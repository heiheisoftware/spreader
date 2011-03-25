package com.nali.spreader.model;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentHeadersExample {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Sun Mar 13 15:40:27 CST 2011
     */
    public ContentHeadersExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Sun Mar 13 15:40:27 CST 2011
     */
    protected ContentHeadersExample(ContentHeadersExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    protected List oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
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
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_content_headers
     *
     * @ibatorgenerated Fri Mar 25 20:53:45 CST 2011
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

        public Criteria andContentIdIsNull() {
            addCriterion("content_id is null");
            return this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("content_id is not null");
            return this;
        }

        public Criteria andContentIdEqualTo(Long value) {
            addCriterion("content_id =", value, "contentId");
            return this;
        }

        public Criteria andContentIdNotEqualTo(Long value) {
            addCriterion("content_id <>", value, "contentId");
            return this;
        }

        public Criteria andContentIdGreaterThan(Long value) {
            addCriterion("content_id >", value, "contentId");
            return this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("content_id >=", value, "contentId");
            return this;
        }

        public Criteria andContentIdLessThan(Long value) {
            addCriterion("content_id <", value, "contentId");
            return this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Long value) {
            addCriterion("content_id <=", value, "contentId");
            return this;
        }

        public Criteria andContentIdIn(List values) {
            addCriterion("content_id in", values, "contentId");
            return this;
        }

        public Criteria andContentIdNotIn(List values) {
            addCriterion("content_id not in", values, "contentId");
            return this;
        }

        public Criteria andContentIdBetween(Long value1, Long value2) {
            addCriterion("content_id between", value1, value2, "contentId");
            return this;
        }

        public Criteria andContentIdNotBetween(Long value1, Long value2) {
            addCriterion("content_id not between", value1, value2, "contentId");
            return this;
        }

        public Criteria andHeaderIdIsNull() {
            addCriterion("header_id is null");
            return this;
        }

        public Criteria andHeaderIdIsNotNull() {
            addCriterion("header_id is not null");
            return this;
        }

        public Criteria andHeaderIdEqualTo(Long value) {
            addCriterion("header_id =", value, "headerId");
            return this;
        }

        public Criteria andHeaderIdNotEqualTo(Long value) {
            addCriterion("header_id <>", value, "headerId");
            return this;
        }

        public Criteria andHeaderIdGreaterThan(Long value) {
            addCriterion("header_id >", value, "headerId");
            return this;
        }

        public Criteria andHeaderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("header_id >=", value, "headerId");
            return this;
        }

        public Criteria andHeaderIdLessThan(Long value) {
            addCriterion("header_id <", value, "headerId");
            return this;
        }

        public Criteria andHeaderIdLessThanOrEqualTo(Long value) {
            addCriterion("header_id <=", value, "headerId");
            return this;
        }

        public Criteria andHeaderIdIn(List values) {
            addCriterion("header_id in", values, "headerId");
            return this;
        }

        public Criteria andHeaderIdNotIn(List values) {
            addCriterion("header_id not in", values, "headerId");
            return this;
        }

        public Criteria andHeaderIdBetween(Long value1, Long value2) {
            addCriterion("header_id between", value1, value2, "headerId");
            return this;
        }

        public Criteria andHeaderIdNotBetween(Long value1, Long value2) {
            addCriterion("header_id not between", value1, value2, "headerId");
            return this;
        }
    }
}
