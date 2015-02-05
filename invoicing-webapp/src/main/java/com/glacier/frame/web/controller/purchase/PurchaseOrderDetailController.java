/**
 * @Title: PurchaseOrderDetailController.java 
 * @Package com.glacier.frame.web.controller.purchase 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-16 上午11:20:03 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-16
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.web.controller.purchase;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.dto.query.purchase.PurchaseOrderDetailQueryDTO;
import com.glacier.frame.service.purchase.PurchaseOrderDetailService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  PurchaseOrderDetailController
 * @Description: TODO(订购合同明细控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-16  上午11:20:03 
 */ 
@Controller
@RequestMapping(value = "/purchaseOrderDetail")
public class PurchaseOrderDetailController  extends AbstractController{

    @Autowired
    private PurchaseOrderDetailService purchaseOrderDetailService;// 注入service
    
    //获取属于该订购合同的商品信息
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listArr(JqPager jqPager,String purOrderId, PurchaseOrderDetailQueryDTO purchaseOrderDetailQueryDTO) {
      	purchaseOrderDetailQueryDTO.setPurOrderId(purOrderId);
    	return purchaseOrderDetailService.listAsGrid(jqPager, purchaseOrderDetailQueryDTO);
    }
    
    //进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoPurchaseOrderDetail(String purOrderDetId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseOrderDetail_mgr/purchaseOrderDetail_detail");
        if(StringUtils.isNotBlank(purOrderDetId)){
            mav.addObject("purOrderDetailData", purchaseOrderDetailService.getPurchaseOrderDetail(purOrderDetId));
        }
        return mav;
    }
}
