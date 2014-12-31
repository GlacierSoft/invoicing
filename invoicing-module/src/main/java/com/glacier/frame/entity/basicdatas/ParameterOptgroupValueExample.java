package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterOptgroupValueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterOptgroupValueExample() {
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

        public Criteria andOptgroupValueIdIsNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id =", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id <>", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id >", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id >=", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id <", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id <=", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id like", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id not like", value, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id in", values, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id not in", values, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id between", value1, value2, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_id not between", value1, value2, "optgroupValueId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdIsNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_id is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id =", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id <>", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id >", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id >=", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id <", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id <=", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id like", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id not like", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id in", values, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id not in", values, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id between", value1, value2, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_id not between", value1, value2, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeIsNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code =", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code <>", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code >", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code >=", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code <", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code <=", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code like", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code not like", value, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code in", values, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code not in", values, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code between", value1, value2, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueCodeNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_code not between", value1, value2, "optgroupValueCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameIsNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name =", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name <>", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name >", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name >=", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name <", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name <=", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name like", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name not like", value, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name in", values, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name not in", values, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name between", value1, value2, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNameNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_name not between", value1, value2, "optgroupValueName");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("temp_parameter_optgroup_value.status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("temp_parameter_optgroup_value.status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumIsNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num =", value, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumNotEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num <>", value, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumGreaterThan(Integer value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num >", value, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num >=", value, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumLessThan(Integer value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num <", value, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num <=", value, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumIn(List<Integer> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num in", values, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumNotIn(List<Integer> values) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num not in", values, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num between", value1, value2, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupValueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_optgroup_value.optgroup_value_num not between", value1, value2, "optgroupValueNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_optgroup_value.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_optgroup_value.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_optgroup_value.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_optgroup_value.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_optgroup_value.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_optgroup_value.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_optgroup_value.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup_value.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup_value.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup_value.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup_value.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_optgroup_value.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup_value.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_optgroup_value.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup_value.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_optgroup_value.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_optgroup_value.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup_value.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup_value.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_optgroup_value.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_optgroup_value.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_optgroup_value.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_optgroup_value.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup_value.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup_value.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup_value.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup_value.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup_value.update_time not between", value1, value2, "updateTime");
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