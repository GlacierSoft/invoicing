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
 * @ClassName: ActionDisabled 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-9-10 下午3:28:01
 */
public enum ActionDisabled {
    /**
     * 返回true表示禁用按钮
     */
    Enabled(false),Disabled(true);
    
    private ActionDisabled(){};
    
    private ActionDisabled(boolean value){
        this.value = value;
    };
    
    private boolean value;

    public boolean getValue() {
        return value;
    }
}
