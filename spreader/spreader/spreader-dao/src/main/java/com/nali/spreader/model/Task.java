package com.nali.spreader.model;

import java.io.Serializable;
import java.util.Date;
import com.nali.common.model.BaseModel;

public class Task extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.status
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Integer status;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.client_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Integer clientId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.error_reason
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private String errorReason;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.user_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Long userId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.created_time
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Date createdTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.check_url
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private String checkUrl;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.website_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Integer websiteId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.use_cookie
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Byte useCookie;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.flow_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Long flowId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.content_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Long contentId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.has_sub_task
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Boolean hasSubTask;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.content
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private String content;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task.task_type
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private Integer taskType;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.id
     *
     * @return the value of spreader.tb_task.id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.id
     *
     * @param id the value for spreader.tb_task.id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.status
     *
     * @return the value of spreader.tb_task.status
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.status
     *
     * @param status the value for spreader.tb_task.status
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.client_id
     *
     * @return the value of spreader.tb_task.client_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.client_id
     *
     * @param clientId the value for spreader.tb_task.client_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.error_reason
     *
     * @return the value of spreader.tb_task.error_reason
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public String getErrorReason() {
        return errorReason;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.error_reason
     *
     * @param errorReason the value for spreader.tb_task.error_reason
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.user_id
     *
     * @return the value of spreader.tb_task.user_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.user_id
     *
     * @param userId the value for spreader.tb_task.user_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.created_time
     *
     * @return the value of spreader.tb_task.created_time
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.created_time
     *
     * @param createdTime the value for spreader.tb_task.created_time
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.check_url
     *
     * @return the value of spreader.tb_task.check_url
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public String getCheckUrl() {
        return checkUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.check_url
     *
     * @param checkUrl the value for spreader.tb_task.check_url
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setCheckUrl(String checkUrl) {
        this.checkUrl = checkUrl;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.website_id
     *
     * @return the value of spreader.tb_task.website_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Integer getWebsiteId() {
        return websiteId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.website_id
     *
     * @param websiteId the value for spreader.tb_task.website_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.use_cookie
     *
     * @return the value of spreader.tb_task.use_cookie
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Byte getUseCookie() {
        return useCookie;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.use_cookie
     *
     * @param useCookie the value for spreader.tb_task.use_cookie
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setUseCookie(Byte useCookie) {
        this.useCookie = useCookie;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.flow_id
     *
     * @return the value of spreader.tb_task.flow_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Long getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.flow_id
     *
     * @param flowId the value for spreader.tb_task.flow_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.content_id
     *
     * @return the value of spreader.tb_task.content_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.content_id
     *
     * @param contentId the value for spreader.tb_task.content_id
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.has_sub_task
     *
     * @return the value of spreader.tb_task.has_sub_task
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Boolean getHasSubTask() {
        return hasSubTask;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.has_sub_task
     *
     * @param hasSubTask the value for spreader.tb_task.has_sub_task
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setHasSubTask(Boolean hasSubTask) {
        this.hasSubTask = hasSubTask;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.content
     *
     * @return the value of spreader.tb_task.content
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.content
     *
     * @param content the value for spreader.tb_task.content
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task.task_type
     *
     * @return the value of spreader.tb_task.task_type
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task.task_type
     *
     * @param taskType the value for spreader.tb_task.task_type
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }
}
