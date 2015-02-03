package com.glacier.frame.web.controller.purchase;
 
import java.util.List;
import javax.validation.Valid;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.glacier.frame.service.basicdatas.WarehouseService;
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
	
	@Autowired
	private WarehouseService warehouseService;
	
	//进入采购到货信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseArrival");
        return mav;
    } 
    
    //根据仓库ID查询出所有货物信息展示页面
    @RequestMapping(value = "/goodsDetail.htm")
    private Object storageList() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseGoods");
        return mav;
    }
    
    //批量货物信息展示页面
    @RequestMapping(value = "/batchGoodsDetail.htm")
    private Object storageBatchList() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseBatchGoods");
        return mav;
    }
    
    //审核页面
    @RequestMapping(value = "/batchAuditForm.htm")
    private Object batchAuditArrivalForm() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/batch/batchAudit/audit_form");
        return mav;
    }
    
    //批量审核
    @RequestMapping(value = "/batchAudit.htm")
    private Object batchAuditArrival() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/batch/batchAudit/batchAuditArrival");
        return mav;
    }
    
    //批量取消审核
    @RequestMapping(value = "/batchCancelAudit.htm")
    private Object batchCancelAuditArrival() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/batch/batchCancelAudit/batchCancelAudit");
        return mav;
    }
    
    //批量启用
    @RequestMapping(value = "/batchEnable.htm")
    private Object batchEnableArrival() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/batch/batchEnable/batchEnable");
        return mav;
    }
    
    //批量禁用
    @RequestMapping(value = "/batchDisable.htm")
    private Object batchDisableArrival() {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/batch/batchDisable/batchDisable");
        return mav;
    }
    
    //获取表格结构的所有采购到货数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, PurchaseArrivalQueryDTO arrivalQueryDTO) {
        return purchaseArrivalService.listAsGrid(jqPager, arrivalQueryDTO);
    }
    
    //收货确认页面
    @RequestMapping(value = "/affirmPurchaseArrival.htm")
    private Object affirmPurchaseArrival(String purchaseId) {
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/PurchaseArrivalAffirm");
        mav.addObject("purchaseDate", purchaseArrivalService.getPurchaseArrival(purchaseId));
        mav.addObject("userDate", userService.getUserCombo(null));//员工信息
        return mav;
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
        ModelAndView mav = new ModelAndView("purchase_mgr/purchaseArrival_mgr/purchaseArrival_form2");
    	mav.addObject("userDate", userService.getUserCombo(null));//员工信息
    	mav.addObject("deliverTypeDate", deliverTypeService.getDeliverTypeCombo());//所属仓库
    	mav.addObject("purchaseTypeDate", purchaseTypeService.getParPurchaseTypeCombo());//采购类型
    	mav.addObject("suppliersDate", suppliersService.getSuppliersCombo());//供应商
    	mav.addObject("suppliersLogisticsDate", suppliersService.getSuppliersLogisticsCombo());//物流供应商
    	mav.addObject("paymentTypeDate", paymentTypeService.getParComPaymentTypeCombo());//约定支付
    	mav.addObject("warehouseDate", warehouseService.getWareHouseCombo());//仓库
    	if(StringUtils.isNotBlank(purchaseId)){
            mav.addObject("purchaseDate", purchaseArrivalService.getPurchaseArrival(purchaseId));
        }
        return mav;
    }
    
    //增加采购到货信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid String purchaseArrival,String rows) {
        return purchaseArrivalService.addPurchaseArrival(purchaseArrival,rows);
    }
    
    //修改采购到货信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(String purchaseArrival,String rows) {
    	JSONObject purchase = JSONObject.fromObject(purchaseArrival);  
        PurchaseArrival arrival = (PurchaseArrival) JSONObject.toBean(purchase,PurchaseArrival.class);
        return purchaseArrivalService.editPurchaseArrival(arrival,rows);
    }
    
    //批量删除采购到货信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> purchaseArrivalIds,@RequestParam List<String> purchaseArrivalNames) {
    	return purchaseArrivalService.delPurchaseArrival(purchaseArrivalIds, purchaseArrivalNames);
    }
    
    //批量审核采购到货信息
    @RequestMapping(value = "/batchAudit.json", method = RequestMethod.POST)
    @ResponseBody
    public Object auditArrival(@RequestParam List<String> arrivalIds,PurchaseArrival arrival) {
    	return purchaseArrivalService.batchAuditArrival(arrivalIds, arrival);
    }
    
    //批量取消审核采购到货信息
    @RequestMapping(value = "/batchCancelAudit.json", method = RequestMethod.POST)
    @ResponseBody
    public Object cancelAuditArrival(@RequestParam List<String> purchaseArrivalIds) {
    	return purchaseArrivalService.batchCancelAuditArrival(purchaseArrivalIds);
    }
    
    //批量启用采购到货信息
    @RequestMapping(value = "/batchEnableArrival.json", method = RequestMethod.POST)
    @ResponseBody
    public Object batchEnableArrival(@RequestParam List<String> purchaseArrivalIds) {
    	return purchaseArrivalService.batchEnableArrival(purchaseArrivalIds);
    }
    
    //批量禁用采购到货信息
    @RequestMapping(value = "/batchDisableArrival.json", method = RequestMethod.POST)
    @ResponseBody
    public Object batchDisableArrival(@RequestParam List<String> purchaseArrivalIds) {
    	return purchaseArrivalService.batchDisableArrival(purchaseArrivalIds);
    }
}
