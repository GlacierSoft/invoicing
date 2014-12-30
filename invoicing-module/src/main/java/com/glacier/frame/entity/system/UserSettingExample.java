package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.List;

public class UserSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UserSettingExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("temp_user_setting.user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("temp_user_setting.user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("temp_user_setting.user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("temp_user_setting.user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("temp_user_setting.user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("temp_user_setting.user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("temp_user_setting.user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("temp_user_setting.user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("temp_user_setting.user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("temp_user_setting.user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("temp_user_setting.user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("temp_user_setting.user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSetKeyIsNull() {
            addCriterion("temp_user_setting.set_key is null");
            return (Criteria) this;
        }

        public Criteria andSetKeyIsNotNull() {
            addCriterion("temp_user_setting.set_key is not null");
            return (Criteria) this;
        }

        public Criteria andSetKeyEqualTo(String value) {
            addCriterion("temp_user_setting.set_key =", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyNotEqualTo(String value) {
            addCriterion("temp_user_setting.set_key <>", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyGreaterThan(String value) {
            addCriterion("temp_user_setting.set_key >", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_key >=", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyLessThan(String value) {
            addCriterion("temp_user_setting.set_key <", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyLessThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_key <=", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyLike(String value) {
            addCriterion("temp_user_setting.set_key like", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyNotLike(String value) {
            addCriterion("temp_user_setting.set_key not like", value, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyIn(List<String> values) {
            addCriterion("temp_user_setting.set_key in", values, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyNotIn(List<String> values) {
            addCriterion("temp_user_setting.set_key not in", values, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_key between", value1, value2, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetKeyNotBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_key not between", value1, value2, "setKey");
            return (Criteria) this;
        }

        public Criteria andSetNameIsNull() {
            addCriterion("temp_user_setting.set_name is null");
            return (Criteria) this;
        }

        public Criteria andSetNameIsNotNull() {
            addCriterion("temp_user_setting.set_name is not null");
            return (Criteria) this;
        }

        public Criteria andSetNameEqualTo(String value) {
            addCriterion("temp_user_setting.set_name =", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotEqualTo(String value) {
            addCriterion("temp_user_setting.set_name <>", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameGreaterThan(String value) {
            addCriterion("temp_user_setting.set_name >", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_name >=", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameLessThan(String value) {
            addCriterion("temp_user_setting.set_name <", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameLessThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_name <=", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameLike(String value) {
            addCriterion("temp_user_setting.set_name like", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotLike(String value) {
            addCriterion("temp_user_setting.set_name not like", value, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameIn(List<String> values) {
            addCriterion("temp_user_setting.set_name in", values, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotIn(List<String> values) {
            addCriterion("temp_user_setting.set_name not in", values, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_name between", value1, value2, "setName");
            return (Criteria) this;
        }

        public Criteria andSetNameNotBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_name not between", value1, value2, "setName");
            return (Criteria) this;
        }

        public Criteria andSetValueIsNull() {
            addCriterion("temp_user_setting.set_value is null");
            return (Criteria) this;
        }

        public Criteria andSetValueIsNotNull() {
            addCriterion("temp_user_setting.set_value is not null");
            return (Criteria) this;
        }

        public Criteria andSetValueEqualTo(String value) {
            addCriterion("temp_user_setting.set_value =", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueNotEqualTo(String value) {
            addCriterion("temp_user_setting.set_value <>", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueGreaterThan(String value) {
            addCriterion("temp_user_setting.set_value >", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueGreaterThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_value >=", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueLessThan(String value) {
            addCriterion("temp_user_setting.set_value <", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueLessThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_value <=", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueLike(String value) {
            addCriterion("temp_user_setting.set_value like", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueNotLike(String value) {
            addCriterion("temp_user_setting.set_value not like", value, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueIn(List<String> values) {
            addCriterion("temp_user_setting.set_value in", values, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueNotIn(List<String> values) {
            addCriterion("temp_user_setting.set_value not in", values, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_value between", value1, value2, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetValueNotBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_value not between", value1, value2, "setValue");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionIsNull() {
            addCriterion("temp_user_setting.set_description is null");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionIsNotNull() {
            addCriterion("temp_user_setting.set_description is not null");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionEqualTo(String value) {
            addCriterion("temp_user_setting.set_description =", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionNotEqualTo(String value) {
            addCriterion("temp_user_setting.set_description <>", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionGreaterThan(String value) {
            addCriterion("temp_user_setting.set_description >", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_description >=", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionLessThan(String value) {
            addCriterion("temp_user_setting.set_description <", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionLessThanOrEqualTo(String value) {
            addCriterion("temp_user_setting.set_description <=", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionLike(String value) {
            addCriterion("temp_user_setting.set_description like", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionNotLike(String value) {
            addCriterion("temp_user_setting.set_description not like", value, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionIn(List<String> values) {
            addCriterion("temp_user_setting.set_description in", values, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionNotIn(List<String> values) {
            addCriterion("temp_user_setting.set_description not in", values, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_description between", value1, value2, "setDescription");
            return (Criteria) this;
        }

        public Criteria andSetDescriptionNotBetween(String value1, String value2) {
            addCriterion("temp_user_setting.set_description not between", value1, value2, "setDescription");
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