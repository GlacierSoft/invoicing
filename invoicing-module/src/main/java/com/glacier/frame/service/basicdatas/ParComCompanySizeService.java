/*
 * @(#)ParComCompanySizeService.java
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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParComCompanySizeMapper;
import com.glacier.frame.dto.query.basicdatas.ParComCompanySizeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParComCompanySize;
import com.glacier.frame.entity.basicdatas.ParComCompanySizeExample;
import com.glacier.frame.entity.basicdatas.ParComCompanySizeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

 /**  
  * @ClassName:  ParComCompanySizeService
  * @Description: TODO(公司规模service)
  * @author songjundong
  * @email 985776597@QQ.com
  * @date 2015-1-8  上午9:31:57
  */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParComCompanySizeService {

    @Autowired
    private ParComCompanySizeMapper parComCompanySizeMapper;
      
    /***
     * @Title: getParComCompanySize  
     * @Description: TODO(根据id获取公司规模)  
     * @param @param parComCompanySizeId
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    public Object getParComCompanySize(String parComCompanySizeId) {
        return parComCompanySizeMapper.selectByPrimaryKey(parComCompanySizeId);
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
    public Object listAsGrid(JqPager jqPager, ParComCompanySizeQueryDTO parComCompanySizeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParComCompanySizeExample parComCompanySizeExample = new ParComCompanySizeExample(); 
        Criteria queryCriteria = parComCompanySizeExample.createCriteria();
        parComCompanySizeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
            parComCompanySizeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parComCompanySizeExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parComCompanySizeExample.setOrderByClause(jqPager.getOrderBy("temp_par_com_company_size_"));
        } 
        List<ParComCompanySize>  carrierCarTypeList = parComCompanySizeMapper.selectByExample(parComCompanySizeExample); // 查询所有公司规模列表
        int total = parComCompanySizeMapper.countByExample(parComCompanySizeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addParComCompanySize  
      * @Description: TODO(新增公司规模)  
      * @param @param parComCompanySize
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ComCompanySizeList_add")
    public Object addParComCompanySize(ParComCompanySize parComCompanySize) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComCompanySizeExample parComCompanySizeExample = new ParComCompanySizeExample();
        int count = 0;
        //防止名称重复
        parComCompanySizeExample.createCriteria().andCompanySizeNameEqualTo(parComCompanySize.getCompanySizeName());
        count = parComCompanySizeMapper.countByExample(parComCompanySizeExample);
        if (count > 0) {
            returnResult.setMsg("公司规模名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parComCompanySize.setCompanySizeId(RandomGUID.getRandomGUID());
        parComCompanySize.setCreater(pricipalUser.getUserCnName());
        parComCompanySize.setCreateTime(new Date());
        parComCompanySize.setUpdater(pricipalUser.getUserCnName());
        parComCompanySize.setUpdateTime(new Date());
        count = parComCompanySizeMapper.insert(parComCompanySize);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParComCompanySize  
      * @Description: TODO(这修改公司规模信息)  
      * @param @param parComCompanySize
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "ComCompanySizeList_edit")
    public Object editParComCompanySize(ParComCompanySize parComCompanySize) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComCompanySizeExample parComCompanySizeExample = new ParComCompanySizeExample();
        int count = 0; 
        //防止名称重复
        parComCompanySizeExample.createCriteria().andCompanySizeNameEqualTo(parComCompanySize.getCompanySizeName());
        count = parComCompanySizeMapper.countByExample(parComCompanySizeExample);
        if (count > 0) {
            returnResult.setMsg("公司规模名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parComCompanySize.setUpdater(pricipalUser.getUserCnName());
        parComCompanySize.setUpdateTime(new Date());
        count = parComCompanySizeMapper.updateByPrimaryKeySelective(parComCompanySize);
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
     * @param @param parComCompanySizeIds
     * @param @param parComCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "ComCompanySizeList_del")
    public Object delCarType(List<String> parComCompanySizeIds, List<String> parComCompanyNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (parComCompanySizeIds.size() > 0) {
            ParComCompanySizeExample parComCompanySizeExample = new ParComCompanySizeExample();
            parComCompanySizeExample.createCriteria().andCompanySizeIdIn(parComCompanySizeIds);
            count = parComCompanySizeMapper.deleteByExample(parComCompanySizeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了公司规模为:[ " + CollectionsUtil.convertToString(parComCompanyNames, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    }
    
}
