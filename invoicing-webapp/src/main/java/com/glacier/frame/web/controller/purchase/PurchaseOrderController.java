/**
 * @Title: PurchaseOrderController.java 
 * @Package com.glacier.frame.web.controller.purchase 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-15 下午1:48:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-15
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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

import com.glacier.core.controller.AbstractController; 
import com.glacier.frame.dto.query.purchase.PurchaseOrderDetailQueryDTO;
import com.glacier.frame.dto.query.purchase.PurchaseOrderQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseOrder;
import com.glacier.frame.service.basicdatas.ParComDeliverTypeService;
import com.glacier.frame.service.basicdatas.ParComPaymentTypeService;
import com.glacier.frame.service.basicdatas.ParPurchaseTypeService;
import com.glacier.frame.service.basicdatas.WarehouseService;
import com.glacier.frame.service.purchase.PurchaseOrderDetailService;
import com.glacier.frame.service.purchase.PurchaseOrderService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  PurchaseOrderController
 * @Description: TODO(采购订货合同控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-15  下午1:48:58
 */ 
@Controller
@RequestMapping(value = "/purchaseOrder")
public class PurchaseOrderController extends AbstractController{ 
	 
    @Autowired
    private PurchaseOrderService purchaseOrderService;// 注入service
 
    @Autowired
    private PurchaseOrderDetailService purchaseOrderDetailService;// 注入service
    
	@Autowired
	private ParPurchaseTypeService purchaseTypeService;
	
	@Autowired
	private ParComDeliverTypeService deliverTypeService;
	
	@Autowired
	private ParComPaymentTypeService paymentTypeService;
	
	@Autowired
	private WarehouseService warehouseService;
    
    //进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseOrder_mgr/purchaseOrder");
        return mav;
    }
     
    //获取表格结构的所有订购合同数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listPurchaseOrder(JqPager jqPager,PurchaseOrderQueryDTO purchaseOrderQueryDTO) {
        return purchaseOrderService.listAsGrid(jqPager, purchaseOrderQueryDTO);
    }
    
    //获取订购合同详细信息
    @RequestMapping(value = "/orderDetail.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listOrderDetail(JqPager jqPager,PurchaseOrderDetailQueryDTO purchaseOrderDetailQueryDTO,String orderId) {
    	purchaseOrderDetailQueryDTO.setPurOrderId(orderId);
    	return purchaseOrderDetailService.listAsGrid(jqPager, purchaseOrderDetailQueryDTO);
    }
    
    //进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String purOrderId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseOrder_mgr/purchaseOrder_form");
        if(StringUtils.isNotBlank(purOrderId)){
            mav.addObject("purchaseOrderData", purchaseOrderService.getPurchaseOrder(purOrderId));
        } 
    	mav.addObject("warehouseDate", warehouseService.getWareHouseCombo());//仓库
    	mav.addObject("deliverTypeDate", deliverTypeService.getDeliverTypeCombo());//交货方式
    	mav.addObject("purchaseTypeDate", purchaseTypeService.getParPurchaseTypeCombo());//采购类型
    	mav.addObject("paymentTypeDate", paymentTypeService.getParComPaymentTypeCombo());//约定支付
    	
    	return mav;
    }
    
    //进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoPurchaseOrder(String purOrderId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseOrder_mgr/purchaseOrder_detail");
        if(StringUtils.isNotBlank(purOrderId)){
            mav.addObject("purchaseOrderData", purchaseOrderService.getPurchaseOrder(purOrderId));
        }
        return mav;
    }
    
    //新增订购合同
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addPurchaseOrder(@Valid PurchaseOrder purchaseOrder, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return purchaseOrderService.addPurchaseOrder(purchaseOrder);
    }  
    
    //修改订购合同
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editPurchaseOrder(@Valid PurchaseOrder purchaseOrder, BindingResult bindingResult) {
         return purchaseOrderService.editPurchaseOrder(purchaseOrder);
    }
    
    //删除订购合同
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delPurchaseOrder(@RequestParam List<String> purOrderIds,@RequestParam List<String> orderCodes) {
    	return purchaseOrderService.delPurchaseOrder(purOrderIds, orderCodes);
    } 
}
