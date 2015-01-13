/**
 * @Title: ParComContactTypeService.java 
 * @Package com.glacier.global.service.ParComContactType
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
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParComContactTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParComContactTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParComContactType;
import com.glacier.frame.entity.basicdatas.ParComContactTypeExample;
import com.glacier.frame.entity.basicdatas.ParComContactTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParComContactTypeService
 * @Description: TODO(联系人类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-8
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParComContactTypeService {

	@Autowired
	private ParComContactTypeMapper parComContactTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有联系人类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParComContactTypeQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParComContactTypeExample parComContactTypeExample = new ParComContactTypeExample(); 
        Criteria queryCriteria = parComContactTypeExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parComContactTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parComContactTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parComContactTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_com_contact_type_"));
        }
        List<ParComContactType>  parComContactTypeList = parComContactTypeMapper.selectByExample(parComContactTypeExample); // 查询所有联系人类型列表
        int total = parComContactTypeMapper.countByExample(parComContactTypeExample); // 查询总页数
        returnResult.setRows(parComContactTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getParComContactType 
	 * @Description: TODO(根据联系人类型Id获取联系人类型信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParComContactType(String deliverTypeId) {
    	ParComContactType parComContactType = parComContactTypeMapper.selectByPrimaryKey(deliverTypeId);
        return parComContactType;
    }
    
    /**
     * @Title: addParComContactType 
     * @Description: TODO(新增联系人类型) 
     * @param @param parComContactType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ContactTypeList_add")
    public Object addParComContactType(ParComContactType parComContactType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComContactTypeExample parComContactTypeExample = new ParComContactTypeExample();
        int count = 0;
        // 防止联系人类型名称重复
        parComContactTypeExample.createCriteria().andContactTypeNameEqualTo(parComContactType.getContactTypeName());
        count = parComContactTypeMapper.countByExample(parComContactTypeExample);
        if (count > 0) {
            returnResult.setMsg("联系人类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parComContactType.setContactTypeId(RandomGUID.getRandomGUID());
        parComContactType.setCreater(pricipalUser.getUserCnName());
        parComContactType.setCreateTime(new Date());
        parComContactType.setUpdater(pricipalUser.getUserCnName());
        parComContactType.setUpdateTime(new Date());
        count = parComContactTypeMapper.insert(parComContactType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parComContactType.getContactTypeName() + "] 联系人类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，联系人类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParComContactType 
     * @Description: TODO(修改联系人类型信息) 
     * @param @param parComContactType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ContactTypeList_edit")
    public Object editParComContactType(ParComContactType parComContactType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComContactTypeExample parComContactTypeExample = new ParComContactTypeExample();
        int count = 0;
        // 防止联系人类型名称重复
        parComContactTypeExample.createCriteria().andContactTypeNameEqualTo(parComContactType.getContactTypeName()).andContactTypeIdNotEqualTo(parComContactType.getContactTypeId());
        count = parComContactTypeMapper.countByExample(parComContactTypeExample);
        if (count > 0) {
            returnResult.setMsg("联系人类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parComContactType.setUpdater(pricipalUser.getUserCnName());
        parComContactType.setUpdateTime(new Date());
        count = parComContactTypeMapper.updateByPrimaryKeySelective(parComContactType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parComContactType.getContactTypeName() + "] 联系人类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，联系人类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParComContactType 
     * @Description: TODO(删除联系人类型) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ContactTypeList_del")
    public Object delParComContactType(List<String> contactTypeIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (contactTypeIds.size() > 0) {
        	ParComContactTypeExample parComContactTypeExample = new ParComContactTypeExample();
        	parComContactTypeExample.createCriteria().andContactTypeIdIn(contactTypeIds);
            count = parComContactTypeMapper.deleteByExample(parComContactTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了【" + count + " 】条联系人类型信息");
            } else {
                returnResult.setMsg("发生未知错误，联系人类型信息删除失败");
            }
        }
        return returnResult;
    }
}
