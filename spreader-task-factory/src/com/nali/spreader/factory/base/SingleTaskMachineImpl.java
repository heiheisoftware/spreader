package com.nali.spreader.factory.base;

import java.util.Arrays;
import java.util.List;

import com.nali.spreader.constants.Channel;
import com.nali.spreader.constants.Website;
import com.nali.spreader.factory.SimpleActionConfig;

public class SingleTaskMachineImpl implements TaskMachine<SingleTaskMeta> {
	private SingleTaskMeta taskMeta;
	protected final Integer websiteId;
	
	public SingleTaskMachineImpl(SimpleActionConfig actionConfig, Website website, Channel channel) {
		this.websiteId = website.getId();
		Integer taskType = website.getId() * 100 + channel.getId();
		taskMeta = new SingleTaskMeta(actionConfig.getActionId(), actionConfig.getTaskCode(), taskType);
	}

	@Override
	public SingleTaskMeta getTaskMeta() {
		return taskMeta;
	}

	protected void setContextMeta(ContextMeta contextMeta) {
		taskMeta.setContextMeta(contextMeta);
	}
	
	protected void setContextMeta(String... systemOnlyProperties) {
		taskMeta.setContextMeta(new ContextMeta(systemOnlyProperties));
	}
	
	protected void setContextMeta(List<String> systemOnlyProperties, List<String> systemProperties) {
		taskMeta.setContextMeta(new ContextMeta(systemOnlyProperties, systemProperties));
	}
	
	protected void setContextMeta(List<String> systemOnlyProperties, String... systemProperties) {
		taskMeta.setContextMeta(new ContextMeta(systemOnlyProperties, Arrays.asList(systemProperties)));
	}
	
	protected void setContextMeta(String[] systemOnlyProperties, String... systemProperties) {
		taskMeta.setContextMeta(new ContextMeta(Arrays.asList(systemOnlyProperties), Arrays.asList(systemProperties)));
	}
}