package com.nali.spreader.dao;

import com.nali.spreader.model.WorldRelation;
import com.nali.spreader.model.WorldRelationExample;
import java.util.List;

public interface ICrudWorldRelationDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    int countByExample(WorldRelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    int deleteByExample(WorldRelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    void insert(WorldRelation record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    void insertSelective(WorldRelation record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    List selectByExample(WorldRelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    int updateByExampleSelective(WorldRelation record, WorldRelationExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_world_relation
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    int updateByExample(WorldRelation record, WorldRelationExample example);
}
