package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public PurchaseReturnExample() {
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

        //供应商查询
        public Criteria andSupplierIdDisplayLike(String value) {
            addCriterion("temp_suppliers_display.suppliers_name like", value, "supplierIdDisplay");
            return (Criteria) this;
        }
        
        //仓库查询
        public Criteria andStorageDisplayLike(String value) {
            addCriterion("temp_warehouse_display.warehouse_name like", value, "storageDisplay");
            return (Criteria) this;
        }
        
        public Criteria andPurReturnIdIsNull() {
            addCriterion("temp_purchase_return.pur_return_id is null");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdIsNotNull() {
            addCriterion("temp_purchase_return.pur_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdEqualTo(String value) {
            addCriterion("temp_purchase_return.pur_return_id =", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return.pur_return_id <>", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdGreaterThan(String value) {
            addCriterion("temp_purchase_return.pur_return_id >", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.pur_return_id >=", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdLessThan(String value) {
            addCriterion("temp_purchase_return.pur_return_id <", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.pur_return_id <=", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdLike(String value) {
            addCriterion("temp_purchase_return.pur_return_id like", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotLike(String value) {
            addCriterion("temp_purchase_return.pur_return_id not like", value, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdIn(List<String> values) {
            addCriterion("temp_purchase_return.pur_return_id in", values, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return.pur_return_id not in", values, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.pur_return_id between", value1, value2, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andPurReturnIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.pur_return_id not between", value1, value2, "purReturnId");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNull() {
            addCriterion("temp_purchase_return.return_code is null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIsNotNull() {
            addCriterion("temp_purchase_return.return_code is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCodeEqualTo(String value) {
            addCriterion("temp_purchase_return.return_code =", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_return.return_code <>", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThan(String value) {
            addCriterion("temp_purchase_return.return_code >", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.return_code >=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThan(String value) {
            addCriterion("temp_purchase_return.return_code <", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.return_code <=", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeLike(String value) {
            addCriterion("temp_purchase_return.return_code like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotLike(String value) {
            addCriterion("temp_purchase_return.return_code not like", value, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeIn(List<String> values) {
            addCriterion("temp_purchase_return.return_code in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_return.return_code not in", values, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.return_code between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.return_code not between", value1, value2, "returnCode");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("temp_purchase_return.return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("temp_purchase_return.return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterion("temp_purchase_return.return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterion("temp_purchase_return.return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterion("temp_purchase_return.return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_return.return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNull() {
            addCriterion("temp_purchase_return.purchase_type is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIsNotNull() {
            addCriterion("temp_purchase_return.purchase_type is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeEqualTo(String value) {
            addCriterion("temp_purchase_return.purchase_type =", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotEqualTo(String value) {
            addCriterion("temp_purchase_return.purchase_type <>", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThan(String value) {
            addCriterion("temp_purchase_return.purchase_type >", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.purchase_type >=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThan(String value) {
            addCriterion("temp_purchase_return.purchase_type <", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.purchase_type <=", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeLike(String value) {
            addCriterion("temp_purchase_return.purchase_type like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotLike(String value) {
            addCriterion("temp_purchase_return.purchase_type not like", value, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeIn(List<String> values) {
            addCriterion("temp_purchase_return.purchase_type in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotIn(List<String> values) {
            addCriterion("temp_purchase_return.purchase_type not in", values, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.purchase_type between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andPurchaseTypeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.purchase_type not between", value1, value2, "purchaseType");
            return (Criteria) this;
        }

        public Criteria andProCameIsNull() {
            addCriterion("temp_purchase_return.pro_came is null");
            return (Criteria) this;
        }

        public Criteria andProCameIsNotNull() {
            addCriterion("temp_purchase_return.pro_came is not null");
            return (Criteria) this;
        }

        public Criteria andProCameEqualTo(String value) {
            addCriterion("temp_purchase_return.pro_came =", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameNotEqualTo(String value) {
            addCriterion("temp_purchase_return.pro_came <>", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameGreaterThan(String value) {
            addCriterion("temp_purchase_return.pro_came >", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.pro_came >=", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameLessThan(String value) {
            addCriterion("temp_purchase_return.pro_came <", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.pro_came <=", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameLike(String value) {
            addCriterion("temp_purchase_return.pro_came like", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameNotLike(String value) {
            addCriterion("temp_purchase_return.pro_came not like", value, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameIn(List<String> values) {
            addCriterion("temp_purchase_return.pro_came in", values, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameNotIn(List<String> values) {
            addCriterion("temp_purchase_return.pro_came not in", values, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.pro_came between", value1, value2, "proCame");
            return (Criteria) this;
        }

        public Criteria andProCameNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.pro_came not between", value1, value2, "proCame");
            return (Criteria) this;
        }

        public Criteria andStorageIsNull() {
            addCriterion("temp_purchase_return.storage is null");
            return (Criteria) this;
        }

        public Criteria andStorageIsNotNull() {
            addCriterion("temp_purchase_return.storage is not null");
            return (Criteria) this;
        }

        public Criteria andStorageEqualTo(String value) {
            addCriterion("temp_purchase_return.storage =", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotEqualTo(String value) {
            addCriterion("temp_purchase_return.storage <>", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThan(String value) {
            addCriterion("temp_purchase_return.storage >", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.storage >=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThan(String value) {
            addCriterion("temp_purchase_return.storage <", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.storage <=", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageLike(String value) {
            addCriterion("temp_purchase_return.storage like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotLike(String value) {
            addCriterion("temp_purchase_return.storage not like", value, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageIn(List<String> values) {
            addCriterion("temp_purchase_return.storage in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotIn(List<String> values) {
            addCriterion("temp_purchase_return.storage not in", values, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.storage between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andStorageNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.storage not between", value1, value2, "storage");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("temp_purchase_return.supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("temp_purchase_return.supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(String value) {
            addCriterion("temp_purchase_return.supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(String value) {
            addCriterion("temp_purchase_return.supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLike(String value) {
            addCriterion("temp_purchase_return.supplier_id like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotLike(String value) {
            addCriterion("temp_purchase_return.supplier_id not like", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<String> values) {
            addCriterion("temp_purchase_return.supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return.supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIsNull() {
            addCriterion("temp_purchase_return.supplier_add is null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIsNotNull() {
            addCriterion("temp_purchase_return.supplier_add is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierAddEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_add =", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_add <>", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddGreaterThan(String value) {
            addCriterion("temp_purchase_return.supplier_add >", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_add >=", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLessThan(String value) {
            addCriterion("temp_purchase_return.supplier_add <", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.supplier_add <=", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddLike(String value) {
            addCriterion("temp_purchase_return.supplier_add like", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotLike(String value) {
            addCriterion("temp_purchase_return.supplier_add not like", value, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddIn(List<String> values) {
            addCriterion("temp_purchase_return.supplier_add in", values, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotIn(List<String> values) {
            addCriterion("temp_purchase_return.supplier_add not in", values, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.supplier_add between", value1, value2, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andSupplierAddNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.supplier_add not between", value1, value2, "supplierAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("temp_purchase_return.linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("temp_purchase_return.linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("temp_purchase_return.linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("temp_purchase_return.linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("temp_purchase_return.linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("temp_purchase_return.linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("temp_purchase_return.linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("temp_purchase_return.linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("temp_purchase_return.linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("temp_purchase_return.linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("temp_purchase_return.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("temp_purchase_return.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("temp_purchase_return.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("temp_purchase_return.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("temp_purchase_return.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("temp_purchase_return.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("temp_purchase_return.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("temp_purchase_return.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("temp_purchase_return.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("temp_purchase_return.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("temp_purchase_return.fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("temp_purchase_return.fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("temp_purchase_return.fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("temp_purchase_return.fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("temp_purchase_return.fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("temp_purchase_return.fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("temp_purchase_return.fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("temp_purchase_return.fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("temp_purchase_return.fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("temp_purchase_return.fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdIsNull() {
            addCriterion("temp_purchase_return.returned_purchase_type_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdIsNotNull() {
            addCriterion("temp_purchase_return.returned_purchase_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id =", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id <>", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id >", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id >=", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdLessThan(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id <", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id <=", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdLike(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id like", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdNotLike(String value) {
            addCriterion("temp_purchase_return.returned_purchase_type_id not like", value, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_return.returned_purchase_type_id in", values, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return.returned_purchase_type_id not in", values, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.returned_purchase_type_id between", value1, value2, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnedPurchaseTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.returned_purchase_type_id not between", value1, value2, "returnedPurchaseTypeId");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesIsNull() {
            addCriterion("temp_purchase_return.return_deadlines is null");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesIsNotNull() {
            addCriterion("temp_purchase_return.return_deadlines is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_deadlines =", value, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesNotEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_deadlines <>", value, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesGreaterThan(Date value) {
            addCriterion("temp_purchase_return.return_deadlines >", value, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_deadlines >=", value, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesLessThan(Date value) {
            addCriterion("temp_purchase_return.return_deadlines <", value, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.return_deadlines <=", value, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesIn(List<Date> values) {
            addCriterion("temp_purchase_return.return_deadlines in", values, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesNotIn(List<Date> values) {
            addCriterion("temp_purchase_return.return_deadlines not in", values, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.return_deadlines between", value1, value2, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnDeadlinesNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.return_deadlines not between", value1, value2, "returnDeadlines");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdIsNull() {
            addCriterion("temp_purchase_return.return_reason_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdIsNotNull() {
            addCriterion("temp_purchase_return.return_reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdEqualTo(String value) {
            addCriterion("temp_purchase_return.return_reason_id =", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return.return_reason_id <>", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdGreaterThan(String value) {
            addCriterion("temp_purchase_return.return_reason_id >", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.return_reason_id >=", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdLessThan(String value) {
            addCriterion("temp_purchase_return.return_reason_id <", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.return_reason_id <=", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdLike(String value) {
            addCriterion("temp_purchase_return.return_reason_id like", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotLike(String value) {
            addCriterion("temp_purchase_return.return_reason_id not like", value, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdIn(List<String> values) {
            addCriterion("temp_purchase_return.return_reason_id in", values, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return.return_reason_id not in", values, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.return_reason_id between", value1, value2, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnReasonIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.return_reason_id not between", value1, value2, "returnReasonId");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyIsNull() {
            addCriterion("temp_purchase_return.return_policy is null");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyIsNotNull() {
            addCriterion("temp_purchase_return.return_policy is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyEqualTo(String value) {
            addCriterion("temp_purchase_return.return_policy =", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyNotEqualTo(String value) {
            addCriterion("temp_purchase_return.return_policy <>", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyGreaterThan(String value) {
            addCriterion("temp_purchase_return.return_policy >", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.return_policy >=", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyLessThan(String value) {
            addCriterion("temp_purchase_return.return_policy <", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.return_policy <=", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyLike(String value) {
            addCriterion("temp_purchase_return.return_policy like", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyNotLike(String value) {
            addCriterion("temp_purchase_return.return_policy not like", value, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyIn(List<String> values) {
            addCriterion("temp_purchase_return.return_policy in", values, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyNotIn(List<String> values) {
            addCriterion("temp_purchase_return.return_policy not in", values, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.return_policy between", value1, value2, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andReturnPolicyNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.return_policy not between", value1, value2, "returnPolicy");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesIsNull() {
            addCriterion("temp_purchase_return.refund_deadlines is null");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesIsNotNull() {
            addCriterion("temp_purchase_return.refund_deadlines is not null");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesEqualTo(Date value) {
            addCriterion("temp_purchase_return.refund_deadlines =", value, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesNotEqualTo(Date value) {
            addCriterion("temp_purchase_return.refund_deadlines <>", value, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesGreaterThan(Date value) {
            addCriterion("temp_purchase_return.refund_deadlines >", value, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.refund_deadlines >=", value, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesLessThan(Date value) {
            addCriterion("temp_purchase_return.refund_deadlines <", value, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.refund_deadlines <=", value, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesIn(List<Date> values) {
            addCriterion("temp_purchase_return.refund_deadlines in", values, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesNotIn(List<Date> values) {
            addCriterion("temp_purchase_return.refund_deadlines not in", values, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.refund_deadlines between", value1, value2, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andRefundDeadlinesNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.refund_deadlines not between", value1, value2, "refundDeadlines");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNull() {
            addCriterion("temp_purchase_return.payment_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNotNull() {
            addCriterion("temp_purchase_return.payment_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_type_id =", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_type_id <>", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThan(String value) {
            addCriterion("temp_purchase_return.payment_type_id >", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_type_id >=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThan(String value) {
            addCriterion("temp_purchase_return.payment_type_id <", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_type_id <=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLike(String value) {
            addCriterion("temp_purchase_return.payment_type_id like", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotLike(String value) {
            addCriterion("temp_purchase_return.payment_type_id not like", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIn(List<String> values) {
            addCriterion("temp_purchase_return.payment_type_id in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotIn(List<String> values) {
            addCriterion("temp_purchase_return.payment_type_id not in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.payment_type_id between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.payment_type_id not between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIsNull() {
            addCriterion("temp_purchase_return.log_settlement is null");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIsNotNull() {
            addCriterion("temp_purchase_return.log_settlement is not null");
            return (Criteria) this;
        }

        public Criteria andLogSettlementEqualTo(String value) {
            addCriterion("temp_purchase_return.log_settlement =", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementNotEqualTo(String value) {
            addCriterion("temp_purchase_return.log_settlement <>", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementGreaterThan(String value) {
            addCriterion("temp_purchase_return.log_settlement >", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_settlement >=", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementLessThan(String value) {
            addCriterion("temp_purchase_return.log_settlement <", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_settlement <=", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementLike(String value) {
            addCriterion("temp_purchase_return.log_settlement like", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementNotLike(String value) {
            addCriterion("temp_purchase_return.log_settlement not like", value, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementIn(List<String> values) {
            addCriterion("temp_purchase_return.log_settlement in", values, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementNotIn(List<String> values) {
            addCriterion("temp_purchase_return.log_settlement not in", values, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_settlement between", value1, value2, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogSettlementNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_settlement not between", value1, value2, "logSettlement");
            return (Criteria) this;
        }

        public Criteria andLogCodeIsNull() {
            addCriterion("temp_purchase_return.log_code is null");
            return (Criteria) this;
        }

        public Criteria andLogCodeIsNotNull() {
            addCriterion("temp_purchase_return.log_code is not null");
            return (Criteria) this;
        }

        public Criteria andLogCodeEqualTo(String value) {
            addCriterion("temp_purchase_return.log_code =", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotEqualTo(String value) {
            addCriterion("temp_purchase_return.log_code <>", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeGreaterThan(String value) {
            addCriterion("temp_purchase_return.log_code >", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_code >=", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLessThan(String value) {
            addCriterion("temp_purchase_return.log_code <", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_code <=", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeLike(String value) {
            addCriterion("temp_purchase_return.log_code like", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotLike(String value) {
            addCriterion("temp_purchase_return.log_code not like", value, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeIn(List<String> values) {
            addCriterion("temp_purchase_return.log_code in", values, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotIn(List<String> values) {
            addCriterion("temp_purchase_return.log_code not in", values, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_code between", value1, value2, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogCodeNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_code not between", value1, value2, "logCode");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountIsNull() {
            addCriterion("temp_purchase_return.log_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountIsNotNull() {
            addCriterion("temp_purchase_return.log_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.log_total_amount =", value, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.log_total_amount <>", value, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return.log_total_amount >", value, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.log_total_amount >=", value, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return.log_total_amount <", value, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.log_total_amount <=", value, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.log_total_amount in", values, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.log_total_amount not in", values, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.log_total_amount between", value1, value2, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.log_total_amount not between", value1, value2, "logTotalAmount");
            return (Criteria) this;
        }

        public Criteria andLogCompanyIsNull() {
            addCriterion("temp_purchase_return.log_company is null");
            return (Criteria) this;
        }

        public Criteria andLogCompanyIsNotNull() {
            addCriterion("temp_purchase_return.log_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogCompanyEqualTo(String value) {
            addCriterion("temp_purchase_return.log_company =", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotEqualTo(String value) {
            addCriterion("temp_purchase_return.log_company <>", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyGreaterThan(String value) {
            addCriterion("temp_purchase_return.log_company >", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_company >=", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyLessThan(String value) {
            addCriterion("temp_purchase_return.log_company <", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_company <=", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyLike(String value) {
            addCriterion("temp_purchase_return.log_company like", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotLike(String value) {
            addCriterion("temp_purchase_return.log_company not like", value, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyIn(List<String> values) {
            addCriterion("temp_purchase_return.log_company in", values, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotIn(List<String> values) {
            addCriterion("temp_purchase_return.log_company not in", values, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_company between", value1, value2, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogCompanyNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_company not between", value1, value2, "logCompany");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanIsNull() {
            addCriterion("temp_purchase_return.log_linkman is null");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanIsNotNull() {
            addCriterion("temp_purchase_return.log_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanEqualTo(String value) {
            addCriterion("temp_purchase_return.log_linkman =", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotEqualTo(String value) {
            addCriterion("temp_purchase_return.log_linkman <>", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanGreaterThan(String value) {
            addCriterion("temp_purchase_return.log_linkman >", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_linkman >=", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanLessThan(String value) {
            addCriterion("temp_purchase_return.log_linkman <", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_linkman <=", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanLike(String value) {
            addCriterion("temp_purchase_return.log_linkman like", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotLike(String value) {
            addCriterion("temp_purchase_return.log_linkman not like", value, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanIn(List<String> values) {
            addCriterion("temp_purchase_return.log_linkman in", values, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotIn(List<String> values) {
            addCriterion("temp_purchase_return.log_linkman not in", values, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_linkman between", value1, value2, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogLinkmanNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_linkman not between", value1, value2, "logLinkman");
            return (Criteria) this;
        }

        public Criteria andLogPhoneIsNull() {
            addCriterion("temp_purchase_return.log_phone is null");
            return (Criteria) this;
        }

        public Criteria andLogPhoneIsNotNull() {
            addCriterion("temp_purchase_return.log_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLogPhoneEqualTo(String value) {
            addCriterion("temp_purchase_return.log_phone =", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotEqualTo(String value) {
            addCriterion("temp_purchase_return.log_phone <>", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneGreaterThan(String value) {
            addCriterion("temp_purchase_return.log_phone >", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_phone >=", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneLessThan(String value) {
            addCriterion("temp_purchase_return.log_phone <", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.log_phone <=", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneLike(String value) {
            addCriterion("temp_purchase_return.log_phone like", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotLike(String value) {
            addCriterion("temp_purchase_return.log_phone not like", value, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneIn(List<String> values) {
            addCriterion("temp_purchase_return.log_phone in", values, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotIn(List<String> values) {
            addCriterion("temp_purchase_return.log_phone not in", values, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_phone between", value1, value2, "logPhone");
            return (Criteria) this;
        }

        public Criteria andLogPhoneNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.log_phone not between", value1, value2, "logPhone");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("temp_purchase_return.payment_state is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("temp_purchase_return.payment_state is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_state =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_state <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(String value) {
            addCriterion("temp_purchase_return.payment_state >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_state >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(String value) {
            addCriterion("temp_purchase_return.payment_state <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.payment_state <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLike(String value) {
            addCriterion("temp_purchase_return.payment_state like", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotLike(String value) {
            addCriterion("temp_purchase_return.payment_state not like", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<String> values) {
            addCriterion("temp_purchase_return.payment_state in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<String> values) {
            addCriterion("temp_purchase_return.payment_state not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.payment_state between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.payment_state not between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIsNull() {
            addCriterion("temp_purchase_return.not_pay_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIsNotNull() {
            addCriterion("temp_purchase_return.not_pay_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_pay_amo =", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_pay_amo <>", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return.not_pay_amo >", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_pay_amo >=", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return.not_pay_amo <", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_pay_amo <=", value, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.not_pay_amo in", values, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.not_pay_amo not in", values, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.not_pay_amo between", value1, value2, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andNotPayAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.not_pay_amo not between", value1, value2, "notPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIsNull() {
            addCriterion("temp_purchase_return.alr_pay_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIsNotNull() {
            addCriterion("temp_purchase_return.alr_pay_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_pay_amo =", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_pay_amo <>", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_pay_amo >", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_pay_amo >=", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_pay_amo <", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_pay_amo <=", value, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.alr_pay_amo in", values, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.alr_pay_amo not in", values, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.alr_pay_amo between", value1, value2, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andAlrPayAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.alr_pay_amo not between", value1, value2, "alrPayAmo");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNull() {
            addCriterion("temp_purchase_return.inv_state is null");
            return (Criteria) this;
        }

        public Criteria andInvStateIsNotNull() {
            addCriterion("temp_purchase_return.inv_state is not null");
            return (Criteria) this;
        }

        public Criteria andInvStateEqualTo(String value) {
            addCriterion("temp_purchase_return.inv_state =", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotEqualTo(String value) {
            addCriterion("temp_purchase_return.inv_state <>", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThan(String value) {
            addCriterion("temp_purchase_return.inv_state >", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.inv_state >=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThan(String value) {
            addCriterion("temp_purchase_return.inv_state <", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.inv_state <=", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateLike(String value) {
            addCriterion("temp_purchase_return.inv_state like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotLike(String value) {
            addCriterion("temp_purchase_return.inv_state not like", value, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateIn(List<String> values) {
            addCriterion("temp_purchase_return.inv_state in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotIn(List<String> values) {
            addCriterion("temp_purchase_return.inv_state not in", values, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.inv_state between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andInvStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.inv_state not between", value1, value2, "invState");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIsNull() {
            addCriterion("temp_purchase_return.not_inv_amo is null");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIsNotNull() {
            addCriterion("temp_purchase_return.not_inv_amo is not null");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_inv_amo =", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_inv_amo <>", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return.not_inv_amo >", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_inv_amo >=", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return.not_inv_amo <", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.not_inv_amo <=", value, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.not_inv_amo in", values, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.not_inv_amo not in", values, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.not_inv_amo between", value1, value2, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andNotInvAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.not_inv_amo not between", value1, value2, "notInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIsNull() {
            addCriterion("temp_purchase_return.alr_inv_amo is null");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIsNotNull() {
            addCriterion("temp_purchase_return.alr_inv_amo is not null");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_inv_amo =", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_inv_amo <>", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_inv_amo >", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_inv_amo >=", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_inv_amo <", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.alr_inv_amo <=", value, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.alr_inv_amo in", values, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.alr_inv_amo not in", values, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.alr_inv_amo between", value1, value2, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andAlrInvAmoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.alr_inv_amo not between", value1, value2, "alrInvAmo");
            return (Criteria) this;
        }

        public Criteria andRefundTotalIsNull() {
            addCriterion("temp_purchase_return.refund_total is null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalIsNotNull() {
            addCriterion("temp_purchase_return.refund_total is not null");
            return (Criteria) this;
        }

        public Criteria andRefundTotalEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.refund_total =", value, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalNotEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.refund_total <>", value, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalGreaterThan(BigDecimal value) {
            addCriterion("temp_purchase_return.refund_total >", value, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.refund_total >=", value, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalLessThan(BigDecimal value) {
            addCriterion("temp_purchase_return.refund_total <", value, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_purchase_return.refund_total <=", value, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.refund_total in", values, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalNotIn(List<BigDecimal> values) {
            addCriterion("temp_purchase_return.refund_total not in", values, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.refund_total between", value1, value2, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andRefundTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_purchase_return.refund_total not between", value1, value2, "refundTotal");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_purchase_return.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_purchase_return.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_purchase_return.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_purchase_return.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_purchase_return.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_purchase_return.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_purchase_return.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_purchase_return.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_purchase_return.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_purchase_return.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNull() {
            addCriterion("temp_purchase_return.operators is null");
            return (Criteria) this;
        }

        public Criteria andOperatorsIsNotNull() {
            addCriterion("temp_purchase_return.operators is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorsEqualTo(String value) {
            addCriterion("temp_purchase_return.operators =", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotEqualTo(String value) {
            addCriterion("temp_purchase_return.operators <>", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThan(String value) {
            addCriterion("temp_purchase_return.operators >", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.operators >=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThan(String value) {
            addCriterion("temp_purchase_return.operators <", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.operators <=", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsLike(String value) {
            addCriterion("temp_purchase_return.operators like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotLike(String value) {
            addCriterion("temp_purchase_return.operators not like", value, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsIn(List<String> values) {
            addCriterion("temp_purchase_return.operators in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotIn(List<String> values) {
            addCriterion("temp_purchase_return.operators not in", values, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.operators between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorsNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.operators not between", value1, value2, "operators");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNull() {
            addCriterion("temp_purchase_return.operator_dep is null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIsNotNull() {
            addCriterion("temp_purchase_return.operator_dep is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorDepEqualTo(String value) {
            addCriterion("temp_purchase_return.operator_dep =", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotEqualTo(String value) {
            addCriterion("temp_purchase_return.operator_dep <>", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThan(String value) {
            addCriterion("temp_purchase_return.operator_dep >", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.operator_dep >=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThan(String value) {
            addCriterion("temp_purchase_return.operator_dep <", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.operator_dep <=", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepLike(String value) {
            addCriterion("temp_purchase_return.operator_dep like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotLike(String value) {
            addCriterion("temp_purchase_return.operator_dep not like", value, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepIn(List<String> values) {
            addCriterion("temp_purchase_return.operator_dep in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotIn(List<String> values) {
            addCriterion("temp_purchase_return.operator_dep not in", values, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.operator_dep between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andOperatorDepNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.operator_dep not between", value1, value2, "operatorDep");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_purchase_return.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_purchase_return.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_purchase_return.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_purchase_return.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_purchase_return.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_purchase_return.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_purchase_return.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_purchase_return.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_purchase_return.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_purchase_return.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_purchase_return.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_purchase_return.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_purchase_return.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_purchase_return.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_purchase_return.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_purchase_return.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_purchase_return.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_purchase_return.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("temp_purchase_return.audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("temp_purchase_return.audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("temp_purchase_return.audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("temp_purchase_return.audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("temp_purchase_return.audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("temp_purchase_return.audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("temp_purchase_return.audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("temp_purchase_return.audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_purchase_return.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_purchase_return.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_return.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_purchase_return.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_purchase_return.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_purchase_return.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_purchase_return.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_return.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("temp_purchase_return.summary is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("temp_purchase_return.summary is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("temp_purchase_return.summary =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("temp_purchase_return.summary <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("temp_purchase_return.summary >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.summary >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("temp_purchase_return.summary <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.summary <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("temp_purchase_return.summary like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("temp_purchase_return.summary not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("temp_purchase_return.summary in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("temp_purchase_return.summary not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.summary between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.summary not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNull() {
            addCriterion("temp_purchase_return.accessory is null");
            return (Criteria) this;
        }

        public Criteria andAccessoryIsNotNull() {
            addCriterion("temp_purchase_return.accessory is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoryEqualTo(String value) {
            addCriterion("temp_purchase_return.accessory =", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotEqualTo(String value) {
            addCriterion("temp_purchase_return.accessory <>", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThan(String value) {
            addCriterion("temp_purchase_return.accessory >", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.accessory >=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThan(String value) {
            addCriterion("temp_purchase_return.accessory <", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.accessory <=", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryLike(String value) {
            addCriterion("temp_purchase_return.accessory like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotLike(String value) {
            addCriterion("temp_purchase_return.accessory not like", value, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryIn(List<String> values) {
            addCriterion("temp_purchase_return.accessory in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotIn(List<String> values) {
            addCriterion("temp_purchase_return.accessory not in", values, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.accessory between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andAccessoryNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.accessory not between", value1, value2, "accessory");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_purchase_return.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_purchase_return.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_purchase_return.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_purchase_return.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_purchase_return.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_purchase_return.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_purchase_return.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_purchase_return.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_purchase_return.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_purchase_return.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_purchase_return.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_purchase_return.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_purchase_return.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_purchase_return.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_purchase_return.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_purchase_return.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_purchase_return.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_purchase_return.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_purchase_return.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_purchase_return.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_purchase_return.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_purchase_return.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_return.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_return.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_return.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_purchase_return.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_return.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_return.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_purchase_return.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_purchase_return.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_purchase_return.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_purchase_return.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_purchase_return.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_purchase_return.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_purchase_return.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_purchase_return.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_purchase_return.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_purchase_return.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_purchase_return.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_purchase_return.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_purchase_return.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_purchase_return.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_purchase_return.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_purchase_return.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_purchase_return.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_purchase_return.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_purchase_return.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_purchase_return.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_purchase_return.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_purchase_return.update_time not between", value1, value2, "updateTime");
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