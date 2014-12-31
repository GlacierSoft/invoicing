/*
 * @(#)ParametervariablesController.java
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
import com.glacier.frame.entity.basicdatas.ParameterSystemVariables;
import com.glacier.frame.service.basicdatas.ParameterSystemVariablesService;

/** 
 * @ClassName: ParametervariablesController 
 * @Description: TODO(系统变量的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/variables")
public class ParameterSystemVariablesController extends AbstractController{

    @Autowired
    private ParameterSystemVariablesService systemVariablesService;// 注入系统变量业务Bean
    
    // 进入系统变量列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPvariables() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/variables_mgr/variables");
        return mav;
    }
    
    // 进入系统变量Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intovariablesFormPvariables(String variablesId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/variables_mgr/variables_form");
        if(StringUtils.isNotBlank(variablesId)){
            mav.addObject("variablesData", systemVariablesService.getSystemVariables(variablesId));
        }
        return mav;
    }
    
    // 进入系统变量Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSystemVariablesDetailPage(String variablesId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/variables_mgr/variables_detail");
        if(StringUtils.isNotBlank(variablesId)){
            mav.addObject("variablesData", systemVariablesService.getSystemVariables(variablesId));
        }
        return mav;
    }
    
    // 获取表格结构的所有系统变量数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listValueAsGridByVariablesId(String variablesId,JqPager pager) {
        return systemVariablesService.listAsGrid(variablesId,pager);
    }
    
    // 增加系统变量
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addvariables(@Valid ParameterSystemVariables systemVariables, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return systemVariablesService.addSystemVariables(systemVariables);
    }
    
    // 修改系统变量
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParameterSystemVariables systemVariables, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return systemVariablesService.editSystemVariables(systemVariables);
    }
    
    // 删除系统变量
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> variablesIds,@RequestParam List<String> variableNames) {
    	return systemVariablesService.delSystemVariables(variablesIds, variableNames);
    }
}
