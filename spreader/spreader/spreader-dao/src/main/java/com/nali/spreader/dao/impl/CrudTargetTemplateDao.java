package com.nali.spreader.dao.impl;

import com.nali.spreader.dao.ICrudTargetTemplateDao;
import com.nali.spreader.model.TargetTemplate;
import com.nali.spreader.model.TargetTemplateExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CrudTargetTemplateDao implements ICrudTargetTemplateDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sat Mar 12 17:19:22 CST 2011
     */
    public CrudTargetTemplateDao() {
        super();
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int countByExample(TargetTemplateExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("spreader_tb_target_template.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int deleteByExample(TargetTemplateExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_target_template.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int deleteByPrimaryKey(Long id) {
        TargetTemplate key = new TargetTemplate();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_target_template.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void insert(TargetTemplate record) {
        getSqlMapClientTemplate().insert("spreader_tb_target_template.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void insertSelective(TargetTemplate record) {
        getSqlMapClientTemplate().insert("spreader_tb_target_template.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public List selectByExample(TargetTemplateExample example) {
        List list = getSqlMapClientTemplate().queryForList("spreader_tb_target_template.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public TargetTemplate selectByPrimaryKey(Long id) {
        TargetTemplate key = new TargetTemplate();
        key.setId(id);
        TargetTemplate record = (TargetTemplate) getSqlMapClientTemplate().queryForObject("spreader_tb_target_template.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByExampleSelective(TargetTemplate record, TargetTemplateExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_target_template.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByExample(TargetTemplate record, TargetTemplateExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_target_template.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByPrimaryKeySelective(TargetTemplate record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_target_template.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByPrimaryKey(TargetTemplate record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_target_template.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    private static class UpdateByExampleParms extends TargetTemplateExample {

        private Object record;

        public UpdateByExampleParms(Object record, TargetTemplateExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
