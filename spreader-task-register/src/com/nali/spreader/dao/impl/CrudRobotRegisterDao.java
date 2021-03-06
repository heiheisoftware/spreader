package com.nali.spreader.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.spreader.dao.ICrudRobotRegisterDao;
import com.nali.spreader.data.RobotRegister;
import com.nali.spreader.data.RobotRegisterExample;

@Repository
public class CrudRobotRegisterDao implements ICrudRobotRegisterDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 25 17:39:43 CST 2011
     */
    public CrudRobotRegisterDao() {
        super();
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int countByExample(RobotRegisterExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("spreader_tb_robot_register.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int deleteByExample(RobotRegisterExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_robot_register.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int deleteByPrimaryKey(Long id) {
        RobotRegister key = new RobotRegister();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_robot_register.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public Long insert(RobotRegister record) {
        Object newKey = getSqlMapClientTemplate().insert("spreader_tb_robot_register.ibatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public Long insertSelective(RobotRegister record) {
        Object newKey = getSqlMapClientTemplate().insert("spreader_tb_robot_register.ibatorgenerated_insertSelective", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    @SuppressWarnings("unchecked")
    public List<RobotRegister> selectByExample(RobotRegisterExample example) {
        List<RobotRegister> list = getSqlMapClientTemplate().queryForList("spreader_tb_robot_register.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public RobotRegister selectByPrimaryKey(Long id) {
        RobotRegister key = new RobotRegister();
        key.setId(id);
        RobotRegister record = (RobotRegister) getSqlMapClientTemplate().queryForObject("spreader_tb_robot_register.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int updateByExampleSelective(RobotRegister record, RobotRegisterExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_robot_register.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int updateByExample(RobotRegister record, RobotRegisterExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_robot_register.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int updateByPrimaryKeySelective(RobotRegister record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_robot_register.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public int updateByPrimaryKey(RobotRegister record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_robot_register.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_robot_register
     *
     * @ibatorgenerated Thu Aug 16 11:34:47 CST 2012
     */
    private static class UpdateByExampleParms extends RobotRegisterExample {

        private Object record;

        public UpdateByExampleParms(Object record, RobotRegisterExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
