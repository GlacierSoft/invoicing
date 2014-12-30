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
 * @ClassName: ActionRange 
 * @Description: TODO(动作范围) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-9-10 下午3:27:48
 */
public enum ActionRange {
    
    ALL(0),DEPC(1),DEP(2),SELF(3);
    
    private ActionRange(){};
    
    private ActionRange(int value){
        this.value = value;
    };
    
    private int value;

    public int getValue() {
        return value;
    }

}
