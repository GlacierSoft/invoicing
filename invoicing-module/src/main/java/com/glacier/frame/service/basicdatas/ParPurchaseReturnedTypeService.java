/**
 * @Title: ParPurchaseReturnedTypeService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 上午10:55:55 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-13
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
package com.glacier.frame.service.basicdatas;

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
import com.glacier.frame.dao.basicdatas.ParPurchaseReturnedTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParPurchaseReturnedTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnedType;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnedTypeExample;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnedTypeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParPurchaseReturnedTypeService
 * @Description: TODO(采购退货方式service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13  上午10:55:55
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParPurchaseReturnedTypeService {
	 
	@Autowired
    private ParPurchaseReturnedTypeMapper purchaseReturnedTypeMapper;
	  
	 /***
	  * @Title: getParPurchaseReturnedType  
	  * @Description: TODO(根据id获取采购退货方式)  
	  * @param @param ParPurchaseReturnedTypeId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getPurchaseReturnedType(String purchaseReturnedTypeId) {
        return purchaseReturnedTypeMapper.selectByPrimaryKey(purchaseReturnedTypeId);
    } 
    
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有采购退货方式信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ParPurchaseReturnedTypeQueryDTO parPurchaseReturnedTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParPurchaseReturnedTypeExample ParPurchaseReturnedTypeExample = new ParPurchaseReturnedTypeExample(); 
        Criteria queryCriteria = ParPurchaseReturnedTypeExample.createCriteria();
        parPurchaseReturnedTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	ParPurchaseReturnedTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	ParPurchaseReturnedTypeExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 ParPurchaseReturnedTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_purchase_returned_type_"));
        } 
        List<ParPurchaseReturnedType>  carrierCarTypeList = purchaseReturnedTypeMapper.selectByExample(ParPurchaseReturnedTypeExample); // 查询所有列表
        int total = purchaseReturnedTypeMapper.countByExample(ParPurchaseReturnedTypeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: listAllGrid
     * @Description: TODO(获取所有采购退货方式信息)
     * @param @param 
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAllGrid() {
    	 ParPurchaseReturnedTypeExample ParPurchaseReturnedTypeExample = new ParPurchaseReturnedTypeExample(); 
    	 ParPurchaseReturnedTypeExample.createCriteria().andEnabledEqualTo("enable");
    	 List<ParPurchaseReturnedType> list=purchaseReturnedTypeMapper.selectByExample(ParPurchaseReturnedTypeExample);
    	return JackJson.fromObjectToJson(list);
    }
    
    /**
      * 
      * @Title: addParPurchaseReturnedType  
      * @Description: TODO(新增采购退货方式)  
      * @param @param ParPurchaseReturnedType
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseReturnedType_add")
    public Object addParPurchaseReturnedType(ParPurchaseReturnedType parPurchaseReturnedType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParPurchaseReturnedTypeExample ParPurchaseReturnedTypeExample = new ParPurchaseReturnedTypeExample();
        int count = 0;
        // 防止名称重复
        ParPurchaseReturnedTypeExample.createCriteria().andNameEqualTo(parPurchaseReturnedType.getName());
        count = purchaseReturnedTypeMapper.countByExample(ParPurchaseReturnedTypeExample);
        if (count > 0) {
            returnResult.setMsg("采购退货方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parPurchaseReturnedType.setReturnedPurchaseTypeId(RandomGUID.getRandomGUID());
        parPurchaseReturnedType.setCreater(pricipalUser.getUserCnName());
        parPurchaseReturnedType.setCreateTime(new Date());
        parPurchaseReturnedType.setUpdater(pricipalUser.getUserCnName());
        parPurchaseReturnedType.setUpdateTime(new Date());
        count = purchaseReturnedTypeMapper.insert(parPurchaseReturnedType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParPurchaseReturnedType  
      * @Description: TODO(修改采购退货方式信息)  
      * @param @param ParPurchaseReturnedType
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseReturnedType_edit")
    public Object editParPurchaseReturnedType(ParPurchaseReturnedType parPurchaseReturnedType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false 
        ParPurchaseReturnedTypeExample ParPurchaseReturnedTypeExample = new ParPurchaseReturnedTypeExample();
        int count = 0;
        // 防止名称重复
        ParPurchaseReturnedTypeExample.createCriteria().andNameEqualTo(parPurchaseReturnedType.getName()).andReturnedPurchaseTypeIdNotEqualTo(parPurchaseReturnedType.getReturnedPurchaseTypeId());
        count = purchaseReturnedTypeMapper.countByExample(ParPurchaseReturnedTypeExample);
        if (count > 0) {
            returnResult.setMsg("采购退货方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        } 
        parPurchaseReturnedType.setUpdater(pricipalUser.getUserCnName());
        parPurchaseReturnedType.setUpdateTime(new Date());
        count = purchaseReturnedTypeMapper.updateByPrimaryKeySelective(parPurchaseReturnedType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
    /** 
     * @Title: delCarType  
     * @Description: TODO(删除采购退货方式信息)  
     * @param @param ParPurchaseReturnedTypeIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseReturnedType_del")
    public Object delPurchaseReturnedType(List<String> ParPurchaseReturnedTypeIds, List<String> parCompanyNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (ParPurchaseReturnedTypeIds.size() > 0) {
        	ParPurchaseReturnedTypeExample ParPurchaseReturnedTypeExample = new ParPurchaseReturnedTypeExample();
        	ParPurchaseReturnedTypeExample.createCriteria().andReturnedPurchaseTypeIdIn(ParPurchaseReturnedTypeIds);
            count = purchaseReturnedTypeMapper.deleteByExample(ParPurchaseReturnedTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了采购退货方式为:[ " + CollectionsUtil.convertToString(parCompanyNames, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    }
      
}
