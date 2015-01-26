package com.glacier.frame.entity.basicdatas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GoodsListExample() {
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

        //扩展查询条件
        public Criteria andWarehouseTypeDisplayEqual(String value) {
            addCriterion("temp_war_display.war_goods_type_id =", value, "warehouseTypeDisplay");
            return (Criteria) this;
        }
        
        //扩展查询条件
        public Criteria andGoodsSortDisplayEqual(String value) {
            addCriterion("temp_warehouse_display.warehouse_id =", value, "goodsSortDisplay");
            return (Criteria) this;
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("temp_goods_list.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("temp_goods_list.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("temp_goods_list.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("temp_goods_list.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("temp_goods_list.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("temp_goods_list.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("temp_goods_list.goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("temp_goods_list.goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("temp_goods_list.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("temp_goods_list.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("temp_goods_list.goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("temp_goods_list.goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("temp_goods_list.goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("temp_goods_list.goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("temp_goods_list.goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("temp_goods_list.goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("temp_goods_list.goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("temp_goods_list.goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("temp_goods_list.goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("temp_goods_list.goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("temp_goods_list.goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("temp_goods_list.goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("temp_goods_list.goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("temp_goods_list.goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("temp_goods_list.goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("temp_goods_list.goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("temp_goods_list.goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("temp_goods_list.goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("temp_goods_list.goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("temp_goods_list.goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("temp_goods_list.goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("temp_goods_list.goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(String value) {
            addCriterion("temp_goods_list.goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(String value) {
            addCriterion("temp_goods_list.goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(String value) {
            addCriterion("temp_goods_list.goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(String value) {
            addCriterion("temp_goods_list.goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLike(String value) {
            addCriterion("temp_goods_list.goods_type_id like", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotLike(String value) {
            addCriterion("temp_goods_list.goods_type_id not like", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<String> values) {
            addCriterion("temp_goods_list.goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<String> values) {
            addCriterion("temp_goods_list.goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_type_id not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdIsNull() {
            addCriterion("temp_goods_list.goods_sort_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdIsNotNull() {
            addCriterion("temp_goods_list.goods_sort_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdEqualTo(String value) {
            addCriterion("temp_goods_list.goods_sort_id =", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotEqualTo(String value) {
            addCriterion("temp_goods_list.goods_sort_id <>", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdGreaterThan(String value) {
            addCriterion("temp_goods_list.goods_sort_id >", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_sort_id >=", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdLessThan(String value) {
            addCriterion("temp_goods_list.goods_sort_id <", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.goods_sort_id <=", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdLike(String value) {
            addCriterion("temp_goods_list.goods_sort_id like", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotLike(String value) {
            addCriterion("temp_goods_list.goods_sort_id not like", value, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdIn(List<String> values) {
            addCriterion("temp_goods_list.goods_sort_id in", values, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotIn(List<String> values) {
            addCriterion("temp_goods_list.goods_sort_id not in", values, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_sort_id between", value1, value2, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIdNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.goods_sort_id not between", value1, value2, "goodsSortId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdIsNull() {
            addCriterion("temp_goods_list.warehouse_type_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdIsNotNull() {
            addCriterion("temp_goods_list.warehouse_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdEqualTo(String value) {
            addCriterion("temp_goods_list.warehouse_type_id =", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdNotEqualTo(String value) {
            addCriterion("temp_goods_list.warehouse_type_id <>", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdGreaterThan(String value) {
            addCriterion("temp_goods_list.warehouse_type_id >", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.warehouse_type_id >=", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdLessThan(String value) {
            addCriterion("temp_goods_list.warehouse_type_id <", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.warehouse_type_id <=", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdLike(String value) {
            addCriterion("temp_goods_list.warehouse_type_id like", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdNotLike(String value) {
            addCriterion("temp_goods_list.warehouse_type_id not like", value, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdIn(List<String> values) {
            addCriterion("temp_goods_list.warehouse_type_id in", values, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdNotIn(List<String> values) {
            addCriterion("temp_goods_list.warehouse_type_id not in", values, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdBetween(String value1, String value2) {
            addCriterion("temp_goods_list.warehouse_type_id between", value1, value2, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andWarehouseTypeIdNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.warehouse_type_id not between", value1, value2, "warehouseTypeId");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeIsNull() {
            addCriterion("temp_goods_list.original_code is null");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeIsNotNull() {
            addCriterion("temp_goods_list.original_code is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeEqualTo(String value) {
            addCriterion("temp_goods_list.original_code =", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotEqualTo(String value) {
            addCriterion("temp_goods_list.original_code <>", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeGreaterThan(String value) {
            addCriterion("temp_goods_list.original_code >", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.original_code >=", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeLessThan(String value) {
            addCriterion("temp_goods_list.original_code <", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.original_code <=", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeLike(String value) {
            addCriterion("temp_goods_list.original_code like", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotLike(String value) {
            addCriterion("temp_goods_list.original_code not like", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeIn(List<String> values) {
            addCriterion("temp_goods_list.original_code in", values, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotIn(List<String> values) {
            addCriterion("temp_goods_list.original_code not in", values, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeBetween(String value1, String value2) {
            addCriterion("temp_goods_list.original_code between", value1, value2, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.original_code not between", value1, value2, "originalCode");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("temp_goods_list.specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("temp_goods_list.specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("temp_goods_list.specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("temp_goods_list.specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("temp_goods_list.specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("temp_goods_list.specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("temp_goods_list.specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("temp_goods_list.specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("temp_goods_list.specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("temp_goods_list.specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("temp_goods_list.specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("temp_goods_list.unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("temp_goods_list.unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("temp_goods_list.unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("temp_goods_list.unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("temp_goods_list.unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("temp_goods_list.unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("temp_goods_list.unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("temp_goods_list.unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("temp_goods_list.unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("temp_goods_list.unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("temp_goods_list.unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitIsNull() {
            addCriterion("temp_goods_list.bulk_unit is null");
            return (Criteria) this;
        }

        public Criteria andBulkUnitIsNotNull() {
            addCriterion("temp_goods_list.bulk_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBulkUnitEqualTo(String value) {
            addCriterion("temp_goods_list.bulk_unit =", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitNotEqualTo(String value) {
            addCriterion("temp_goods_list.bulk_unit <>", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitGreaterThan(String value) {
            addCriterion("temp_goods_list.bulk_unit >", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.bulk_unit >=", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitLessThan(String value) {
            addCriterion("temp_goods_list.bulk_unit <", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.bulk_unit <=", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitLike(String value) {
            addCriterion("temp_goods_list.bulk_unit like", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitNotLike(String value) {
            addCriterion("temp_goods_list.bulk_unit not like", value, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitIn(List<String> values) {
            addCriterion("temp_goods_list.bulk_unit in", values, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitNotIn(List<String> values) {
            addCriterion("temp_goods_list.bulk_unit not in", values, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitBetween(String value1, String value2) {
            addCriterion("temp_goods_list.bulk_unit between", value1, value2, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andBulkUnitNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.bulk_unit not between", value1, value2, "bulkUnit");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesIsNull() {
            addCriterion("temp_goods_list.package_con_rates is null");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesIsNotNull() {
            addCriterion("temp_goods_list.package_con_rates is not null");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.package_con_rates =", value, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesNotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.package_con_rates <>", value, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesGreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.package_con_rates >", value, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.package_con_rates >=", value, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesLessThan(BigDecimal value) {
            addCriterion("temp_goods_list.package_con_rates <", value, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.package_con_rates <=", value, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.package_con_rates in", values, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesNotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.package_con_rates not in", values, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.package_con_rates between", value1, value2, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPackageConRatesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.package_con_rates not between", value1, value2, "packageConRates");
            return (Criteria) this;
        }

        public Criteria andPricingIsNull() {
            addCriterion("temp_goods_list.pricing is null");
            return (Criteria) this;
        }

        public Criteria andPricingIsNotNull() {
            addCriterion("temp_goods_list.pricing is not null");
            return (Criteria) this;
        }

        public Criteria andPricingEqualTo(String value) {
            addCriterion("temp_goods_list.pricing =", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotEqualTo(String value) {
            addCriterion("temp_goods_list.pricing <>", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThan(String value) {
            addCriterion("temp_goods_list.pricing >", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.pricing >=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThan(String value) {
            addCriterion("temp_goods_list.pricing <", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.pricing <=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLike(String value) {
            addCriterion("temp_goods_list.pricing like", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotLike(String value) {
            addCriterion("temp_goods_list.pricing not like", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingIn(List<String> values) {
            addCriterion("temp_goods_list.pricing in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotIn(List<String> values) {
            addCriterion("temp_goods_list.pricing not in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingBetween(String value1, String value2) {
            addCriterion("temp_goods_list.pricing between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.pricing not between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("temp_goods_list.tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("temp_goods_list.tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("temp_goods_list.tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andBatchManagementIsNull() {
            addCriterion("temp_goods_list.batch_management is null");
            return (Criteria) this;
        }

        public Criteria andBatchManagementIsNotNull() {
            addCriterion("temp_goods_list.batch_management is not null");
            return (Criteria) this;
        }

        public Criteria andBatchManagementEqualTo(String value) {
            addCriterion("temp_goods_list.batch_management =", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementNotEqualTo(String value) {
            addCriterion("temp_goods_list.batch_management <>", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementGreaterThan(String value) {
            addCriterion("temp_goods_list.batch_management >", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.batch_management >=", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementLessThan(String value) {
            addCriterion("temp_goods_list.batch_management <", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.batch_management <=", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementLike(String value) {
            addCriterion("temp_goods_list.batch_management like", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementNotLike(String value) {
            addCriterion("temp_goods_list.batch_management not like", value, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementIn(List<String> values) {
            addCriterion("temp_goods_list.batch_management in", values, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementNotIn(List<String> values) {
            addCriterion("temp_goods_list.batch_management not in", values, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementBetween(String value1, String value2) {
            addCriterion("temp_goods_list.batch_management between", value1, value2, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andBatchManagementNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.batch_management not between", value1, value2, "batchManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementIsNull() {
            addCriterion("temp_goods_list.valid_management is null");
            return (Criteria) this;
        }

        public Criteria andValidManagementIsNotNull() {
            addCriterion("temp_goods_list.valid_management is not null");
            return (Criteria) this;
        }

        public Criteria andValidManagementEqualTo(String value) {
            addCriterion("temp_goods_list.valid_management =", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementNotEqualTo(String value) {
            addCriterion("temp_goods_list.valid_management <>", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementGreaterThan(String value) {
            addCriterion("temp_goods_list.valid_management >", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.valid_management >=", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementLessThan(String value) {
            addCriterion("temp_goods_list.valid_management <", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.valid_management <=", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementLike(String value) {
            addCriterion("temp_goods_list.valid_management like", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementNotLike(String value) {
            addCriterion("temp_goods_list.valid_management not like", value, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementIn(List<String> values) {
            addCriterion("temp_goods_list.valid_management in", values, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementNotIn(List<String> values) {
            addCriterion("temp_goods_list.valid_management not in", values, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementBetween(String value1, String value2) {
            addCriterion("temp_goods_list.valid_management between", value1, value2, "validManagement");
            return (Criteria) this;
        }

        public Criteria andValidManagementNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.valid_management not between", value1, value2, "validManagement");
            return (Criteria) this;
        }

        public Criteria andReferenceCostIsNull() {
            addCriterion("temp_goods_list.reference_cost is null");
            return (Criteria) this;
        }

        public Criteria andReferenceCostIsNotNull() {
            addCriterion("temp_goods_list.reference_cost is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceCostEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_cost =", value, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostNotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_cost <>", value, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostGreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.reference_cost >", value, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_cost >=", value, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostLessThan(BigDecimal value) {
            addCriterion("temp_goods_list.reference_cost <", value, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_cost <=", value, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.reference_cost in", values, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostNotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.reference_cost not in", values, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.reference_cost between", value1, value2, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.reference_cost not between", value1, value2, "referenceCost");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceIsNull() {
            addCriterion("temp_goods_list.reference_sales_price is null");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceIsNotNull() {
            addCriterion("temp_goods_list.reference_sales_price is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_sales_price =", value, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_sales_price <>", value, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.reference_sales_price >", value, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_sales_price >=", value, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceLessThan(BigDecimal value) {
            addCriterion("temp_goods_list.reference_sales_price <", value, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_sales_price <=", value, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.reference_sales_price in", values, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.reference_sales_price not in", values, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.reference_sales_price between", value1, value2, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceSalesPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.reference_sales_price not between", value1, value2, "referenceSalesPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceIsNull() {
            addCriterion("temp_goods_list.reference_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceIsNotNull() {
            addCriterion("temp_goods_list.reference_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_retail_price =", value, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceNotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_retail_price <>", value, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceGreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.reference_retail_price >", value, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_retail_price >=", value, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceLessThan(BigDecimal value) {
            addCriterion("temp_goods_list.reference_retail_price <", value, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.reference_retail_price <=", value, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.reference_retail_price in", values, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceNotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.reference_retail_price not in", values, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.reference_retail_price between", value1, value2, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andReferenceRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.reference_retail_price not between", value1, value2, "referenceRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1IsNull() {
            addCriterion("temp_goods_list.sales_price1 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1IsNotNull() {
            addCriterion("temp_goods_list.sales_price1 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price1 =", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price1 <>", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price1 >", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price1 >=", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price1 <", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price1 <=", value, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price1 in", values, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price1 not in", values, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price1 between", value1, value2, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price1 not between", value1, value2, "salesPrice1");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2IsNull() {
            addCriterion("temp_goods_list.sales_price2 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2IsNotNull() {
            addCriterion("temp_goods_list.sales_price2 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price2 =", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price2 <>", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price2 >", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price2 >=", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price2 <", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price2 <=", value, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price2 in", values, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price2 not in", values, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price2 between", value1, value2, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price2 not between", value1, value2, "salesPrice2");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3IsNull() {
            addCriterion("temp_goods_list.sales_price3 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3IsNotNull() {
            addCriterion("temp_goods_list.sales_price3 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price3 =", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price3 <>", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price3 >", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price3 >=", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price3 <", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price3 <=", value, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price3 in", values, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price3 not in", values, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price3 between", value1, value2, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price3 not between", value1, value2, "salesPrice3");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4IsNull() {
            addCriterion("temp_goods_list.sales_price4 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4IsNotNull() {
            addCriterion("temp_goods_list.sales_price4 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price4 =", value, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price4 <>", value, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price4 >", value, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price4 >=", value, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price4 <", value, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price4 <=", value, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price4 in", values, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price4 not in", values, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price4 between", value1, value2, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price4 not between", value1, value2, "salesPrice4");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5IsNull() {
            addCriterion("temp_goods_list.sales_price5 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5IsNotNull() {
            addCriterion("temp_goods_list.sales_price5 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price5 =", value, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price5 <>", value, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price5 >", value, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price5 >=", value, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price5 <", value, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price5 <=", value, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price5 in", values, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price5 not in", values, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price5 between", value1, value2, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price5 not between", value1, value2, "salesPrice5");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6IsNull() {
            addCriterion("temp_goods_list.sales_price6 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6IsNotNull() {
            addCriterion("temp_goods_list.sales_price6 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price6 =", value, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price6 <>", value, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price6 >", value, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price6 >=", value, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price6 <", value, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price6 <=", value, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price6 in", values, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price6 not in", values, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price6 between", value1, value2, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price6 not between", value1, value2, "salesPrice6");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7IsNull() {
            addCriterion("temp_goods_list.sales_price7 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7IsNotNull() {
            addCriterion("temp_goods_list.sales_price7 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price7 =", value, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price7 <>", value, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price7 >", value, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price7 >=", value, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price7 <", value, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price7 <=", value, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price7 in", values, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price7 not in", values, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price7 between", value1, value2, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price7 not between", value1, value2, "salesPrice7");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8IsNull() {
            addCriterion("temp_goods_list.sales_price8 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8IsNotNull() {
            addCriterion("temp_goods_list.sales_price8 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price8 =", value, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price8 <>", value, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price8 >", value, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price8 >=", value, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price8 <", value, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price8 <=", value, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price8 in", values, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price8 not in", values, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price8 between", value1, value2, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price8 not between", value1, value2, "salesPrice8");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9IsNull() {
            addCriterion("temp_goods_list.sales_price9 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9IsNotNull() {
            addCriterion("temp_goods_list.sales_price9 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price9 =", value, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price9 <>", value, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price9 >", value, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price9 >=", value, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price9 <", value, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price9 <=", value, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price9 in", values, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price9 not in", values, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price9 between", value1, value2, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price9 not between", value1, value2, "salesPrice9");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10IsNull() {
            addCriterion("temp_goods_list.sales_price10 is null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10IsNotNull() {
            addCriterion("temp_goods_list.sales_price10 is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10EqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price10 =", value, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10NotEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price10 <>", value, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10GreaterThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price10 >", value, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price10 >=", value, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10LessThan(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price10 <", value, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("temp_goods_list.sales_price10 <=", value, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10In(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price10 in", values, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10NotIn(List<BigDecimal> values) {
            addCriterion("temp_goods_list.sales_price10 not in", values, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price10 between", value1, value2, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andSalesPrice10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("temp_goods_list.sales_price10 not between", value1, value2, "salesPrice10");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("temp_goods_list.image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("temp_goods_list.image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("temp_goods_list.image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("temp_goods_list.image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("temp_goods_list.image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("temp_goods_list.image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("temp_goods_list.image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("temp_goods_list.image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("temp_goods_list.image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("temp_goods_list.image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("temp_goods_list.image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("temp_goods_list.origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("temp_goods_list.origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("temp_goods_list.origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("temp_goods_list.origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("temp_goods_list.origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("temp_goods_list.origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("temp_goods_list.origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("temp_goods_list.origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("temp_goods_list.origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("temp_goods_list.origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("temp_goods_list.origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andManufacturersIsNull() {
            addCriterion("temp_goods_list.manufacturers is null");
            return (Criteria) this;
        }

        public Criteria andManufacturersIsNotNull() {
            addCriterion("temp_goods_list.manufacturers is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturersEqualTo(String value) {
            addCriterion("temp_goods_list.manufacturers =", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotEqualTo(String value) {
            addCriterion("temp_goods_list.manufacturers <>", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersGreaterThan(String value) {
            addCriterion("temp_goods_list.manufacturers >", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.manufacturers >=", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersLessThan(String value) {
            addCriterion("temp_goods_list.manufacturers <", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.manufacturers <=", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersLike(String value) {
            addCriterion("temp_goods_list.manufacturers like", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotLike(String value) {
            addCriterion("temp_goods_list.manufacturers not like", value, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersIn(List<String> values) {
            addCriterion("temp_goods_list.manufacturers in", values, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotIn(List<String> values) {
            addCriterion("temp_goods_list.manufacturers not in", values, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersBetween(String value1, String value2) {
            addCriterion("temp_goods_list.manufacturers between", value1, value2, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andManufacturersNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.manufacturers not between", value1, value2, "manufacturers");
            return (Criteria) this;
        }

        public Criteria andBrandsIsNull() {
            addCriterion("temp_goods_list.brands is null");
            return (Criteria) this;
        }

        public Criteria andBrandsIsNotNull() {
            addCriterion("temp_goods_list.brands is not null");
            return (Criteria) this;
        }

        public Criteria andBrandsEqualTo(String value) {
            addCriterion("temp_goods_list.brands =", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotEqualTo(String value) {
            addCriterion("temp_goods_list.brands <>", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsGreaterThan(String value) {
            addCriterion("temp_goods_list.brands >", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.brands >=", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLessThan(String value) {
            addCriterion("temp_goods_list.brands <", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.brands <=", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsLike(String value) {
            addCriterion("temp_goods_list.brands like", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotLike(String value) {
            addCriterion("temp_goods_list.brands not like", value, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsIn(List<String> values) {
            addCriterion("temp_goods_list.brands in", values, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotIn(List<String> values) {
            addCriterion("temp_goods_list.brands not in", values, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsBetween(String value1, String value2) {
            addCriterion("temp_goods_list.brands between", value1, value2, "brands");
            return (Criteria) this;
        }

        public Criteria andBrandsNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.brands not between", value1, value2, "brands");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartIsNull() {
            addCriterion("temp_goods_list.warranty_start is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartIsNotNull() {
            addCriterion("temp_goods_list.warranty_start is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_start =", value, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartNotEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_start <>", value, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartGreaterThan(Date value) {
            addCriterion("temp_goods_list.warranty_start >", value, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_start >=", value, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartLessThan(Date value) {
            addCriterion("temp_goods_list.warranty_start <", value, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartLessThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_start <=", value, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartIn(List<Date> values) {
            addCriterion("temp_goods_list.warranty_start in", values, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartNotIn(List<Date> values) {
            addCriterion("temp_goods_list.warranty_start not in", values, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.warranty_start between", value1, value2, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyStartNotBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.warranty_start not between", value1, value2, "warrantyStart");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndIsNull() {
            addCriterion("temp_goods_list.warranty_end is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndIsNotNull() {
            addCriterion("temp_goods_list.warranty_end is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_end =", value, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndNotEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_end <>", value, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndGreaterThan(Date value) {
            addCriterion("temp_goods_list.warranty_end >", value, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_end >=", value, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndLessThan(Date value) {
            addCriterion("temp_goods_list.warranty_end <", value, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndLessThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.warranty_end <=", value, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndIn(List<Date> values) {
            addCriterion("temp_goods_list.warranty_end in", values, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndNotIn(List<Date> values) {
            addCriterion("temp_goods_list.warranty_end not in", values, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.warranty_end between", value1, value2, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andWarrantyEndNotBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.warranty_end not between", value1, value2, "warrantyEnd");
            return (Criteria) this;
        }

        public Criteria andAttnIsNull() {
            addCriterion("temp_goods_list.attn is null");
            return (Criteria) this;
        }

        public Criteria andAttnIsNotNull() {
            addCriterion("temp_goods_list.attn is not null");
            return (Criteria) this;
        }

        public Criteria andAttnEqualTo(String value) {
            addCriterion("temp_goods_list.attn =", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotEqualTo(String value) {
            addCriterion("temp_goods_list.attn <>", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnGreaterThan(String value) {
            addCriterion("temp_goods_list.attn >", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.attn >=", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnLessThan(String value) {
            addCriterion("temp_goods_list.attn <", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.attn <=", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnLike(String value) {
            addCriterion("temp_goods_list.attn like", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotLike(String value) {
            addCriterion("temp_goods_list.attn not like", value, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnIn(List<String> values) {
            addCriterion("temp_goods_list.attn in", values, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotIn(List<String> values) {
            addCriterion("temp_goods_list.attn not in", values, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnBetween(String value1, String value2) {
            addCriterion("temp_goods_list.attn between", value1, value2, "attn");
            return (Criteria) this;
        }

        public Criteria andAttnNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.attn not between", value1, value2, "attn");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("temp_goods_list.department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("temp_goods_list.department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("temp_goods_list.department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("temp_goods_list.department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("temp_goods_list.department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("temp_goods_list.department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("temp_goods_list.department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("temp_goods_list.department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("temp_goods_list.department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("temp_goods_list.department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("temp_goods_list.department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("temp_goods_list.enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("temp_goods_list.enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("temp_goods_list.enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("temp_goods_list.enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("temp_goods_list.enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("temp_goods_list.enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("temp_goods_list.enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("temp_goods_list.enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("temp_goods_list.enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("temp_goods_list.enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("temp_goods_list.enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("temp_goods_list.auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("temp_goods_list.auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("temp_goods_list.auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("temp_goods_list.auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("temp_goods_list.auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("temp_goods_list.auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("temp_goods_list.auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("temp_goods_list.auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("temp_goods_list.auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("temp_goods_list.auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("temp_goods_list.auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("temp_goods_list.audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("temp_goods_list.audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("temp_goods_list.audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("temp_goods_list.audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("temp_goods_list.audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("temp_goods_list.audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("temp_goods_list.audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("temp_goods_list.audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("temp_goods_list.audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("temp_goods_list.audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("temp_goods_list.audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("temp_goods_list.audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("temp_goods_list.audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("temp_goods_list.audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("temp_goods_list.audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("temp_goods_list.audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("temp_goods_list.audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("temp_goods_list.audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("temp_goods_list.audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.audit_state not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("temp_goods_list.audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("temp_goods_list.audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("temp_goods_list.audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("temp_goods_list.audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("temp_goods_list.audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("temp_goods_list.audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("temp_goods_list.audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("temp_goods_list.audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("temp_goods_list.audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("temp_goods_list.audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("temp_goods_list.audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.audit_remark not between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("temp_goods_list.remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("temp_goods_list.remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("temp_goods_list.remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("temp_goods_list.remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("temp_goods_list.remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("temp_goods_list.remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("temp_goods_list.remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("temp_goods_list.remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("temp_goods_list.remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("temp_goods_list.remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("temp_goods_list.remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("temp_goods_list.creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("temp_goods_list.creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("temp_goods_list.creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("temp_goods_list.creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("temp_goods_list.creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("temp_goods_list.creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("temp_goods_list.creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("temp_goods_list.creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("temp_goods_list.creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("temp_goods_list.creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("temp_goods_list.creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("temp_goods_list.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("temp_goods_list.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("temp_goods_list.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("temp_goods_list.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("temp_goods_list.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("temp_goods_list.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("temp_goods_list.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("temp_goods_list.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("temp_goods_list.updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("temp_goods_list.updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("temp_goods_list.updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("temp_goods_list.updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("temp_goods_list.updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("temp_goods_list.updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("temp_goods_list.updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("temp_goods_list.updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("temp_goods_list.updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("temp_goods_list.updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("temp_goods_list.updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("temp_goods_list.updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("temp_goods_list.updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("temp_goods_list.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("temp_goods_list.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("temp_goods_list.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("temp_goods_list.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("temp_goods_list.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("temp_goods_list.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("temp_goods_list.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("temp_goods_list.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("temp_goods_list.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("temp_goods_list.update_time not between", value1, value2, "updateTime");
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