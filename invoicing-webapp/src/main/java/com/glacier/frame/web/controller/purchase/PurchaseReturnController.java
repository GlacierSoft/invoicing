/**
 * @Title: PurchaseReturnController.java 
 * @Package com.glacier.frame.web.controller.purchase 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-16 下午4:25:24 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-16
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.web.controller.purchase;

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

import com.glacier.frame.dto.query.purchase.PurchaseReturnQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseReturn;
import com.glacier.frame.service.basicdatas.WarehouseService;
import com.glacier.frame.service.purchase.PurchaseReturnService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: PurchaseReturnController 
 * @Description: TODO(采购退货控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-16 下午4:25:24
 */
@Controller
@RequestMapping(value = "/purchaseReturn")
public class PurchaseReturnController {
	@Autowired
    private PurchaseReturnService purchaseReturnService;
	
	@Autowired
	private WarehouseService warehouseService;
	
	// 进入采购退货信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/purchaseReturn");
        return mav;
    } 

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, PurchaseReturnQueryDTO purchaseReturnQueryDTO) {
        return purchaseReturnService.listAsGrid(jqPager, purchaseReturnQueryDTO);
    }
    
    // 进入采购退货信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoReturnReasonDetail(String purReturnId) { 
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/purchaseReturn_detail");
        if(StringUtils.isNotBlank(purReturnId)){
            mav.addObject("purchaseReturnDate", purchaseReturnService.getPurchaseReturn(purReturnId));
        }
        return mav;
    }
    
    // 进入采购退货信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String purReturnId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseReturn_mgr/purchaseReturn_form");
        //仓库信息获取
        mav.addObject("allWareHouseDate",warehouseService.getWareHouseCombo());
        //判断主键标志
        if(StringUtils.isNotBlank(purReturnId)){
            mav.addObject("purchaseReturnDate", purchaseReturnService.getPurchaseReturn(purReturnId));
        }
        return mav;
    }
    
    //增加采购退货信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid PurchaseReturn purchaseReturn, BindingResult bindingResult) {
        return purchaseReturnService.addPurchaseReturn(purchaseReturn);
    }
    
    //修改采购退货类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid PurchaseReturn purchaseReturn, BindingResult bindingResult) {
        return purchaseReturnService.editPurchaseReturn(purchaseReturn);
    }
    
    //删除采购退货信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> purReturnIds) {
        return purchaseReturnService.delPurchaseReturn(purReturnIds);
    }
}
