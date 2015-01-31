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
import com.glacier.frame.dto.query.purchase.PurchaseArrivalDetailQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetail;
import com.glacier.frame.service.purchase.PurchaseArrivalDetailService;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  PurchaseArrivalDetailController
 * @Description: TODO(采购到货明细controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-09
 */
@Controller
@RequestMapping(value = "/purchaseArrivalDetail")
public class PurchaseArrivalDetailController extends AbstractController{

	@Autowired
	private PurchaseArrivalDetailService purchaseArrivalDetailService;

	//进入采购到货明细信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrivalDetail_mgr/purchaseArrivalDetail");
        return mav;
    } 
    
    //获取表格结构的所有采购到货明细数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager,PurchaseArrivalDetailQueryDTO purchaseArrivalDetailQueryDTO,String purArrivalId) {
    	if(purArrivalId==""){
    		JqGridReturn returnResult = new JqGridReturn();
    		return returnResult;
    	}else{
	    	purchaseArrivalDetailQueryDTO.setPurArrivalId(purArrivalId);
	        return purchaseArrivalDetailService.listAsGrid(jqPager,purchaseArrivalDetailQueryDTO);
    	}
    }
      
    //进入采购到货明细信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String PurchaseDetailId) { 
    	ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrivalDetail_mgr/purchaseArrivalDetail_detail");
        if(StringUtils.isNotBlank(PurchaseDetailId)){
            mav.addObject("purchaseDetailDate", purchaseArrivalDetailService.getPurchaseArrivalDetail(PurchaseDetailId));
        }
	    return mav;
    }
    
    //进入采购到货明细信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String PurchaseDetailId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrivalDetail_mgr/purchaseArrivalDetail_form");
        if(StringUtils.isNotBlank(PurchaseDetailId)){
            mav.addObject("purchaseDetailDate", purchaseArrivalDetailService.getPurchaseArrivalDetail(PurchaseDetailId));
        }
        return mav;
    }
    
    //增加采购到货明细信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid PurchaseArrivalDetail purchaseArrivalDetail, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return purchaseArrivalDetailService.addPurchaseArrivalDetail(purchaseArrivalDetail);
    }
    
    //修改采购到货明细信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid PurchaseArrivalDetail purchaseArrivalDetail, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return purchaseArrivalDetailService.editPurchaseArrivalDetail(purchaseArrivalDetail);
    }
    
    //批量删除采购到货明细信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> purchaseArrivalDetailIds,@RequestParam List<String> purchaseArrivalDetailNames) {
    	return purchaseArrivalDetailService.delPurchaseArrivalDetail(purchaseArrivalDetailIds, purchaseArrivalDetailNames);
    }
}
