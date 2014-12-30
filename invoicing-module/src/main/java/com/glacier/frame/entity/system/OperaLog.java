package com.glacier.frame.entity.system;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class OperaLog {
    private String operalogId;

    private String operaMenu;

    private String operaPenal;

    private String operaMethod;

    private String operaResult;

    private String operaDesc;

    private String operaClass;

    private String operaMd;

    private String operaKey;

    private String operator;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date operaTime;

    public String getOperalogId() {
        return operalogId;
    }

    public void setOperalogId(String operalogId) {
        this.operalogId = operalogId;
    }

    public String getOperaMenu() {
        return operaMenu;
    }

    public void setOperaMenu(String operaMenu) {
        this.operaMenu = operaMenu;
    }

    public String getOperaPenal() {
        return operaPenal;
    }

    public void setOperaPenal(String operaPenal) {
        this.operaPenal = operaPenal;
    }

    public String getOperaMethod() {
        return operaMethod;
    }

    public void setOperaMethod(String operaMethod) {
        this.operaMethod = operaMethod;
    }

    public String getOperaResult() {
        return operaResult;
    }

    public void setOperaResult(String operaResult) {
        this.operaResult = operaResult;
    }

    public String getOperaDesc() {
        return operaDesc;
    }

    public void setOperaDesc(String operaDesc) {
        this.operaDesc = operaDesc;
    }

    public String getOperaClass() {
        return operaClass;
    }

    public void setOperaClass(String operaClass) {
        this.operaClass = operaClass;
    }

    public String getOperaMd() {
        return operaMd;
    }

    public void setOperaMd(String operaMd) {
        this.operaMd = operaMd;
    }

    public String getOperaKey() {
        return operaKey;
    }

    public void setOperaKey(String operaKey) {
        this.operaKey = operaKey;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperaTime() {
        return operaTime;
    }

    public void setOperaTime(Date operaTime) {
        this.operaTime = operaTime;
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
        OperaLog other = (OperaLog) that;
        return (this.getOperalogId() == null ? other.getOperalogId() == null : this.getOperalogId().equals(other.getOperalogId()))
            && (this.getOperaMenu() == null ? other.getOperaMenu() == null : this.getOperaMenu().equals(other.getOperaMenu()))
            && (this.getOperaPenal() == null ? other.getOperaPenal() == null : this.getOperaPenal().equals(other.getOperaPenal()))
            && (this.getOperaMethod() == null ? other.getOperaMethod() == null : this.getOperaMethod().equals(other.getOperaMethod()))
            && (this.getOperaResult() == null ? other.getOperaResult() == null : this.getOperaResult().equals(other.getOperaResult()))
            && (this.getOperaDesc() == null ? other.getOperaDesc() == null : this.getOperaDesc().equals(other.getOperaDesc()))
            && (this.getOperaClass() == null ? other.getOperaClass() == null : this.getOperaClass().equals(other.getOperaClass()))
            && (this.getOperaMd() == null ? other.getOperaMd() == null : this.getOperaMd().equals(other.getOperaMd()))
            && (this.getOperaKey() == null ? other.getOperaKey() == null : this.getOperaKey().equals(other.getOperaKey()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOperaTime() == null ? other.getOperaTime() == null : this.getOperaTime().equals(other.getOperaTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperalogId() == null) ? 0 : getOperalogId().hashCode());
        result = prime * result + ((getOperaMenu() == null) ? 0 : getOperaMenu().hashCode());
        result = prime * result + ((getOperaPenal() == null) ? 0 : getOperaPenal().hashCode());
        result = prime * result + ((getOperaMethod() == null) ? 0 : getOperaMethod().hashCode());
        result = prime * result + ((getOperaResult() == null) ? 0 : getOperaResult().hashCode());
        result = prime * result + ((getOperaDesc() == null) ? 0 : getOperaDesc().hashCode());
        result = prime * result + ((getOperaClass() == null) ? 0 : getOperaClass().hashCode());
        result = prime * result + ((getOperaMd() == null) ? 0 : getOperaMd().hashCode());
        result = prime * result + ((getOperaKey() == null) ? 0 : getOperaKey().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getOperaTime() == null) ? 0 : getOperaTime().hashCode());
        return result;
    }
}