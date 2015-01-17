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
import com.glacier.frame.dto.query.purchase.PurchaseArrivalQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.service.basicdatas.ParComDeliverTypeService;
import com.glacier.frame.service.basicdatas.ParComPaymentTypeService;
import com.glacier.frame.service.basicdatas.ParPurchaseTypeService;
import com.glacier.frame.service.basicdatas.SuppliersService;
import com.glacier.frame.service.purchase.PurchaseArrivalService;
import com.glacier.frame.service.system.UserService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  PurchaseArrivalController
 * @Description: TODO(采购到货controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-09
 */
@Controller
@RequestMapping(value = "/purchaseArrival")
public class PurchaseArrivalController extends AbstractController{

	@Autowired
	private PurchaseArrivalService purchaseArrivalService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private SuppliersService suppliersService;
	
	@Autowired
	private ParPurchaseTypeService purchaseTypeService;
	
	@Autowired
	private ParComDeliverTypeService deliverTypeService;
	
	@Autowired
	private ParComPaymentTypeService paymentTypeService;
	
	//进入采购到货信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseArrival");
        return mav;
    } 
    
    //获取表格结构的所有采购到货数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, PurchaseArrivalQueryDTO carTypeQueryDTO) {
        return purchaseArrivalService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入采购到货信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String purchaseId) { 
    	ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseArrival_detail");
        if(StringUtils.isNotBlank(purchaseId)){
            mav.addObject("purchaseDate", purchaseArrivalService.getPurchaseArrival(purchaseId));
        }
	    return mav;
    }
    
    //进入采购到货信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String purchaseId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseArrival_form");
    	mav.addObject("userDate", userService.getUserCombo(null));//员工信息
    	//mav.addObject("userDate", userService.getUserCombo(null));//所属仓库
    	mav.addObject("deliverTypeDate", deliverTypeService.getDeliverTypeCombo());//所属仓库
    	mav.addObject("purchaseTypeDate", purchaseTypeService.getParPurchaseTypeCombo());//采购类型
    	mav.addObject("suppliersDate", suppliersService.getSuppliersCombo());//供应商
    	mav.addObject("suppliersLogisticsDate", suppliersService.getSuppliersLogisticsCombo());//物流供应商
    	mav.addObject("paymentTypeDate", paymentTypeService.getParComPaymentTypeCombo());//约定支付
        if(StringUtils.isNotBlank(purchaseId)){
            mav.addObject("purchaseDate", purchaseArrivalService.getPurchaseArrival(purchaseId));
        }
        return mav;
    }
    
    //增加采购到货信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid PurchaseArrival purchaseArrival, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return purchaseArrivalService.addPurchaseArrival(purchaseArrival);
    }
    
    //修改采购到货信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid PurchaseArrival purchaseArrival, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return purchaseArrivalService.editPurchaseArrival(purchaseArrival);
    }
    
    //批量删除采购到货信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> purchaseArrivalIds,@RequestParam List<String> purchaseArrivalNames) {
    	return purchaseArrivalService.delPurchaseArrival(purchaseArrivalIds, purchaseArrivalNames);
    }
}
