/**
 * @Title: ParPurchaseReturnedTypeController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 上午11:08:09 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-13
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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

import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.basicdatas.ParPurchaseReturnedTypeQueryDTO; 
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnedType;
import com.glacier.frame.service.basicdatas.ParPurchaseReturnedTypeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ParPurchaseReturnedTypeController
 * @Description: TODO(采购退货方式控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13  上午11:08:09
 */
@Controller
@RequestMapping(value = "/purchaseReturnedType")
public class ParPurchaseReturnedTypeController extends AbstractController{
 
    @Autowired
    private ParPurchaseReturnedTypeService purchaseReturnedTypeService;// 注入service
    
    // 进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseReturnedType_mgr/purchaseReturnedType");
        return mav;
    }
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParPurchaseReturnedTypeQueryDTO parPurchaseReturnedTypeQueryDTO) {
        return purchaseReturnedTypeService.listAsGrid(jqPager, parPurchaseReturnedTypeQueryDTO);
    }
    
     // 进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String returnedPurchaseTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseReturnedType_mgr/purchaseReturnedType_form");
        if(StringUtils.isNotBlank(returnedPurchaseTypeId)){
            mav.addObject("purchaseReturnedTypeData", purchaseReturnedTypeService.getPurchaseReturnedType(returnedPurchaseTypeId));
        }
        return mav;
    }
    
    // 进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoParComNatureDetailPage(String returnedPurchaseTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseReturnedType_mgr/purchaseReturnedType_detail");
        if(StringUtils.isNotBlank(returnedPurchaseTypeId)){
            mav.addObject("purchaseReturnedTypeData", purchaseReturnedTypeService.getPurchaseReturnedType(returnedPurchaseTypeId));
        }
        return mav;
    }
    
     //新增采购退货方式
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addSuppliersNature(@Valid ParPurchaseReturnedType parPurchaseReturnedType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return purchaseReturnedTypeService.addParPurchaseReturnedType(parPurchaseReturnedType);
    }  
    
    // 修改采购退货方式
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParPurchaseReturnedType parPurchaseReturnedType, BindingResult bindingResult) {
         return purchaseReturnedTypeService.editParPurchaseReturnedType(parPurchaseReturnedType);
    }
    
    // 删除采购退货方式
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> returnedPurchaseTypeIds,@RequestParam List<String> purchaseReturnedTypeNames) {
        return purchaseReturnedTypeService.delPurchaseReturnedType(returnedPurchaseTypeIds, purchaseReturnedTypeNames);
    } 
}
