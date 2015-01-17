/**
 * @Title: PurchaseArrivalDetailService.java 
 * @Package com.glacier.global.service.PurchaseArrivalDetail
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
import org.apache.commons.lang3.StringUtils; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.frame.dao.purchase.PurchaseArrivalDetailMapper;
import com.glacier.frame.dto.query.purchase.PurchaseArrivalDetailQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetail;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetailExample;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetailExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  PurchaseArrivalDetailService
 * @Description: TODO(采购到货明细表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-9
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class PurchaseArrivalDetailService {

	@Autowired
	private PurchaseArrivalDetailMapper purchaseArrivalDetailMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有采购到货明细信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager,PurchaseArrivalDetailQueryDTO purchaseArrivalDetailQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        PurchaseArrivalDetailExample purchaseArrivalExample = new PurchaseArrivalDetailExample(); 
        Criteria queryCriteria = purchaseArrivalExample.createCriteria();
        purchaseArrivalDetailQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	purchaseArrivalExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	purchaseArrivalExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	purchaseArrivalExample.setOrderByClause(jqPager.getOrderBy("temp_purchase_arrival_detail_"));
        }
        List<PurchaseArrivalDetail>  purchaseArrivalList = purchaseArrivalDetailMapper.selectByExample(purchaseArrivalExample); // 查询所有采购到货明细列表
        int total = purchaseArrivalDetailMapper.countByExample(purchaseArrivalExample); // 查询总页数
        returnResult.setRows(purchaseArrivalList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getPurchaseArrivalDetail 
	 * @Description: TODO(根据采购到货明细Id获取采购到货明细信息) 
	 * @param @param purchaseDetailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getPurchaseArrivalDetail(String purchaseDetailId) {
    	PurchaseArrivalDetail purchaseArrival = purchaseArrivalDetailMapper.selectByPrimaryKey(purchaseDetailId);
        return purchaseArrival;
    }
    
    /**
     * @Title: addPurchaseArrivalDetail 
     * @Description: TODO(新增采购到货明细) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalDetailList_add")
    public Object addPurchaseArrivalDetail(PurchaseArrivalDetail purchaseArrival) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PurchaseArrivalDetailExample purchaseArrivalExample = new PurchaseArrivalDetailExample();
        int count = 0;
        count = purchaseArrivalDetailMapper.countByExample(purchaseArrivalExample);
        count = purchaseArrivalDetailMapper.insert(purchaseArrival);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("采购到货明细信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货明细信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPurchaseArrivalDetail 
     * @Description: TODO(修改采购到货明细信息) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalDetailList_edit")
    public Object editPurchaseArrivalDetail(PurchaseArrivalDetail purchaseArrival) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        count = purchaseArrivalDetailMapper.updateByPrimaryKeySelective(purchaseArrival);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("采购到货明细信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货明细信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPurchaseArrivalDetail 
     * @Description: TODO(删除采购到货明细) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalDetailList_del")
    public Object delPurchaseArrivalDetail(List<String> clientIds, List<String> ArrivalCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientIds.size() > 0) {
        	PurchaseArrivalDetailExample purchaseArrivalExample = new PurchaseArrivalDetailExample();
        	purchaseArrivalExample.createCriteria().andPurArrivalIdIn(clientIds);
            count = purchaseArrivalDetailMapper.deleteByExample(purchaseArrivalExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(ArrivalCodes, ",") + " ]采购到货明细信息");
            } else {
                returnResult.setMsg("发生未知错误，采购到货明细信息删除失败");
            }
        }
        return returnResult;
    }
}
