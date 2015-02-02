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
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.purchase.PurchaseArrivalAffirmMapper;
import com.glacier.frame.dao.purchase.PurchaseArrivalDetailMapper;
import com.glacier.frame.dao.purchase.PurchaseArrivalMapper;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalAffirm;
import com.glacier.frame.entity.purchase.PurchaseArrivalAffirmExample;
import com.glacier.frame.entity.system.User;
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
	
	@Autowired
	private PurchaseArrivalDetailMapper arrivalDetailMapper;
	
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
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        arrivalAffirm.setPurArrAffId(RandomGUID.getRandomGUID());
        int count = 0;
        PurchaseArrival purchaseArrival = arrivalMapper.selectByPrimaryKey(arrivalAffirm.getPurArrivalId());
        //改变采购到货中的确认收货状态
        purchaseArrival.setAffirmArrival("yes");
        arrivalMapper.updateByPrimaryKeySelective(purchaseArrival);
        arrivalAffirm.setCreater(pricipalUser.getUserCnName());
        arrivalAffirm.setCreateTime(new Date());
        //执行增加确认收货信息
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
    public Object delPurchaseArrivalAffirm(String purArrivalId) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        PurchaseArrival purchaseArrival = arrivalMapper.selectByPrimaryKey(purArrivalId);
        //改变采购到货中的确认收货状态
        purchaseArrival.setAffirmArrival("no");
        arrivalMapper.updateByPrimaryKeySelective(purchaseArrival);
        //删除确认到货的信息
        PurchaseArrivalAffirmExample arrivalAffirmExample = new PurchaseArrivalAffirmExample();
        arrivalAffirmExample.createCriteria().andPurArrivalIdEqualTo(purArrivalId);
        count = purchaseArrivalDetailMapper.deleteByExample(arrivalAffirmExample);
	    if (count > 0) {
	        returnResult.setSuccess(true);
	        returnResult.setMsg("成功取消了[ " + purchaseArrival.getArrivalCode() + " ]的采购到货");
	    } else {
	        returnResult.setMsg("发生未知错误，采购到货收货信息删除失败");
	    }
        return returnResult;
    }
}