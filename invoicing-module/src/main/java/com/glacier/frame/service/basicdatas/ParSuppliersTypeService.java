/**
 * @Title: ParSuppliersTypeService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 下午1:40:38 
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
import com.glacier.basic.util.RandomGUID; 
import com.glacier.frame.dao.basicdatas.ParSuppliersTypeMapper; 
import com.glacier.frame.dto.query.basicdatas.ParSuppliersTypeQueryDTO; 
import com.glacier.frame.entity.basicdatas.ParSuppliersType;
import com.glacier.frame.entity.basicdatas.ParSuppliersTypeExample;
import com.glacier.frame.entity.basicdatas.ParSuppliersTypeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParSuppliersTypeService
 * @Description: TODO(供应商类型service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13  下午1:40:38
 */ 
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParSuppliersTypeService {
 
	@Autowired
    private ParSuppliersTypeMapper suppliersTypeMapper;
	  
	/** 
	 * @Title: getSuppliers  
	 * @Description: TODO(获取单个供应商类型对象)  
	 * @param @param suppliersId
	 * @param @return    设定文件  
	 * @return Object    返回类型  
	 * @throws
	 */
    public Object getSuppliersType(String suppliersTypeId) {
        return suppliersTypeMapper.selectByPrimaryKey(suppliersTypeId);
    } 
      
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有供应商类型信息信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ParSuppliersTypeQueryDTO suppliersTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSuppliersTypeExample suppliersTypeExample = new ParSuppliersTypeExample(); 
        Criteria queryCriteria = suppliersTypeExample.createCriteria();
        suppliersTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	suppliersTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	suppliersTypeExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 suppliersTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_suppliers_type_"));
        } 
        List<ParSuppliersType>  carrierCarTypeList = suppliersTypeMapper.selectByExample(suppliersTypeExample); // 查询所有列表
        int total = suppliersTypeMapper.countByExample(suppliersTypeExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addSuppliers  
      * @Description: TODO(新增供应商类型信息)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersTypeList_add")
    public Object addSuppliersType(ParSuppliersType suppliersType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersTypeExample suppliersExample = new ParSuppliersTypeExample();
        int count = 0;
        // 防止名称重复
        suppliersExample.createCriteria().andTypeNameEqualTo(suppliersType.getTypeName());
        count = suppliersTypeMapper.countByExample(suppliersExample);
        if (count > 0) {
            returnResult.setMsg("供应商类型信息名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        suppliersType.setTypeId(RandomGUID.getRandomGUID()); 
        suppliersType.setCreater(pricipalUser.getUserCnName());
        suppliersType.setCreateTime(new Date());
        suppliersType.setUpdater(pricipalUser.getUserCnName());
        suppliersType.setUpdateTime(new Date());
        count = suppliersTypeMapper.insert(suppliersType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
      
     /** 
      * @Title: editSuppliers  
      * @Description: TODO(这修改供应商类型信息信息)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersTypeList_edit")
    public Object editSuppliersType(ParSuppliersType suppliersType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersTypeExample suppliersTypeExample = new ParSuppliersTypeExample();
        int count = 0; 
       // 防止名称重复
        suppliersTypeExample.createCriteria().andTypeNameEqualTo(suppliersType.getTypeName()).andTypeIdNotEqualTo(suppliersType.getTypeId());
        count = suppliersTypeMapper.countByExample(suppliersTypeExample);
        if (count > 0) {
            returnResult.setMsg("供应商类型信息名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        suppliersType.setUpdater(pricipalUser.getUserCnName());
        suppliersType.setUpdateTime(new Date());
        count = suppliersTypeMapper.updateByPrimaryKeySelective(suppliersType);
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
     * @Description: TODO(删除供应商类型信息信息)  
     * @param @param SuppliersIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersTypeList_del")
    public Object delSuppliersType(List<String> suppliersTypeIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (suppliersTypeIds.size() > 0) {
        	ParSuppliersTypeExample suppliersExample = new ParSuppliersTypeExample();
        	suppliersExample.createCriteria().andTypeIdIn(suppliersTypeIds);
            count = suppliersTypeMapper.deleteByExample(suppliersExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了供应商类型信息为:[ " + CollectionsUtil.convertToString(names, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    } 
 
}
