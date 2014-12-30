package com.glacier.frame.entity.common.util;

public enum CommonStatus {
    /**
     * 返回true表示禁用按钮
     */
    enable(false),disable(true);
    
    private CommonStatus(){};
    
    private CommonStatus(boolean value){
        this.value = value;
    };
    
    private boolean value;

    public boolean getValue() {
        return value;
    }
}
