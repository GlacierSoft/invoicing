/**
 * @Title: ParDeliverTypeService.java 
 * @Package com.glacier.global.service.ParDeliverType
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
import com.glacier.frame.dao.basicdatas.ParDeliverTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParDeliverTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParDeliverType;
import com.glacier.frame.entity.basicdatas.ParDeliverTypeExample;
import com.glacier.frame.entity.basicdatas.ParDeliverTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParDeliverTypeService
 * @Description: TODO(交换方式表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-8
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParDeliverTypeService {

	@Autowired
	private ParDeliverTypeMapper parDeliverTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有交货方式信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParDeliverTypeQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParDeliverTypeExample parDeliverTypeExample = new ParDeliverTypeExample(); 
        Criteria queryCriteria = parDeliverTypeExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parDeliverTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parDeliverTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parDeliverTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_deliver_type_"));
        }
        List<ParDeliverType>  parDeliverTypeList = parDeliverTypeMapper.selectByExample(parDeliverTypeExample); // 查询所有交货方式列表
        int total = parDeliverTypeMapper.countByExample(parDeliverTypeExample); // 查询总页数
        returnResult.setRows(parDeliverTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getParDeliverType 
	 * @Description: TODO(根据交货方式Id获取交货方式信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParDeliverType(String deliverTypeId) {
    	ParDeliverType parDeliverType = parDeliverTypeMapper.selectByPrimaryKey(deliverTypeId);
        return parDeliverType;
    }
    
    /**
     * @Title: addParDeliverType 
     * @Description: TODO(新增交货方式) 
     * @param @param parDeliverType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ParDeliverTypeList_add")
    public Object addParDeliverType(ParDeliverType parDeliverType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParDeliverTypeExample parDeliverTypeExample = new ParDeliverTypeExample();
        int count = 0;
        // 防止交货方式名称重复
        parDeliverTypeExample.createCriteria().andDeliverTypeNameEqualTo(parDeliverType.getDeliverTypeName());
        count = parDeliverTypeMapper.countByExample(parDeliverTypeExample);
        if (count > 0) {
            returnResult.setMsg("交货方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parDeliverType.setDeliverTypeId(RandomGUID.getRandomGUID());
        parDeliverType.setCreater(pricipalUser.getUserCnName());
        parDeliverType.setCreateTime(new Date());
        parDeliverType.setUpdater(pricipalUser.getUserCnName());
        parDeliverType.setUpdateTime(new Date());
        count = parDeliverTypeMapper.insert(parDeliverType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parDeliverType.getDeliverTypeName() + "] 交货方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，交货方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParDeliverType 
     * @Description: TODO(修改交货方式信息) 
     * @param @param parDeliverType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ParDeliverTypeList_edit")
    public Object editParDeliverType(ParDeliverType parDeliverType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParDeliverTypeExample parDeliverTypeExample = new ParDeliverTypeExample();
        int count = 0;
        // 防止交货方式名称重复
        parDeliverTypeExample.createCriteria().andDeliverTypeNameEqualTo(parDeliverType.getDeliverTypeName()).andDeliverTypeIdNotEqualTo(parDeliverType.getDeliverTypeId());
        count = parDeliverTypeMapper.countByExample(parDeliverTypeExample);
        if (count > 0) {
            returnResult.setMsg("交货方式名称重复");
            return returnResult;
        }
        //根据ID获取交货方式信息
        count = parDeliverTypeMapper.updateByPrimaryKeySelective(parDeliverType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parDeliverType.getDeliverTypeName() + "] 交货方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，交货方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParDeliverType 
     * @Description: TODO(删除交货方式) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ParDeliverTypeList_del")
    public Object delParDeliverType(List<String> deliverTypeIds, List<String> deliverTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (deliverTypeIds.size() > 0) {
        	ParDeliverTypeExample parDeliverTypeExample = new ParDeliverTypeExample();
        	parDeliverTypeExample.createCriteria().andDeliverTypeIdIn(deliverTypeIds);
            count = parDeliverTypeMapper.deleteByExample(parDeliverTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(deliverTypeName, ",") + " ]交货方式信息");
            } else {
                returnResult.setMsg("发生未知错误，交货方式信息删除失败");
            }
        }
        return returnResult;
    }
}
