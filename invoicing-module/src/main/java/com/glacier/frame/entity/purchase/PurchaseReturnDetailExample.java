package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseReturnDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseReturnDetailExample() {
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

        public Criteria andPurReturnDetIdIsNull() {
            addCriterion("temp_purchase_return_detail.pur_return_det_id is null");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdIsNotNull() {
            addCriterion("temp_purchase_return_detail.pur_return_det_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id =", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id <>", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id >", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id >=", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdLessThan(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id <", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id <=", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdLike(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id like", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdNotLike(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id not like", value, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id in", values, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id not in", values, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id between", value1, value2, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnDetIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.pur_return_det_id not between", value1, value2, "purReturnDetId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdIsNull() {
            addCriterion("temp_purchase_return_detail.pur_return_id is null");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdIsNotNull() {
            addCriterion("temp_purchase_return_detail.pur_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id =", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id <>", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id >", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id >=", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdLessThan(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id <", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id <=", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdLike(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id like", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotLike(String value) {
            addCriterion("temp_purchase_return_detail.pur_return_id not like", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.pur_return_id in", values, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.pur_return_id not in", values, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.pur_return_id between", value1, value2, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.pur_return_id not between", value1, value2, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("temp_purchase_return_detail.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("temp_purchase_return_detail.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("temp_purchase_return_detail.goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("temp_purchase_return_detail.goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("temp_purchase_return_detail.goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("temp_purchase_return_detail.goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNull() {
            addCriterion("temp_purchase_return_detail.goods_model is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNotNull() {
            addCriterion("temp_purchase_return_detail.goods_model is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_model =", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_model <>", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_model >", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_model >=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_model <", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_model <=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_model like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_model not like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_model in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_model not in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_model between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_model not between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("temp_purchase_return_detail.goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("temp_purchase_return_detail.goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("temp_purchase_return_detail.goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("temp_purchase_return_detail.quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("temp_purchase_return_detail.quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("temp_purchase_return_detail.quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("temp_purchase_return_detail.quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("temp_purchase_return_detail.price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("temp_purchase_return_detail.price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("temp_purchase_return_detail.brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("temp_purchase_return_detail.brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("temp_purchase_return_detail.brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("temp_purchase_return_detail.brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("temp_purchase_return_detail.brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNull() {
            addCriterion("temp_purchase_return_detail.place_of_origin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNotNull() {
            addCriterion("temp_purchase_return_detail.place_of_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin =", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin <>", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin >", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin >=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThan(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin <", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin <=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLike(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotLike(String value) {
            addCriterion("temp_purchase_return_detail.place_of_origin not like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.place_of_origin in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.place_of_origin not in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.place_of_origin between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.place_of_origin not between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andBatchInformationIsNull() {
            addCriterion("temp_purchase_return_detail.batch_information is null");
            return (Criteria) this;
        }

        public Criteria andBatchInformationIsNotNull() {
            addCriterion("temp_purchase_return_detail.batch_information is not null");
            return (Criteria) this;
        }

        public Criteria andBatchInformationEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.batch_information =", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.batch_information <>", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.batch_information >", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.batch_information >=", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationLessThan(String value) {
            addCriterion("temp_purchase_return_detail.batch_information <", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.batch_information <=", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationLike(String value) {
            addCriterion("temp_purchase_return_detail.batch_information like", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationNotLike(String value) {
            addCriterion("temp_purchase_return_detail.batch_information not like", value, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.batch_information in", values, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.batch_information not in", values, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.batch_information between", value1, value2, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andBatchInformationNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.batch_information not between", value1, value2, "batchInformation");
            return (Criteria) this;
        }

        public Criteria andCessIsNull() {
            addCriterion("temp_purchase_return_detail.cess is null");
            return (Criteria) this;
        }

        public Criteria andCessIsNotNull() {
            addCriterion("temp_purchase_return_detail.cess is not null");
            return (Criteria) this;
        }

        public Criteria andCessEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.cess =", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.cess <>", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.cess >", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.cess >=", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.cess <", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.cess <=", value, "cess");
            return (Criteria) this;
        }

        public Criteria andCessIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.cess in", values, "cess");
            return (Criteria) this;
        }

        public Criteria andCessNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.cess not in", values, "cess");
            return (Criteria) this;
        }

        public Criteria andCessBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.cess between", value1, value2, "cess");
            return (Criteria) this;
        }

        public Criteria andCessNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.cess not between", value1, value2, "cess");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("temp_purchase_return_detail.money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("temp_purchase_return_detail.money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andPurMoneyIsNull() {
            addCriterion("temp_purchase_return_detail.pur_money is null");
            return (Criteria) this;
        }

        public Criteria andPurMoneyIsNotNull() {
            addCriterion("temp_purchase_return_detail.pur_money is not null");
            return (Criteria) this;
        }

        public Criteria andPurMoneyEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.pur_money =", value, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.pur_money <>", value, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.pur_money >", value, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.pur_money >=", value, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.pur_money <", value, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return_detail.pur_money <=", value, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.pur_money in", values, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return_detail.pur_money not in", values, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.pur_money between", value1, value2, "purMoney");
            return (Criteria) this;
        }

        public Criteria andPurMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return_detail.pur_money not between", value1, value2, "purMoney");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("temp_purchase_return_detail.deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("temp_purchase_return_detail.deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("temp_purchase_return_detail.deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("temp_purchase_return_detail.deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("temp_purchase_return_detail.deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return_detail.deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("temp_purchase_return_detail.deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return_detail.deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("temp_purchase_return_detail.deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("temp_purchase_return_detail.deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return_detail.deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return_detail.deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andNotPayNumIsNull() {
            addCriterion("temp_purchase_return_detail.not_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andNotPayNumIsNotNull() {
            addCriterion("temp_purchase_return_detail.not_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayNumEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_pay_num =", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_pay_num <>", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_return_detail.not_pay_num >", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_pay_num >=", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumLessThan(Integer value) {
            addCriterion("temp_purchase_return_detail.not_pay_num <", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_pay_num <=", value, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.not_pay_num in", values, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.not_pay_num not in", values, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.not_pay_num between", value1, value2, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andNotPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.not_pay_num not between", value1, value2, "notPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumIsNull() {
            addCriterion("temp_purchase_return_detail.alr_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumIsNotNull() {
            addCriterion("temp_purchase_return_detail.alr_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_pay_num =", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_pay_num <>", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_pay_num >", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_pay_num >=", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumLessThan(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_pay_num <", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_pay_num <=", value, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.alr_pay_num in", values, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.alr_pay_num not in", values, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.alr_pay_num between", value1, value2, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andAlrPayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.alr_pay_num not between", value1, value2, "alrPayNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumIsNull() {
            addCriterion("temp_purchase_return_detail.not_inv_num is null");
            return (Criteria) this;
        }

        public Criteria andNotInvNumIsNotNull() {
            addCriterion("temp_purchase_return_detail.not_inv_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotInvNumEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_inv_num =", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_inv_num <>", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_return_detail.not_inv_num >", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_inv_num >=", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumLessThan(Integer value) {
            addCriterion("temp_purchase_return_detail.not_inv_num <", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.not_inv_num <=", value, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.not_inv_num in", values, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.not_inv_num not in", values, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.not_inv_num between", value1, value2, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andNotInvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.not_inv_num not between", value1, value2, "notInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumIsNull() {
            addCriterion("temp_purchase_return_detail.alr_inv_num is null");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumIsNotNull() {
            addCriterion("temp_purchase_return_detail.alr_inv_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_inv_num =", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumNotEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_inv_num <>", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumGreaterThan(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_inv_num >", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_inv_num >=", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumLessThan(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_inv_num <", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumLessThanOrEqualTo(Integer value) {
            addCriterion("temp_purchase_return_detail.alr_inv_num <=", value, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.alr_inv_num in", values, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumNotIn(List<Integer> values) {
            addCriterion("temp_purchase_return_detail.alr_inv_num not in", values, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.alr_inv_num between", value1, value2, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andAlrInvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("temp_purchase_return_detail.alr_inv_num not between", value1, value2, "alrInvNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_return_detail.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_return_detail.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_return_detail.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_return_detail.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return_detail.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_return_detail.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_return_detail.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_return_detail.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return_detail.remark not between", value1, value2, "remark");
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