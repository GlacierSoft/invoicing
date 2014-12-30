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
package com.glacier.core.controller;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.validation.BindingResult;

import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: AbstractController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xichao.dong	
 * @email 406592176@qq.com
 * @date 2014-8-15 上午11:17:27
 */
public abstract class AbstractController {

    protected Object returnErrorBindingResult(BindingResult bindingResult) {
        return new JqReturnJson(bindingResult.getFieldErrors().get(0).getDefaultMessage());
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
