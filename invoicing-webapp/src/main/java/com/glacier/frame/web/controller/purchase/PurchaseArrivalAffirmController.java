package com.glacier.frame.web.controller.purchase;
 
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.glacier.core.controller.AbstractController;
import com.glacier.frame.entity.purchase.PurchaseArrivalAffirm;
import com.glacier.frame.service.purchase.PurchaseArrivalAffirmService;

/*** 
 * @ClassName:  PurchaseArrivalDetailController
 * @Description: TODO(采购到货明细controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-09
 */
@Controller
@RequestMapping(value = "/purchaseArrivalAffirm")
public class PurchaseArrivalAffirmController extends AbstractController{

	@Autowired
	private PurchaseArrivalAffirmService affirmService;

	//增加收货确认信息
    @RequestMapping(value = "/addAffirm.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAffirmPurchaseArrival(@Valid PurchaseArrivalAffirm purchaseArrivalAffirm) {
        return affirmService.addPurchaseArrivalAffirm(purchaseArrivalAffirm);
    }
    
    //批量删除采购到货信息
    @RequestMapping(value = "/delAffirm.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAffirmPurchaseArrival(String purArrivalId) {
    	return affirmService.delPurchaseArrivalAffirm(purArrivalId);
    }
}
