package com.glacier.frame.entity.system;

import java.util.ArrayList;
import java.util.List;

public class ActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ActionExample() {
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

        public Criteria andActionIdIsNull() {
            addCriterion("temp_action.action_id is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("temp_action.action_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(String value) {
            addCriterion("temp_action.action_id =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(String value) {
            addCriterion("temp_action.action_id <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(String value) {
            addCriterion("temp_action.action_id >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.action_id >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(String value) {
            addCriterion("temp_action.action_id <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(String value) {
            addCriterion("temp_action.action_id <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLike(String value) {
            addCriterion("temp_action.action_id like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotLike(String value) {
            addCriterion("temp_action.action_id not like", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<String> values) {
            addCriterion("temp_action.action_id in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<String> values) {
            addCriterion("temp_action.action_id not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(String value1, String value2) {
            addCriterion("temp_action.action_id between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(String value1, String value2) {
            addCriterion("temp_action.action_id not between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("temp_action.menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("temp_action.menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("temp_action.menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("temp_action.menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("temp_action.menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("temp_action.menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("temp_action.menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("temp_action.menu_id like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("temp_action.menu_id not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("temp_action.menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("temp_action.menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("temp_action.menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("temp_action.menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNull() {
            addCriterion("temp_action.panel_id is null");
            return (Criteria) this;
        }

        public Criteria andPanelIdIsNotNull() {
            addCriterion("temp_action.panel_id is not null");
            return (Criteria) this;
        }

        public Criteria andPanelIdEqualTo(String value) {
            addCriterion("temp_action.panel_id =", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotEqualTo(String value) {
            addCriterion("temp_action.panel_id <>", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThan(String value) {
            addCriterion("temp_action.panel_id >", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.panel_id >=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThan(String value) {
            addCriterion("temp_action.panel_id <", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLessThanOrEqualTo(String value) {
            addCriterion("temp_action.panel_id <=", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdLike(String value) {
            addCriterion("temp_action.panel_id like", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotLike(String value) {
            addCriterion("temp_action.panel_id not like", value, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdIn(List<String> values) {
            addCriterion("temp_action.panel_id in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotIn(List<String> values) {
            addCriterion("temp_action.panel_id not in", values, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdBetween(String value1, String value2) {
            addCriterion("temp_action.panel_id between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andPanelIdNotBetween(String value1, String value2) {
            addCriterion("temp_action.panel_id not between", value1, value2, "panelId");
            return (Criteria) this;
        }

        public Criteria andActionCnNameIsNull() {
            addCriterion("temp_action.action_cn_name is null");
            return (Criteria) this;
        }

        public Criteria andActionCnNameIsNotNull() {
            addCriterion("temp_action.action_cn_name is not null");
            return (Criteria) this;
        }

        public Criteria andActionCnNameEqualTo(String value) {
            addCriterion("temp_action.action_cn_name =", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameNotEqualTo(String value) {
            addCriterion("temp_action.action_cn_name <>", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameGreaterThan(String value) {
            addCriterion("temp_action.action_cn_name >", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.action_cn_name >=", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameLessThan(String value) {
            addCriterion("temp_action.action_cn_name <", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_action.action_cn_name <=", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameLike(String value) {
            addCriterion("temp_action.action_cn_name like", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameNotLike(String value) {
            addCriterion("temp_action.action_cn_name not like", value, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameIn(List<String> values) {
            addCriterion("temp_action.action_cn_name in", values, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameNotIn(List<String> values) {
            addCriterion("temp_action.action_cn_name not in", values, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameBetween(String value1, String value2) {
            addCriterion("temp_action.action_cn_name between", value1, value2, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionCnNameNotBetween(String value1, String value2) {
            addCriterion("temp_action.action_cn_name not between", value1, value2, "actionCnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameIsNull() {
            addCriterion("temp_action.action_en_name is null");
            return (Criteria) this;
        }

        public Criteria andActionEnNameIsNotNull() {
            addCriterion("temp_action.action_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andActionEnNameEqualTo(String value) {
            addCriterion("temp_action.action_en_name =", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameNotEqualTo(String value) {
            addCriterion("temp_action.action_en_name <>", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameGreaterThan(String value) {
            addCriterion("temp_action.action_en_name >", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.action_en_name >=", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameLessThan(String value) {
            addCriterion("temp_action.action_en_name <", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameLessThanOrEqualTo(String value) {
            addCriterion("temp_action.action_en_name <=", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameLike(String value) {
            addCriterion("temp_action.action_en_name like", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameNotLike(String value) {
            addCriterion("temp_action.action_en_name not like", value, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameIn(List<String> values) {
            addCriterion("temp_action.action_en_name in", values, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameNotIn(List<String> values) {
            addCriterion("temp_action.action_en_name not in", values, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameBetween(String value1, String value2) {
            addCriterion("temp_action.action_en_name between", value1, value2, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andActionEnNameNotBetween(String value1, String value2) {
            addCriterion("temp_action.action_en_name not between", value1, value2, "actionEnName");
            return (Criteria) this;
        }

        public Criteria andIconClsIsNull() {
            addCriterion("temp_action.icon_cls is null");
            return (Criteria) this;
        }

        public Criteria andIconClsIsNotNull() {
            addCriterion("temp_action.icon_cls is not null");
            return (Criteria) this;
        }

        public Criteria andIconClsEqualTo(String value) {
            addCriterion("temp_action.icon_cls =", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotEqualTo(String value) {
            addCriterion("temp_action.icon_cls <>", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsGreaterThan(String value) {
            addCriterion("temp_action.icon_cls >", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.icon_cls >=", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsLessThan(String value) {
            addCriterion("temp_action.icon_cls <", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsLessThanOrEqualTo(String value) {
            addCriterion("temp_action.icon_cls <=", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsLike(String value) {
            addCriterion("temp_action.icon_cls like", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotLike(String value) {
            addCriterion("temp_action.icon_cls not like", value, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsIn(List<String> values) {
            addCriterion("temp_action.icon_cls in", values, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotIn(List<String> values) {
            addCriterion("temp_action.icon_cls not in", values, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsBetween(String value1, String value2) {
            addCriterion("temp_action.icon_cls between", value1, value2, "iconCls");
            return (Criteria) this;
        }

        public Criteria andIconClsNotBetween(String value1, String value2) {
            addCriterion("temp_action.icon_cls not between", value1, value2, "iconCls");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("temp_action.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("temp_action.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("temp_action.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("temp_action.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("temp_action.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("temp_action.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_action.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("temp_action.type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("temp_action.type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("temp_action.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("temp_action.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("temp_action.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("temp_action.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("temp_action.disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("temp_action.disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(String value) {
            addCriterion("temp_action.disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(String value) {
            addCriterion("temp_action.disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(String value) {
            addCriterion("temp_action.disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(String value) {
            addCriterion("temp_action.disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(String value) {
            addCriterion("temp_action.disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLike(String value) {
            addCriterion("temp_action.disabled like", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotLike(String value) {
            addCriterion("temp_action.disabled not like", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<String> values) {
            addCriterion("temp_action.disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<String> values) {
            addCriterion("temp_action.disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(String value1, String value2) {
            addCriterion("temp_action.disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(String value1, String value2) {
            addCriterion("temp_action.disabled not between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("temp_action.method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("temp_action.method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("temp_action.method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("temp_action.method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("temp_action.method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("temp_action.method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("temp_action.method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("temp_action.method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("temp_action.method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("temp_action.method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("temp_action.method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("temp_action.method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("temp_action.method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("temp_action.order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("temp_action.order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("temp_action.order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("temp_action.order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("temp_action.order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_action.order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("temp_action.order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_action.order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("temp_action.order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("temp_action.order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_action.order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_action.order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_action.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_action.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_action.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_action.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_action.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_action.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_action.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_action.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_action.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_action.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_action.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_action.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_action.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_action.remark not between", value1, value2, "remark");
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