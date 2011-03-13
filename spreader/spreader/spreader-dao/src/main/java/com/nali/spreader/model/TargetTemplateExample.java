package com.nali.spreader.model;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TargetTemplateExample {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sat Mar 12 17:16:39 CST 2011
     */
    public TargetTemplateExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sat Mar 12 17:16:39 CST 2011
     */
    protected TargetTemplateExample(TargetTemplateExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    protected List oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_target_template
     *
     * @ibatorgenerated Sun Mar 13 16:01:16 CST 2011
     */
    public static class Criteria {

        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0 || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return this;
        }

        public Criteria andNameIn(List values) {
            addCriterion("name in", values, "name");
            return this;
        }

        public Criteria andNameNotIn(List values) {
            addCriterion("name not in", values, "name");
            return this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return this;
        }

        public Criteria andDescriptionIn(List values) {
            addCriterion("description in", values, "description");
            return this;
        }

        public Criteria andDescriptionNotIn(List values) {
            addCriterion("description not in", values, "description");
            return this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return this;
        }

        public Criteria andUrlIn(List values) {
            addCriterion("url in", values, "url");
            return this;
        }

        public Criteria andUrlNotIn(List values) {
            addCriterion("url not in", values, "url");
            return this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeIn(List values) {
            addCriterion("created_time in", values, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeNotIn(List values) {
            addCriterion("created_time not in", values, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return this;
        }

        public Criteria andWebsiteIdIsNull() {
            addCriterion("website_id is null");
            return this;
        }

        public Criteria andWebsiteIdIsNotNull() {
            addCriterion("website_id is not null");
            return this;
        }

        public Criteria andWebsiteIdEqualTo(Integer value) {
            addCriterion("website_id =", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotEqualTo(Integer value) {
            addCriterion("website_id <>", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdGreaterThan(Integer value) {
            addCriterion("website_id >", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("website_id >=", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdLessThan(Integer value) {
            addCriterion("website_id <", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("website_id <=", value, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdIn(List values) {
            addCriterion("website_id in", values, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotIn(List values) {
            addCriterion("website_id not in", values, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdBetween(Integer value1, Integer value2) {
            addCriterion("website_id between", value1, value2, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("website_id not between", value1, value2, "websiteId");
            return this;
        }

        public Criteria andHasProblemIsNull() {
            addCriterion("has_problem is null");
            return this;
        }

        public Criteria andHasProblemIsNotNull() {
            addCriterion("has_problem is not null");
            return this;
        }

        public Criteria andHasProblemEqualTo(Boolean value) {
            addCriterion("has_problem =", value, "hasProblem");
            return this;
        }

        public Criteria andHasProblemNotEqualTo(Boolean value) {
            addCriterion("has_problem <>", value, "hasProblem");
            return this;
        }

        public Criteria andHasProblemGreaterThan(Boolean value) {
            addCriterion("has_problem >", value, "hasProblem");
            return this;
        }

        public Criteria andHasProblemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_problem >=", value, "hasProblem");
            return this;
        }

        public Criteria andHasProblemLessThan(Boolean value) {
            addCriterion("has_problem <", value, "hasProblem");
            return this;
        }

        public Criteria andHasProblemLessThanOrEqualTo(Boolean value) {
            addCriterion("has_problem <=", value, "hasProblem");
            return this;
        }

        public Criteria andHasProblemIn(List values) {
            addCriterion("has_problem in", values, "hasProblem");
            return this;
        }

        public Criteria andHasProblemNotIn(List values) {
            addCriterion("has_problem not in", values, "hasProblem");
            return this;
        }

        public Criteria andHasProblemBetween(Boolean value1, Boolean value2) {
            addCriterion("has_problem between", value1, value2, "hasProblem");
            return this;
        }

        public Criteria andHasProblemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_problem not between", value1, value2, "hasProblem");
            return this;
        }

        public Criteria andTemplateTypeIsNull() {
            addCriterion("template_type is null");
            return this;
        }

        public Criteria andTemplateTypeIsNotNull() {
            addCriterion("template_type is not null");
            return this;
        }

        public Criteria andTemplateTypeEqualTo(Integer value) {
            addCriterion("template_type =", value, "templateType");
            return this;
        }

        public Criteria andTemplateTypeNotEqualTo(Integer value) {
            addCriterion("template_type <>", value, "templateType");
            return this;
        }

        public Criteria andTemplateTypeGreaterThan(Integer value) {
            addCriterion("template_type >", value, "templateType");
            return this;
        }

        public Criteria andTemplateTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("template_type >=", value, "templateType");
            return this;
        }

        public Criteria andTemplateTypeLessThan(Integer value) {
            addCriterion("template_type <", value, "templateType");
            return this;
        }

        public Criteria andTemplateTypeLessThanOrEqualTo(Integer value) {
            addCriterion("template_type <=", value, "templateType");
            return this;
        }

        public Criteria andTemplateTypeIn(List values) {
            addCriterion("template_type in", values, "templateType");
            return this;
        }

        public Criteria andTemplateTypeNotIn(List values) {
            addCriterion("template_type not in", values, "templateType");
            return this;
        }

        public Criteria andTemplateTypeBetween(Integer value1, Integer value2) {
            addCriterion("template_type between", value1, value2, "templateType");
            return this;
        }

        public Criteria andTemplateTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("template_type not between", value1, value2, "templateType");
            return this;
        }

        public Criteria andLastModifiedTimeIsNull() {
            addCriterion("last_modified_time is null");
            return this;
        }

        public Criteria andLastModifiedTimeIsNotNull() {
            addCriterion("last_modified_time is not null");
            return this;
        }

        public Criteria andLastModifiedTimeEqualTo(Date value) {
            addCriterion("last_modified_time =", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeNotEqualTo(Date value) {
            addCriterion("last_modified_time <>", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeGreaterThan(Date value) {
            addCriterion("last_modified_time >", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modified_time >=", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeLessThan(Date value) {
            addCriterion("last_modified_time <", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modified_time <=", value, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeIn(List values) {
            addCriterion("last_modified_time in", values, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeNotIn(List values) {
            addCriterion("last_modified_time not in", values, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("last_modified_time between", value1, value2, "lastModifiedTime");
            return this;
        }

        public Criteria andLastModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modified_time not between", value1, value2, "lastModifiedTime");
            return this;
        }

        public Criteria andUseCookieIsNull() {
            addCriterion("use_cookie is null");
            return this;
        }

        public Criteria andUseCookieIsNotNull() {
            addCriterion("use_cookie is not null");
            return this;
        }

        public Criteria andUseCookieEqualTo(Integer value) {
            addCriterion("use_cookie =", value, "useCookie");
            return this;
        }

        public Criteria andUseCookieNotEqualTo(Integer value) {
            addCriterion("use_cookie <>", value, "useCookie");
            return this;
        }

        public Criteria andUseCookieGreaterThan(Integer value) {
            addCriterion("use_cookie >", value, "useCookie");
            return this;
        }

        public Criteria andUseCookieGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_cookie >=", value, "useCookie");
            return this;
        }

        public Criteria andUseCookieLessThan(Integer value) {
            addCriterion("use_cookie <", value, "useCookie");
            return this;
        }

        public Criteria andUseCookieLessThanOrEqualTo(Integer value) {
            addCriterion("use_cookie <=", value, "useCookie");
            return this;
        }

        public Criteria andUseCookieIn(List values) {
            addCriterion("use_cookie in", values, "useCookie");
            return this;
        }

        public Criteria andUseCookieNotIn(List values) {
            addCriterion("use_cookie not in", values, "useCookie");
            return this;
        }

        public Criteria andUseCookieBetween(Integer value1, Integer value2) {
            addCriterion("use_cookie between", value1, value2, "useCookie");
            return this;
        }

        public Criteria andUseCookieNotBetween(Integer value1, Integer value2) {
            addCriterion("use_cookie not between", value1, value2, "useCookie");
            return this;
        }

        public Criteria andRedirectTypeIsNull() {
            addCriterion("redirect_type is null");
            return this;
        }

        public Criteria andRedirectTypeIsNotNull() {
            addCriterion("redirect_type is not null");
            return this;
        }

        public Criteria andRedirectTypeEqualTo(Integer value) {
            addCriterion("redirect_type =", value, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeNotEqualTo(Integer value) {
            addCriterion("redirect_type <>", value, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeGreaterThan(Integer value) {
            addCriterion("redirect_type >", value, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("redirect_type >=", value, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeLessThan(Integer value) {
            addCriterion("redirect_type <", value, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("redirect_type <=", value, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeIn(List values) {
            addCriterion("redirect_type in", values, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeNotIn(List values) {
            addCriterion("redirect_type not in", values, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeBetween(Integer value1, Integer value2) {
            addCriterion("redirect_type between", value1, value2, "redirectType");
            return this;
        }

        public Criteria andRedirectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("redirect_type not between", value1, value2, "redirectType");
            return this;
        }

        public Criteria andContentEncodingIsNull() {
            addCriterion("content_encoding is null");
            return this;
        }

        public Criteria andContentEncodingIsNotNull() {
            addCriterion("content_encoding is not null");
            return this;
        }

        public Criteria andContentEncodingEqualTo(String value) {
            addCriterion("content_encoding =", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingNotEqualTo(String value) {
            addCriterion("content_encoding <>", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingGreaterThan(String value) {
            addCriterion("content_encoding >", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingGreaterThanOrEqualTo(String value) {
            addCriterion("content_encoding >=", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingLessThan(String value) {
            addCriterion("content_encoding <", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingLessThanOrEqualTo(String value) {
            addCriterion("content_encoding <=", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingLike(String value) {
            addCriterion("content_encoding like", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingNotLike(String value) {
            addCriterion("content_encoding not like", value, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingIn(List values) {
            addCriterion("content_encoding in", values, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingNotIn(List values) {
            addCriterion("content_encoding not in", values, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingBetween(String value1, String value2) {
            addCriterion("content_encoding between", value1, value2, "contentEncoding");
            return this;
        }

        public Criteria andContentEncodingNotBetween(String value1, String value2) {
            addCriterion("content_encoding not between", value1, value2, "contentEncoding");
            return this;
        }
    }
}
