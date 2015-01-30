/**
 * @Title: SuppliersService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-9 下午1:23:06 
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
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;  
import com.glacier.frame.dao.basicdatas.SuppliersMapper;
import com.glacier.frame.dto.query.basicdatas.SuppliersQueryDTO; 
import com.glacier.frame.entity.basicdatas.Suppliers;
import com.glacier.frame.entity.basicdatas.SuppliersExample;
import com.glacier.frame.entity.basicdatas.SuppliersExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  SuppliersService
 * @Description: TODO(供应商service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-9  下午1:23:06
 */ 
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class SuppliersService {
 
	@Autowired
    private SuppliersMapper suppliersMapper;
	 
	 /***
	  * @Title: getSuppliers  
	  * @Description: TODO(根据id获取供应商)  
	  * @param @param SuppliersId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getSuppliers(String suppliersId) {
        return suppliersMapper.selectByPrimaryKey(suppliersId);
    } 
      
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有供应商信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, SuppliersQueryDTO suppliersQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        SuppliersExample suppliersExample = new SuppliersExample(); 
        Criteria queryCriteria = suppliersExample.createCriteria();
        suppliersQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	suppliersExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	suppliersExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 suppliersExample.setOrderByClause(jqPager.getOrderBy("temp_suppliers_"));
        } 
        List<Suppliers>  carrierCarTypeList = suppliersMapper.selectByExample(suppliersExample); // 查询所有列表
        int total = suppliersMapper.countByExample(suppliersExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
     
    /** 
     * @Title: getSuppliersLogisticsCombo  
     * @Description: TODO(这里用一句话描述这个方法的作用)  
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    public Object getSuppliersLogisticsCombo() {
    	SuppliersExample SuppliersLogisticsExample = new SuppliersExample();
    	SuppliersLogisticsExample.createCriteria().andEnabledEqualTo("enable").andSupplierTypeNameEqualTo("物流公司");
        List<Suppliers> SuppliersLogisticss = suppliersMapper.selectByExample(SuppliersLogisticsExample);
        return JackJson.fromObjectToJson(SuppliersLogisticss);
    }
    
    /**
     * @Title: getSuppliersCombo 
     * @Description: TODO(用于供应商Combo的数据绑定) 
     * @param  @param suppliersId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getSuppliersCombo() {
    	SuppliersExample parSuppliersExample = new SuppliersExample();
    	parSuppliersExample.createCriteria().andEnabledEqualTo("enable");
        List<Suppliers> parSupplierss = suppliersMapper.selectByExample(parSuppliersExample);
        return JackJson.fromObjectToJson(parSupplierss);
    }
    
     /**
      * 
      * @Title: addSuppliers  
      * @Description: TODO(新增供应商)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersList_add")
    public Object addSuppliers(Suppliers suppliers) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        SuppliersExample suppliersExample = new SuppliersExample();
        int count = 0;
        // 防止名称重复
        suppliersExample.createCriteria().andSuppliersNameEqualTo(suppliers.getSuppliersName());
        count = suppliersMapper.countByExample(suppliersExample);
        if (count > 0) {
            returnResult.setMsg("供应商名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        suppliers.setSupplierId(RandomGUID.getRandomGUID());
        suppliers.setSupplierNumber(getSupplierNumber());
        suppliers.setCreater(pricipalUser.getUserCnName());
        suppliers.setCreateTime(new Date());
        suppliers.setUpdater(pricipalUser.getUserCnName());
        suppliers.setUpdateTime(new Date());
        count = suppliersMapper.insert(suppliers);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
   /** 
    * @Title: getSupplierNumber  
    * @Description: TODO(自动累加供应商的编号)  
    * @param @return    设定文件  
    * @return String    返回类型  
    * @throws
    */
   public String getSupplierNumber(){  
		String route=suppliersMapper.selectTop();   
		if(route==null){
			String number=1+"00000";
			return number;
		} 
		int num=Integer.parseInt(route)+1; 
		return num+"";
	} 
    
    
     /** 
      * @Title: editSuppliers  
      * @Description: TODO(这修改供应商信息)  
      * @param @param Suppliers
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersList_edit")
    public Object editSuppliers(Suppliers suppliers) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        SuppliersExample SuppliersExample = new SuppliersExample();
        int count = 0; 
       // 防止名称重复
        SuppliersExample.createCriteria().andSuppliersNameEqualTo(suppliers.getSuppliersName()).andSupplierIdNotEqualTo(suppliers.getSupplierId());
        count = suppliersMapper.countByExample(SuppliersExample);
        if (count > 0) {
            returnResult.setMsg("供应商名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        suppliers.setUpdater(pricipalUser.getUserCnName());
        suppliers.setUpdateTime(new Date());
        count = suppliersMapper.updateByPrimaryKeySelective(suppliers);
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
     * @Description: TODO(删除供应商信息)  
     * @param @param SuppliersIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersList_del")
    public Object delSuppliers(List<String> suppliersIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (suppliersIds.size() > 0) {
        	SuppliersExample suppliersExample = new SuppliersExample();
        	suppliersExample.createCriteria().andSupplierIdIn(suppliersIds);
            count = suppliersMapper.deleteByExample(suppliersExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了供应商为:[ " + CollectionsUtil.convertToString(names, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    } 
}
