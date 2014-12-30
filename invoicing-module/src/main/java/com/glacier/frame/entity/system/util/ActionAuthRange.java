/**
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2014-8-15 上午8:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) : 2014-8-15 上午8:50:38  xichao.dong 
 * @Review (审核人) ：xichao.dong 
 */
package com.glacier.frame.entity.system.util;

/**
 * @ClassName: ActionAuthRange 
 * @Description: TODO(操作是否开启权限范围) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-9-10 下午3:26:34
 */
public enum ActionAuthRange {
    
    Open(true),Close(false);
    
    private ActionAuthRange(){};
    
    private ActionAuthRange(boolean value){
        this.value = value;
    };
    
    private boolean value;

    public boolean getValue() {
        return value;
    }
}
