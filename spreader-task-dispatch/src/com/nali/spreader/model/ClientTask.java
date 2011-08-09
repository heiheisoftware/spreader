package com.nali.spreader.model;

import java.io.Serializable;
import java.util.Date;
import com.nali.common.model.BaseModel;

/**
 * ClientTask<br>&nbsp;
 * 目前逻辑上taskId只存在于前台，后台不关心具体id
 * @author sam Created on 2011-8-1
 */
public class ClientTask extends BaseModel implements Serializable {

    private static final long serialVersionUID = 5144184626459560630L;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.action_id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private Long actionId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.uid
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private Long uid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.task_code
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private String taskCode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.batch_id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private Long batchId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.client_type
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private Integer clientType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.expire_time
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private Date expireTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_client_task.contents
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    private String contents;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.id
     *
     * @return the value of spreader.tb_client_task.id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.id
     *
     * @param id the value for spreader.tb_client_task.id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.action_id
     *
     * @return the value of spreader.tb_client_task.action_id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.action_id
     *
     * @param actionId the value for spreader.tb_client_task.action_id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.uid
     *
     * @return the value of spreader.tb_client_task.uid
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.uid
     *
     * @param uid the value for spreader.tb_client_task.uid
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.task_code
     *
     * @return the value of spreader.tb_client_task.task_code
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.task_code
     *
     * @param taskCode the value for spreader.tb_client_task.task_code
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.batch_id
     *
     * @return the value of spreader.tb_client_task.batch_id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public Long getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.batch_id
     *
     * @param batchId the value for spreader.tb_client_task.batch_id
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setBatchId(Long batchId) {
        this.batchId = batchId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.client_type
     *
     * @return the value of spreader.tb_client_task.client_type
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public Integer getClientType() {
        return clientType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.client_type
     *
     * @param clientType the value for spreader.tb_client_task.client_type
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.expire_time
     *
     * @return the value of spreader.tb_client_task.expire_time
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.expire_time
     *
     * @param expireTime the value for spreader.tb_client_task.expire_time
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_client_task.contents
     *
     * @return the value of spreader.tb_client_task.contents
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public String getContents() {
        return contents;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_client_task.contents
     *
     * @param contents the value for spreader.tb_client_task.contents
     *
     * @ibatorgenerated Thu Aug 04 16:36:41 CST 2011
     */
    public void setContents(String contents) {
        this.contents = contents;
    }
}
