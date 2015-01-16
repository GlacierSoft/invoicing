package com.glacier.frame.entity.basicdatas;

public class ParWarGoodsClassify {
    private String warehouseClassifyId;

    private String warehouseId;

    private String warGoodsTypeId;

    public String getWarehouseClassifyId() {
        return warehouseClassifyId;
    }

    public void setWarehouseClassifyId(String warehouseClassifyId) {
        this.warehouseClassifyId = warehouseClassifyId;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarGoodsTypeId() {
        return warGoodsTypeId;
    }

    public void setWarGoodsTypeId(String warGoodsTypeId) {
        this.warGoodsTypeId = warGoodsTypeId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ParWarGoodsClassify other = (ParWarGoodsClassify) that;
        return (this.getWarehouseClassifyId() == null ? other.getWarehouseClassifyId() == null : this.getWarehouseClassifyId().equals(other.getWarehouseClassifyId()))
            && (this.getWarehouseId() == null ? other.getWarehouseId() == null : this.getWarehouseId().equals(other.getWarehouseId()))
            && (this.getWarGoodsTypeId() == null ? other.getWarGoodsTypeId() == null : this.getWarGoodsTypeId().equals(other.getWarGoodsTypeId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWarehouseClassifyId() == null) ? 0 : getWarehouseClassifyId().hashCode());
        result = prime * result + ((getWarehouseId() == null) ? 0 : getWarehouseId().hashCode());
        result = prime * result + ((getWarGoodsTypeId() == null) ? 0 : getWarGoodsTypeId().hashCode());
        return result;
    }
}