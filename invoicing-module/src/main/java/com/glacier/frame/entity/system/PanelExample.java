package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.List;

public class PanelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PanelExample() {
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

        public Criteria andPanelIdIsNull() {
            addCriterion("temp_panel.panel_id is null");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNotNull() {
            addCriterion("temp_panel.panel_id is not null");
            return (Criteria) this;
        }

        public Criteria andPanelIdEqualTo(String value) {
            addCriterion("temp_panel.panel_id =", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotEqualTo(String value) {
            addCriterion("temp_panel.panel_id <>", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThan(String value) {
            addCriterion("temp_panel.panel_id >", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_panel.panel_id >=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThan(String value) {
            addCriterion("temp_panel.panel_id <", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThanOrEqualTo(String value) {
            addCriterion("temp_panel.panel_id <=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLike(String value) {
            addCriterion("temp_panel.panel_id like", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotLike(String value) {
            addCriterion("temp_panel.panel_id not like", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdIn(List<String> values) {
            addCriterion("temp_panel.panel_id in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotIn(List<String> values) {
            addCriterion("temp_panel.panel_id not in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdBetween(String value1, String value2) {
            addCriterion("temp_panel.panel_id between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotBetween(String value1, String value2) {
            addCriterion("temp_panel.panel_id not between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("temp_panel.menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("temp_panel.menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("temp_panel.menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("temp_panel.menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("temp_panel.menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_panel.menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("temp_panel.menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("temp_panel.menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("temp_panel.menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("temp_panel.menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("temp_panel.menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("temp_panel.menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("temp_panel.menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("temp_panel.menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameIsNull() {
            addCriterion("temp_panel.panel_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameIsNotNull() {
            addCriterion("temp_panel.panel_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameEqualTo(String value) {
            addCriterion("temp_panel.panel_cn_name =", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameNotEqualTo(String value) {
            addCriterion("temp_panel.panel_cn_name <>", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameGreaterThan(String value) {
            addCriterion("temp_panel.panel_cn_name >", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_panel.panel_cn_name >=", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameLessThan(String value) {
            addCriterion("temp_panel.panel_cn_name <", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_panel.panel_cn_name <=", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameLike(String value) {
            addCriterion("temp_panel.panel_cn_name like", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameNotLike(String value) {
            addCriterion("temp_panel.panel_cn_name not like", value, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameIn(List<String> values) {
            addCriterion("temp_panel.panel_cn_name in", values, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameNotIn(List<String> values) {
            addCriterion("temp_panel.panel_cn_name not in", values, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameBetween(String value1, String value2) {
            addCriterion("temp_panel.panel_cn_name between", value1, value2, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelCnNameNotBetween(String value1, String value2) {
            addCriterion("temp_panel.panel_cn_name not between", value1, value2, "panelCnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameIsNull() {
            addCriterion("temp_panel.panel_en_name is null");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameIsNotNull() {
            addCriterion("temp_panel.panel_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameEqualTo(String value) {
            addCriterion("temp_panel.panel_en_name =", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameNotEqualTo(String value) {
            addCriterion("temp_panel.panel_en_name <>", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameGreaterThan(String value) {
            addCriterion("temp_panel.panel_en_name >", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_panel.panel_en_name >=", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameLessThan(String value) {
            addCriterion("temp_panel.panel_en_name <", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_panel.panel_en_name <=", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameLike(String value) {
            addCriterion("temp_panel.panel_en_name like", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameNotLike(String value) {
            addCriterion("temp_panel.panel_en_name not like", value, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameIn(List<String> values) {
            addCriterion("temp_panel.panel_en_name in", values, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameNotIn(List<String> values) {
            addCriterion("temp_panel.panel_en_name not in", values, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameBetween(String value1, String value2) {
            addCriterion("temp_panel.panel_en_name between", value1, value2, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andPanelEnNameNotBetween(String value1, String value2) {
            addCriterion("temp_panel.panel_en_name not between", value1, value2, "panelEnName");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("temp_panel.order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("temp_panel.order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("temp_panel.order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("temp_panel.order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("temp_panel.order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_panel.order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("temp_panel.order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_panel.order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("temp_panel.order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("temp_panel.order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_panel.order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_panel.order_num not between", value1, value2, "orderNum");
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