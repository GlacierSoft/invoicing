/**
 * @Title: ParClientContactService.java 
 * @Package com.glacier.global.service.ParClientContact
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
import com.glacier.frame.dao.basicdatas.ParClientContactMapper;
import com.glacier.frame.dto.query.basicdatas.ParClientContactQueryDTO;
import com.glacier.frame.entity.basicdatas.ParClientContact;
import com.glacier.frame.entity.basicdatas.ParClientContactExample;
import com.glacier.frame.entity.basicdatas.ParClientContactExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
/*** 
 * @ClassName:  ParClientContactService
 * @Description: TODO(客户联系人表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParClientContactService {

    @Autowired
    private ParClientContactMapper parClientContactMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有客户联系人信息) 
     * @param @param jqPager ParClientContactQueryDTO clientContactQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParClientContactQueryDTO parClientContactQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParClientContactExample parClientContactExample = new ParClientContactExample(); 
        Criteria queryCriteria = parClientContactExample.createCriteria();
        parClientContactQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parClientContactExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parClientContactExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parClientContactExample.setOrderByClause(jqPager.getOrderBy("temp_par_client_contact_"));
        }
        List<ParClientContact>  parClientContactList = parClientContactMapper.selectByExample(parClientContactExample); // 查询所有客户联系人列表
        int total = parClientContactMapper.countByExample(parClientContactExample); // 查询总页数
        returnResult.setRows(parClientContactList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParClientContact 
     * @Description: TODO(根据客户联系人Id获取客户联系人信息) 
     * @param @param parClientContactId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParClientContact(String parClientContactId) {
        ParClientContact parClientContact = parClientContactMapper.selectByPrimaryKey(parClientContactId);
        return parClientContact;
    }
    
    /**
     * @Title: addParClientContact 
     * @Description: TODO(新增客户联系人) 
     * @param @param parClientContact
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientContactList_add")
    public Object addParClientContact(ParClientContact parClientContact) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientContactExample parClientContactExample = new ParClientContactExample();
        int count = 0;
        // 防止客户联系人名称重复
        parClientContactExample.createCriteria().andNameEqualTo(parClientContact.getName());
        count = parClientContactMapper.countByExample(parClientContactExample);
        if (count > 0) {
            returnResult.setMsg("客户联系人名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parClientContact.setClientContactId(RandomGUID.getRandomGUID());
        parClientContact.setCreater(pricipalUser.getUserCnName());
        parClientContact.setCreateTime(new Date());
        parClientContact.setUpdater(pricipalUser.getUserCnName());
        parClientContact.setUpdateTime(new Date());
        count = parClientContactMapper.insert(parClientContact);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientContact.getName() + "] 客户联系人信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户联系人信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParClientContact 
     * @Description: TODO(修改客户联系人信息) 
     * @param @param parClientContact
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientContactList_edit")
    public Object editParClientContact(ParClientContact parClientContact) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientContactExample parClientContactExample = new ParClientContactExample();
        int count = 0;
        //防止客户联系人名称重复
        parClientContactExample.createCriteria().andNameEqualTo(parClientContact.getName()).andClientContactIdNotEqualTo(parClientContact.getClientContactId());
        count = parClientContactMapper.countByExample(parClientContactExample);
        if (count > 0) {
            returnResult.setMsg("客户联系人名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parClientContact.setUpdater(pricipalUser.getUserCnName());
        parClientContact.setUpdateTime(new Date());
        count = parClientContactMapper.updateByPrimaryKeySelective(parClientContact);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientContact.getName() + "] 客户联系人信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户联系人信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParClientContact 
     * @Description: TODO(删除客户联系人) 
     * @param @param clientContactIds names
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientContactList_del")
    public Object delParClientContact(List<String> clientContactIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientContactIds.size() > 0) {
            ParClientContactExample parClientContactExample = new ParClientContactExample();
            parClientContactExample.createCriteria().andClientContactIdIn(clientContactIds);
            count = parClientContactMapper.deleteByExample(parClientContactExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(names, ",") + " ]客户联系人信息");
            } else {
                returnResult.setMsg("发生未知错误，客户联系人信息删除失败");
            }
        }
        return returnResult;
    }
}
