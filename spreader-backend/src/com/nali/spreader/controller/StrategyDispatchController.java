package com.nali.spreader.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nali.common.pagination.PageResult;
import com.nali.common.util.CollectionUtils;
import com.nali.lang.StringUtils;
import com.nali.lts.exceptions.SchedulerException;
import com.nali.spreader.factory.config.ConfigableType;
import com.nali.spreader.factory.config.IConfigService;
import com.nali.spreader.factory.config.desc.ConfigDefinition;
import com.nali.spreader.factory.config.desc.ConfigableInfo;
import com.nali.spreader.factory.regular.RegularScheduler;
import com.nali.spreader.model.RegularJob;
import com.nali.spreader.model.RegularJob.TriggerDto;
import com.nali.spreader.model.StrategyGroup;
import com.nali.spreader.model.StrategyUserGroup;
import com.nali.spreader.service.IStrategyGroupService;

@Controller
public class StrategyDispatchController {
	private static final Logger LOGGER = Logger.getLogger(StrategyDispatchController.class);
	private static ObjectMapper jacksonMapper = new ObjectMapper();
	@Autowired
	private RegularScheduler cfgService;
	@Autowired
	private IConfigService<Long> regularConfigService;
	@Autowired
	private IStrategyGroupService groupService;
	// 简单分组
	private final Integer SIMPLE_GROUP_TYPE = 1;
	// 复杂分组
	// private final Integer COMPLEX_GROUP_TYPE = 2;

	/**
	 * 策略调度列表的显示页
	 * 
	 * @return
	 */
	@RequestMapping(value = "/strategy/dispatchlist")
	public String showStgList() {
		return "/show/main/strategyDispatchListShow";
	}

	/**
	 * 构造GRID的STROE
	 * 
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/stgdispgridstore")
	public String stgGridStore(String dispname, Integer triggerType, Long groupId, Integer start,
			Integer limit) throws JsonGenerationException, JsonMappingException, IOException {
		if (limit == null) {
			limit = 20;
		}
		if (start == null) {
			start = 0;
		} else {
			start = start / limit + 1;
		}
		PageResult<RegularJob> pr = cfgService.findRegularJob(dispname, triggerType, groupId, ConfigableType.normal, start, limit);
		List<RegularJob> list = pr.getList();
		List<ConfigableInfo> dispnamelist = regularConfigService.listConfigableInfo(ConfigableType.normal);
		int rowcount = pr.getTotalCount();
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		jsonMap.put("cnt", rowcount);
		jsonMap.put("data", list);
		jsonMap.put("dispname", dispnamelist);
		return jacksonMapper.writeValueAsString(jsonMap);
	}

	/**
	 * 构建树结构的数据源
	 * 
	 * @param name
	 * @param disname
	 *            用于显示的名称
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/createdisptree")
	public String createStgTreeData(String name, Long id, Boolean isGroup) throws JsonGenerationException,
			JsonMappingException, IOException {
		if (Boolean.TRUE.equals(isGroup)) {
			id = getRegularIdByGid(id);
		}
		ConfigableInfo cfg = regularConfigService.getConfigableInfo(name);
		String dispname = cfg.getDisplayName();
		String extendType = cfg.getExtendType();
		Object meta = cfg.getExtendMeta();
		ConfigDefinition def = regularConfigService.getConfigDefinition(name);
		Object data = id != null ? cfgService.getRegularJobObject(id).getConfigObject() : null;
		Object sug = null;
		if (!StringUtils.isEmpty(extendType)) {
			sug = cfgService.getExtendConfig(name, id);
		}
		DispatchData dispatch = new DispatchData(null, dispname, extendType, meta, def, data, sug);
		return jacksonMapper.writeValueAsString(dispatch);
	}

	/**
	 * 获取调度参数
	 * 
	 * @param id
	 * @return
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @throws SchedulerException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/settgrparam")
	public String settingTriggerParam(Long id, Boolean isGroup) throws JsonGenerationException,
			JsonMappingException, IOException, SchedulerException {
		if (isGroup != null && isGroup) {
			id = getRegularIdByGid(id);
		}
		// 如果ID为空直接返回报错信息
		if (id == null) {
			Map<String, Boolean> err = CollectionUtils.newHashMap(1);
			err.put("error", true);
			LOGGER.error("不能获取任务ID，设置参数错误");
			return jacksonMapper.writeValueAsString(err);
		}
		RegularJob job = cfgService.getRegularJobObject(id);
		TriggerDto triggerObject = job.getTriggerObject();
		triggerObject.setDescription(job.getDescription());
		triggerObject.setTriggerType(job.getTriggerType());
		return jacksonMapper.writeValueAsString(triggerObject);
	}

	/**
	 * 保存前台编辑的配置对象
	 * 
	 * @param name
	 * @param config
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/dispsave")
	public String saveStrategyConfig(String groupName, Long groupId, Integer groupType,
			Long fromGroupId, Long toGroupId, RegularJob regularJob, TriggerDto triggerDto) throws JsonGenerationException, JsonMappingException, IOException {
		//检查参数
		if (groupType == null) {
			return returnError("分组类型为空，不能保存策略配置", null);
		}
		
		//处理分组相关字段
		if (SIMPLE_GROUP_TYPE.equals(groupType)) {
			groupName = regularJob.getName();
			if (groupId != null) {
				Long id = getRegularIdByGid(groupId);
				regularJob.setId(id);//把页面上传过来的错误的id刷成正确的
				if (id != null) {
					// 如果分组ID不为null,首先检查并同步策略表
					groupService.syncRegularJob(groupId, groupName, id);
				} else {
					return returnError("通过组ID:" + groupId + ",获取regularJob失败", null);
				}
			} else {
				// 否则先保存分组获取分组ID
				groupId = getNewGroupId(groupType, groupName, regularJob.getDescription());
			}
		} else {
			//复杂分组
			if (groupId == null) {
				return returnError("复杂分组传入的groupId为空或小于等于0，不能保存策略", null);
			}
		}
		regularJob.setGid(groupId);
		regularJob.setGname(groupName);
		
		//check config
		Class<?> dataClass = regularConfigService.getConfigableInfo(regularJob.getName()).getDataClass();
		if(regularJob.getConfig()!=null) {
			try {
				Object configObj = jacksonMapper.readValue(regularJob.getConfig(), dataClass);
				regularJob.setConfigObject(configObj);
			} catch (Exception e) {
				groupService.rollBackStrategyGroupByGid(groupId);
				return returnError("获取configObj异常,回滚分组：" + groupId, e);
			}
		}
		
		//处理StrategyUserGroup
		if (fromGroupId != null || toGroupId != null) {
			StrategyUserGroup sug = new StrategyUserGroup();
			sug.setFromUserGroup(fromGroupId);
			sug.setToUserGroup(toGroupId);
			regularJob.setExtendConfigObject(sug);
		}
		
		//设置triggerDto和JobType
		regularJob.setTriggerObject(triggerDto);
		regularJob.setJobType(ConfigableType.normal.jobType);
		
		//save
		try {
			cfgService.scheduleRegularJob(regularJob);
			Map<String, Object> message = CollectionUtils.newHashMap(1);
			message.put("success", true);
			return jacksonMapper.writeValueAsString(message);
		} catch (Exception e) {
			groupService.rollBackStrategyGroupByGid(groupId);
			return returnError("保存失败,请检查数据重新填写,数据已回滚", e);
		}
	}

	private String returnError(String msg, Throwable e) throws IOException {
		if(e==null) {
			LOGGER.warn(msg);
		} else {
			LOGGER.warn(msg, e);
		}
		Map<String, Object> message = CollectionUtils.newHashMap(2);
		message.put("success", false);
		message.put("message", msg);
		return jacksonMapper.writeValueAsString(message);
	}
	
	/**
	 * 批量删除调度信息
	 * 
	 * @param idstr
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/deletetrg")
	public String deleteTrigger(String idstr) throws JsonGenerationException, JsonMappingException,
			IOException {
		// 操作记录数
		int count = 0;
		// 返回消息
		Map<String, String> map = new HashMap<String, String>();
		if (StringUtils.isNotEmptyNoOffset(idstr)) {
			String[] idarray = idstr.split("[,]");
			if (idarray.length > 0) {
				for (int i = 0; i < idarray.length; i++) {
					try {
						cfgService.unSchedule(Long.parseLong(idarray[i]));
						count++;
					} catch (Exception e) {
						LOGGER.error("调度删除异常", e);
					}
				}
			}
		} else {
			map.put("message", "删除失败");
		}
		map.put("message", "成功删除" + count + "条记录");
		return jacksonMapper.writeValueAsString(map);
	}

	/**
	 * 构造ComboBox的数据源
	 * 
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/combstore")
	public String createStgCombStore() throws JsonGenerationException, JsonMappingException, IOException {
		List<ConfigableInfo> list = regularConfigService.listConfigableInfo(ConfigableType.normal);
		return jacksonMapper.writeValueAsString(list);
	}

	/**
	 * 获取新构建的分组ID
	 * 
	 * @param groupType
	 * @param groupName
	 * @param groupNote
	 * @return
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	@ResponseBody
	@RequestMapping(value = "/strategy/newgroupid")
	public String createNewGroupId(Integer groupType, String groupName, String groupNote)
			throws JsonGenerationException, JsonMappingException, IOException {
		Long gid = this.getNewGroupId(groupType, groupName, groupNote);
		Map<String, Long> m = CollectionUtils.newHashMap(1);
		m.put("groupId", gid);
		return jacksonMapper.writeValueAsString(m);
	}

	/**
	 * 通过分组ID获取调度ID
	 * 
	 * @param gid
	 * @return
	 */
	private Long getRegularIdByGid(Long gid) {
		return cfgService.findRegularJobIdBySimpleGroupId(gid);
	}

	/**
	 * 获取新保存的分组ID
	 * 
	 * @param groupType
	 * @param groupName
	 * @param note
	 * @return
	 */
	private Long getNewGroupId(Integer groupType, String groupName, String groupNote) {
		// 否则先保存分组获取分组ID
		StrategyGroup sg = new StrategyGroup();
		sg.setGroupType(groupType);
		sg.setGroupName(groupName);
		sg.setDescription(groupNote);
		sg.setCreateTime(new Date());
		return groupService.saveGroupInfo(sg);
	}

	/**
	 * 
	 * @author xiefei
	 * 
	 */
	public static class DispatchData {
		// 树节点ID
		private String treeid;
		// TEXT
		private String treename;
		// 属性配置
		private ConfigDefinition def;
		// 节点数据
		private Object data;
		private String extendType;
		private Object extendMeta;
		private Object sug;

		public DispatchData(String treeid, String treename, String extendType, Object extendMeta,
				ConfigDefinition def, Object data, Object sug) {
			this.treeid = treeid;
			this.treename = treename;
			this.def = def;
			this.data = data;
			this.extendType = extendType;
			this.extendMeta = extendMeta;
			this.sug = sug;
		}

		public String getExtendType() {
			return extendType;
		}

		public Object getSug() {
			return sug;
		}

		public void setSug(Object sug) {
			this.sug = sug;
		}

		public void setExtendType(String extendType) {
			this.extendType = extendType;
		}

		public Object getExtendMeta() {
			return extendMeta;
		}

		public void setExtendMeta(Object extendMeta) {
			this.extendMeta = extendMeta;
		}

		public String getTreeid() {
			return treeid;
		}

		public void setTreeid(String treeid) {
			this.treeid = treeid;
		}

		public String getTreename() {
			return treename;
		}

		public void setTreename(String treename) {
			this.treename = treename;
		}

		public ConfigDefinition getDef() {
			return def;
		}

		public void setDef(ConfigDefinition def) {
			this.def = def;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

	}

	public static class GridListStore {
		private String displayName;
		private RegularJob job;

		public GridListStore(RegularJob job, String displayName) {
			this.displayName = displayName;
			this.job = job;
		}

		public String getDisplayName() {
			return displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public RegularJob getJob() {
			return job;
		}

		public void setJob(RegularJob job) {
			this.job = job;
		}
	}
}
