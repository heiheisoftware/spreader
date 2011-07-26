package com.nali.spreader.model;

import com.nali.common.model.Limit;
import com.nali.common.model.Shard;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskResultExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    private Shard shard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    private Limit limit;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public TaskResultExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    protected TaskResultExample(TaskResultExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.limit = example.limit;
        this.shard = example.shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
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
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public void setShard(Shard shard) {
        this.shard = shard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
     */
    public void setLimit(Limit limit) {
        this.limit = limit;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table spreader.tb_task_result
     *
     * @ibatorgenerated Mon Jul 25 19:10:23 CST 2011
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
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("client_id is null");
            return this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("client_id is not null");
            return this;
        }

        public Criteria andClientIdEqualTo(Long value) {
            addCriterion("client_id =", value, "clientId");
            return this;
        }

        public Criteria andClientIdNotEqualTo(Long value) {
            addCriterion("client_id <>", value, "clientId");
            return this;
        }

        public Criteria andClientIdGreaterThan(Long value) {
            addCriterion("client_id >", value, "clientId");
            return this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_id >=", value, "clientId");
            return this;
        }

        public Criteria andClientIdLessThan(Long value) {
            addCriterion("client_id <", value, "clientId");
            return this;
        }

        public Criteria andClientIdLessThanOrEqualTo(Long value) {
            addCriterion("client_id <=", value, "clientId");
            return this;
        }

        public Criteria andClientIdIn(List<Long> values) {
            addCriterion("client_id in", values, "clientId");
            return this;
        }

        public Criteria andClientIdNotIn(List<Long> values) {
            addCriterion("client_id not in", values, "clientId");
            return this;
        }

        public Criteria andClientIdBetween(Long value1, Long value2) {
            addCriterion("client_id between", value1, value2, "clientId");
            return this;
        }

        public Criteria andClientIdNotBetween(Long value1, Long value2) {
            addCriterion("client_id not between", value1, value2, "clientId");
            return this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return this;
        }

        public Criteria andTaskCodeEqualTo(String value) {
            addCriterion("task_code =", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeNotEqualTo(String value) {
            addCriterion("task_code <>", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeGreaterThan(String value) {
            addCriterion("task_code >", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(String value) {
            addCriterion("task_code >=", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeLessThan(String value) {
            addCriterion("task_code <", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(String value) {
            addCriterion("task_code <=", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeLike(String value) {
            addCriterion("task_code like", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeNotLike(String value) {
            addCriterion("task_code not like", value, "taskCode");
            return this;
        }

        public Criteria andTaskCodeIn(List<String> values) {
            addCriterion("task_code in", values, "taskCode");
            return this;
        }

        public Criteria andTaskCodeNotIn(List<String> values) {
            addCriterion("task_code not in", values, "taskCode");
            return this;
        }

        public Criteria andTaskCodeBetween(String value1, String value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return this;
        }

        public Criteria andTaskCodeNotBetween(String value1, String value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return this;
        }

        public Criteria andExecutedTimeIsNull() {
            addCriterion("executed_time is null");
            return this;
        }

        public Criteria andExecutedTimeIsNotNull() {
            addCriterion("executed_time is not null");
            return this;
        }

        public Criteria andExecutedTimeEqualTo(Date value) {
            addCriterion("executed_time =", value, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeNotEqualTo(Date value) {
            addCriterion("executed_time <>", value, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeGreaterThan(Date value) {
            addCriterion("executed_time >", value, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("executed_time >=", value, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeLessThan(Date value) {
            addCriterion("executed_time <", value, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeLessThanOrEqualTo(Date value) {
            addCriterion("executed_time <=", value, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeIn(List<Date> values) {
            addCriterion("executed_time in", values, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeNotIn(List<Date> values) {
            addCriterion("executed_time not in", values, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeBetween(Date value1, Date value2) {
            addCriterion("executed_time between", value1, value2, "executedTime");
            return this;
        }

        public Criteria andExecutedTimeNotBetween(Date value1, Date value2) {
            addCriterion("executed_time not between", value1, value2, "executedTime");
            return this;
        }
    }
}