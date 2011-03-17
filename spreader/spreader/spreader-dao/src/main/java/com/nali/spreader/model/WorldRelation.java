package com.nali.spreader.model;

import java.io.Serializable;
import com.nali.common.model.BaseModel;

public class WorldRelation extends BaseModel implements Serializable {

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_world_relation.from_uid
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private Long fromUid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_world_relation.from_uid_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private Byte fromUidType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_world_relation.to_uid
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private Long toUid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_world_relation.to_uid_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private Byte toUidType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_world_relation.relation_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    private Integer relationType;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_world_relation.from_uid
     *
     * @return the value of spreader.tb_world_relation.from_uid
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public Long getFromUid() {
        return fromUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_world_relation.from_uid
     *
     * @param fromUid the value for spreader.tb_world_relation.from_uid
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setFromUid(Long fromUid) {
        this.fromUid = fromUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_world_relation.from_uid_type
     *
     * @return the value of spreader.tb_world_relation.from_uid_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public Byte getFromUidType() {
        return fromUidType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_world_relation.from_uid_type
     *
     * @param fromUidType the value for spreader.tb_world_relation.from_uid_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setFromUidType(Byte fromUidType) {
        this.fromUidType = fromUidType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_world_relation.to_uid
     *
     * @return the value of spreader.tb_world_relation.to_uid
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public Long getToUid() {
        return toUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_world_relation.to_uid
     *
     * @param toUid the value for spreader.tb_world_relation.to_uid
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setToUid(Long toUid) {
        this.toUid = toUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_world_relation.to_uid_type
     *
     * @return the value of spreader.tb_world_relation.to_uid_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public Byte getToUidType() {
        return toUidType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_world_relation.to_uid_type
     *
     * @param toUidType the value for spreader.tb_world_relation.to_uid_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setToUidType(Byte toUidType) {
        this.toUidType = toUidType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_world_relation.relation_type
     *
     * @return the value of spreader.tb_world_relation.relation_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public Integer getRelationType() {
        return relationType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_world_relation.relation_type
     *
     * @param relationType the value for spreader.tb_world_relation.relation_type
     *
     * @ibatorgenerated Sun Mar 13 16:01:17 CST 2011
     */
    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }
}