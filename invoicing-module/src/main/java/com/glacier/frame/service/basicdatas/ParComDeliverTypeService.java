/**
 * @Title: ParComDeliverTypeService.java 
 * @Package com.glacier.global.service.ParComDeliverType
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
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParComDeliverTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParComDeliverTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParComDeliverType;
import com.glacier.frame.entity.basicdatas.ParComDeliverTypeExample;
import com.glacier.frame.entity.basicdatas.ParComDeliverTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParComDeliverTypeService
 * @Description: TODO(交货方式表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-8
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParComDeliverTypeService {

	@Autowired
	private ParComDeliverTypeMapper parComDeliverTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有交货方式信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParComDeliverTypeQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParComDeliverTypeExample parComDeliverTypeExample = new ParComDeliverTypeExample(); 
        Criteria queryCriteria = parComDeliverTypeExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parComDeliverTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parComDeliverTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parComDeliverTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_com_deliver_type_"));
        }
        List<ParComDeliverType>  parComDeliverTypeList = parComDeliverTypeMapper.selectByExample(parComDeliverTypeExample); // 查询所有交货方式列表
        int total = parComDeliverTypeMapper.countByExample(parComDeliverTypeExample); // 查询总页数
        returnResult.setRows(parComDeliverTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getDeliverTypeCombo 
     * @Description: TODO(用于交货方式Combo的数据绑定) 
     * @param  @param clientId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getDeliverTypeCombo() {
    	ParComDeliverTypeExample parComDeliverTypeExample = new ParComDeliverTypeExample();
        parComDeliverTypeExample.createCriteria().andEnabledEqualTo("enable");
        List<ParComDeliverType> parComDeliverTypes = parComDeliverTypeMapper.selectByExample(parComDeliverTypeExample);
        return JackJson.fromObjectToJson(parComDeliverTypes);
    }
    
    /**
	 * @Title: getParComDeliverType 
	 * @Description: TODO(根据交货方式Id获取交货方式信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParComDeliverType(String deliverTypeId) {
    	ParComDeliverType parComDeliverType = parComDeliverTypeMapper.selectByPrimaryKey(deliverTypeId);
        return parComDeliverType;
    }
    
    /**
     * @Title: addParComDeliverType 
     * @Description: TODO(新增交货方式) 
     * @param @param parComDeliverType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ComDeliveryTypeList_add")
    public Object addParComDeliverType(ParComDeliverType parComDeliverType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComDeliverTypeExample parComDeliverTypeExample = new ParComDeliverTypeExample();
        int count = 0;
        // 防止交货方式名称重复
        parComDeliverTypeExample.createCriteria().andDeliverTypeNameEqualTo(parComDeliverType.getDeliverTypeName());
        count = parComDeliverTypeMapper.countByExample(parComDeliverTypeExample);
        if (count > 0) {
            returnResult.setMsg("交货方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parComDeliverType.setDeliverTypeId(RandomGUID.getRandomGUID());
        parComDeliverType.setCreater(pricipalUser.getUserCnName());
        parComDeliverType.setCreateTime(new Date());
        parComDeliverType.setUpdater(pricipalUser.getUserCnName());
        parComDeliverType.setUpdateTime(new Date());
        count = parComDeliverTypeMapper.insert(parComDeliverType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parComDeliverType.getDeliverTypeName() + "] 交货方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，交货方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParComDeliverType 
     * @Description: TODO(修改交货方式信息) 
     * @param @param parComDeliverType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ComDeliveryTypeList_edit")
    public Object editParComDeliverType(ParComDeliverType parComDeliverType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComDeliverTypeExample parComDeliverTypeExample = new ParComDeliverTypeExample();
        int count = 0;
        //防止交货方式名称重复
        parComDeliverTypeExample.createCriteria().andDeliverTypeNameEqualTo(parComDeliverType.getDeliverTypeName()).andDeliverTypeIdNotEqualTo(parComDeliverType.getDeliverTypeId());
        count = parComDeliverTypeMapper.countByExample(parComDeliverTypeExample);
        if (count > 0) {
            returnResult.setMsg("交货方式名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parComDeliverType.setUpdater(pricipalUser.getUserCnName());
        parComDeliverType.setUpdateTime(new Date());
        count = parComDeliverTypeMapper.updateByPrimaryKeySelective(parComDeliverType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parComDeliverType.getDeliverTypeName() + "] 交货方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，交货方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParComDeliverType 
     * @Description: TODO(删除交货方式) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ComDeliveryTypeList_del")
    public Object delParComDeliverType(List<String> deliverTypeIds, List<String> deliverTypeName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (deliverTypeIds.size() > 0) {
        	ParComDeliverTypeExample parComDeliverTypeExample = new ParComDeliverTypeExample();
        	parComDeliverTypeExample.createCriteria().andDeliverTypeIdIn(deliverTypeIds);
            count = parComDeliverTypeMapper.deleteByExample(parComDeliverTypeExample);
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
