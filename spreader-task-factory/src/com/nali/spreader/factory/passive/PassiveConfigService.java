package com.nali.spreader.factory.passive;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.nali.spreader.dao.IPassiveConfigDao;
import com.nali.spreader.factory.config.AbstractConfigService;
import com.nali.spreader.factory.config.Configable;
import com.nali.spreader.factory.config.ConfigableCenter;
import com.nali.spreader.factory.config.ConfigableListener;
import com.nali.spreader.factory.config.IConfigableCenter;

@Service
public class PassiveConfigService extends AbstractConfigService<String> {
	private static Logger logger = Logger.getLogger(PassiveConfigService.class);
	private IConfigableCenter configableCenter;
	@Autowired
	private IPassiveConfigDao passiveConfigDao;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void registerConfigableInfo(String name, Configable obj) {
		boolean newRegister = configableCenter.register(name, obj);
		if (newRegister) {
			handleNewRegister(name, obj);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void handleNewRegister(String name, Configable obj) {
		Class<?> clazz = obj.getClass();
		super.registerConfigableInfo(name, clazz);
		Object config = passiveConfigDao.getConfig(name);
		if(config!=null) {
			try {
				obj.init(config);
			} catch (Exception e) {
				logger.error("configable object has a error config:" + name, e);
			}
		} else {
			logger.warn("configable object has not config:" + name);
		}
	
	}

	public <T extends Configable<?>> void listen(String name, ConfigableListener<T>... listeners) {
		configableCenter.listen(name, listeners);
	}
	
	public <T extends Configable<?>> void listenAndRegisterIfNeeded(String name, T configable, ConfigableListener<T>... listeners) {
		boolean newRegister = configableCenter.listenAndRegisterIfNeeded(name, configable, listeners);
		if (newRegister) {
			handleNewRegister(name, configable);
		}
	}

	@Override
	public Object getConfigData(String key) {
		return passiveConfigDao.getConfig(key);
	}

	@Override
	public void saveConfigData(String key, Object object) {
		configableCenter.applyConfigToPrototype(key, object);
		passiveConfigDao.saveConfig(key, object);
	}

	@Override
	protected IConfigableCenter getConfigableCenter() {
		return configableCenter;
	}
	
	@Autowired
	public void setApplicationContext(ApplicationContext context) {
		configableCenter = new ConfigableCenter(context);
	}
	
//	@Bean
//	public IConfigableCenter passiveConfigableCenter() {
//		return configableCenter;
//	}

}
