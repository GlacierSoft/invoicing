package com.glacier.frame.entity.basicdatas;

import java.util.ArrayList;
import java.util.List;

public class ParWarGoodsClassifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public ParWarGoodsClassifyExample() {
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

        public Criteria andWarehouseClassifyIdIsNull() {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdIsNotNull() {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id =", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdNotEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id <>", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdGreaterThan(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id >", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id >=", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdLessThan(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id <", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id <=", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdLike(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id like", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdNotLike(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id not like", value, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdIn(List<String> values) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id in", values, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdNotIn(List<String> values) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id not in", values, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdBetween(String value1, String value2) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id between", value1, value2, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseClassifyIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_goods_classify.warehouse_classify_id not between", value1, value2, "warehouseClassifyId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("temp_par_war_goods_classify.warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("temp_par_war_goods_classify.warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLike(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotLike(String value) {
            addCriterion("temp_par_war_goods_classify.warehouse_id not like", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<String> values) {
            addCriterion("temp_par_war_goods_classify.warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<String> values) {
            addCriterion("temp_par_war_goods_classify.warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(String value1, String value2) {
            addCriterion("temp_par_war_goods_classify.warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_goods_classify.warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdIsNull() {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdIsNotNull() {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id =", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdNotEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id <>", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdGreaterThan(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id >", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id >=", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdLessThan(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id <", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id <=", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdLike(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id like", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdNotLike(String value) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id not like", value, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdIn(List<String> values) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id in", values, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdNotIn(List<String> values) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id not in", values, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdBetween(String value1, String value2) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id between", value1, value2, "warGoodsTypeId");
            return (Criteria) this;
        }

        public Criteria andWarGoodsTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_par_war_goods_classify.war_goods_type_id not between", value1, value2, "warGoodsTypeId");
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