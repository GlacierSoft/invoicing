/**
 * @Title: PurchaseArrivalService.java 
 * @Package com.glacier.global.service.PurchaseArrival
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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils; 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.purchase.PurchaseArrivalMapper;
import com.glacier.frame.dto.query.purchase.PurchaseArrivalQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalExample;
import com.glacier.frame.entity.purchase.PurchaseArrivalExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  PurchaseArrivalService
 * @Description: TODO(采购到货表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-9
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class PurchaseArrivalService {

	@Autowired
	private PurchaseArrivalMapper purchaseArrivalMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有采购到货信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, PurchaseArrivalQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        PurchaseArrivalExample purchaseArrivalExample = new PurchaseArrivalExample(); 
        Criteria queryCriteria = purchaseArrivalExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	purchaseArrivalExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	purchaseArrivalExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	purchaseArrivalExample.setOrderByClause(jqPager.getOrderBy("temp_purchase_arrival_"));
        }
        List<PurchaseArrival>  purchaseArrivalList = purchaseArrivalMapper.selectByExample(purchaseArrivalExample); // 查询所有采购到货列表
        int total = purchaseArrivalMapper.countByExample(purchaseArrivalExample); // 查询总页数
        returnResult.setRows(purchaseArrivalList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getPurchaseArrival 
	 * @Description: TODO(根据采购到货Id获取采购到货信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getPurchaseArrival(String deliverTypeId) {
    	PurchaseArrival purchaseArrival = purchaseArrivalMapper.selectByPrimaryKey(deliverTypeId);
        return purchaseArrival;
    }
    
    /**
     * @Title: addPurchaseArrival 
     * @Description: TODO(新增采购到货) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalList_add")
    public Object addPurchaseArrival(PurchaseArrival purchaseArrival) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PurchaseArrivalExample purchaseArrivalExample = new PurchaseArrivalExample();
        int count = 0;
        count = purchaseArrivalMapper.countByExample(purchaseArrivalExample);
        //采购到货编号格式:表名_年_月_日_分_秒
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        purchaseArrival.setPurArrivalId(RandomGUID.getRandomGUID());
        purchaseArrival.setArrivalCode("arrival"+formatDate.format(new Date()));
        purchaseArrival.setCreater(pricipalUser.getUserCnName());
        purchaseArrival.setCreateTime(new Date());
        purchaseArrival.setUpdater(pricipalUser.getUserCnName());
        purchaseArrival.setUpdateTime(new Date());
        count = purchaseArrivalMapper.insert(purchaseArrival);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseArrival.getArrivalCode() + "] 采购到货信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPurchaseArrival 
     * @Description: TODO(修改采购到货信息) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalList_edit")
    public Object editPurchaseArrival(PurchaseArrival purchaseArrival) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //更新更新人和更新时间
        purchaseArrival.setUpdater(pricipalUser.getUserCnName());
        purchaseArrival.setUpdateTime(new Date());
        count = purchaseArrivalMapper.updateByPrimaryKeySelective(purchaseArrival);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseArrival.getArrivalCode() + "] 采购到货信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPurchaseArrival 
     * @Description: TODO(删除采购到货) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalList_del")
    public Object delPurchaseArrival(List<String> clientIds, List<String> ArrivalCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientIds.size() > 0) {
        	PurchaseArrivalExample purchaseArrivalExample = new PurchaseArrivalExample();
        	purchaseArrivalExample.createCriteria().andPurArrivalIdIn(clientIds);
            count = purchaseArrivalMapper.deleteByExample(purchaseArrivalExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(ArrivalCodes, ",") + " ]采购到货信息");
            } else {
                returnResult.setMsg("发生未知错误，采购到货信息删除失败");
            }
        }
        return returnResult;
    }
}
