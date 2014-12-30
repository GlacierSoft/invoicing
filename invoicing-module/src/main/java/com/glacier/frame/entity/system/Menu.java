package com.glacier.frame.entity.system;

public class Menu {
    private String menuId;

    private String pid;
    
    /**
     * 自定义字段
     */
    private String parentMenuCnName;

    private String menuEnName;

    private String menuCnName;

    private String iconCls;

    private String url;

    private Integer orderNum;

    private String remark;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMenuEnName() {
        return menuEnName;
    }

    public void setMenuEnName(String menuEnName) {
        this.menuEnName = menuEnName;
    }

    public String getMenuCnName() {
        return menuCnName;
    }

    public void setMenuCnName(String menuCnName) {
        this.menuCnName = menuCnName;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public String getParentMenuCnName() {
        return parentMenuCnName;
    }

    public void setParentMenuCnName(String parentMenuCnName) {
        this.parentMenuCnName = parentMenuCnName;
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
        Menu other = (Menu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getMenuEnName() == null ? other.getMenuEnName() == null : this.getMenuEnName().equals(other.getMenuEnName()))
            && (this.getMenuCnName() == null ? other.getMenuCnName() == null : this.getMenuCnName().equals(other.getMenuCnName()))
            && (this.getIconCls() == null ? other.getIconCls() == null : this.getIconCls().equals(other.getIconCls()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getOrderNum() == null ? other.getOrderNum() == null : this.getOrderNum().equals(other.getOrderNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getMenuEnName() == null) ? 0 : getMenuEnName().hashCode());
        result = prime * result + ((getMenuCnName() == null) ? 0 : getMenuCnName().hashCode());
        result = prime * result + ((getIconCls() == null) ? 0 : getIconCls().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getOrderNum() == null) ? 0 : getOrderNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}