package com.glacier.frame.entity.system;

public class UserSetting {
    private String userId;

    private String setKey;

    private String setName;

    private String setValue;

    private String setDescription;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSetKey() {
        return setKey;
    }

    public void setSetKey(String setKey) {
        this.setKey = setKey;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getSetValue() {
        return setValue;
    }

    public void setSetValue(String setValue) {
        this.setValue = setValue;
    }

    public String getSetDescription() {
        return setDescription;
    }

    public void setSetDescription(String setDescription) {
        this.setDescription = setDescription;
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
        UserSetting other = (UserSetting) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getSetKey() == null ? other.getSetKey() == null : this.getSetKey().equals(other.getSetKey()))
            && (this.getSetName() == null ? other.getSetName() == null : this.getSetName().equals(other.getSetName()))
            && (this.getSetValue() == null ? other.getSetValue() == null : this.getSetValue().equals(other.getSetValue()))
            && (this.getSetDescription() == null ? other.getSetDescription() == null : this.getSetDescription().equals(other.getSetDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getSetKey() == null) ? 0 : getSetKey().hashCode());
        result = prime * result + ((getSetName() == null) ? 0 : getSetName().hashCode());
        result = prime * result + ((getSetValue() == null) ? 0 : getSetValue().hashCode());
        result = prime * result + ((getSetDescription() == null) ? 0 : getSetDescription().hashCode());
        return result;
    }
}