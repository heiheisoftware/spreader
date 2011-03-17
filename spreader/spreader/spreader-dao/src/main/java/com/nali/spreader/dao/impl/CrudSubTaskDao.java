package com.nali.spreader.dao.impl;

import com.nali.spreader.dao.ICrudSubTaskDao;
import com.nali.spreader.model.SubTask;
import com.nali.spreader.model.SubTaskExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CrudSubTaskDao implements ICrudSubTaskDao {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public CrudSubTaskDao() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int countByExample(SubTaskExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("spreader_tb_sub_task.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int deleteByExample(SubTaskExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_sub_task.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int deleteByPrimaryKey(Long id) {
        SubTask key = new SubTask();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_sub_task.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void insert(SubTask record) {
        getSqlMapClientTemplate().insert("spreader_tb_sub_task.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void insertSelective(SubTask record) {
        getSqlMapClientTemplate().insert("spreader_tb_sub_task.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public List selectByExample(SubTaskExample example) {
        List list = getSqlMapClientTemplate().queryForList("spreader_tb_sub_task.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public SubTask selectByPrimaryKey(Long id) {
        SubTask key = new SubTask();
        key.setId(id);
        SubTask record = (SubTask) getSqlMapClientTemplate().queryForObject("spreader_tb_sub_task.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByExampleSelective(SubTask record, SubTaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_sub_task.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByExample(SubTask record, SubTaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_sub_task.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByPrimaryKeySelective(SubTask record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_sub_task.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public int updateByPrimaryKey(SubTask record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_sub_task.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_sub_task
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    private static class UpdateByExampleParms extends SubTaskExample {
        private Object record;

        public UpdateByExampleParms(Object record, SubTaskExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}