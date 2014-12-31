/*
 * @(#)ParameteroptgroupController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.web.controller.basicdatas;

import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.basicdatas.ParameterOptgroup;
import com.glacier.frame.service.basicdatas.ParameterOptgroupService;

/** 
 * @ClassName: ParameteroptgroupController 
 * @Description: TODO(下拉项的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/optgroup")
public class ParameterOptgroupController extends AbstractController{

    @Autowired
    private ParameterOptgroupService optgroupService;// 注入下拉项业务Bean
    
    // 进入下拉项列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPoptgroup() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroup_mgr/optgroup");
        return mav;
    }
    
    // 获取菜单下的树结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listOptgroupAsTreeByOptgroupId() {
        return optgroupService.listAsTree();
    }
    
    // 进入下拉项Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoOptgroupFormPoptgroup(String optgroupId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroup_mgr/optgroup_form");
        mav.addObject("allOptgroupTreeNodeData", optgroupService.getAllTreeOptgroupNode(true));
        if(StringUtils.isNotBlank(optgroupId)){
            mav.addObject("optgroupData", optgroupService.getOptgroup(optgroupId));
        }
        return mav;
    }
    
    // 进入下拉项Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoOptgroupDetailPage(String optgroupId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/optgroup_mgr/optgroup_detail");
        if(StringUtils.isNotBlank(optgroupId)){
            mav.addObject("optgroupData", optgroupService.getOptgroup(optgroupId));
        }
        return mav;
    }
    
    // 增加下拉项
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addoptgroup(@Valid ParameterOptgroup optgroup, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return optgroupService.addOptgroup(optgroup);
    }
    
    // 修改下拉项
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterOptgroup optgroup, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return optgroupService.editOptgroup(optgroup);
    }
    
    // 删除下拉项
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(String optgroupId) {
    	return optgroupService.delOptgroup(optgroupId);
    }
}
