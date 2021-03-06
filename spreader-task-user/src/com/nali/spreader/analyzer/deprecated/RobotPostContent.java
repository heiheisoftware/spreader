package com.nali.spreader.analyzer.deprecated;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nali.spreader.config.UserDto;
import com.nali.spreader.constants.Website;
import com.nali.spreader.data.KeyValue;
import com.nali.spreader.factory.TaskProduceLine;
import com.nali.spreader.factory.config.Configable;
import com.nali.spreader.factory.config.desc.ClassDescription;
import com.nali.spreader.factory.passive.AutowireProductLine;
import com.nali.spreader.factory.regular.RegularAnalyzer;
import com.nali.spreader.service.IUserService;
import com.nali.spreader.service.IUserServiceFactory;

@Component
@ClassDescription("发微博")
public class RobotPostContent implements RegularAnalyzer,Configable<UserDto> {
	private Integer websiteId = Website.weibo.getId();
	private IUserService userService;
	private UserDto dto;
	@AutowireProductLine
	private TaskProduceLine<Long> autoPostWeiboContent;
	
	@Autowired
	public void initUserService(IUserServiceFactory userServiceFactory) {
		userService = userServiceFactory.getUserService(websiteId);
	}

	@Override
	public String work() {
		List<KeyValue<Long, Long>> uidToWebsiteUidMaps = userService.findUidToWebsiteUidMapByDto(dto);
		for (KeyValue<Long, Long> uidToWebsiteUidMap : uidToWebsiteUidMaps) {
			Long uid = uidToWebsiteUidMap.getKey();
			autoPostWeiboContent.send(uid);
		}
		return null;
	}

	@Override
	public void init(UserDto dto) {
		this.dto = dto;
		dto.setIsRobot(true);
	}

}
