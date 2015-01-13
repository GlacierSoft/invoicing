/**
 * @Title: ParPurchaseTypeController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午5:29:50 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-8
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
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

import com.glacier.frame.dto.service.basicdatas.ParPurchaseTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseType;
import com.glacier.frame.service.basicdatas.ParPurchaseTypeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: ParPurchaseTypeController 
 * @Description: TODO(采购类型业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午5:29:50
 */ 
@Controller
@RequestMapping(value = "/purchaseType")
public class ParPurchaseTypeController {
  
	@Autowired
	private ParPurchaseTypeService purchaseTypeService;
	
	// 进入采购类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseType_mgr/purchaseType");
        return mav;
    } 

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParPurchaseTypeQueryDTO purchaseTypeQueryDTO) {
        return purchaseTypeService.listAsGrid(jqPager, purchaseTypeQueryDTO);
    }
    
    // 进入采购类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersIndustryDetail(String purchaseTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseType_mgr/purchaseType_detail");
        if(StringUtils.isNotBlank(purchaseTypeId)){
            mav.addObject("purchaseTypeDate", purchaseTypeService.getPurchaseType(purchaseTypeId));
        }
	    return mav;
    }
    
    // 进入采购类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String purchaseTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseType_mgr/purchaseType_form");
        if(StringUtils.isNotBlank(purchaseTypeId)){
            mav.addObject("purchaseTypeDate", purchaseTypeService.getPurchaseType(purchaseTypeId));
        }
        return mav;
    }
    
    //增加采购类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParPurchaseType parPurchaseType, BindingResult bindingResult) {
        return purchaseTypeService.addPurchaseType(parPurchaseType);
    }
    
    //修改采购类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParPurchaseType parPurchaseType, BindingResult bindingResult) {
        return purchaseTypeService.editPurchaseType(parPurchaseType);
    }
    
    //删除采购类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> purchaseTypeIds,@RequestParam List<String> names) {
    	return purchaseTypeService.delPurchaseType(purchaseTypeIds, names);
    }
}
