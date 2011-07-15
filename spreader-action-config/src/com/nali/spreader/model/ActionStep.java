package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;

public class ActionStep extends BaseModel implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.action_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private Long actionId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.url_config
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private String urlConfig;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_action_step.type
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private String type;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.id
     *
     * @return the value of spreader.tb_action_step.id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.id
     *
     * @param id the value for spreader.tb_action_step.id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.action_id
     *
     * @return the value of spreader.tb_action_step.action_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.action_id
     *
     * @param actionId the value for spreader.tb_action_step.action_id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.url_config
     *
     * @return the value of spreader.tb_action_step.url_config
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public String getUrlConfig() {
        return urlConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.url_config
     *
     * @param urlConfig the value for spreader.tb_action_step.url_config
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setUrlConfig(String urlConfig) {
        this.urlConfig = urlConfig;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_action_step.type
     *
     * @return the value of spreader.tb_action_step.type
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_action_step.type
     *
     * @param type the value for spreader.tb_action_step.type
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setType(String type) {
        this.type = type;
    }
}