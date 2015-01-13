/**
 * @Title: ParClientTypeService.java 
 * @Package com.glacier.global.service.ParClientType
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
import com.glacier.frame.dao.basicdatas.ParClientTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParClientTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParClientType;
import com.glacier.frame.entity.basicdatas.ParClientTypeExample;
import com.glacier.frame.entity.basicdatas.ParClientTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParClientTypeService
 * @Description: TODO(客户类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParClientTypeService {

	@Autowired
	private ParClientTypeMapper parClientTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有客户类型信息) 
     * @param @param jqPager ParClientTypeQueryDTO clientTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParClientTypeQueryDTO clientTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParClientTypeExample parClientTypeExample = new ParClientTypeExample(); 
        Criteria queryCriteria = parClientTypeExample.createCriteria();
        clientTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parClientTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parClientTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parClientTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_client_type_"));
        }
        List<ParClientType>  parClientTypeList = parClientTypeMapper.selectByExample(parClientTypeExample); // 查询所有客户类型列表
        int total = parClientTypeMapper.countByExample(parClientTypeExample); // 查询总页数
        returnResult.setRows(parClientTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getParClientType 
	 * @Description: TODO(根据客户类型Id获取客户类型信息) 
	 * @param @param parClientTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParClientType(String parClientTypeId) {
    	ParClientType parClientType = parClientTypeMapper.selectByPrimaryKey(parClientTypeId);
        return parClientType;
    }
    
    /**
     * @Title: addParClientType 
     * @Description: TODO(新增客户类型) 
     * @param @param parClientType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientTypeList_add")
    public Object addParClientType(ParClientType parClientType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientTypeExample parClientTypeExample = new ParClientTypeExample();
        int count = 0;
        // 防止客户类型名称重复
        parClientTypeExample.createCriteria().andClientTypeNameEqualTo(parClientType.getClientTypeName());
        count = parClientTypeMapper.countByExample(parClientTypeExample);
        if (count > 0) {
            returnResult.setMsg("客户类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parClientType.setClientTypeid(RandomGUID.getRandomGUID());
        parClientType.setCreater(pricipalUser.getUserCnName());
        parClientType.setCreateTime(new Date());
        parClientType.setUpdater(pricipalUser.getUserCnName());
        parClientType.setUpdateTime(new Date());
        count = parClientTypeMapper.insert(parClientType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientType.getClientTypeName() + "] 客户类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParClientType 
     * @Description: TODO(修改客户类型信息) 
     * @param @param parClientType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientTypeList_edit")
    public Object editParClientType(ParClientType parClientType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientTypeExample parClientTypeExample = new ParClientTypeExample();
        int count = 0;
        //防止客户类型名称重复
        parClientTypeExample.createCriteria().andClientTypeNameEqualTo(parClientType.getClientTypeName()).andClientTypeidNotEqualTo(parClientType.getClientTypeid());
        count = parClientTypeMapper.countByExample(parClientTypeExample);
        if (count > 0) {
            returnResult.setMsg("客户类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parClientType.setUpdater(pricipalUser.getUserCnName());
        parClientType.setUpdateTime(new Date());
        count = parClientTypeMapper.updateByPrimaryKeySelective(parClientType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientType.getClientTypeName() + "] 客户类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParClientType 
     * @Description: TODO(删除客户类型) 
     * @param @param clientTypeIds clientTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientTypeList_del")
    public Object delParClientType(List<String> clientTypeIds, List<String> clientTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientTypeIds.size() > 0) {
        	ParClientTypeExample parClientTypeExample = new ParClientTypeExample();
        	parClientTypeExample.createCriteria().andClientTypeidIn(clientTypeIds);
            count = parClientTypeMapper.deleteByExample(parClientTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(clientTypeName, ",") + " ]客户类型信息");
            } else {
                returnResult.setMsg("发生未知错误，客户类型信息删除失败");
            }
        }
        return returnResult;
    }
}
