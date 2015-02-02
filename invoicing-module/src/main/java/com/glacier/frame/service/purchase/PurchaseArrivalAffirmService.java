/**
 * @Title: PurchaseArrivalAffirmService.java 
 * @Package com.glacier.global.service.PurchaseArrivalAffirm
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2015-1-9
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.purchase; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.frame.dao.purchase.PurchaseArrivalAffirmMapper;
import com.glacier.frame.dao.purchase.PurchaseArrivalMapper;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalAffirm;
import com.glacier.frame.entity.purchase.PurchaseArrivalAffirmExample;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  PurchaseArrivalAffirmService
 * @Description: TODO(采购到货收货表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-9
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class PurchaseArrivalAffirmService {

	@Autowired
	private PurchaseArrivalAffirmMapper purchaseArrivalDetailMapper;
	
	@Autowired
	private PurchaseArrivalMapper arrivalMapper;
	
    /**
     * @Title: addPurchaseArrivalAffirm 
     * @Description: TODO(新增采购到货收货) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalAffirmList_add")
    public Object addPurchaseArrivalAffirm(PurchaseArrivalAffirm arrivalAffirm) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PurchaseArrivalAffirmExample purchaseArrivalExample = new PurchaseArrivalAffirmExample();
        int count = 0;
        PurchaseArrival purchaseArrival = arrivalMapper.selectByPrimaryKey(arrivalAffirm.getPurArrivalId());
        
        count = purchaseArrivalDetailMapper.insert(arrivalAffirm);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("采购到货收货信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货收货信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPurchaseArrivalAffirm 
     * @Description: TODO(删除采购到货收货) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalAffirmList_del")
    public Object delPurchaseArrivalAffirm(List<String> clientIds, List<String> ArrivalCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientIds.size() > 0) {
        	PurchaseArrivalAffirmExample purchaseArrivalExample = new PurchaseArrivalAffirmExample();
        	purchaseArrivalExample.createCriteria().andPurArrivalIdIn(clientIds);
            count = purchaseArrivalDetailMapper.deleteByExample(purchaseArrivalExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(ArrivalCodes, ",") + " ]采购到货收货信息");
            } else {
                returnResult.setMsg("发生未知错误，采购到货收货信息删除失败");
            }
        }
        return returnResult;
    }
}
