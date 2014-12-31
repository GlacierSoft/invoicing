/*
 * @(#)ParameteroptgroupValueController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.basicdatas;

import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.entity.basicdatas.ParameterOptgroupValue;
import com.glacier.frame.service.basicdatas.ParameterOptgroupService;
import com.glacier.frame.service.basicdatas.ParameterOptgroupValueService;

/** 
 * @ClassName: ParameteroptgroupValueController 
 * @Description: TODO(下拉值的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/optgroupValue")
public class ParameterOptgroupValueController extends AbstractController{

    @Autowired
    private ParameterOptgroupValueService optgroupValueService;// 注入下拉值业务Bean
    
    @Autowired
    private ParameterOptgroupService optgroupService;// 注入下拉值业务Bean
    
    // 进入下拉值列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPoptgroupValue() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroupValue_mgr/optgroupValue");
        return mav;
    }
    
    // 进入下拉值Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intooptgroupValueFormPoptgroupValue(String optgroupValueId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroup_mgr/optgroupValue_form");
        mav.addObject("allOptgroupTreeNodeData", optgroupService.getAllTreeOptgroupNode(true));
        if(StringUtils.isNotBlank(optgroupValueId)){
            mav.addObject("optgroupValueData", optgroupValueService.getOptgroupValue(optgroupValueId));
        }
        return mav;
    }
    
    // 进入下拉值Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoOptgroupValueDetailPage(String optgroupValueId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroup_mgr/optgroupValue_detail");
        if(StringUtils.isNotBlank(optgroupValueId)){
            mav.addObject("optgroupValueData", optgroupValueService.getOptgroupValue(optgroupValueId));
        }
        return mav;
    }
    
    // 获取表格结构的所有下拉值数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listValueAsGridByOptgroupId(String optgroupId,JqPager pager) {
        return optgroupValueService.listAsGrid(optgroupId,pager);
    }
    
    // 增加下拉值
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addoptgroupValue(@Valid ParameterOptgroupValue optgroupValue, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return optgroupValueService.addOptgroupValue(optgroupValue);
    }
    
    // 修改下拉值
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterOptgroupValue optgroupValue, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return optgroupValueService.editOptgroupValue(optgroupValue);
    }
    
    // 删除下拉值
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> optgroupValueIds,@RequestParam List<String> optgroupValueNames) {
    	return optgroupValueService.delOptgroupValue(optgroupValueIds, optgroupValueNames);
    }
}
