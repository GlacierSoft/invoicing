/**
 * @Title: ParPurchaseQuotedPriceTypeService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-9 上午9:07:06 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-9
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
import com.glacier.basic.util.RandomGUID; 
import com.glacier.frame.dao.basicdatas.ParPurchaseQuotedPriceTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParPurchaseQuotedPriceTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseQuotedPriceType;
import com.glacier.frame.entity.basicdatas.ParPurchaseQuotedPriceTypeExample;
import com.glacier.frame.entity.basicdatas.ParPurchaseQuotedPriceTypeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParPurchaseQuotedPriceTypeService
 * @Description: TODO(报价类型service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-9  上午9:07:06
 */ 
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParPurchaseQuotedPriceTypeService { 
	 
	@Autowired
    private ParPurchaseQuotedPriceTypeMapper quotedPriceTypeMapper;
	  
	 /***
	  * @Title: getParPurchaseQuotedPriceType  
	  * @Description: TODO(根据id获取报价类型)  
	  * @param @param ParPurchaseQuotedPriceTypeId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getParPurchaseQuotedPriceType(String ParPurchaseQuotedPriceTypeId) {
        return quotedPriceTypeMapper.selectByPrimaryKey(ParPurchaseQuotedPriceTypeId);
    } 
    
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有报价类型信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ParPurchaseQuotedPriceTypeQueryDTO parPurchaseQuotedPriceTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParPurchaseQuotedPriceTypeExample parPurchaseQuotedPriceTypeExample = new ParPurchaseQuotedPriceTypeExample(); 
        Criteria queryCriteria = parPurchaseQuotedPriceTypeExample.createCriteria();
        parPurchaseQuotedPriceTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	parPurchaseQuotedPriceTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parPurchaseQuotedPriceTypeExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 parPurchaseQuotedPriceTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_purchase_quoted_price_type_"));
        } 
        List<ParPurchaseQuotedPriceType>  carrierCarTypeList = quotedPriceTypeMapper.selectByExample(parPurchaseQuotedPriceTypeExample); // 查询所有列表
        int total = quotedPriceTypeMapper.countByExample(parPurchaseQuotedPriceTypeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addParPurchaseQuotedPriceType  
      * @Description: TODO(新增报价类型)  
      * @param @param ParPurchaseQuotedPriceType
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseQuotedPriceTypeList_add")
    public Object addParPurchaseQuotedPriceType(ParPurchaseQuotedPriceType parPurchaseQuotedPriceType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParPurchaseQuotedPriceTypeExample ParPurchaseQuotedPriceTypeExample = new ParPurchaseQuotedPriceTypeExample();
        int count = 0;
        // 防止名称重复
        ParPurchaseQuotedPriceTypeExample.createCriteria().andNameEqualTo(parPurchaseQuotedPriceType.getName());
        count = quotedPriceTypeMapper.countByExample(ParPurchaseQuotedPriceTypeExample);
        if (count > 0) {
            returnResult.setMsg("报价类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parPurchaseQuotedPriceType.setQuotedPriceTypeId(RandomGUID.getRandomGUID());
        parPurchaseQuotedPriceType.setCreater(pricipalUser.getUserCnName());
        parPurchaseQuotedPriceType.setCreateTime(new Date());
        parPurchaseQuotedPriceType.setUpdater(pricipalUser.getUserCnName());
        parPurchaseQuotedPriceType.setUpdateTime(new Date());
        count = quotedPriceTypeMapper.insert(parPurchaseQuotedPriceType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParPurchaseQuotedPriceType  
      * @Description: TODO(这修改报价类型信息)  
      * @param @param ParPurchaseQuotedPriceType
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseQuotedPriceTypeList_edit")
    public Object editParPurchaseQuotedPriceType(ParPurchaseQuotedPriceType parPurchaseQuotedPriceType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParPurchaseQuotedPriceTypeExample ParPurchaseQuotedPriceTypeExample = new ParPurchaseQuotedPriceTypeExample();
        int count = 0; 
       // 防止名称重复
        ParPurchaseQuotedPriceTypeExample.createCriteria().andNameEqualTo(parPurchaseQuotedPriceType.getName()).andQuotedPriceTypeIdNotEqualTo(parPurchaseQuotedPriceType.getQuotedPriceTypeId());
        count = quotedPriceTypeMapper.countByExample(ParPurchaseQuotedPriceTypeExample);
        if (count > 0) {
            returnResult.setMsg("报价类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parPurchaseQuotedPriceType.setUpdater(pricipalUser.getUserCnName());
        parPurchaseQuotedPriceType.setUpdateTime(new Date());
        count = quotedPriceTypeMapper.updateByPrimaryKeySelective(parPurchaseQuotedPriceType);
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
     * @Description: TODO(删除报价类型信息)  
     * @param @param ParPurchaseQuotedPriceTypeIds
     * @param @param parPurchaseQuotedPriceTypeNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "PurchaseQuotedPriceTypeList_del")
    public Object delQuotedPriceType(List<String> parPurchaseQuotedPriceTypeIds, List<String> parPurchaseQuotedPriceTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (parPurchaseQuotedPriceTypeIds.size() > 0) {
        	ParPurchaseQuotedPriceTypeExample ParPurchaseQuotedPriceTypeExample = new ParPurchaseQuotedPriceTypeExample();
        	ParPurchaseQuotedPriceTypeExample.createCriteria().andQuotedPriceTypeIdIn(parPurchaseQuotedPriceTypeIds);
            count = quotedPriceTypeMapper.deleteByExample(ParPurchaseQuotedPriceTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了报价类型为:[ " + CollectionsUtil.convertToString(parPurchaseQuotedPriceTypeNames, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    }
 
}
