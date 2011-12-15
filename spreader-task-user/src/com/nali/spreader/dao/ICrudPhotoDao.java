package com.nali.spreader.dao;

import com.nali.spreader.data.Photo;
import com.nali.spreader.data.PhotoExample;
import java.util.List;

public interface ICrudPhotoDao {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int countByExample(PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int deleteByExample(PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    void insert(Photo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    void insertSelective(Photo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    List<Photo> selectByExampleWithBLOBs(PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    List<Photo> selectByExampleWithoutBLOBs(PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    Photo selectByPrimaryKey(Long id);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int updateByExampleSelective(Photo record, PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int updateByExampleWithBLOBs(Photo record, PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int updateByExampleWithoutBLOBs(Photo record, PhotoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int updateByPrimaryKeySelective(Photo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int updateByPrimaryKeyWithBLOBs(Photo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_photo
     *
     * @ibatorgenerated Thu Dec 15 11:45:43 CST 2011
     */
    int updateByPrimaryKeyWithoutBLOBs(Photo record);
}
