/**
 * @Title: PurchaseRequisitionService.java 
 * @Package com.glacier.frame.service.purchase 
 * @author xichao.dong   
 * @email 406592176@qq.com
 * @date 2015-1-15 上午10:36:58 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2015-1-15
                修改人：xichao.dong 
                修改内容简介 ：
            </p>              
 * @Review (审核人) ：xichao.dong
 * 
 */
package com.glacier.frame.service.purchase;

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
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.purchase.PurchaseRequisitionMapper;
import com.glacier.frame.dto.query.purchase.PurchaseRequisitionQueryDTO;
import com.glacier.frame.entity.purchase.PurchaseRequisitionExample.Criteria;
import com.glacier.frame.entity.purchase.PurchaseRequisition;
import com.glacier.frame.entity.purchase.PurchaseRequisitionExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: PurchaseRequisitionService 
 * @Description: TODO(采购申请业务类) 
 * @author xichao.dong  
 * @email 406592176@qq.com
 * @date 2015-1-16 下午4:39:01
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PurchaseRequisitionService {

    @Autowired
    private PurchaseRequisitionMapper purchaseRequisitionMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有采购申请信息) 
     * @param @param jqPager PurchaseRequisitionQueryDTO purchaseRequisitionQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, PurchaseRequisitionQueryDTO purchaseRequisitionQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        PurchaseRequisitionExample purchaseRequisitionExample = new PurchaseRequisitionExample(); 
        Criteria queryCriteria = purchaseRequisitionExample.createCriteria();
        purchaseRequisitionQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            purchaseRequisitionExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            purchaseRequisitionExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            purchaseRequisitionExample.setOrderByClause(jqPager.getOrderBy("temp_purchase_requisition_"));
        }
        List<PurchaseRequisition>  purchaseRequisitionList = purchaseRequisitionMapper.selectByExample(purchaseRequisitionExample); // 查询所有采购申请列表
        int total = purchaseRequisitionMapper.countByExample(purchaseRequisitionExample); // 查询总页数
        returnResult.setRows(purchaseRequisitionList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getPurchaseRequisitionCombo 
     * @Description: TODO(根据客户档案Id查找客户级别信息或查询全部,用于Combo的数据绑定) 
     * @param  @param purchaseRequisitionId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getPurchaseRequisitionCombo(String purchaseRequisitionId) {
        PurchaseRequisitionExample parClientExample = new PurchaseRequisitionExample();
        parClientExample.createCriteria().andEnabledEqualTo("enable");
        List<PurchaseRequisition> purchaseRequisitions = purchaseRequisitionMapper.selectByExample(parClientExample);
        return JackJson.fromObjectToJson(purchaseRequisitions);
    }
    
    /**
     * @Title: getPurchaseRequisition 
     * @Description: TODO(根据采购申请Id获取采购申请信息) 
     * @param @param purchaseRequisitionId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getPurchaseRequisition(String purchaseRequisitionId) {
        PurchaseRequisition purchaseRequisition = purchaseRequisitionMapper.selectByPrimaryKey(purchaseRequisitionId);
        return purchaseRequisition;
    }
    
    /**
     * @Title: addPurchaseRequisition 
     * @Description: TODO(新增采购申请) 
     * @param @param purchaseRequisition
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseRequisitionList_add")
    public Object addPurchaseRequisition(PurchaseRequisition purchaseRequisition) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PurchaseRequisitionExample purchaseRequisitionExample = new PurchaseRequisitionExample();
        int count = 0;
        // 防止采购申请名称重复
        purchaseRequisitionExample.createCriteria().andReqCodeEqualTo(purchaseRequisition.getReqCode());
        count = purchaseRequisitionMapper.countByExample(purchaseRequisitionExample);
        if (count > 0) {
            returnResult.setMsg("采购申请名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        purchaseRequisition.setPurReqId(RandomGUID.getRandomGUID());
        purchaseRequisition.setCreater(pricipalUser.getUserCnName());
        purchaseRequisition.setCreateTime(new Date());
        purchaseRequisition.setUpdater(pricipalUser.getUserCnName());
        purchaseRequisition.setUpdateTime(new Date());
        count = purchaseRequisitionMapper.insert(purchaseRequisition);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseRequisition.getReqCode() + "] 采购申请信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购申请信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPurchaseRequisition 
     * @Description: TODO(修改采购申请信息) 
     * @param @param purchaseRequisition
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseRequisitionList_edit")
    public Object editPurchaseRequisition(PurchaseRequisition purchaseRequisition) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        PurchaseRequisitionExample purchaseRequisitionExample = new PurchaseRequisitionExample();
        int count = 0;
        //防止采购申请名称重复
        purchaseRequisitionExample.createCriteria().andReqCodeEqualTo(purchaseRequisition.getReqCode()).andPurReqIdNotEqualTo(purchaseRequisition.getPurReqId());
        count = purchaseRequisitionMapper.countByExample(purchaseRequisitionExample);
        if (count > 0) {
            returnResult.setMsg("采购申请名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        purchaseRequisition.setUpdater(pricipalUser.getUserCnName());
        purchaseRequisition.setUpdateTime(new Date());
        count = purchaseRequisitionMapper.updateByPrimaryKeySelective(purchaseRequisition);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseRequisition.getReqCode() + "] 采购申请信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购申请信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPurchaseRequisition 
     * @Description: TODO(删除采购申请) 
     * @param @param purchaseRequisitionIds purchaseRequisitionName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseRequisitionList_del")
    public Object delPurchaseRequisition(List<String> purReqIds, List<String> reqCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (purReqIds.size() > 0) {
            PurchaseRequisitionExample purchaseRequisitionExample = new PurchaseRequisitionExample();
            purchaseRequisitionExample.createCriteria().andPurReqIdIn(purReqIds);
            count = purchaseRequisitionMapper.deleteByExample(purchaseRequisitionExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(reqCodes, ",") + " ]采购申请信息");
            } else {
                returnResult.setMsg("发生未知错误，采购申请信息删除失败");
            }
        }
        return returnResult;
    }
}
