package com.nali.spreader.factory.passive;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.nali.spreader.factory.TaskProduceLine;
import com.nali.spreader.factory.base.TaskMeta;
import com.nali.spreader.factory.config.Configable;
import com.nali.spreader.factory.config.ConfigableListener;
import com.nali.spreader.factory.config.LazyConfigableListener;
import com.nali.spreader.factory.exporter.ClientTaskExporterFactory;
import com.nali.spreader.factory.exporter.Exporter;
import com.nali.spreader.factory.exporter.ExporterProvider;
import com.nali.spreader.factory.exporter.ThreadLocalResultInfo;
import com.nali.spreader.util.AnnotatedMethodIterator;
import com.nali.spreader.util.reflect.GenericInfo;

@Service
@SuppressWarnings({ "rawtypes", "unchecked" })
public class PassiveProducerManager {
	private static Logger logger = Logger.getLogger(PassiveProducerManager.class);
	@Autowired
	private ApplicationContext context;
	@Autowired
	private PassiveConfigService passiveConfigService;
	@Autowired
	private ClientTaskExporterFactory passiveTaskExporterFactory;
	@Autowired
	private ThreadLocalResultInfo threadLocalResultInfo;

	public TaskProduceLine<?> getProduceLine(String beanName, Type type) {
		if (type instanceof Class) {
			throw new IllegalArgumentException("ProductLine must be parameterized");
		}
		ParameterizedType pt = (ParameterizedType) type;
		Type paramType = pt.getActualTypeArguments()[0];
		
		PassiveObject passive = context.getBean(beanName, PassiveObject.class);
		if (passive instanceof Configable) {
			LazyProduceLine lazyProduceLine = new LazyProduceLine(beanName, paramType);
			passiveConfigService.listenAndRegisterIfNeeded(beanName, (Configable)passive, lazyProduceLine);
			return lazyProduceLine;
		} else {
			//TODO 需合并(1) 和 (2)代码合并
			if (passive instanceof PassiveAnalyzer) {
				AnalyzerProduceLine produceLine = new AnalyzerProduceLine((PassiveAnalyzer)passive, paramType);
				return new ResultInfoWrappedProduceLine(produceLine, beanName);
			} else if (passive instanceof PassiveTaskProducer) {
				PassiveTaskProducer passiveTaskProducer = (PassiveTaskProducer) passive;
				TaskProducerProduceLine produceLine = new TaskProducerProduceLine(passiveTaskProducer, passiveTaskExporterFactory, paramType);
				return new ResultInfoWrappedProduceLine(produceLine, beanName);
			} else {
				throw new IllegalArgumentException("illegal bean type:" + passive.getClass());
			}
		}
	}

	private static Method iterateAnnotatedMethod(Class<?> clazz, Type paramType, MethodFilter filter) {
		Iterator<Method> methods = new AnnotatedMethodIterator<Input>(clazz, Input.class);
		while (methods.hasNext()) {
			Method method = methods.next();
			Boolean checkRlt = filter.check(method);
			if(checkRlt==null) {
				throw new IllegalArgumentException(clazz + " has a illegal argument method [" + method + "]");
			} else if(checkRlt==true) {
				return method;
			} else {
				continue;
			}
		}
		throw new IllegalArgumentException(clazz + " has not method match paramType [" + paramType + "]");
	}
	
	private static Type resolveTypeArgument(Class target, Class parent, int idx) {
		return GenericInfo.get(target).getGeneric(parent.getTypeParameters()[idx]);
	}
	
	static interface MethodFilter {
		/** null if illegal argument */
		Boolean check(Method method);
	}
	
	private class ResultInfoWrappedProduceLine<T> implements TaskProduceLine<T> {//记录日志
		private TaskProduceLine<T> inner;
		private String name;
		
		public ResultInfoWrappedProduceLine(TaskProduceLine<T> inner, String name) {
			super();
			this.inner = inner;
			this.name = name;
		}

		@Override
		public void send(T data) {
			threadLocalResultInfo.inProduceLine(name);
			inner.send(data);
			threadLocalResultInfo.outProduceLine();
		}
	}
	
	private class LazyProduceLine<T> implements TaskProduceLine<T>, LazyConfigableListener<Configable<?>> {
		private TaskProduceLine<T> innerProduceLine;
		private ConfigableListener<Configable<?>> innerListener;
		private final String name;
		private final Type paramType;
		
		public LazyProduceLine(String name, Type paramType) {
			super();
			this.name = name;
			this.paramType = paramType;
		}
		@Override
		public void onbind(Configable<?> obj) {
			//TODO 需合并(2) 和 (1)代码合并
			if (obj instanceof PassiveAnalyzer) {
				AnalyzerProduceLine produceLine = new AnalyzerProduceLine((PassiveAnalyzer)obj, paramType);
				innerProduceLine = new ResultInfoWrappedProduceLine(produceLine, name);
				innerListener = produceLine;
			} else if (obj instanceof PassiveTaskProducer) {
				TaskProducerProduceLine produceLine = new TaskProducerProduceLine((PassiveTaskProducer)obj, passiveTaskExporterFactory, paramType);
				innerProduceLine = new ResultInfoWrappedProduceLine(produceLine, name);
				innerListener = produceLine;
			} else {
				throw new IllegalArgumentException("illegal bean type:" + obj.getClass());
			}
		}

		@Override
		public void onchange(Configable<?> newObj, Configable<?> oldObj) {
			innerListener.onchange(newObj, oldObj);			
		}
		@Override
		public void send(T data) {
			innerProduceLine.send(data);
		}
	}
	
	public static class AnalyzerProduceLine<T> implements TaskProduceLine<T>, ConfigableListener<Configable<?>> {
		private PassiveAnalyzer<T> passiveAnalyzer;
		private Method method;
		public AnalyzerProduceLine(PassiveAnalyzer<T> passiveAnalyzer, final Type paramType) {
			this.passiveAnalyzer = passiveAnalyzer;
			Type baseParamType = resolveTypeArgument(passiveAnalyzer.getClass(), PassiveAnalyzer.class, 0);
			if(baseParamType.equals(paramType)) {
				method=PassiveAnalyzer.class.getDeclaredMethods()[0];
			} else {
				method=iterateAnnotatedMethod(passiveAnalyzer.getClass(), paramType, new MethodFilter() {
					@Override
					public Boolean check(Method method) {
						Type[] methodParameterTypes = method.getGenericParameterTypes();
						if(methodParameterTypes.length==1) {
							if(methodParameterTypes[0].equals(paramType)) {
								return true;
							} else {
								return false;
							}
						}
						return null;
					}
				});
			}
		}
		@Override
		public void onchange(Configable<?> newObj, Configable<?> oldObj) {
			passiveAnalyzer=(PassiveAnalyzer) newObj;
		}
		@Override
		public void send(T data) {
			try {
				method.invoke(passiveAnalyzer, data);
			} catch (Exception e) {
				logger.error(e, e);
			}
		}
	}
	
	public static class TaskProducerProduceLine<T, TM extends TaskMeta, E extends Exporter<TM>> implements TaskProduceLine<T>, ConfigableListener<Configable<?>> {
		private PassiveTaskProducer<T, TM, E> passiveTaskProducer;
		private Method method;
		private boolean reverseArgument;
		private ExporterProvider<TM, E> exporterProvider;
		public TaskProducerProduceLine(final PassiveTaskProducer<T, TM, E> passiveTaskProducer, final ClientTaskExporterFactory exporterFactory, final Type paramType) {
			this.passiveTaskProducer = passiveTaskProducer;
			final TM tm = passiveTaskProducer.getTaskMeta();
			
			GenericInfo<? extends PassiveTaskProducer> genericInfo = GenericInfo.get(passiveTaskProducer.getClass());
			Type baseParamType = genericInfo.getGeneric(PassiveTaskProducer.class.getTypeParameters()[0]);
			if(baseParamType.equals(paramType)) {
				method=PassiveTaskProducer.class.getDeclaredMethods()[0];
				setExporterProvider(tm, genericInfo.getGeneric(PassiveTaskProducer.class.getTypeParameters()[2]), exporterFactory);
				reverseArgument = false;
			} else {
				method=iterateAnnotatedMethod(passiveTaskProducer.getClass(), paramType, new MethodFilter() {
					@Override
					public Boolean check(Method method) {
						Type[] methodParameterTypes = method.getGenericParameterTypes();
						if(methodParameterTypes.length==2) {
							if(isExporter(methodParameterTypes[1])) {
								if(methodParameterTypes[0].equals(paramType)) {//equals-->isAssignableFrom ??
									reverseArgument = false;
									setExporterProvider(tm, methodParameterTypes[1], exporterFactory);
									return true;
								} else {
									return false;
								}
							} else if(isExporter(methodParameterTypes[0])) {
								if(methodParameterTypes[1].equals(paramType)) {
									reverseArgument = true;
									setExporterProvider(tm, methodParameterTypes[0], exporterFactory);
									return true;
								} else {
									return false;
								}
							}
						}
						return null;
					}
					private boolean isExporter(Type type) {
						return type instanceof Class && Exporter.class.isAssignableFrom((Class<?>)type);
					}
				});
			}
		}
		private void setExporterProvider(TM tm, Type exporterType, ClientTaskExporterFactory exporterFactory) {
			Class<E> exporterClass;
			if (exporterType instanceof Class) {
				exporterClass = (Class<E>) exporterType;
			} else if(exporterType instanceof ParameterizedType) {
				exporterClass = (Class<E>) ((ParameterizedType)exporterType).getRawType();
			} else {
				throw new IllegalArgumentException("exporterType has a wrong type:" + exporterType);
			}
			
			exporterProvider = exporterFactory.getExporterProvider(tm, exporterClass);
		}
		@Override
		public void onchange(Configable<?> newObj, Configable<?> oldObj) {
			passiveTaskProducer=(PassiveTaskProducer) newObj;
		}
		
		@Override
		public void send(T data) {
			E exporter = exporterProvider.getExporter();
			Object[] params;
			if(reverseArgument) {
				params = new Object[] {exporter, data};
			} else {
				params = new Object[] {data, exporter};
			}
			try {
				method.invoke(passiveTaskProducer, params);
			} catch (Exception e) {
				logger.error(e, e);
			}
			exporter.reset();
		}
	}
	
}
