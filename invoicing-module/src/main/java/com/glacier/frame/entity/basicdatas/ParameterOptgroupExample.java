package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParameterOptgroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParameterOptgroupExample() {
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

        public Criteria andOptgroupIdIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_id is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id =", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id <>", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id >", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id >=", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdLessThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id <", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id <=", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id like", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_id not like", value, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_id in", values, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_id not in", values, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_id between", value1, value2, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupIdNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_id not between", value1, value2, "optgroupId");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_pid is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_pid is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid =", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid <>", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid >", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid >=", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidLessThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid <", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid <=", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid like", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidNotLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_pid not like", value, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_pid in", values, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_pid not in", values, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_pid between", value1, value2, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupPidNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_pid not between", value1, value2, "optgroupPid");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_code is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_code is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code =", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code <>", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code >", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code >=", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeLessThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code <", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code <=", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code like", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeNotLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_code not like", value, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_code in", values, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_code not in", values, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_code between", value1, value2, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupCodeNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_code not between", value1, value2, "optgroupCode");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_name is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name =", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name <>", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name >", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name >=", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameLessThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name <", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name <=", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name like", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameNotLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_name not like", value, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_name in", values, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_name not in", values, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_name between", value1, value2, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupNameNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_name not between", value1, value2, "optgroupName");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_icon is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_icon is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon =", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon <>", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon >", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon >=", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconLessThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon <", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon <=", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon like", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconNotLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_icon not like", value, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_icon in", values, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_icon not in", values, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_icon between", value1, value2, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupIconNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_icon not between", value1, value2, "optgroupIcon");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_url is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_url is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url =", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url <>", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url >", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url >=", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlLessThan(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url <", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url <=", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url like", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlNotLike(String value) {
            addCriterion("temp_parameter_optgroup.optgroup_url not like", value, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_url in", values, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.optgroup_url not in", values, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_url between", value1, value2, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupUrlNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.optgroup_url not between", value1, value2, "optgroupUrl");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumIsNull() {
            addCriterion("temp_parameter_optgroup.optgroup_num is null");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumIsNotNull() {
            addCriterion("temp_parameter_optgroup.optgroup_num is not null");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup.optgroup_num =", value, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumNotEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup.optgroup_num <>", value, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumGreaterThan(Integer value) {
            addCriterion("temp_parameter_optgroup.optgroup_num >", value, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup.optgroup_num >=", value, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumLessThan(Integer value) {
            addCriterion("temp_parameter_optgroup.optgroup_num <", value, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_parameter_optgroup.optgroup_num <=", value, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumIn(List<Integer> values) {
            addCriterion("temp_parameter_optgroup.optgroup_num in", values, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumNotIn(List<Integer> values) {
            addCriterion("temp_parameter_optgroup.optgroup_num not in", values, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_optgroup.optgroup_num between", value1, value2, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andOptgroupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_parameter_optgroup.optgroup_num not between", value1, value2, "optgroupNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_parameter_optgroup.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_parameter_optgroup.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_parameter_optgroup.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_parameter_optgroup.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_parameter_optgroup.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_parameter_optgroup.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_parameter_optgroup.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_parameter_optgroup.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_parameter_optgroup.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_parameter_optgroup.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_parameter_optgroup.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_parameter_optgroup.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_optgroup.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_parameter_optgroup.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_parameter_optgroup.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_parameter_optgroup.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_parameter_optgroup.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_parameter_optgroup.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_parameter_optgroup.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_parameter_optgroup.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_parameter_optgroup.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_parameter_optgroup.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_parameter_optgroup.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_parameter_optgroup.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_parameter_optgroup.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_parameter_optgroup.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_parameter_optgroup.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_parameter_optgroup.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_parameter_optgroup.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_parameter_optgroup.update_time not between", value1, value2, "updateTime");
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