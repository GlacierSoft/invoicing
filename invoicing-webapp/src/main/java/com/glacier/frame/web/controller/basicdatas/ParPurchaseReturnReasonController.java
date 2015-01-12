/**
 * @Title: ParPurchaseReturnReasonController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-9 上午9:45:57 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2015-1-9
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

import com.glacier.frame.dto.service.basicdatas.ParPurchaseReturnReasonQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnReason;
import com.glacier.frame.service.basicdatas.ParPurchaseReturnReasonService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: ParPurchaseReturnReasonController 
 * @Description: TODO(退货类型信息控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-9 上午9:45:57
 */
@Controller
@RequestMapping(value = "/parPurchaseReturnReason")
public class ParPurchaseReturnReasonController {
    @Autowired
    private ParPurchaseReturnReasonService parPurchaseReturnReasonService;
    
    // 进入退货类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseReturnReason_mgr/parPurchaseReturnReason");
        return mav;
    } 

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParPurchaseReturnReasonQueryDTO parPurchaseReturnReasonQueryDTO) {
        return parPurchaseReturnReasonService.listAsGrid(jqPager, parPurchaseReturnReasonQueryDTO);
    }
    
    // 进入退货类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoReturnReasonDetail(String parPurchaseReturnReasonId) { 
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseReturnReason_mgr/parPurchaseReturnReason_detail");
        if(StringUtils.isNotBlank(parPurchaseReturnReasonId)){
            mav.addObject("parPurchaseReturnReasonDate", parPurchaseReturnReasonService.getReturnReason(parPurchaseReturnReasonId));
        }
        return mav;
    }
    
    // 进入退货类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String parPurchaseReturnReasonId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/purchaseReturnReason_mgr/parPurchaseReturnReason_form");
        if(StringUtils.isNotBlank(parPurchaseReturnReasonId)){
            mav.addObject("parPurchaseReturnReasonDate", parPurchaseReturnReasonService.getReturnReason(parPurchaseReturnReasonId));
        }
        return mav;
    }
    
    //增加退货类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParPurchaseReturnReason parPurchaseReturnReason, BindingResult bindingResult) {
        return parPurchaseReturnReasonService.addReturnReason(parPurchaseReturnReason);
    }
    
    //修改退货类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParPurchaseReturnReason parPurchaseReturnReason, BindingResult bindingResult) {
        return parPurchaseReturnReasonService.editReturnReason(parPurchaseReturnReason);
    }
    
    //删除等级信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parPurchaseReturnReasonIds,@RequestParam List<String> names) {
        return parPurchaseReturnReasonService.delReturnReason(parPurchaseReturnReasonIds, names);
    }
}
