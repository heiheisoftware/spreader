package com.nali.spreader.workshop.other;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nali.spreader.constants.Channel;
import com.nali.spreader.constants.Website;
import com.nali.spreader.data.Content;
import com.nali.spreader.data.KeyValue;
import com.nali.spreader.dto.ForwardDto;
import com.nali.spreader.factory.PassiveWorkshop;
import com.nali.spreader.factory.SimpleActionConfig;
import com.nali.spreader.factory.base.SingleTaskMachineImpl;
import com.nali.spreader.factory.exporter.SingleTaskExporter;
import com.nali.spreader.factory.passive.Input;
import com.nali.spreader.service.IContentService;
import com.nali.spreader.util.SpecialDateUtil;

@Component
public class ForwardWeiboContent extends SingleTaskMachineImpl implements PassiveWorkshop<KeyValue<Long, Long>, KeyValue<Long, KeyValue<Long, Long>>> {
	@Autowired
	private IContentService contentService;

	public ForwardWeiboContent() {
		super(SimpleActionConfig.forwardWeiboContent, Website.weibo, Channel.normal);
	}

	@Override
	public void work(KeyValue<Long, Long> data, SingleTaskExporter exporter) {
		Long robotUid=data.getKey();
		Long contentId=data.getValue();
		Content content = contentService.getContentById(contentId);
		work(robotUid, content, exporter, null);
	}

	@Input
	public void work(SingleTaskExporter exporter, KeyValue<Long, Content> data) {
		Long robotUid=data.getKey();
		Content content=data.getValue();
		work(robotUid, content, exporter, null);
	}
	
	@Input
	public void work(SingleTaskExporter exporter, ForwardDto dto) {
		Content content=dto.getContent();
		if(content==null) {
			content = contentService.getContentById(dto.getContentId());
		}
		Long robotUid=dto.getRobotUid();
		Date startTime = dto.getStartTime();
		work(robotUid, content, exporter, startTime);
	}
	
	private void work(Long robotUid, Content content, SingleTaskExporter exporter, Date startTime) {
		work(robotUid, content.getId(), content.getWebsiteContentId(), content.getWebsiteUid(), content.getEntry(), exporter, startTime);
	}

	private void work(Long robotUid, Long contentId, Long websiteContentId, Long websiteUid, String entry, SingleTaskExporter exporter, Date startTime) {
		exporter.setProperty("id", robotUid);
		exporter.setProperty("contentId", contentId);
		exporter.setProperty("websiteContentId", websiteContentId);
		exporter.setProperty("websiteUid", websiteUid);
		exporter.setProperty("entry", entry);
		if(startTime==null) {
			startTime = new Date();
		}
		exporter.setTimes(startTime, SpecialDateUtil.afterToday(3));
		exporter.setUid(robotUid);
		exporter.send();
		contentService.addPostContentId(robotUid, contentId);
	}

	@Override
	public void handleResult(Date updateTime, KeyValue<Long, KeyValue<Long, Long>> resultObject) {
		//do nothing??
	}

}
