package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseOrderDetailExample() {
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

        public Criteria andPurOrderDetIdIsNull() {
            addCriterion("temp_purchase_order_detail.pur_order_det_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdIsNotNull() {
            addCriterion("temp_purchase_order_detail.pur_order_det_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id =", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id <>", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id >", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id >=", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdLessThan(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id <", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id <=", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdLike(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id like", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdNotLike(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id not like", value, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id in", values, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id not in", values, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id between", value1, value2, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderDetIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.pur_order_det_id not between", value1, value2, "purOrderDetId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNull() {
            addCriterion("temp_purchase_order_detail.pur_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("temp_purchase_order_detail.pur_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("temp_purchase_order_detail.pur_order_id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.pur_order_id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.pur_order_id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.pur_order_id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.pur_order_id not between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("temp_purchase_order_detail.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("temp_purchase_order_detail.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("temp_purchase_order_detail.goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("temp_purchase_order_detail.goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("temp_purchase_order_detail.goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("temp_purchase_order_detail.goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNull() {
            addCriterion("temp_purchase_order_detail.goods_model is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNotNull() {
            addCriterion("temp_purchase_order_detail.goods_model is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_model =", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_model <>", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_model >", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_model >=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_model <", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_model <=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_model like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_model not like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_model in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_model not in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_model between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_model not between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("temp_purchase_order_detail.goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("temp_purchase_order_detail.goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("temp_purchase_order_detail.goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("temp_purchase_order_detail.quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("temp_purchase_order_detail.quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("temp_purchase_order_detail.price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("temp_purchase_order_detail.price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("temp_purchase_order_detail.brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("temp_purchase_order_detail.brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("temp_purchase_order_detail.brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("temp_purchase_order_detail.brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("temp_purchase_order_detail.brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNull() {
            addCriterion("temp_purchase_order_detail.place_of_origin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNotNull() {
            addCriterion("temp_purchase_order_detail.place_of_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin =", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin <>", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin >", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin >=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThan(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin <", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin <=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLike(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotLike(String value) {
            addCriterion("temp_purchase_order_detail.place_of_origin not like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.place_of_origin in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.place_of_origin not in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.place_of_origin between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.place_of_origin not between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPrimeCostIsNull() {
            addCriterion("temp_purchase_order_detail.prime_cost is null");
            return (Criteria) this;
        }

        public Criteria andPrimeCostIsNotNull() {
            addCriterion("temp_purchase_order_detail.prime_cost is not null");
            return (Criteria) this;
        }

        public Criteria andPrimeCostEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.prime_cost =", value, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.prime_cost <>", value, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.prime_cost >", value, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.prime_cost >=", value, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.prime_cost <", value, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.prime_cost <=", value, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.prime_cost in", values, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.prime_cost not in", values, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.prime_cost between", value1, value2, "primeCost");
            return (Criteria) this;
        }

        public Criteria andPrimeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.prime_cost not between", value1, value2, "primeCost");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("temp_purchase_order_detail.discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("temp_purchase_order_detail.discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andCessIsNull() {
            addCriterion("temp_purchase_order_detail.cess is null");
            return (Criteria) this;
        }

        public Criteria andCessIsNotNull() {
            addCriterion("temp_purchase_order_detail.cess is not null");
            return (Criteria) this;
        }

        public Criteria andCessEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.cess =", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.cess <>", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.cess >", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.cess >=", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.cess <", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.cess <=", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.cess in", values, "cess");
            return (Criteria) this;
        }

        public Criteria andCessNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.cess not in", values, "cess");
            return (Criteria) this;
        }

        public Criteria andCessBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.cess between", value1, value2, "cess");
            return (Criteria) this;
        }

        public Criteria andCessNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.cess not between", value1, value2, "cess");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("temp_purchase_order_detail.money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("temp_purchase_order_detail.money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("temp_purchase_order_detail.deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("temp_purchase_order_detail.deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("temp_purchase_order_detail.deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("temp_purchase_order_detail.deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("temp_purchase_order_detail.deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_detail.deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("temp_purchase_order_detail.deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_detail.deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("temp_purchase_order_detail.deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("temp_purchase_order_detail.deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_detail.deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_detail.deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andNotArrNumIsNull() {
            addCriterion("temp_purchase_order_detail.not_arr_num is null");
            return (Criteria) this;
        }

        public Criteria andNotArrNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.not_arr_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotArrNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_arr_num =", value, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_arr_num <>", value, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_arr_num >", value, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_arr_num >=", value, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_arr_num <", value, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_arr_num <=", value, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_arr_num in", values, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_arr_num not in", values, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_arr_num between", value1, value2, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andNotArrNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_arr_num not between", value1, value2, "notArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumIsNull() {
            addCriterion("temp_purchase_order_detail.alr_arr_num is null");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.alr_arr_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_arr_num =", value, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_arr_num <>", value, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_arr_num >", value, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_arr_num >=", value, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_arr_num <", value, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_arr_num <=", value, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_arr_num in", values, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_arr_num not in", values, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_arr_num between", value1, value2, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andAlrArrNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_arr_num not between", value1, value2, "alrArrNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumIsNull() {
            addCriterion("temp_purchase_order_detail.not_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andNotPayNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.not_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_pay_num =", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_pay_num <>", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_pay_num >", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_pay_num >=", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_pay_num <", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_pay_num <=", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_pay_num in", values, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_pay_num not in", values, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_pay_num between", value1, value2, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_pay_num not between", value1, value2, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumIsNull() {
            addCriterion("temp_purchase_order_detail.alr_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.alr_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_pay_num =", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_pay_num <>", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_pay_num >", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_pay_num >=", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_pay_num <", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_pay_num <=", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_pay_num in", values, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_pay_num not in", values, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_pay_num between", value1, value2, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_pay_num not between", value1, value2, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumIsNull() {
            addCriterion("temp_purchase_order_detail.not_inv_num is null");
            return (Criteria) this;
        }

        public Criteria andNotInvNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.not_inv_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotInvNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_inv_num =", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_inv_num <>", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_inv_num >", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_inv_num >=", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_inv_num <", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_inv_num <=", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_inv_num in", values, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_inv_num not in", values, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_inv_num between", value1, value2, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_inv_num not between", value1, value2, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumIsNull() {
            addCriterion("temp_purchase_order_detail.alr_inv_num is null");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.alr_inv_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_inv_num =", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_inv_num <>", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_inv_num >", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_inv_num >=", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_inv_num <", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_inv_num <=", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_inv_num in", values, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_inv_num not in", values, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_inv_num between", value1, value2, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_inv_num not between", value1, value2, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumIsNull() {
            addCriterion("temp_purchase_order_detail.not_ter_num is null");
            return (Criteria) this;
        }

        public Criteria andNotTerNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.not_ter_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotTerNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_ter_num =", value, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_ter_num <>", value, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_ter_num >", value, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_ter_num >=", value, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.not_ter_num <", value, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.not_ter_num <=", value, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_ter_num in", values, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.not_ter_num not in", values, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_ter_num between", value1, value2, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.not_ter_num not between", value1, value2, "notTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumIsNull() {
            addCriterion("temp_purchase_order_detail.alr_ter_num is null");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumIsNotNull() {
            addCriterion("temp_purchase_order_detail.alr_ter_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_ter_num =", value, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_ter_num <>", value, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_ter_num >", value, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_ter_num >=", value, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumLessThan(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_ter_num <", value, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_order_detail.alr_ter_num <=", value, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_ter_num in", values, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_order_detail.alr_ter_num not in", values, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_ter_num between", value1, value2, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andAlrTerNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_order_detail.alr_ter_num not between", value1, value2, "alrTerNum");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyIsNull() {
            addCriterion("temp_purchase_order_detail.not_ter_money is null");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyIsNotNull() {
            addCriterion("temp_purchase_order_detail.not_ter_money is not null");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.not_ter_money =", value, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.not_ter_money <>", value, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.not_ter_money >", value, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.not_ter_money >=", value, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.not_ter_money <", value, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.not_ter_money <=", value, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.not_ter_money in", values, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.not_ter_money not in", values, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.not_ter_money between", value1, value2, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andNotTerMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.not_ter_money not between", value1, value2, "notTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyIsNull() {
            addCriterion("temp_purchase_order_detail.alr_ter_money is null");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyIsNotNull() {
            addCriterion("temp_purchase_order_detail.alr_ter_money is not null");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.alr_ter_money =", value, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.alr_ter_money <>", value, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.alr_ter_money >", value, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.alr_ter_money >=", value, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyLessThan(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.alr_ter_money <", value, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_order_detail.alr_ter_money <=", value, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.alr_ter_money in", values, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_order_detail.alr_ter_money not in", values, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.alr_ter_money between", value1, value2, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andAlrTerMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_order_detail.alr_ter_money not between", value1, value2, "alrTerMoney");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_order_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_order_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_order_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_order_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_order_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_order_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_order_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_detail.remark not between", value1, value2, "remark");
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