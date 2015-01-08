package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParSuppliersSizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParSuppliersSizeExample() {
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

        public Criteria andSizeIdIsNull() {
            addCriterion("temp_par_suppliers_size.size_id is null");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNotNull() {
            addCriterion("temp_par_suppliers_size.size_id is not null");
            return (Criteria) this;
        }

        public Criteria andSizeIdEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_id =", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_id <>", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.size_id >", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_id >=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThan(String value) {
            addCriterion("temp_par_suppliers_size.size_id <", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_id <=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLike(String value) {
            addCriterion("temp_par_suppliers_size.size_id like", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotLike(String value) {
            addCriterion("temp_par_suppliers_size.size_id not like", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.size_id in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.size_id not in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.size_id between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.size_id not between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNull() {
            addCriterion("temp_par_suppliers_size.size_name is null");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNotNull() {
            addCriterion("temp_par_suppliers_size.size_name is not null");
            return (Criteria) this;
        }

        public Criteria andSizeNameEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_name =", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_name <>", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.size_name >", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_name >=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThan(String value) {
            addCriterion("temp_par_suppliers_size.size_name <", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_name <=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLike(String value) {
            addCriterion("temp_par_suppliers_size.size_name like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotLike(String value) {
            addCriterion("temp_par_suppliers_size.size_name not like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.size_name in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.size_name not in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.size_name between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.size_name not between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIsNull() {
            addCriterion("temp_par_suppliers_size.size_code is null");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIsNotNull() {
            addCriterion("temp_par_suppliers_size.size_code is not null");
            return (Criteria) this;
        }

        public Criteria andSizeCodeEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_code =", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_code <>", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.size_code >", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_code >=", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLessThan(String value) {
            addCriterion("temp_par_suppliers_size.size_code <", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.size_code <=", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeLike(String value) {
            addCriterion("temp_par_suppliers_size.size_code like", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotLike(String value) {
            addCriterion("temp_par_suppliers_size.size_code not like", value, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.size_code in", values, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.size_code not in", values, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.size_code between", value1, value2, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andSizeCodeNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.size_code not between", value1, value2, "sizeCode");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_par_suppliers_size.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_par_suppliers_size.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_par_suppliers_size.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_par_suppliers_size.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_par_suppliers_size.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_par_suppliers_size.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_par_suppliers_size.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_par_suppliers_size.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_par_suppliers_size.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_par_suppliers_size.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_par_suppliers_size.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_par_suppliers_size.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_par_suppliers_size.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_par_suppliers_size.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_par_suppliers_size.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_par_suppliers_size.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_par_suppliers_size.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_size.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_par_suppliers_size.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_par_suppliers_size.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_size.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_size.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_size.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_par_suppliers_size.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_par_suppliers_size.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_par_suppliers_size.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_par_suppliers_size.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_par_suppliers_size.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_par_suppliers_size.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_par_suppliers_size.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_par_suppliers_size.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_par_suppliers_size.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_par_suppliers_size.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_par_suppliers_size.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_par_suppliers_size.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_par_suppliers_size.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_par_suppliers_size.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_par_suppliers_size.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_par_suppliers_size.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_size.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_par_suppliers_size.update_time not between", value1, value2, "updateTime");
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