package com.nali.spreader.dao;

import com.nali.spreader.data.User;
import com.nali.spreader.data.UserExample;
import java.util.List;

public interface ICrudUserDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    void insert(User record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    void insertSelective(User record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int updateByExampleSelective(User record, UserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int updateByExample(User record, UserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user
     *
     * @ibatorgenerated Mon Nov 21 19:19:52 CST 2011
     */
    int updateByPrimaryKey(User record);
}
