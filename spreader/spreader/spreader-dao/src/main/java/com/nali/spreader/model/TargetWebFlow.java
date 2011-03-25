package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;

public class TargetWebFlow extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_target_web_flow.flow_id
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    private Long flowId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_target_web_flow.use_cookie
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    private String useCookie;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_target_web_flow.flow_id
     *
     * @return the value of spreader.tb_target_web_flow.flow_id
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    public Long getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_target_web_flow.flow_id
     *
     * @param flowId the value for spreader.tb_target_web_flow.flow_id
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_target_web_flow.use_cookie
     *
     * @return the value of spreader.tb_target_web_flow.use_cookie
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    public String getUseCookie() {
        return useCookie;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_target_web_flow.use_cookie
     *
     * @param useCookie the value for spreader.tb_target_web_flow.use_cookie
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    public void setUseCookie(String useCookie) {
        this.useCookie = useCookie;
    }
}
