package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;
import java.util.Date;

public class TaskResult extends BaseModel implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_result.task_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private Long taskId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_result.client_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private Long clientId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_result.task_code
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private String taskCode;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_result.status
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private Integer status;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_result.executed_time
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private Date executedTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_task_result.result
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private String result;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_result.task_id
     *
     * @return the value of spreader.tb_task_result.task_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_result.task_id
     *
     * @param taskId the value for spreader.tb_task_result.task_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_result.client_id
     *
     * @return the value of spreader.tb_task_result.client_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_result.client_id
     *
     * @param clientId the value for spreader.tb_task_result.client_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_result.task_code
     *
     * @return the value of spreader.tb_task_result.task_code
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_result.task_code
     *
     * @param taskCode the value for spreader.tb_task_result.task_code
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_result.status
     *
     * @return the value of spreader.tb_task_result.status
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_result.status
     *
     * @param status the value for spreader.tb_task_result.status
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_result.executed_time
     *
     * @return the value of spreader.tb_task_result.executed_time
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public Date getExecutedTime() {
        return executedTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_result.executed_time
     *
     * @param executedTime the value for spreader.tb_task_result.executed_time
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void setExecutedTime(Date executedTime) {
        this.executedTime = executedTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_task_result.result
     *
     * @return the value of spreader.tb_task_result.result
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_task_result.result
     *
     * @param result the value for spreader.tb_task_result.result
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void setResult(String result) {
        this.result = result;
    }
}