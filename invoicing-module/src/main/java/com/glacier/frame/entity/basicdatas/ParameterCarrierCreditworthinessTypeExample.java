package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterCarrierCreditworthinessTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterCarrierCreditworthinessTypeExample() {
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

        public Criteria andCreditworthinessTypeIdIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id =", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdNotEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id <>", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdGreaterThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id >", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id >=", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdLessThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id <", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id <=", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id like", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdNotLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id not like", value, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id in", values, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdNotIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id not in", values, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id between", value1, value2, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type_id not between", value1, value2, "creditworthinessTypeId");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type is null");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type =", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeNotEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type <>", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeGreaterThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type >", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type >=", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeLessThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type <", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type <=", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type like", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeNotLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type not like", value, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type in", values, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeNotIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type not in", values, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type between", value1, value2, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andCreditworthinessTypeNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creditworthiness_type not between", value1, value2, "creditworthinessType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type is null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTypeEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type =", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type <>", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type >", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type >=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type <", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type <=", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type not like", value, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type not in", values, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeTypeNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_type not between", value1, value2, "changeType");
            return (Criteria) this;
        }

        public Criteria andChangeValueIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value is null");
            return (Criteria) this;
        }

        public Criteria andChangeValueIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value is not null");
            return (Criteria) this;
        }

        public Criteria andChangeValueEqualTo(Integer value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value =", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotEqualTo(Integer value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value <>", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueGreaterThan(Integer value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value >", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value >=", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueLessThan(Integer value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value <", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value <=", value, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueIn(List<Integer> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value in", values, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotIn(List<Integer> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value not in", values, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value between", value1, value2, "changeValue");
            return (Criteria) this;
        }

        public Criteria andChangeValueNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.change_value not between", value1, value2, "changeValue");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_carrier_creditworthiness_type.update_time not between", value1, value2, "updateTime");
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