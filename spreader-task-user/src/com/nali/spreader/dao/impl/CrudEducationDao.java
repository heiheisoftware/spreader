package com.nali.spreader.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.nali.spreader.dao.ICrudEducationDao;
import com.nali.spreader.data.Education;
import com.nali.spreader.data.EducationExample;

@Repository
public class CrudEducationDao implements ICrudEducationDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Sat Jul 30 16:58:55 CST 2011
     */
    public CrudEducationDao() {
        super();
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    @Autowired
    private SqlMapClientTemplate sqlMap;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int countByExample(EducationExample example) {
        Integer count = (Integer) getSqlMapClientTemplate().queryForObject("spreader_tb_education.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int deleteByExample(EducationExample example) {
        int rows = getSqlMapClientTemplate().delete("spreader_tb_education.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int deleteByPrimaryKey(Long id) {
        Education key = new Education();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("spreader_tb_education.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public void insert(Education record) {
        getSqlMapClientTemplate().insert("spreader_tb_education.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public void insertSelective(Education record) {
        getSqlMapClientTemplate().insert("spreader_tb_education.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    @SuppressWarnings("unchecked")
    public List<Education> selectByExample(EducationExample example) {
        List<Education> list = getSqlMapClientTemplate().queryForList("spreader_tb_education.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public Education selectByPrimaryKey(Long id) {
        Education key = new Education();
        key.setId(id);
        Education record = (Education) getSqlMapClientTemplate().queryForObject("spreader_tb_education.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int updateByExampleSelective(Education record, EducationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_education.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int updateByExample(Education record, EducationExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("spreader_tb_education.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int updateByPrimaryKeySelective(Education record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_education.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public int updateByPrimaryKey(Education record) {
        int rows = getSqlMapClientTemplate().update("spreader_tb_education.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public SqlMapClientTemplate getSqlMapClientTemplate() {
        return sqlMap;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_education
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    private static class UpdateByExampleParms extends EducationExample {

        private Object record;

        public UpdateByExampleParms(Object record, EducationExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
