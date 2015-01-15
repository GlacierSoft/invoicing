package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseArrivalDetail {
    private String purArrivalDetId;

    private String purArrivalId;

    private String goodsId;

    private String goodsCode;

    private String goodsName;

    private String goodsModel;

    private String goodsUnit;

    private Integer quantity;

    private BigDecimal price;

    private BigDecimal goodsMoney;

    private Date deadline;

    private Integer notReturnNum;

    private Integer alrReturnNum;

    private Integer notPayNum;

    private Integer alrPayNum;

    private Integer notInvNum;

    private Integer alrInvNum;

    private String brand;

    private String placeOfOrigin;

    private String batchInformation;

    private Integer arrival;

    private Integer delivery;

    private Integer rejection;

    private BigDecimal originalCost;

    private BigDecimal depositRate;

    private Integer putstorage;

    private Integer takestorage;

    private String remark;

    public String getPurArrivalDetId() {
        return purArrivalDetId;
    }

    public void setPurArrivalDetId(String purArrivalDetId) {
        this.purArrivalDetId = purArrivalDetId;
    }

    public String getPurArrivalId() {
        return purArrivalId;
    }

    public void setPurArrivalId(String purArrivalId) {
        this.purArrivalId = purArrivalId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getGoodsMoney() {
        return goodsMoney;
    }

    public void setGoodsMoney(BigDecimal goodsMoney) {
        this.goodsMoney = goodsMoney;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getNotReturnNum() {
        return notReturnNum;
    }

    public void setNotReturnNum(Integer notReturnNum) {
        this.notReturnNum = notReturnNum;
    }

    public Integer getAlrReturnNum() {
        return alrReturnNum;
    }

    public void setAlrReturnNum(Integer alrReturnNum) {
        this.alrReturnNum = alrReturnNum;
    }

    public Integer getNotPayNum() {
        return notPayNum;
    }

    public void setNotPayNum(Integer notPayNum) {
        this.notPayNum = notPayNum;
    }

    public Integer getAlrPayNum() {
        return alrPayNum;
    }

    public void setAlrPayNum(Integer alrPayNum) {
        this.alrPayNum = alrPayNum;
    }

    public Integer getNotInvNum() {
        return notInvNum;
    }

    public void setNotInvNum(Integer notInvNum) {
        this.notInvNum = notInvNum;
    }

    public Integer getAlrInvNum() {
        return alrInvNum;
    }

    public void setAlrInvNum(Integer alrInvNum) {
        this.alrInvNum = alrInvNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getBatchInformation() {
        return batchInformation;
    }

    public void setBatchInformation(String batchInformation) {
        this.batchInformation = batchInformation;
    }

    public Integer getArrival() {
        return arrival;
    }

    public void setArrival(Integer arrival) {
        this.arrival = arrival;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getRejection() {
        return rejection;
    }

    public void setRejection(Integer rejection) {
        this.rejection = rejection;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
    }

    public BigDecimal getDepositRate() {
        return depositRate;
    }

    public void setDepositRate(BigDecimal depositRate) {
        this.depositRate = depositRate;
    }

    public Integer getPutstorage() {
        return putstorage;
    }

    public void setPutstorage(Integer putstorage) {
        this.putstorage = putstorage;
    }

    public Integer getTakestorage() {
        return takestorage;
    }

    public void setTakestorage(Integer takestorage) {
        this.takestorage = takestorage;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        PurchaseArrivalDetail other = (PurchaseArrivalDetail) that;
        return (this.getPurArrivalDetId() == null ? other.getPurArrivalDetId() == null : this.getPurArrivalDetId().equals(other.getPurArrivalDetId()))
            && (this.getPurArrivalId() == null ? other.getPurArrivalId() == null : this.getPurArrivalId().equals(other.getPurArrivalId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsModel() == null ? other.getGoodsModel() == null : this.getGoodsModel().equals(other.getGoodsModel()))
            && (this.getGoodsUnit() == null ? other.getGoodsUnit() == null : this.getGoodsUnit().equals(other.getGoodsUnit()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getGoodsMoney() == null ? other.getGoodsMoney() == null : this.getGoodsMoney().equals(other.getGoodsMoney()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getNotReturnNum() == null ? other.getNotReturnNum() == null : this.getNotReturnNum().equals(other.getNotReturnNum()))
            && (this.getAlrReturnNum() == null ? other.getAlrReturnNum() == null : this.getAlrReturnNum().equals(other.getAlrReturnNum()))
            && (this.getNotPayNum() == null ? other.getNotPayNum() == null : this.getNotPayNum().equals(other.getNotPayNum()))
            && (this.getAlrPayNum() == null ? other.getAlrPayNum() == null : this.getAlrPayNum().equals(other.getAlrPayNum()))
            && (this.getNotInvNum() == null ? other.getNotInvNum() == null : this.getNotInvNum().equals(other.getNotInvNum()))
            && (this.getAlrInvNum() == null ? other.getAlrInvNum() == null : this.getAlrInvNum().equals(other.getAlrInvNum()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getPlaceOfOrigin() == null ? other.getPlaceOfOrigin() == null : this.getPlaceOfOrigin().equals(other.getPlaceOfOrigin()))
            && (this.getBatchInformation() == null ? other.getBatchInformation() == null : this.getBatchInformation().equals(other.getBatchInformation()))
            && (this.getArrival() == null ? other.getArrival() == null : this.getArrival().equals(other.getArrival()))
            && (this.getDelivery() == null ? other.getDelivery() == null : this.getDelivery().equals(other.getDelivery()))
            && (this.getRejection() == null ? other.getRejection() == null : this.getRejection().equals(other.getRejection()))
            && (this.getOriginalCost() == null ? other.getOriginalCost() == null : this.getOriginalCost().equals(other.getOriginalCost()))
            && (this.getDepositRate() == null ? other.getDepositRate() == null : this.getDepositRate().equals(other.getDepositRate()))
            && (this.getPutstorage() == null ? other.getPutstorage() == null : this.getPutstorage().equals(other.getPutstorage()))
            && (this.getTakestorage() == null ? other.getTakestorage() == null : this.getTakestorage().equals(other.getTakestorage()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurArrivalDetId() == null) ? 0 : getPurArrivalDetId().hashCode());
        result = prime * result + ((getPurArrivalId() == null) ? 0 : getPurArrivalId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsModel() == null) ? 0 : getGoodsModel().hashCode());
        result = prime * result + ((getGoodsUnit() == null) ? 0 : getGoodsUnit().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getGoodsMoney() == null) ? 0 : getGoodsMoney().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getNotReturnNum() == null) ? 0 : getNotReturnNum().hashCode());
        result = prime * result + ((getAlrReturnNum() == null) ? 0 : getAlrReturnNum().hashCode());
        result = prime * result + ((getNotPayNum() == null) ? 0 : getNotPayNum().hashCode());
        result = prime * result + ((getAlrPayNum() == null) ? 0 : getAlrPayNum().hashCode());
        result = prime * result + ((getNotInvNum() == null) ? 0 : getNotInvNum().hashCode());
        result = prime * result + ((getAlrInvNum() == null) ? 0 : getAlrInvNum().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getPlaceOfOrigin() == null) ? 0 : getPlaceOfOrigin().hashCode());
        result = prime * result + ((getBatchInformation() == null) ? 0 : getBatchInformation().hashCode());
        result = prime * result + ((getArrival() == null) ? 0 : getArrival().hashCode());
        result = prime * result + ((getDelivery() == null) ? 0 : getDelivery().hashCode());
        result = prime * result + ((getRejection() == null) ? 0 : getRejection().hashCode());
        result = prime * result + ((getOriginalCost() == null) ? 0 : getOriginalCost().hashCode());
        result = prime * result + ((getDepositRate() == null) ? 0 : getDepositRate().hashCode());
        result = prime * result + ((getPutstorage() == null) ? 0 : getPutstorage().hashCode());
        result = prime * result + ((getTakestorage() == null) ? 0 : getTakestorage().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}