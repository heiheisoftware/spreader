package com.nali.spreader.workshop.ximalaya;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.nali.spreader.analyzer.ximalaya.CheckRobotRemoteService;
import com.nali.spreader.analyzer.ximalaya.CheckRobotRemoteService.CheckRobotRemoteServiceConfig;
import com.nali.spreader.constants.Channel;
import com.nali.spreader.constants.Website;
import com.nali.spreader.data.User;
import com.nali.spreader.factory.PassiveWorkshop;
import com.nali.spreader.factory.SimpleActionConfig;
import com.nali.spreader.factory.base.SingleTaskMachineImpl;
import com.nali.spreader.factory.exporter.SingleTaskExporter;
import com.nali.spreader.util.SpecialDateUtil;

/**
 * 被动策略
 * 
 */
@Component
public class RobotRemoteServiceCheck extends SingleTaskMachineImpl implements PassiveWorkshop<CheckRobotRemoteService.CheckRobotRemoteServiceConfig, Boolean> {

	public RobotRemoteServiceCheck() {
		super(SimpleActionConfig.checkRobotRemote, Website.ximalaya, Channel.normal);
	}

	@Override
	public void work(CheckRobotRemoteServiceConfig data, SingleTaskExporter exporter) {
		String mail = data.getMail();
		boolean sendSuccessEmail = data.isSendSuccessEmail();
		work(mail, sendSuccessEmail, exporter);
	}

	private void work(String mail, boolean sendEmail, SingleTaskExporter exporter) {
		exporter.setProperty("mail", mail);
		exporter.setProperty("sendSuccessEmail", sendEmail);
		exporter.send(User.UID_NOT_LOGIN, SpecialDateUtil.afterNow(30));
	}

	@Override
	public void handleResult(Date updateTime, Boolean resultObject) {

	}
}
