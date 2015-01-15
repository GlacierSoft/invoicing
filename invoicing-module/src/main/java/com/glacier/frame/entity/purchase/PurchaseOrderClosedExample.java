package com.glacier.frame.entity.purchase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderClosedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseOrderClosedExample() {
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

        public Criteria andPurOrderColIdIsNull() {
            addCriterion("temp_purchase_order_closed.pur_order_col_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdIsNotNull() {
            addCriterion("temp_purchase_order_closed.pur_order_col_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id =", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id <>", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id >", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id >=", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdLessThan(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id <", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id <=", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdLike(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id like", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdNotLike(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id not like", value, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id in", values, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id not in", values, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id between", value1, value2, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andPurOrderColIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.pur_order_col_id not between", value1, value2, "purOrderColId");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeIsNull() {
            addCriterion("temp_purchase_order_closed.order_clo_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeIsNotNull() {
            addCriterion("temp_purchase_order_closed.order_clo_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code =", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code <>", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code >", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code >=", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeLessThan(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code <", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code <=", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeLike(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code like", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeNotLike(String value) {
            addCriterion("temp_purchase_order_closed.order_clo_code not like", value, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.order_clo_code in", values, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.order_clo_code not in", values, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.order_clo_code between", value1, value2, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andOrderCloCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.order_clo_code not between", value1, value2, "orderCloCode");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNull() {
            addCriterion("temp_purchase_order_closed.pur_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("temp_purchase_order_closed.pur_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("temp_purchase_order_closed.pur_order_id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.pur_order_id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.pur_order_id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.pur_order_id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.pur_order_id not between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("temp_purchase_order_closed.content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("temp_purchase_order_closed.content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("temp_purchase_order_closed.content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("temp_purchase_order_closed.content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("temp_purchase_order_closed.content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("temp_purchase_order_closed.content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNull() {
            addCriterion("temp_purchase_order_closed.operator_dep is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNotNull() {
            addCriterion("temp_purchase_order_closed.operator_dep is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep =", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep <>", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThan(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep >", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep >=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThan(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep <", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep <=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLike(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotLike(String value) {
            addCriterion("temp_purchase_order_closed.operator_dep not like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.operator_dep in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.operator_dep not in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.operator_dep between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.operator_dep not between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_order_closed.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_order_closed.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_order_closed.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_order_closed.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_closed.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_order_closed.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_order_closed.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_order_closed.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_closed.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_order_closed.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_order_closed.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_order_closed.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_order_closed.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_order_closed.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_closed.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_order_closed.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_closed.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_order_closed.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_order_closed.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_closed.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_closed.create_time not between", value1, value2, "createTime");
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