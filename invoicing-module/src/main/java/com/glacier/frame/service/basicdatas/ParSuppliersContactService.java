/**
 * @Title: ParSuppliersContactService.java 
 * @Package com.glacier.global.service.ParSuppliersContact
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2015-1-8
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
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
import com.glacier.frame.dao.basicdatas.ParSuppliersContactMapper;
import com.glacier.frame.dto.query.basicdatas.ParSuppliersContactQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersContact;
import com.glacier.frame.entity.basicdatas.ParSuppliersContactExample;
import com.glacier.frame.entity.basicdatas.ParSuppliersContactExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  ParSuppliersContactService
 * @Description: TODO(供应商联系人表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParSuppliersContactService {

    @Autowired
    private ParSuppliersContactMapper parSuppliersContactMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有供应商联系人信息) 
     * @param @param jqPager ParSuppliersContactQueryDTO clientContactQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParSuppliersContactQueryDTO parSuppliersContactQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSuppliersContactExample parSuppliersContactExample = new ParSuppliersContactExample(); 
        Criteria queryCriteria = parSuppliersContactExample.createCriteria();
        parSuppliersContactQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parSuppliersContactExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parSuppliersContactExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parSuppliersContactExample.setOrderByClause(jqPager.getOrderBy("temp_par_suppliers_contact_"));
        }
        List<ParSuppliersContact>  parSuppliersContactList = parSuppliersContactMapper.selectByExample(parSuppliersContactExample); // 查询所有供应商联系人列表
        int total = parSuppliersContactMapper.countByExample(parSuppliersContactExample); // 查询总页数
        returnResult.setRows(parSuppliersContactList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParSuppliersContact 
     * @Description: TODO(根据供应商联系人Id获取供应商联系人信息) 
     * @param @param supplierContactId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParSuppliersContact(String supplierContactId) {
        ParSuppliersContact parSuppliersContact = parSuppliersContactMapper.selectByPrimaryKey(supplierContactId);
        return parSuppliersContact;
    }
    
    /**
     * @Title: addParSuppliersContact 
     * @Description: TODO(新增供应商联系人) 
     * @param @param parSuppliersContact
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersContactList_add")
    public Object addParSuppliersContact(ParSuppliersContact parSuppliersContact) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersContactExample parSuppliersContactExample = new ParSuppliersContactExample();
        int count = 0;
        // 防止供应商联系人名称重复
        parSuppliersContactExample.createCriteria().andNameEqualTo(parSuppliersContact.getName());
        count = parSuppliersContactMapper.countByExample(parSuppliersContactExample);
        if (count > 0) {
            returnResult.setMsg("供应商联系人名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parSuppliersContact.setSupplierContactId(RandomGUID.getRandomGUID());
        parSuppliersContact.setCreater(pricipalUser.getUserCnName());
        parSuppliersContact.setCreateTime(new Date());
        parSuppliersContact.setUpdater(pricipalUser.getUserCnName());
        parSuppliersContact.setUpdateTime(new Date());
        count = parSuppliersContactMapper.insert(parSuppliersContact);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSuppliersContact.getName() + "] 供应商联系人信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，供应商联系人信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParSuppliersContact 
     * @Description: TODO(修改供应商联系人信息) 
     * @param @param parSuppliersContact
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersContactList_edit")
    public Object editParSuppliersContact(ParSuppliersContact parSuppliersContact) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersContactExample parSuppliersContactExample = new ParSuppliersContactExample();
        int count = 0;
        //防止供应商联系人名称重复
        parSuppliersContactExample.createCriteria().andNameEqualTo(parSuppliersContact.getName()).andSupplierContactIdNotEqualTo(parSuppliersContact.getSupplierContactId());
        count = parSuppliersContactMapper.countByExample(parSuppliersContactExample);
        if (count > 0) {
            returnResult.setMsg("供应商联系人名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parSuppliersContact.setUpdater(pricipalUser.getUserCnName());
        parSuppliersContact.setUpdateTime(new Date());
        count = parSuppliersContactMapper.updateByPrimaryKeySelective(parSuppliersContact);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSuppliersContact.getName() + "] 供应商联系人信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，供应商联系人信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParSuppliersContact 
     * @Description: TODO(删除供应商联系人) 
     * @param @param supplierContactIds names
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersContactList_del")
    public Object delParSuppliersContact(List<String> supplierContactIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (supplierContactIds.size() > 0) {
            ParSuppliersContactExample parSuppliersContactExample = new ParSuppliersContactExample();
            parSuppliersContactExample.createCriteria().andSupplierContactIdIn(supplierContactIds);
            count = parSuppliersContactMapper.deleteByExample(parSuppliersContactExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(names, ",") + " ]供应商联系人信息");
            } else {
                returnResult.setMsg("发生未知错误，供应商联系人信息删除失败");
            }
        }
        return returnResult;
    }
}
