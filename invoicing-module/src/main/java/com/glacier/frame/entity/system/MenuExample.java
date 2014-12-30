package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("temp_menu.menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("temp_menu.menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("temp_menu.menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("temp_menu.menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("temp_menu.menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("temp_menu.menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("temp_menu.menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("temp_menu.menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("temp_menu.menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("temp_menu.menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("temp_menu.menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("temp_menu.menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("temp_menu.pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("temp_menu.pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("temp_menu.pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("temp_menu.pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("temp_menu.pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("temp_menu.pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("temp_menu.pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("temp_menu.pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("temp_menu.pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("temp_menu.pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("temp_menu.pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("temp_menu.pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameIsNull() {
            addCriterion("temp_menu.menu_en_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameIsNotNull() {
            addCriterion("temp_menu.menu_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameEqualTo(String value) {
            addCriterion("temp_menu.menu_en_name =", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameNotEqualTo(String value) {
            addCriterion("temp_menu.menu_en_name <>", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameGreaterThan(String value) {
            addCriterion("temp_menu.menu_en_name >", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.menu_en_name >=", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameLessThan(String value) {
            addCriterion("temp_menu.menu_en_name <", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.menu_en_name <=", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameLike(String value) {
            addCriterion("temp_menu.menu_en_name like", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameNotLike(String value) {
            addCriterion("temp_menu.menu_en_name not like", value, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameIn(List<String> values) {
            addCriterion("temp_menu.menu_en_name in", values, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameNotIn(List<String> values) {
            addCriterion("temp_menu.menu_en_name not in", values, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameBetween(String value1, String value2) {
            addCriterion("temp_menu.menu_en_name between", value1, value2, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuEnNameNotBetween(String value1, String value2) {
            addCriterion("temp_menu.menu_en_name not between", value1, value2, "menuEnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameIsNull() {
            addCriterion("temp_menu.menu_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameIsNotNull() {
            addCriterion("temp_menu.menu_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameEqualTo(String value) {
            addCriterion("temp_menu.menu_cn_name =", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameNotEqualTo(String value) {
            addCriterion("temp_menu.menu_cn_name <>", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameGreaterThan(String value) {
            addCriterion("temp_menu.menu_cn_name >", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.menu_cn_name >=", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameLessThan(String value) {
            addCriterion("temp_menu.menu_cn_name <", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.menu_cn_name <=", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameLike(String value) {
            addCriterion("temp_menu.menu_cn_name like", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameNotLike(String value) {
            addCriterion("temp_menu.menu_cn_name not like", value, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameIn(List<String> values) {
            addCriterion("temp_menu.menu_cn_name in", values, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameNotIn(List<String> values) {
            addCriterion("temp_menu.menu_cn_name not in", values, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameBetween(String value1, String value2) {
            addCriterion("temp_menu.menu_cn_name between", value1, value2, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andMenuCnNameNotBetween(String value1, String value2) {
            addCriterion("temp_menu.menu_cn_name not between", value1, value2, "menuCnName");
            return (Criteria) this;
        }

        public Criteria andIconClsIsNull() {
            addCriterion("temp_menu.icon_cls is null");
            return (Criteria) this;
        }

        public Criteria andIconClsIsNotNull() {
            addCriterion("temp_menu.icon_cls is not null");
            return (Criteria) this;
        }

        public Criteria andIconClsEqualTo(String value) {
            addCriterion("temp_menu.icon_cls =", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotEqualTo(String value) {
            addCriterion("temp_menu.icon_cls <>", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsGreaterThan(String value) {
            addCriterion("temp_menu.icon_cls >", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.icon_cls >=", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsLessThan(String value) {
            addCriterion("temp_menu.icon_cls <", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.icon_cls <=", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsLike(String value) {
            addCriterion("temp_menu.icon_cls like", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotLike(String value) {
            addCriterion("temp_menu.icon_cls not like", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsIn(List<String> values) {
            addCriterion("temp_menu.icon_cls in", values, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotIn(List<String> values) {
            addCriterion("temp_menu.icon_cls not in", values, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsBetween(String value1, String value2) {
            addCriterion("temp_menu.icon_cls between", value1, value2, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotBetween(String value1, String value2) {
            addCriterion("temp_menu.icon_cls not between", value1, value2, "iconCls");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("temp_menu.url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("temp_menu.url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("temp_menu.url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("temp_menu.url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("temp_menu.url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("temp_menu.url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("temp_menu.url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("temp_menu.url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("temp_menu.url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("temp_menu.url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("temp_menu.url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("temp_menu.url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("temp_menu.order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("temp_menu.order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("temp_menu.order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("temp_menu.order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("temp_menu.order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_menu.order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("temp_menu.order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_menu.order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("temp_menu.order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("temp_menu.order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_menu.order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_menu.order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_menu.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_menu.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_menu.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_menu.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_menu.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_menu.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_menu.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_menu.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_menu.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_menu.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_menu.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_menu.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_menu.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_menu.remark not between", value1, value2, "remark");
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