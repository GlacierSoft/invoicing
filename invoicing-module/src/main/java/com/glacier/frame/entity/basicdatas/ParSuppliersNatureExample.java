package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParSuppliersNatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParSuppliersNatureExample() {
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

        public Criteria andNatureIdIsNull() {
            addCriterion("temp_par_suppliers_nature.nature_id is null");
            return (Criteria) this;
        }

        public Criteria andNatureIdIsNotNull() {
            addCriterion("temp_par_suppliers_nature.nature_id is not null");
            return (Criteria) this;
        }

        public Criteria andNatureIdEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id =", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id <>", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id >", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id >=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id <", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id <=", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdLike(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id like", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.nature_id not like", value, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.nature_id in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.nature_id not in", values, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.nature_id between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.nature_id not between", value1, value2, "natureId");
            return (Criteria) this;
        }

        public Criteria andNatureNameIsNull() {
            addCriterion("temp_par_suppliers_nature.nature_name is null");
            return (Criteria) this;
        }

        public Criteria andNatureNameIsNotNull() {
            addCriterion("temp_par_suppliers_nature.nature_name is not null");
            return (Criteria) this;
        }

        public Criteria andNatureNameEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name =", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name <>", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name >", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name >=", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name <", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name <=", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameLike(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name like", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.nature_name not like", value, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.nature_name in", values, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.nature_name not in", values, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.nature_name between", value1, value2, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureNameNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.nature_name not between", value1, value2, "natureName");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIsNull() {
            addCriterion("temp_par_suppliers_nature.nature_code is null");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIsNotNull() {
            addCriterion("temp_par_suppliers_nature.nature_code is not null");
            return (Criteria) this;
        }

        public Criteria andNatureCodeEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code =", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code <>", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code >", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code >=", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code <", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code <=", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeLike(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code like", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.nature_code not like", value, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.nature_code in", values, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.nature_code not in", values, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.nature_code between", value1, value2, "natureCode");
            return (Criteria) this;
        }

        public Criteria andNatureCodeNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.nature_code not between", value1, value2, "natureCode");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_par_suppliers_nature.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_par_suppliers_nature.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_par_suppliers_nature.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_par_suppliers_nature.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_par_suppliers_nature.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_par_suppliers_nature.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_par_suppliers_nature.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_par_suppliers_nature.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_par_suppliers_nature.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_par_suppliers_nature.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_par_suppliers_nature.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_nature.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_par_suppliers_nature.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_par_suppliers_nature.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_nature.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_nature.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_nature.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_par_suppliers_nature.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_par_suppliers_nature.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_par_suppliers_nature.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_par_suppliers_nature.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_nature.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_par_suppliers_nature.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_par_suppliers_nature.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_nature.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_nature.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_par_suppliers_nature.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_par_suppliers_nature.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_nature.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_par_suppliers_nature.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_nature.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_par_suppliers_nature.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_nature.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_nature.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_nature.update_time not between", value1, value2, "updateTime");
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