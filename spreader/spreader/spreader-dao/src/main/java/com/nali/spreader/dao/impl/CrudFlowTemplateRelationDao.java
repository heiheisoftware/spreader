package com.nali.spreader.dao.impl;

import com.nali.spreader.dao.ICrudFlowTemplateRelationDao;
import com.nali.spreader.model.FlowTemplateRelation;
import com.nali.spreader.model.FlowTemplateRelationExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CrudFlowTemplateRelationDao implements ICrudFlowTemplateRelationDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 15:40:27 CST 2011
     */
    public CrudFlowTemplateRelationDao() {
        super();
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int countByExample(FlowTemplateRelationExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("spreader_tb_flow_template_relation.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int deleteByExample(FlowTemplateRelationExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_flow_template_relation.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void insert(FlowTemplateRelation record) {
        getSqlMapClientTemplate().insert("spreader_tb_flow_template_relation.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void insertSelective(FlowTemplateRelation record) {
        getSqlMapClientTemplate().insert("spreader_tb_flow_template_relation.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public List selectByExample(FlowTemplateRelationExample example) {
        List list = getSqlMapClientTemplate().queryForList("spreader_tb_flow_template_relation.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByExampleSelective(FlowTemplateRelation record, FlowTemplateRelationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_flow_template_relation.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByExample(FlowTemplateRelation record, FlowTemplateRelationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_flow_template_relation.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_flow_template_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    private static class UpdateByExampleParms extends FlowTemplateRelationExample {

        private Object record;

        public UpdateByExampleParms(Object record, FlowTemplateRelationExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}