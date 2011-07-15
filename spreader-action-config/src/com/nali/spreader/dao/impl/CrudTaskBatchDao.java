package com.nali.spreader.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.spreader.dao.ICrudTaskBatchDao;
import com.nali.spreader.model.TaskBatch;
import com.nali.spreader.model.TaskBatchExample;

@Repository
public class CrudTaskBatchDao implements ICrudTaskBatchDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:16:22 CST 2011
     */
    public CrudTaskBatchDao() {
        super();
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int countByExample(TaskBatchExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("spreader_tb_task_batch.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int deleteByExample(TaskBatchExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_task_batch.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int deleteByPrimaryKey(Long id) {
        TaskBatch key = new TaskBatch();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_task_batch.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void insert(TaskBatch record) {
        getSqlMapClientTemplate().insert("spreader_tb_task_batch.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public void insertSelective(TaskBatch record) {
        getSqlMapClientTemplate().insert("spreader_tb_task_batch.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    @SuppressWarnings("unchecked")
    public List<TaskBatch> selectByExample(TaskBatchExample example) {
        List<TaskBatch> list = getSqlMapClientTemplate().queryForList("spreader_tb_task_batch.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public TaskBatch selectByPrimaryKey(Long id) {
        TaskBatch key = new TaskBatch();
        key.setId(id);
        TaskBatch record = (TaskBatch) getSqlMapClientTemplate().queryForObject("spreader_tb_task_batch.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int updateByExampleSelective(TaskBatch record, TaskBatchExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_batch.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int updateByExample(TaskBatch record, TaskBatchExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_batch.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int updateByPrimaryKeySelective(TaskBatch record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_batch.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public int updateByPrimaryKey(TaskBatch record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_task_batch.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_task_batch
     *
     * @ibatorgenerated Fri Jul 15 17:17:13 CST 2011
     */
    private static class UpdateByExampleParms extends TaskBatchExample {

        private Object record;

        public UpdateByExampleParms(Object record, TaskBatchExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
