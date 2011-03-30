package com.nali.spreader.dao.impl;

import com.nali.spreader.dao.ICrudTaskAssignDao;
import com.nali.spreader.model.TaskAssign;
import com.nali.spreader.model.TaskAssignExample;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class CrudTaskAssignDao implements ICrudTaskAssignDao {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public CrudTaskAssignDao() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int countByExample(TaskAssignExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("spreader_tb_task_assign.ibatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int deleteByExample(TaskAssignExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_task_assign.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int deleteByPrimaryKey(Long id) {
        TaskAssign key = new TaskAssign();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_task_assign.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void insert(TaskAssign record) {
        getSqlMapClientTemplate().insert("spreader_tb_task_assign.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public void insertSelective(TaskAssign record) {
        getSqlMapClientTemplate().insert("spreader_tb_task_assign.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public List selectByExample(TaskAssignExample example) {
        List list = getSqlMapClientTemplate().queryForList("spreader_tb_task_assign.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public TaskAssign selectByPrimaryKey(Long id) {
        TaskAssign key = new TaskAssign();
        key.setId(id);
        TaskAssign record = (TaskAssign) getSqlMapClientTemplate().queryForObject("spreader_tb_task_assign.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int updateByExampleSelective(TaskAssign record, TaskAssignExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_assign.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int updateByExample(TaskAssign record, TaskAssignExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_assign.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int updateByPrimaryKeySelective(TaskAssign record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_assign.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public int updateByPrimaryKey(TaskAssign record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_assign.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_task_assign
     *
     * @ibatorgenerated Wed Mar 30 17:07:26 CST 2011
     */
    private static class UpdateByExampleParms extends TaskAssignExample {
        private Object record;

        public UpdateByExampleParms(Object record, TaskAssignExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}