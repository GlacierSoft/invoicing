/**
 * @Title: ParPurchaseQuotedPriceTypeController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-9 上午9:19:03 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-9
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
import com.glacier.frame.dto.query.basicdatas.ParPurchaseQuotedPriceTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseQuotedPriceType;
import com.glacier.frame.service.basicdatas.ParPurchaseQuotedPriceTypeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ParPurchaseQuotedPriceTypeController
 * @Description: TODO(报价类型控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-9  上午9:19:03
 */
@Controller
@RequestMapping(value = "/purchaseQuotedPriceType")
public class ParPurchaseQuotedPriceTypeController extends AbstractController{ 

    @Autowired
    private ParPurchaseQuotedPriceTypeService quotedPriceTypeService;// 注入service
    
    // 进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseQuotedPriceType_mgr/quotedPriceType");
        return mav;
    }
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParPurchaseQuotedPriceTypeQueryDTO parPurchaseQuotedPriceTypeQueryDTO) {
        return quotedPriceTypeService.listAsGrid(jqPager, parPurchaseQuotedPriceTypeQueryDTO);
    }
    
     // 进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String quotedPriceTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseQuotedPriceType_mgr/quotedPriceType_form");
        if(StringUtils.isNotBlank(quotedPriceTypeId)){
            mav.addObject("quotedPriceTypeData", quotedPriceTypeService.getParPurchaseQuotedPriceType(quotedPriceTypeId));
        }
        return mav;
    }
    
    // 进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoParquotedPriceTypeDetailPage(String quotedPriceTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseQuotedPriceType_mgr/quotedPriceType_detail");
        if(StringUtils.isNotBlank(quotedPriceTypeId)){
            mav.addObject("quotedPriceTypeData", quotedPriceTypeService.getParPurchaseQuotedPriceType(quotedPriceTypeId));
        }
        return mav;
    }
    
     //新增报价类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addquotedPriceType(@Valid ParPurchaseQuotedPriceType parquotedPriceType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return quotedPriceTypeService.addParPurchaseQuotedPriceType(parquotedPriceType);
    }  
    
    // 修改报价类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParPurchaseQuotedPriceType parquotedPriceType, BindingResult bindingResult) {
         return quotedPriceTypeService.editParPurchaseQuotedPriceType(parquotedPriceType);
    }
    
    // 删除报价类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> quotedPriceTypeIds,@RequestParam List<String> quotedPriceTypeNames) {
    	return quotedPriceTypeService.delQuotedPriceType(quotedPriceTypeIds, quotedPriceTypeNames);
    }
  
}
