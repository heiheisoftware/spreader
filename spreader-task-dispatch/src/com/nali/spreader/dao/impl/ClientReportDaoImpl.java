package com.nali.spreader.dao.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.common.model.Limit;
import com.nali.common.util.CollectionUtils;
import com.nali.spreader.dao.IClientReportDao;
import com.nali.spreader.dto.MarketTaskCount;
import com.nali.spreader.model.ClientReport;

@Repository
public class ClientReportDaoImpl implements IClientReportDao {
	@Autowired
	private SqlMapClientTemplate sqlMap;

	@Override
	public List<ClientReport> queryClientTaskCount(Date taskDate, Long clientId, Long actionId, String appName, Limit limit) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("taskDate", taskDate);
		params.put("clientId", clientId);
		if (actionId != null) {
			String[] actionIdArr = actionId.toString().split(",");
			params.put("actionId", actionIdArr);
		}
		params.put("appName", appName);
		params.put("limit", limit);
		return sqlMap.queryForList("spreader_client_report.queryClientTaskCount", params);
	}

	@Override
	public int countClientTaskCount(Date taskDate, Long clientId, Long actionId, String appName) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("taskDate", taskDate);
		params.put("clientId", clientId);
		if (actionId != null) {
			String[] actionIdArr = actionId.toString().split(",");
			params.put("actionId", actionIdArr);
		}
		params.put("appName", appName);
		Integer cnt = (Integer) sqlMap.queryForObject("spreader_client_report.countClientTaskCount", params);
		if (cnt == null) {
			cnt = 0;
		}
		return cnt;
	}

	@Override
	public List<MarketTaskCount> queryMarketTaskCount(int days, Limit limit) {
		Map<String, Object> params = CollectionUtils.newHashMap(2);
		params.put("days", days);
		params.put("limit", limit);
		return sqlMap.queryForList("spreader_client_report.queryMarketTaskCount", params);
	}

	@Override
	public int countMarketTaskCount(int days) {
		Integer cnt = (Integer) sqlMap.queryForObject("spreader_client_report.countMarketTaskCount", days);
		if (cnt == null) {
			cnt = 0;
		}
		return cnt;
	}
}
