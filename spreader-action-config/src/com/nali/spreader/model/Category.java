package com.nali.spreader.model;

import com.nali.common.model.BaseModel;
import java.io.Serializable;

public class Category extends BaseModel implements Serializable {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_category.id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_category.name
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private String name;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_category.description
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private String description;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_category.tags
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    private String tags;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_category.id
     *
     * @return the value of spreader.tb_category.id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_category.id
     *
     * @param id the value for spreader.tb_category.id
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_category.name
     *
     * @return the value of spreader.tb_category.name
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_category.name
     *
     * @param name the value for spreader.tb_category.name
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_category.description
     *
     * @return the value of spreader.tb_category.description
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_category.description
     *
     * @param description the value for spreader.tb_category.description
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_category.tags
     *
     * @return the value of spreader.tb_category.tags
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_category.tags
     *
     * @param tags the value for spreader.tb_category.tags
     *
     * @ibatorgenerated Fri Jul 15 17:17:12 CST 2011
     */
    public void setTags(String tags) {
        this.tags = tags;
    }
}