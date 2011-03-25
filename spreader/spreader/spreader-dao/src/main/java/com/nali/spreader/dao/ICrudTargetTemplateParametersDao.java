package com.nali.spreader.dao;

import com.nali.spreader.model.TargetTemplateParameters;
import com.nali.spreader.model.TargetTemplateParametersExample;
import java.util.List;

public interface ICrudTargetTemplateParametersDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int countByExample(TargetTemplateParametersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int deleteByExample(TargetTemplateParametersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    void insert(TargetTemplateParameters record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    void insertSelective(TargetTemplateParameters record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    List selectByExample(TargetTemplateParametersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    TargetTemplateParameters selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int updateByExampleSelective(TargetTemplateParameters record, TargetTemplateParametersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int updateByExample(TargetTemplateParameters record, TargetTemplateParametersExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int updateByPrimaryKeySelective(TargetTemplateParameters record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template_parameters
     *
     * @ibatorgenerated Fri Mar 25 20:53:46 CST 2011
     */
    int updateByPrimaryKey(TargetTemplateParameters record);
}
