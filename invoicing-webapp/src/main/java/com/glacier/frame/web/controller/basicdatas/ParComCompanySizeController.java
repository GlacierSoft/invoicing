/*
 * @(#)ParameterareaController.java
 * @author songjundong
 * Copyright (c) 2015 Glacier SoftWare Company Limited. All Rights Reserved.
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
import com.glacier.frame.dto.query.basicdatas.ParComCompanySizeQueryDTO; 
import com.glacier.frame.entity.basicdatas.ParComCompanySize;
import com.glacier.frame.service.basicdatas.ParComCompanySizeService;
import com.glacier.jqueryui.util.JqPager;

/** 
 * @ClassName:  ParComCompanySizeController
 * @Description: TODO(公司规模Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-8  上午9:53:18
 */
@Controller
@RequestMapping(value = "/companySize")
public class ParComCompanySizeController extends AbstractController{

    @Autowired
    private ParComCompanySizeService parComCompanySizeService;// 注入service
    
    // 进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comCompanySize_mgr/companySize");
        return mav;
    }
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParComCompanySizeQueryDTO parComCompanySizeQueryDTO) {
        return parComCompanySizeService.listAsGrid(jqPager, parComCompanySizeQueryDTO);
    }
    
     // 进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String companySizeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comCompanySize_mgr/companySize_form");
        if(StringUtils.isNotBlank(companySizeId)){
            mav.addObject("companySizeData", parComCompanySizeService.getParComCompanySize(companySizeId));
        }
        return mav;
    }
    
    // 进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoParComCompanySizeDetailPage(String parComCompanySizeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comCompanySize_mgr/companySize_detail");
        if(StringUtils.isNotBlank(parComCompanySizeId)){
            mav.addObject("companySizeData", parComCompanySizeService.getParComCompanySize(parComCompanySizeId));
        }
        return mav;
    }
    
     //新增公司规模
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addarea(@Valid ParComCompanySize ParComCompanySize, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parComCompanySizeService.addParComCompanySize(ParComCompanySize);
    }  
    
    // 修改公司规模
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParComCompanySize parComCompanySize, BindingResult bindingResult) {
         return parComCompanySizeService.editParComCompanySize(parComCompanySize);
    }
    
    // 删除公司规模
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> parComCompanySizeIds,@RequestParam List<String> parComCompanyNames) {
    	return parComCompanySizeService.delCarType(parComCompanySizeIds, parComCompanyNames);
    }
}
