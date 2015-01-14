/**
 * @Title: ParSuppliersSourceService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 下午1:39:47 
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
import com.glacier.frame.dao.basicdatas.ParSuppliersSourceMapper;
import com.glacier.frame.dto.query.basicdatas.ParSuppliersSourceQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersSource;
import com.glacier.frame.entity.basicdatas.ParSuppliersSourceExample;
import com.glacier.frame.entity.basicdatas.ParSuppliersSourceExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParSuppliersSourceService
 * @Description: TODO(供应商来源信息来源service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13  下午1:39:47
 */ 
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParSuppliersSourceService {
 
	@Autowired
    private ParSuppliersSourceMapper suppliersSourceMapper;
	  
	 /***
	  * @Title: getSuppliers  
	  * @Description: TODO(根据id获取供应商来源信息)  
	  * @param @param SuppliersId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getSuppliers(String suppliersId) {
        return suppliersSourceMapper.selectByPrimaryKey(suppliersId);
    } 
      
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有供应商来源信息信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ParSuppliersSourceQueryDTO suppliersQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSuppliersSourceExample suppliersSourceExample = new ParSuppliersSourceExample(); 
        Criteria queryCriteria = suppliersSourceExample.createCriteria();
        suppliersQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	suppliersSourceExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	suppliersSourceExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 suppliersSourceExample.setOrderByClause(jqPager.getOrderBy("temp_par_suppliers_source_"));
        } 
        List<ParSuppliersSource>  carrierCarTypeList = suppliersSourceMapper.selectByExample(suppliersSourceExample); // 查询所有列表
        int total = suppliersSourceMapper.countByExample(suppliersSourceExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addSuppliers  
      * @Description: TODO(新增供应商来源信息)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersSourceList_add")
    public Object addSuppliersSource(ParSuppliersSource suppliersSource) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersSourceExample suppliersExample = new ParSuppliersSourceExample();
        int count = 0;
        // 防止名称重复
        suppliersExample.createCriteria().andSourceNameEqualTo(suppliersSource.getSourceName());
        count = suppliersSourceMapper.countByExample(suppliersExample);
        if (count > 0) {
            returnResult.setMsg("供应商来源信息名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        suppliersSource.setSourceId(RandomGUID.getRandomGUID()); 
        suppliersSource.setCreater(pricipalUser.getUserCnName());
        suppliersSource.setCreateTime(new Date());
        suppliersSource.setUpdater(pricipalUser.getUserCnName());
        suppliersSource.setUpdateTime(new Date());
        count = suppliersSourceMapper.insert(suppliersSource);
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
      * @Description: TODO(这修改供应商来源信息信息)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersSourceList_edit")
    public Object editSuppliersSource(ParSuppliersSource suppliersSource) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersSourceExample suppliersSourceExample = new ParSuppliersSourceExample();
        int count = 0; 
       // 防止名称重复
        suppliersSourceExample.createCriteria().andSourceNameEqualTo(suppliersSource.getSourceName()).andSourceIdNotEqualTo(suppliersSource.getSourceId());
        count = suppliersSourceMapper.countByExample(suppliersSourceExample);
        if (count > 0) {
            returnResult.setMsg("供应商来源信息名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        suppliersSource.setUpdater(pricipalUser.getUserCnName());
        suppliersSource.setUpdateTime(new Date());
        count = suppliersSourceMapper.updateByPrimaryKeySelective(suppliersSource);
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
     * @Description: TODO(删除供应商来源信息信息)  
     * @param @param SuppliersIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersSourceList_del")
    public Object delSuppliersSource(List<String> suppliersSourceIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (suppliersSourceIds.size() > 0) {
        	ParSuppliersSourceExample suppliersExample = new ParSuppliersSourceExample();
        	suppliersExample.createCriteria().andSourceIdIn(suppliersSourceIds);
            count = suppliersSourceMapper.deleteByExample(suppliersExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了供应商来源信息为:[ " + CollectionsUtil.convertToString(names, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    } 

}
