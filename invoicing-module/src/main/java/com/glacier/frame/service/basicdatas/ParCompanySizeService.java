/*
 * @(#)ParCompanySizeService.java
 * @author songjundong
 * Copyright (c) 2015 Glacier SoftWare Company Limited. All Rights Reserved.
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
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParCompanySizeMapper;  
import com.glacier.frame.dto.query.basicdatas.ParCompanySizeQueryDTO; 
import com.glacier.frame.entity.basicdatas.ParCompanySize;
import com.glacier.frame.entity.basicdatas.ParCompanySizeExample;  
import com.glacier.frame.entity.basicdatas.ParCompanySizeExample.Criteria; 
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

 /**  
  * @ClassName:  ParCompanySizeService
  * @Description: TODO(公司规模service)
  * @author songjundong
  * @email 985776597@QQ.com
  * @date 2015-1-8  上午9:31:57
  */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParCompanySizeService {

	@Autowired
    private ParCompanySizeMapper parCompanySizeMapper;
	  
	 /***
	  * @Title: getParCompanySize  
	  * @Description: TODO(根据id获取公司规模)  
	  * @param @param parCompanySizeId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getParCompanySize(String parCompanySizeId) {
        return parCompanySizeMapper.selectByPrimaryKey(parCompanySizeId);
    } 
    
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有公司规模信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ParCompanySizeQueryDTO parCompanySizeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParCompanySizeExample parCompanySizeExample = new ParCompanySizeExample(); 
        Criteria queryCriteria = parCompanySizeExample.createCriteria();
        parCompanySizeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	parCompanySizeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parCompanySizeExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parCompanySizeExample.setOrderByClause(jqPager.getOrderBy("temp_par_company_size_"));
        } 
        List<ParCompanySize>  carrierCarTypeList = parCompanySizeMapper.selectByExample(parCompanySizeExample); // 查询所有会员列表
        int total = parCompanySizeMapper.countByExample(parCompanySizeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addParCompanySize  
      * @Description: TODO(新增公司规模)  
      * @param @param parCompanySize
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CompanySizeList_add")
    public Object addParCompanySize(ParCompanySize parCompanySize) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParCompanySizeExample parCompanySizeExample = new ParCompanySizeExample();
        int count = 0;
        // 防止名称重复
        parCompanySizeExample.createCriteria().andCompanySizeNameEqualTo(parCompanySize.getCompanySizeName());
        count = parCompanySizeMapper.countByExample(parCompanySizeExample);
        if (count > 0) {
            returnResult.setMsg("公司规模名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parCompanySize.setCompanySizeId(RandomGUID.getRandomGUID());
        parCompanySize.setCreater(pricipalUser.getUserCnName());
        parCompanySize.setCreateTime(new Date());
        parCompanySize.setUpdater(pricipalUser.getUserCnName());
        parCompanySize.setUpdateTime(new Date());
        count = parCompanySizeMapper.insert(parCompanySize);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParCompanySize  
      * @Description: TODO(这修改公司规模信息)  
      * @param @param parCompanySize
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "CompanySizeList_edit")
    public Object editParCompanySize(ParCompanySize parCompanySize) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParCompanySizeExample parCompanySizeExample = new ParCompanySizeExample();
        int count = 0; 
       // 防止名称重复
        parCompanySizeExample.createCriteria().andCompanySizeNameEqualTo(parCompanySize.getCompanySizeName());
        count = parCompanySizeMapper.countByExample(parCompanySizeExample);
        if (count > 0) {
            returnResult.setMsg("公司规模名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parCompanySize.setUpdater(pricipalUser.getUserCnName());
        parCompanySize.setUpdateTime(new Date());
        count = parCompanySizeMapper.updateByPrimaryKeySelective(parCompanySize);
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
     * @Description: TODO(删除公司规模信息)  
     * @param @param parCompanySizeIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "CompanySizeList_del")
    public Object delCarType(List<String> parCompanySizeIds, List<String> parCompanyNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (parCompanySizeIds.size() > 0) {
        	ParCompanySizeExample parCompanySizeExample = new ParCompanySizeExample();
        	parCompanySizeExample.createCriteria().andCompanySizeIdIn(parCompanySizeIds);
            count = parCompanySizeMapper.deleteByExample(parCompanySizeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了公司规模为:[ " + CollectionsUtil.convertToString(parCompanyNames, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    }
    
}
