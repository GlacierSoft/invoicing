package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public RoleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("temp_role.role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("temp_role.role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("temp_role.role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("temp_role.role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("temp_role.role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_role.role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("temp_role.role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("temp_role.role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("temp_role.role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("temp_role.role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("temp_role.role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("temp_role.role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("temp_role.role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("temp_role.role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIsNull() {
            addCriterion("temp_role.role_en_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIsNotNull() {
            addCriterion("temp_role.role_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameEqualTo(String value) {
            addCriterion("temp_role.role_en_name =", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotEqualTo(String value) {
            addCriterion("temp_role.role_en_name <>", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameGreaterThan(String value) {
            addCriterion("temp_role.role_en_name >", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_role.role_en_name >=", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLessThan(String value) {
            addCriterion("temp_role.role_en_name <", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_role.role_en_name <=", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLike(String value) {
            addCriterion("temp_role.role_en_name like", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotLike(String value) {
            addCriterion("temp_role.role_en_name not like", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIn(List<String> values) {
            addCriterion("temp_role.role_en_name in", values, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotIn(List<String> values) {
            addCriterion("temp_role.role_en_name not in", values, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameBetween(String value1, String value2) {
            addCriterion("temp_role.role_en_name between", value1, value2, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotBetween(String value1, String value2) {
            addCriterion("temp_role.role_en_name not between", value1, value2, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameIsNull() {
            addCriterion("temp_role.role_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameIsNotNull() {
            addCriterion("temp_role.role_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameEqualTo(String value) {
            addCriterion("temp_role.role_cn_name =", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameNotEqualTo(String value) {
            addCriterion("temp_role.role_cn_name <>", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameGreaterThan(String value) {
            addCriterion("temp_role.role_cn_name >", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_role.role_cn_name >=", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameLessThan(String value) {
            addCriterion("temp_role.role_cn_name <", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_role.role_cn_name <=", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameLike(String value) {
            addCriterion("temp_role.role_cn_name like", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameNotLike(String value) {
            addCriterion("temp_role.role_cn_name not like", value, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameIn(List<String> values) {
            addCriterion("temp_role.role_cn_name in", values, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameNotIn(List<String> values) {
            addCriterion("temp_role.role_cn_name not in", values, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameBetween(String value1, String value2) {
            addCriterion("temp_role.role_cn_name between", value1, value2, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andRoleCnNameNotBetween(String value1, String value2) {
            addCriterion("temp_role.role_cn_name not between", value1, value2, "roleCnName");
            return (Criteria) this;
        }

        public Criteria andBuiltinIsNull() {
            addCriterion("temp_role.builtin is null");
            return (Criteria) this;
        }

        public Criteria andBuiltinIsNotNull() {
            addCriterion("temp_role.builtin is not null");
            return (Criteria) this;
        }

        public Criteria andBuiltinEqualTo(String value) {
            addCriterion("temp_role.builtin =", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotEqualTo(String value) {
            addCriterion("temp_role.builtin <>", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinGreaterThan(String value) {
            addCriterion("temp_role.builtin >", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinGreaterThanOrEqualTo(String value) {
            addCriterion("temp_role.builtin >=", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinLessThan(String value) {
            addCriterion("temp_role.builtin <", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinLessThanOrEqualTo(String value) {
            addCriterion("temp_role.builtin <=", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinLike(String value) {
            addCriterion("temp_role.builtin like", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotLike(String value) {
            addCriterion("temp_role.builtin not like", value, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinIn(List<String> values) {
            addCriterion("temp_role.builtin in", values, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotIn(List<String> values) {
            addCriterion("temp_role.builtin not in", values, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinBetween(String value1, String value2) {
            addCriterion("temp_role.builtin between", value1, value2, "builtin");
            return (Criteria) this;
        }

        public Criteria andBuiltinNotBetween(String value1, String value2) {
            addCriterion("temp_role.builtin not between", value1, value2, "builtin");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_role.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_role.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_role.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_role.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_role.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_role.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_role.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_role.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_role.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_role.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_role.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_role.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_role.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_role.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_role.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_role.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_role.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_role.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_role.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_role.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_role.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_role.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_role.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_role.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_role.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_role.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_role.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_role.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_role.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_role.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("temp_role.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("temp_role.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("temp_role.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("temp_role.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("temp_role.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("temp_role.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("temp_role.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("temp_role.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("temp_role.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("temp_role.create_time not between", value1, value2, "createTime");
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