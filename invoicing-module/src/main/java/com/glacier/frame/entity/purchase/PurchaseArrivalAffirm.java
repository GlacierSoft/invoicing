package com.glacier.frame.entity.purchase;

import java.util.Date;

public class PurchaseArrivalAffirm {
    private String purArrAffId;

    private String purArrivalId;

    private Date signDate;

    private String signPerson;

    private Date affirmDate;

    private String affirmPerson;

    private String affirmDep;

    private String remark;

    private String creater;

    private Date createTime;

    public String getPurArrAffId() {
        return purArrAffId;
    }

    public void setPurArrAffId(String purArrAffId) {
        this.purArrAffId = purArrAffId;
    }

    public String getPurArrivalId() {
        return purArrivalId;
    }

    public void setPurArrivalId(String purArrivalId) {
        this.purArrivalId = purArrivalId;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getSignPerson() {
        return signPerson;
    }

    public void setSignPerson(String signPerson) {
        this.signPerson = signPerson;
    }

    public Date getAffirmDate() {
        return affirmDate;
    }

    public void setAffirmDate(Date affirmDate) {
        this.affirmDate = affirmDate;
    }

    public String getAffirmPerson() {
        return affirmPerson;
    }

    public void setAffirmPerson(String affirmPerson) {
        this.affirmPerson = affirmPerson;
    }

    public String getAffirmDep() {
        return affirmDep;
    }

    public void setAffirmDep(String affirmDep) {
        this.affirmDep = affirmDep;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        PurchaseArrivalAffirm other = (PurchaseArrivalAffirm) that;
        return (this.getPurArrAffId() == null ? other.getPurArrAffId() == null : this.getPurArrAffId().equals(other.getPurArrAffId()))
            && (this.getPurArrivalId() == null ? other.getPurArrivalId() == null : this.getPurArrivalId().equals(other.getPurArrivalId()))
            && (this.getSignDate() == null ? other.getSignDate() == null : this.getSignDate().equals(other.getSignDate()))
            && (this.getSignPerson() == null ? other.getSignPerson() == null : this.getSignPerson().equals(other.getSignPerson()))
            && (this.getAffirmDate() == null ? other.getAffirmDate() == null : this.getAffirmDate().equals(other.getAffirmDate()))
            && (this.getAffirmPerson() == null ? other.getAffirmPerson() == null : this.getAffirmPerson().equals(other.getAffirmPerson()))
            && (this.getAffirmDep() == null ? other.getAffirmDep() == null : this.getAffirmDep().equals(other.getAffirmDep()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPurArrAffId() == null) ? 0 : getPurArrAffId().hashCode());
        result = prime * result + ((getPurArrivalId() == null) ? 0 : getPurArrivalId().hashCode());
        result = prime * result + ((getSignDate() == null) ? 0 : getSignDate().hashCode());
        result = prime * result + ((getSignPerson() == null) ? 0 : getSignPerson().hashCode());
        result = prime * result + ((getAffirmDate() == null) ? 0 : getAffirmDate().hashCode());
        result = prime * result + ((getAffirmPerson() == null) ? 0 : getAffirmPerson().hashCode());
        result = prime * result + ((getAffirmDep() == null) ? 0 : getAffirmDep().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}