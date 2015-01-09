/**
 * @Title: ParQuotedPriceTypeService.java 
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
import com.glacier.frame.dao.basicdatas.ParQuotedPriceTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParQuotedPriceTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParQuotedPriceType;
import com.glacier.frame.entity.basicdatas.ParQuotedPriceTypeExample;
import com.glacier.frame.entity.basicdatas.ParQuotedPriceTypeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParQuotedPriceTypeService
 * @Description: TODO(报价类型service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-9  上午9:07:06
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParQuotedPriceTypeService {

	 
	@Autowired
    private ParQuotedPriceTypeMapper quotedPriceTypeMapper;
	  
	 /***
	  * @Title: getParQuotedPriceType  
	  * @Description: TODO(根据id获取报价类型)  
	  * @param @param ParQuotedPriceTypeId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getParQuotedPriceType(String ParQuotedPriceTypeId) {
        return quotedPriceTypeMapper.selectByPrimaryKey(ParQuotedPriceTypeId);
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
    public Object listAsGrid(JqPager jqPager, ParQuotedPriceTypeQueryDTO parQuotedPriceTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParQuotedPriceTypeExample parQuotedPriceTypeExample = new ParQuotedPriceTypeExample(); 
        Criteria queryCriteria = parQuotedPriceTypeExample.createCriteria();
        parQuotedPriceTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	parQuotedPriceTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parQuotedPriceTypeExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 parQuotedPriceTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_quoted_price_type_"));
        } 
        List<ParQuotedPriceType>  carrierCarTypeList = quotedPriceTypeMapper.selectByExample(parQuotedPriceTypeExample); // 查询所有列表
        int total = quotedPriceTypeMapper.countByExample(parQuotedPriceTypeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addParQuotedPriceType  
      * @Description: TODO(新增报价类型)  
      * @param @param ParQuotedPriceType
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "QuotedPriceTypeList_add")
    public Object addParQuotedPriceType(ParQuotedPriceType parQuotedPriceType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParQuotedPriceTypeExample ParQuotedPriceTypeExample = new ParQuotedPriceTypeExample();
        int count = 0;
        // 防止名称重复
        ParQuotedPriceTypeExample.createCriteria().andNameEqualTo(parQuotedPriceType.getName());
        count = quotedPriceTypeMapper.countByExample(ParQuotedPriceTypeExample);
        if (count > 0) {
            returnResult.setMsg("报价类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parQuotedPriceType.setQuotedPriceTypeId(RandomGUID.getRandomGUID());
        parQuotedPriceType.setCreater(pricipalUser.getUserCnName());
        parQuotedPriceType.setCreateTime(new Date());
        parQuotedPriceType.setUpdater(pricipalUser.getUserCnName());
        parQuotedPriceType.setUpdateTime(new Date());
        count = quotedPriceTypeMapper.insert(parQuotedPriceType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParQuotedPriceType  
      * @Description: TODO(这修改报价类型信息)  
      * @param @param ParQuotedPriceType
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "QuotedPriceTypeList_edit")
    public Object editParQuotedPriceType(ParQuotedPriceType parQuotedPriceType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParQuotedPriceTypeExample ParQuotedPriceTypeExample = new ParQuotedPriceTypeExample();
        int count = 0; 
       // 防止名称重复
        ParQuotedPriceTypeExample.createCriteria().andNameEqualTo(parQuotedPriceType.getName());
        count = quotedPriceTypeMapper.countByExample(ParQuotedPriceTypeExample);
        if (count > 0) {
            returnResult.setMsg("报价类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parQuotedPriceType.setUpdater(pricipalUser.getUserCnName());
        parQuotedPriceType.setUpdateTime(new Date());
        count = quotedPriceTypeMapper.updateByPrimaryKeySelective(parQuotedPriceType);
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
     * @param @param ParQuotedPriceTypeIds
     * @param @param parQuotedPriceTypeNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "QuotedPriceTypeList_del")
    public Object delQuotedPriceType(List<String> parQuotedPriceTypeIds, List<String> parQuotedPriceTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (parQuotedPriceTypeIds.size() > 0) {
        	ParQuotedPriceTypeExample ParQuotedPriceTypeExample = new ParQuotedPriceTypeExample();
        	ParQuotedPriceTypeExample.createCriteria().andQuotedPriceTypeIdIn(parQuotedPriceTypeIds);
            count = quotedPriceTypeMapper.deleteByExample(ParQuotedPriceTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了报价类型为:[ " + CollectionsUtil.convertToString(parQuotedPriceTypeNames, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    }
 
}
