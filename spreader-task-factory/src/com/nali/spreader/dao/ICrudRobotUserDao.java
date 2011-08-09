package com.nali.spreader.dao;

import com.nali.spreader.model.RobotUser;
import com.nali.spreader.model.RobotUserExample;
import java.util.List;

public interface ICrudRobotUserDao {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int countByExample(RobotUserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int deleteByExample(RobotUserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int deleteByPrimaryKey(Long uid);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    void insert(RobotUser record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    void insertSelective(RobotUser record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    List<RobotUser> selectByExample(RobotUserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    RobotUser selectByPrimaryKey(Long uid);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int updateByExampleSelective(RobotUser record, RobotUserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int updateByExample(RobotUser record, RobotUserExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int updateByPrimaryKeySelective(RobotUser record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_robot_user
     *
     * @ibatorgenerated Sat Jul 30 20:00:57 CST 2011
     */
    int updateByPrimaryKey(RobotUser record);
}