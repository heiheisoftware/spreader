package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class StrategyGroup extends BaseModel implements Serializable {
	private static final long serialVersionUID = 7747290269093900408L;

	/**
	 * 转换后的分组名称
	 */
	private String transformName;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column spreader.tb_strategy_group.id
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	private Long id;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column spreader.tb_strategy_group.group_name
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	private String groupName;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column spreader.tb_strategy_group.group_type
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	private Integer groupType;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column spreader.tb_strategy_group.description
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	private String description;

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds
	 * to the database column spreader.tb_strategy_group.create_time
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	private Date createTime;

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column spreader.tb_strategy_group.id
	 * 
	 * @return the value of spreader.tb_strategy_group.id
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column spreader.tb_strategy_group.id
	 * 
	 * @param id
	 *            the value for spreader.tb_strategy_group.id
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column spreader.tb_strategy_group.group_name
	 * 
	 * @return the value of spreader.tb_strategy_group.group_name
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column spreader.tb_strategy_group.group_name
	 * 
	 * @param groupName
	 *            the value for spreader.tb_strategy_group.group_name
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column spreader.tb_strategy_group.group_type
	 * 
	 * @return the value of spreader.tb_strategy_group.group_type
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public Integer getGroupType() {
		return groupType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column spreader.tb_strategy_group.group_type
	 * 
	 * @param groupType
	 *            the value for spreader.tb_strategy_group.group_type
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public void setGroupType(Integer groupType) {
		this.groupType = groupType;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column spreader.tb_strategy_group.description
	 * 
	 * @return the value of spreader.tb_strategy_group.description
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column spreader.tb_strategy_group.description
	 * 
	 * @param description
	 *            the value for spreader.tb_strategy_group.description
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns
	 * the value of the database column spreader.tb_strategy_group.create_time
	 * 
	 * @return the value of spreader.tb_strategy_group.create_time
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the
	 * value of the database column spreader.tb_strategy_group.create_time
	 * 
	 * @param createTime
	 *            the value for spreader.tb_strategy_group.create_time
	 * 
	 * @ibatorgenerated Fri Jan 06 17:05:12 CST 2012
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTransformName() {
		return transformName;
	}

	public void setTransformName(String transformName) {
		this.transformName = transformName;
	}
}
