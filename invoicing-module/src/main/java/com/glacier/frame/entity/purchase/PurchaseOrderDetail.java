package com.glacier.frame.entity.purchase;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class PurchaseOrderDetail {
    private String purOrderDetId;

    private String purOrderId;

    private String goodsId;

    private String goodsCode;

    private String goodsName;

    private String goodsModel;

    private String goodsUnit;

    private Integer quantity;

    private BigDecimal price;

    private String brand;

    private String placeOfOrigin;

    private BigDecimal primeCost;

    private BigDecimal discount;

    private BigDecimal cess;

    private BigDecimal money;

    @JSONField(format="yyyy-MM-dd")
    private Date deadline;

    private Integer notArrNum;

    private Integer alrArrNum;

    private Integer notPayNum;

    private Integer alrPayNum;

    private Integer notInvNum;

    private Integer alrInvNum;

    private Integer notTerNum;

    private Integer alrTerNum;

    private BigDecimal notTerMoney;

    private BigDecimal alrTerMoney;

    private String remark;
    
    //----临时字段------
    
    private Integer arrival;//到货数量
    
    private Integer delivery;//收货数量
    
    private Integer rejection;//拒收数量
    
    private String batchInformation;//批次信息
      
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

	public String getPurOrderDetId() {
        return purOrderDetId;
    }

    public void setPurOrderDetId(String purOrderDetId) {
        this.purOrderDetId = purOrderDetId;
    }

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId;
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

    public BigDecimal getPrimeCost() {
        return primeCost;
    }

    public void setPrimeCost(BigDecimal primeCost) {
        this.primeCost = primeCost;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getNotArrNum() {
        return notArrNum;
    }

    public void setNotArrNum(Integer notArrNum) {
        this.notArrNum = notArrNum;
    }

    public Integer getAlrArrNum() {
        return alrArrNum;
    }

    public void setAlrArrNum(Integer alrArrNum) {
        this.alrArrNum = alrArrNum;
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

    public Integer getNotTerNum() {
        return notTerNum;
    }

    public void setNotTerNum(Integer notTerNum) {
        this.notTerNum = notTerNum;
    }

    public Integer getAlrTerNum() {
        return alrTerNum;
    }

    public void setAlrTerNum(Integer alrTerNum) {
        this.alrTerNum = alrTerNum;
    }

    public BigDecimal getNotTerMoney() {
        return notTerMoney;
    }

    public void setNotTerMoney(BigDecimal notTerMoney) {
        this.notTerMoney = notTerMoney;
    }

    public BigDecimal getAlrTerMoney() {
        return alrTerMoney;
    }

    public void setAlrTerMoney(BigDecimal alrTerMoney) {
        this.alrTerMoney = alrTerMoney;
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
        PurchaseOrderDetail other = (PurchaseOrderDetail) that;
        return (this.getPurOrderDetId() == null ? other.getPurOrderDetId() == null : this.getPurOrderDetId().equals(other.getPurOrderDetId()))
            && (this.getPurOrderId() == null ? other.getPurOrderId() == null : this.getPurOrderId().equals(other.getPurOrderId()))
            && (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsCode() == null ? other.getGoodsCode() == null : this.getGoodsCode().equals(other.getGoodsCode()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsModel() == null ? other.getGoodsModel() == null : this.getGoodsModel().equals(other.getGoodsModel()))
            && (this.getGoodsUnit() == null ? other.getGoodsUnit() == null : this.getGoodsUnit().equals(other.getGoodsUnit()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getPlaceOfOrigin() == null ? other.getPlaceOfOrigin() == null : this.getPlaceOfOrigin().equals(other.getPlaceOfOrigin()))
            && (this.getPrimeCost() == null ? other.getPrimeCost() == null : this.getPrimeCost().equals(other.getPrimeCost()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getCess() == null ? other.getCess() == null : this.getCess().equals(other.getCess()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getDeadline() == null ? other.getDeadline() == null : this.getDeadline().equals(other.getDeadline()))
            && (this.getNotArrNum() == null ? other.getNotArrNum() == null : this.getNotArrNum().equals(other.getNotArrNum()))
            && (this.getAlrArrNum() == null ? other.getAlrArrNum() == null : this.getAlrArrNum().equals(other.getAlrArrNum()))
            && (this.getNotPayNum() == null ? other.getNotPayNum() == null : this.getNotPayNum().equals(other.getNotPayNum()))
            && (this.getAlrPayNum() == null ? other.getAlrPayNum() == null : this.getAlrPayNum().equals(other.getAlrPayNum()))
            && (this.getNotInvNum() == null ? other.getNotInvNum() == null : this.getNotInvNum().equals(other.getNotInvNum()))
            && (this.getAlrInvNum() == null ? other.getAlrInvNum() == null : this.getAlrInvNum().equals(other.getAlrInvNum()))
            && (this.getNotTerNum() == null ? other.getNotTerNum() == null : this.getNotTerNum().equals(other.getNotTerNum()))
            && (this.getAlrTerNum() == null ? other.getAlrTerNum() == null : this.getAlrTerNum().equals(other.getAlrTerNum()))
            && (this.getNotTerMoney() == null ? other.getNotTerMoney() == null : this.getNotTerMoney().equals(other.getNotTerMoney()))
            && (this.getAlrTerMoney() == null ? other.getAlrTerMoney() == null : this.getAlrTerMoney().equals(other.getAlrTerMoney()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurOrderDetId() == null) ? 0 : getPurOrderDetId().hashCode());
        result = prime * result + ((getPurOrderId() == null) ? 0 : getPurOrderId().hashCode());
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsCode() == null) ? 0 : getGoodsCode().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsModel() == null) ? 0 : getGoodsModel().hashCode());
        result = prime * result + ((getGoodsUnit() == null) ? 0 : getGoodsUnit().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getPlaceOfOrigin() == null) ? 0 : getPlaceOfOrigin().hashCode());
        result = prime * result + ((getPrimeCost() == null) ? 0 : getPrimeCost().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getCess() == null) ? 0 : getCess().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getDeadline() == null) ? 0 : getDeadline().hashCode());
        result = prime * result + ((getNotArrNum() == null) ? 0 : getNotArrNum().hashCode());
        result = prime * result + ((getAlrArrNum() == null) ? 0 : getAlrArrNum().hashCode());
        result = prime * result + ((getNotPayNum() == null) ? 0 : getNotPayNum().hashCode());
        result = prime * result + ((getAlrPayNum() == null) ? 0 : getAlrPayNum().hashCode());
        result = prime * result + ((getNotInvNum() == null) ? 0 : getNotInvNum().hashCode());
        result = prime * result + ((getAlrInvNum() == null) ? 0 : getAlrInvNum().hashCode());
        result = prime * result + ((getNotTerNum() == null) ? 0 : getNotTerNum().hashCode());
        result = prime * result + ((getAlrTerNum() == null) ? 0 : getAlrTerNum().hashCode());
        result = prime * result + ((getNotTerMoney() == null) ? 0 : getNotTerMoney().hashCode());
        result = prime * result + ((getAlrTerMoney() == null) ? 0 : getAlrTerMoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}