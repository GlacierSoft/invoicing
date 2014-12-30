package com.glacier.frame.entity.system;

public class Panel {
    private String panelId;

    private String menuId;

    private String panelCnName;

    private String panelEnName;

    private Integer orderNum;

    public String getPanelId() {
        return panelId;
    }

    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getPanelCnName() {
        return panelCnName;
    }

    public void setPanelCnName(String panelCnName) {
        this.panelCnName = panelCnName;
    }

    public String getPanelEnName() {
        return panelEnName;
    }

    public void setPanelEnName(String panelEnName) {
        this.panelEnName = panelEnName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
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
        Panel other = (Panel) that;
        return (this.getPanelId() == null ? other.getPanelId() == null : this.getPanelId().equals(other.getPanelId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getPanelCnName() == null ? other.getPanelCnName() == null : this.getPanelCnName().equals(other.getPanelCnName()))
            && (this.getPanelEnName() == null ? other.getPanelEnName() == null : this.getPanelEnName().equals(other.getPanelEnName()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPanelId() == null) ? 0 : getPanelId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getPanelCnName() == null) ? 0 : getPanelCnName().hashCode());
        result = prime * result + ((getPanelEnName() == null) ? 0 : getPanelEnName().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        return result;
    }
}