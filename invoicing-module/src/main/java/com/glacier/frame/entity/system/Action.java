package com.glacier.frame.entity.system;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.frame.entity.common.util.CommonStatus;
import com.glacier.frame.entity.system.util.ActionType;

public class Action {
    private String actionId;

    private String menuId;

    private String panelId;

    private String actionCnName;

    private String actionEnName;

    private String iconCls;

    private ActionType type;

    private CommonStatus disabled;

    private String method;

    private Integer orderNum;

    private String remark;

    /**
     * 自定义显示字段：菜单英文名称
     */
    private String menuEnName;

    /**
     * 自定义显示字段：菜单中文名称
     */
    private String menuCnName;

    /**
     * 自定义显示字段：面板中文名称
     */
    private String panelCnName;

    /**
     * 自定义显示字段：面板英文名称
     */
    private String panelEnName;

    public String getGroup() {
        return this.panelCnName;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getPanelId() {
        return panelId;
    }

    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    public String getActionCnName() {
        return actionCnName;
    }

    public void setActionCnName(String actionCnName) {
        this.actionCnName = actionCnName;
    }

    public String getActionEnName() {
        return actionEnName;
    }

    public void setActionEnName(String actionEnName) {
        this.actionEnName = actionEnName;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public CommonStatus getDisabled() {
        return disabled;
    }

    public void setDisabled(CommonStatus disabled) {
        this.disabled = disabled;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    /*
     * (non-Javadoc)
     * 
     * 
     * @return
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ReflectionToStringBuilder.toString(this);
    }

}