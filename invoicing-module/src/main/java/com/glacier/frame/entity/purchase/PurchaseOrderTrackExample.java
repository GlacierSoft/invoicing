package com.glacier.frame.entity.purchase;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderTrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseOrderTrackExample() {
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

        public Criteria andPurOrderTraIdIsNull() {
            addCriterion("temp_purchase_order_track.pur_order_tra_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdIsNotNull() {
            addCriterion("temp_purchase_order_track.pur_order_tra_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id =", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id <>", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id >", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id >=", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdLessThan(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id <", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id <=", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdLike(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id like", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdNotLike(String value) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id not like", value, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdIn(List<String> values) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id in", values, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id not in", values, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id between", value1, value2, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andPurOrderTraIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.pur_order_tra_id not between", value1, value2, "purOrderTraId");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeIsNull() {
            addCriterion("temp_purchase_order_track.order_track_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeIsNotNull() {
            addCriterion("temp_purchase_order_track.order_track_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeEqualTo(String value) {
            addCriterion("temp_purchase_order_track.order_track_code =", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.order_track_code <>", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.order_track_code >", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.order_track_code >=", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeLessThan(String value) {
            addCriterion("temp_purchase_order_track.order_track_code <", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.order_track_code <=", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeLike(String value) {
            addCriterion("temp_purchase_order_track.order_track_code like", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeNotLike(String value) {
            addCriterion("temp_purchase_order_track.order_track_code not like", value, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeIn(List<String> values) {
            addCriterion("temp_purchase_order_track.order_track_code in", values, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.order_track_code not in", values, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.order_track_code between", value1, value2, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andOrderTrackCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.order_track_code not between", value1, value2, "orderTrackCode");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNull() {
            addCriterion("temp_purchase_order_track.pur_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIsNotNull() {
            addCriterion("temp_purchase_order_track.pur_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id =", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id <>", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id >", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id >=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThan(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id <", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id <=", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdLike(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotLike(String value) {
            addCriterion("temp_purchase_order_track.pur_order_id not like", value, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdIn(List<String> values) {
            addCriterion("temp_purchase_order_track.pur_order_id in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.pur_order_id not in", values, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.pur_order_id between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andPurOrderIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.pur_order_id not between", value1, value2, "purOrderId");
            return (Criteria) this;
        }

        public Criteria andTrackThemeIsNull() {
            addCriterion("temp_purchase_order_track.track_theme is null");
            return (Criteria) this;
        }

        public Criteria andTrackThemeIsNotNull() {
            addCriterion("temp_purchase_order_track.track_theme is not null");
            return (Criteria) this;
        }

        public Criteria andTrackThemeEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_theme =", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_theme <>", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.track_theme >", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_theme >=", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeLessThan(String value) {
            addCriterion("temp_purchase_order_track.track_theme <", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_theme <=", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeLike(String value) {
            addCriterion("temp_purchase_order_track.track_theme like", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeNotLike(String value) {
            addCriterion("temp_purchase_order_track.track_theme not like", value, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeIn(List<String> values) {
            addCriterion("temp_purchase_order_track.track_theme in", values, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.track_theme not in", values, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.track_theme between", value1, value2, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andTrackThemeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.track_theme not between", value1, value2, "trackTheme");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("temp_purchase_order_track.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("temp_purchase_order_track.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("temp_purchase_order_track.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("temp_purchase_order_track.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("temp_purchase_order_track.supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("temp_purchase_order_track.supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("temp_purchase_order_track.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andTrackContentIsNull() {
            addCriterion("temp_purchase_order_track.track_content is null");
            return (Criteria) this;
        }

        public Criteria andTrackContentIsNotNull() {
            addCriterion("temp_purchase_order_track.track_content is not null");
            return (Criteria) this;
        }

        public Criteria andTrackContentEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_content =", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_content <>", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.track_content >", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_content >=", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentLessThan(String value) {
            addCriterion("temp_purchase_order_track.track_content <", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.track_content <=", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentLike(String value) {
            addCriterion("temp_purchase_order_track.track_content like", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentNotLike(String value) {
            addCriterion("temp_purchase_order_track.track_content not like", value, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentIn(List<String> values) {
            addCriterion("temp_purchase_order_track.track_content in", values, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.track_content not in", values, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.track_content between", value1, value2, "trackContent");
            return (Criteria) this;
        }

        public Criteria andTrackContentNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.track_content not between", value1, value2, "trackContent");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("temp_purchase_order_track.linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("temp_purchase_order_track.linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("temp_purchase_order_track.linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("temp_purchase_order_track.linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("temp_purchase_order_track.linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("temp_purchase_order_track.linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("temp_purchase_order_track.linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("temp_purchase_order_track.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("temp_purchase_order_track.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("temp_purchase_order_track.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("temp_purchase_order_track.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("temp_purchase_order_track.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("temp_purchase_order_track.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("temp_purchase_order_track.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_purchase_order_track.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_purchase_order_track.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_purchase_order_track.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_purchase_order_track.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_purchase_order_track.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_purchase_order_track.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_purchase_order_track.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_order_track.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_order_track.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_order_track.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_order_track.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_order_track.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_order_track.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_order_track.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_order_track.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_order_track.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_order_track.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_order_track.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_order_track.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_order_track.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_order_track.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_order_track.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_order_track.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_order_track.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_order_track.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_order_track.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_order_track.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_track.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_track.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_purchase_order_track.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_purchase_order_track.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_purchase_order_track.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_purchase_order_track.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_purchase_order_track.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_purchase_order_track.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_order_track.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_purchase_order_track.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_purchase_order_track.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_purchase_order_track.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_purchase_order_track.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_order_track.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_purchase_order_track.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_purchase_order_track.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_order_track.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_purchase_order_track.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_order_track.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_order_track.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_order_track.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_track.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_order_track.update_time not between", value1, value2, "updateTime");
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