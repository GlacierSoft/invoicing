package com.glacier.frame.entity.system;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Authority extends AuthorityKey {

    private String actions;

    /**
     * 自定义显示字段,菜单英文名称
     */
    private String menuEnName;

    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public String getMenuEnName() {
        return menuEnName;
    }

    public void setMenuEnName(String menuEnName) {
        this.menuEnName = menuEnName;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ReflectionToStringBuilder.toString(this);
    }

    public boolean equals(Object obj) {
        Authority param = (Authority) obj;
        if (this.getMenuId().equals(param.getMenuId()) && this.getRoleId().equals(param.getRoleId())) {
            return true;
        } else {
            return false;
        }
    }
}