package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.Date;

public class PurchaseReturnDetail {
    private String purReturnDetId;

    private String purReturnId;

    private String goodsId;

    private String goodsCode;

    private String goodsName;

    private String goodsModel;

    private String goodsUnit;

    private Integer quantity;

    private BigDecimal price;

    private String brand;

    private String placeOfOrigin;

    private String batchInformation;

    private BigDecimal cess;

    private BigDecimal money;

    private BigDecimal purMoney;

    private Date deadline;

    private Integer notPayNum;

    private Integer alrPayNum;

    private Integer notInvNum;

    private Integer alrInvNum;

    private String remark;

    public String getPurReturnDetId() {
        return purReturnDetId;
    }

    public void setPurReturnDetId(String purReturnDetId) {
        this.purReturnDetId = purReturnDetId;
    }

    public String getPurReturnId() {
        return purReturnId;
    }

    public void setPurReturnId(String purReturnId) {
        this.purReturnId = purReturnId;
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

    public BigDecimal getCess() {
        return cess;
    }

    public void setCess(BigDecimal cess) {
        this.cess = cess;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getPurMoney() {
        return purMoney;
    }

    public void setPurMoney(BigDecimal purMoney) {
        this.purMoney = purMoney;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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
        PurchaseReturnDetail other = (PurchaseReturnDetail) that;
        return (this.getPurReturnDetId() == null ? other.getPurReturnDetId() == null : this.getPurReturnDetId().equals(other.getPurReturnDetId()))
            && (this.getPurReturnId() == null ? other.getPurReturnId() == null : this.getPurReturnId().equals(other.getPurReturnId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsModel() == null ? other.getGoodsModel() == null : this.getGoodsModel().equals(other.getGoodsModel()))
            && (this.getGoodsUnit() == null ? other.getGoodsUnit() == null : this.getGoodsUnit().equals(other.getGoodsUnit()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getPlaceOfOrigin() == null ? other.getPlaceOfOrigin() == null : this.getPlaceOfOrigin().equals(other.getPlaceOfOrigin()))
            && (this.getBatchInformation() == null ? other.getBatchInformation() == null : this.getBatchInformation().equals(other.getBatchInformation()))
            && (this.getCess() == null ? other.getCess() == null : this.getCess().equals(other.getCess()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getPurMoney() == null ? other.getPurMoney() == null : this.getPurMoney().equals(other.getPurMoney()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getNotPayNum() == null ? other.getNotPayNum() == null : this.getNotPayNum().equals(other.getNotPayNum()))
            && (this.getAlrPayNum() == null ? other.getAlrPayNum() == null : this.getAlrPayNum().equals(other.getAlrPayNum()))
            && (this.getNotInvNum() == null ? other.getNotInvNum() == null : this.getNotInvNum().equals(other.getNotInvNum()))
            && (this.getAlrInvNum() == null ? other.getAlrInvNum() == null : this.getAlrInvNum().equals(other.getAlrInvNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurReturnDetId() == null) ? 0 : getPurReturnDetId().hashCode());
        result = prime * result + ((getPurReturnId() == null) ? 0 : getPurReturnId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsModel() == null) ? 0 : getGoodsModel().hashCode());
        result = prime * result + ((getGoodsUnit() == null) ? 0 : getGoodsUnit().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getPlaceOfOrigin() == null) ? 0 : getPlaceOfOrigin().hashCode());
        result = prime * result + ((getBatchInformation() == null) ? 0 : getBatchInformation().hashCode());
        result = prime * result + ((getCess() == null) ? 0 : getCess().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getPurMoney() == null) ? 0 : getPurMoney().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getNotPayNum() == null) ? 0 : getNotPayNum().hashCode());
        result = prime * result + ((getAlrPayNum() == null) ? 0 : getAlrPayNum().hashCode());
        result = prime * result + ((getNotInvNum() == null) ? 0 : getNotInvNum().hashCode());
        result = prime * result + ((getAlrInvNum() == null) ? 0 : getAlrInvNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}