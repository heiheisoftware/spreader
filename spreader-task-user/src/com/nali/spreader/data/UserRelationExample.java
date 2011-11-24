package com.nali.spreader.data;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRelationExample {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    public UserRelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Thu Aug 04 10:00:33 CST 2011
     */
    protected UserRelationExample(UserRelationExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
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
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_user_relation
     *
     * @ibatorgenerated Tue Nov 22 15:00:05 CST 2011
     */
    public static class Criteria {

        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0 || criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
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
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andToUidIsNull() {
            addCriterion("to_uid is null");
            return this;
        }

        public Criteria andToUidIsNotNull() {
            addCriterion("to_uid is not null");
            return this;
        }

        public Criteria andToUidEqualTo(Long value) {
            addCriterion("to_uid =", value, "toUid");
            return this;
        }

        public Criteria andToUidNotEqualTo(Long value) {
            addCriterion("to_uid <>", value, "toUid");
            return this;
        }

        public Criteria andToUidGreaterThan(Long value) {
            addCriterion("to_uid >", value, "toUid");
            return this;
        }

        public Criteria andToUidGreaterThanOrEqualTo(Long value) {
            addCriterion("to_uid >=", value, "toUid");
            return this;
        }

        public Criteria andToUidLessThan(Long value) {
            addCriterion("to_uid <", value, "toUid");
            return this;
        }

        public Criteria andToUidLessThanOrEqualTo(Long value) {
            addCriterion("to_uid <=", value, "toUid");
            return this;
        }

        public Criteria andToUidIn(List<Long> values) {
            addCriterion("to_uid in", values, "toUid");
            return this;
        }

        public Criteria andToUidNotIn(List<Long> values) {
            addCriterion("to_uid not in", values, "toUid");
            return this;
        }

        public Criteria andToUidBetween(Long value1, Long value2) {
            addCriterion("to_uid between", value1, value2, "toUid");
            return this;
        }

        public Criteria andToUidNotBetween(Long value1, Long value2) {
            addCriterion("to_uid not between", value1, value2, "toUid");
            return this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andWebsiteIdIn(List<Integer> values) {
            addCriterion("website_id in", values, "websiteId");
            return this;
        }

        public Criteria andWebsiteIdNotIn(List<Integer> values) {
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

        public Criteria andWebsiteUidIsNull() {
            addCriterion("website_uid is null");
            return this;
        }

        public Criteria andWebsiteUidIsNotNull() {
            addCriterion("website_uid is not null");
            return this;
        }

        public Criteria andWebsiteUidEqualTo(Long value) {
            addCriterion("website_uid =", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidNotEqualTo(Long value) {
            addCriterion("website_uid <>", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidGreaterThan(Long value) {
            addCriterion("website_uid >", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidGreaterThanOrEqualTo(Long value) {
            addCriterion("website_uid >=", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidLessThan(Long value) {
            addCriterion("website_uid <", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidLessThanOrEqualTo(Long value) {
            addCriterion("website_uid <=", value, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidIn(List<Long> values) {
            addCriterion("website_uid in", values, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidNotIn(List<Long> values) {
            addCriterion("website_uid not in", values, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidBetween(Long value1, Long value2) {
            addCriterion("website_uid between", value1, value2, "websiteUid");
            return this;
        }

        public Criteria andWebsiteUidNotBetween(Long value1, Long value2) {
            addCriterion("website_uid not between", value1, value2, "websiteUid");
            return this;
        }

        public Criteria andToWebsiteUidIsNull() {
            addCriterion("to_website_uid is null");
            return this;
        }

        public Criteria andToWebsiteUidIsNotNull() {
            addCriterion("to_website_uid is not null");
            return this;
        }

        public Criteria andToWebsiteUidEqualTo(Long value) {
            addCriterion("to_website_uid =", value, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidNotEqualTo(Long value) {
            addCriterion("to_website_uid <>", value, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidGreaterThan(Long value) {
            addCriterion("to_website_uid >", value, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidGreaterThanOrEqualTo(Long value) {
            addCriterion("to_website_uid >=", value, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidLessThan(Long value) {
            addCriterion("to_website_uid <", value, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidLessThanOrEqualTo(Long value) {
            addCriterion("to_website_uid <=", value, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidIn(List<Long> values) {
            addCriterion("to_website_uid in", values, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidNotIn(List<Long> values) {
            addCriterion("to_website_uid not in", values, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidBetween(Long value1, Long value2) {
            addCriterion("to_website_uid between", value1, value2, "toWebsiteUid");
            return this;
        }

        public Criteria andToWebsiteUidNotBetween(Long value1, Long value2) {
            addCriterion("to_website_uid not between", value1, value2, "toWebsiteUid");
            return this;
        }

        public Criteria andIsRobotUserIsNull() {
            addCriterion("is_robot_user is null");
            return this;
        }

        public Criteria andIsRobotUserIsNotNull() {
            addCriterion("is_robot_user is not null");
            return this;
        }

        public Criteria andIsRobotUserEqualTo(Boolean value) {
            addCriterion("is_robot_user =", value, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserNotEqualTo(Boolean value) {
            addCriterion("is_robot_user <>", value, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserGreaterThan(Boolean value) {
            addCriterion("is_robot_user >", value, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_robot_user >=", value, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserLessThan(Boolean value) {
            addCriterion("is_robot_user <", value, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserLessThanOrEqualTo(Boolean value) {
            addCriterion("is_robot_user <=", value, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserIn(List<Boolean> values) {
            addCriterion("is_robot_user in", values, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserNotIn(List<Boolean> values) {
            addCriterion("is_robot_user not in", values, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserBetween(Boolean value1, Boolean value2) {
            addCriterion("is_robot_user between", value1, value2, "isRobotUser");
            return this;
        }

        public Criteria andIsRobotUserNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_robot_user not between", value1, value2, "isRobotUser");
            return this;
        }
    }
}
