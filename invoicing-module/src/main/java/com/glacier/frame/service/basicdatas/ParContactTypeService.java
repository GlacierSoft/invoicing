/**
 * @Title: ParContactTypeService.java 
 * @Package com.glacier.global.service.ParContactType
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
import com.glacier.frame.dao.basicdatas.ParContactTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParContactTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParContactType;
import com.glacier.frame.entity.basicdatas.ParContactTypeExample;
import com.glacier.frame.entity.basicdatas.ParContactTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParContactTypeService
 * @Description: TODO(联系人类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-8
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParContactTypeService {

	@Autowired
	private ParContactTypeMapper parContactTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有联系人类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParContactTypeQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParContactTypeExample parContactTypeExample = new ParContactTypeExample(); 
        Criteria queryCriteria = parContactTypeExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parContactTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parContactTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parContactTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_contact_type_"));
        }
        List<ParContactType>  parContactTypeList = parContactTypeMapper.selectByExample(parContactTypeExample); // 查询所有联系人类型列表
        int total = parContactTypeMapper.countByExample(parContactTypeExample); // 查询总页数
        returnResult.setRows(parContactTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getParContactType 
	 * @Description: TODO(根据联系人类型Id获取联系人类型信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParContactType(String deliverTypeId) {
    	ParContactType parContactType = parContactTypeMapper.selectByPrimaryKey(deliverTypeId);
        return parContactType;
    }
    
    /**
     * @Title: addParContactType 
     * @Description: TODO(新增联系人类型) 
     * @param @param parContactType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ContactTypeList_add")
    public Object addParContactType(ParContactType parContactType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParContactTypeExample parContactTypeExample = new ParContactTypeExample();
        int count = 0;
        // 防止联系人类型名称重复
        parContactTypeExample.createCriteria().andContactTypeNameEqualTo(parContactType.getContactTypeName());
        count = parContactTypeMapper.countByExample(parContactTypeExample);
        if (count > 0) {
            returnResult.setMsg("联系人类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parContactType.setContactTypeId(RandomGUID.getRandomGUID());
        parContactType.setCreater(pricipalUser.getUserCnName());
        parContactType.setCreateTime(new Date());
        parContactType.setUpdater(pricipalUser.getUserCnName());
        parContactType.setUpdateTime(new Date());
        count = parContactTypeMapper.insert(parContactType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parContactType.getContactTypeName() + "] 联系人类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，联系人类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParContactType 
     * @Description: TODO(修改联系人类型信息) 
     * @param @param parContactType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ContactTypeList_edit")
    public Object editParContactType(ParContactType parContactType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParContactTypeExample parContactTypeExample = new ParContactTypeExample();
        int count = 0;
        // 防止联系人类型名称重复
        parContactTypeExample.createCriteria().andContactTypeNameEqualTo(parContactType.getContactTypeName()).andContactTypeIdNotEqualTo(parContactType.getContactTypeId());
        count = parContactTypeMapper.countByExample(parContactTypeExample);
        if (count > 0) {
            returnResult.setMsg("联系人类型名称重复");
            return returnResult;
        }
        //根据ID获取联系人类型信息
        count = parContactTypeMapper.updateByPrimaryKeySelective(parContactType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parContactType.getContactTypeName() + "] 联系人类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，联系人类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParContactType 
     * @Description: TODO(删除联系人类型) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ContactTypeList_del")
    public Object delParContactType(List<String> paymentTypesId, List<String> paymentTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (paymentTypesId.size() > 0) {
        	ParContactTypeExample parContactTypeExample = new ParContactTypeExample();
        	parContactTypeExample.createCriteria().andContactTypeIdIn(paymentTypesId);
            count = parContactTypeMapper.deleteByExample(parContactTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(paymentTypeNames, ",") + " ]联系人类型信息");
            } else {
                returnResult.setMsg("发生未知错误，联系人类型信息删除失败");
            }
        }
        return returnResult;
    }
}
