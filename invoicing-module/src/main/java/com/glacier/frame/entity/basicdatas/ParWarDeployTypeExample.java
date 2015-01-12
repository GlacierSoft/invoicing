package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParWarDeployTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParWarDeployTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDeployTypeIdIsNull() {
            addCriterion("temp_par_war_deploy_type.deploy_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdIsNotNull() {
            addCriterion("temp_par_war_deploy_type.deploy_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id =", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdNotEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id <>", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdGreaterThan(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id >", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id >=", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdLessThan(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id <", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id <=", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdLike(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id like", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdNotLike(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id not like", value, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id in", values, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdNotIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id not in", values, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id between", value1, value2, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andDeployTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.deploy_type_id not between", value1, value2, "deployTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("temp_par_war_deploy_type.order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("temp_par_war_deploy_type.order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("temp_par_war_deploy_type.order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("temp_par_war_deploy_type.order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("temp_par_war_deploy_type.order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_par_war_deploy_type.order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("temp_par_war_deploy_type.order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_par_war_deploy_type.order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("temp_par_war_deploy_type.order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("temp_par_war_deploy_type.order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_par_war_deploy_type.order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_par_war_deploy_type.order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateIsNull() {
            addCriterion("temp_par_war_deploy_type.deploy_type_state is null");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateIsNotNull() {
            addCriterion("temp_par_war_deploy_type.deploy_type_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state =", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateNotEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state <>", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateGreaterThan(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state >", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state >=", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateLessThan(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state <", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state <=", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateLike(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state like", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateNotLike(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state not like", value, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state in", values, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateNotIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state not in", values, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state between", value1, value2, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeStateNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.deploy_type_state not between", value1, value2, "deployTypeState");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameIsNull() {
            addCriterion("temp_par_war_deploy_type.deploy_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameIsNotNull() {
            addCriterion("temp_par_war_deploy_type.deploy_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name =", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameNotEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name <>", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameGreaterThan(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name >", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name >=", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameLessThan(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name <", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name <=", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameLike(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name like", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameNotLike(String value) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name not like", value, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name in", values, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameNotIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name not in", values, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name between", value1, value2, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andDeployTypeNameNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.deploy_type_name not between", value1, value2, "deployTypeName");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_par_war_deploy_type.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_par_war_deploy_type.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_par_war_deploy_type.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_par_war_deploy_type.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_par_war_deploy_type.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_par_war_deploy_type.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_par_war_deploy_type.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_par_war_deploy_type.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_par_war_deploy_type.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_par_war_deploy_type.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_par_war_deploy_type.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_par_war_deploy_type.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_par_war_deploy_type.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_par_war_deploy_type.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_par_war_deploy_type.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_par_war_deploy_type.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_par_war_deploy_type.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_war_deploy_type.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_war_deploy_type.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_war_deploy_type.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_par_war_deploy_type.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_par_war_deploy_type.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_par_war_deploy_type.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_par_war_deploy_type.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_deploy_type.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_par_war_deploy_type.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_par_war_deploy_type.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_par_war_deploy_type.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_deploy_type.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_par_war_deploy_type.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_par_war_deploy_type.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_par_war_deploy_type.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_par_war_deploy_type.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_war_deploy_type.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_par_war_deploy_type.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_war_deploy_type.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_war_deploy_type.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_war_deploy_type.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}