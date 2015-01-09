/**
 * @Title: ParPaymentTypeService.java 
 * @Package com.glacier.global.service.ParPaymentType
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
import com.glacier.frame.dao.basicdatas.ParPaymentTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParPaymentTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParPaymentType;
import com.glacier.frame.entity.basicdatas.ParPaymentTypeExample;
import com.glacier.frame.entity.basicdatas.ParPaymentTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParPaymentTypeService
 * @Description: TODO(支付方式表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-8
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParPaymentTypeService {

	@Autowired
	private ParPaymentTypeMapper parPaymentTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有支付方式信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParPaymentTypeQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParPaymentTypeExample parPaymentTypeExample = new ParPaymentTypeExample(); 
        Criteria queryCriteria = parPaymentTypeExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parPaymentTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parPaymentTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parPaymentTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_payment_type_"));
        }
        List<ParPaymentType>  parPaymentTypeList = parPaymentTypeMapper.selectByExample(parPaymentTypeExample); // 查询所有支付方式列表
        int total = parPaymentTypeMapper.countByExample(parPaymentTypeExample); // 查询总页数
        returnResult.setRows(parPaymentTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getParPaymentType 
	 * @Description: TODO(根据支付方式Id获取支付方式信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParPaymentType(String deliverTypeId) {
    	ParPaymentType parPaymentType = parPaymentTypeMapper.selectByPrimaryKey(deliverTypeId);
        return parPaymentType;
    }
    
    /**
     * @Title: addParPaymentType 
     * @Description: TODO(新增支付方式) 
     * @param @param parPaymentType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PaymentTypeList_add")
    public Object addParPaymentType(ParPaymentType parPaymentType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParPaymentTypeExample parPaymentTypeExample = new ParPaymentTypeExample();
        int count = 0;
        // 防止支付方式名称重复
        parPaymentTypeExample.createCriteria().andPaymentTypeNameEqualTo(parPaymentType.getPaymentTypeName());
        count = parPaymentTypeMapper.countByExample(parPaymentTypeExample);
        if (count > 0) {
            returnResult.setMsg("支付方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parPaymentType.setPaymentTypeId(RandomGUID.getRandomGUID());
        parPaymentType.setCreater(pricipalUser.getUserCnName());
        parPaymentType.setCreateTime(new Date());
        parPaymentType.setUpdater(pricipalUser.getUserCnName());
        parPaymentType.setUpdateTime(new Date());
        count = parPaymentTypeMapper.insert(parPaymentType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parPaymentType.getPaymentTypeName() + "] 支付方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，支付方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParPaymentType 
     * @Description: TODO(修改支付方式信息) 
     * @param @param parPaymentType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PaymentTypeList_edit")
    public Object editParPaymentType(ParPaymentType parPaymentType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParPaymentTypeExample parPaymentTypeExample = new ParPaymentTypeExample();
        int count = 0;
        // 防止支付方式名称重复
        parPaymentTypeExample.createCriteria().andPaymentTypeNameEqualTo(parPaymentType.getPaymentTypeName()).andPaymentTypeIdNotEqualTo(parPaymentType.getPaymentTypeId());
        count = parPaymentTypeMapper.countByExample(parPaymentTypeExample);
        if (count > 0) {
            returnResult.setMsg("支付方式名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parPaymentType.setUpdater(pricipalUser.getUserCnName());
        parPaymentType.setUpdateTime(new Date());
        count = parPaymentTypeMapper.updateByPrimaryKeySelective(parPaymentType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parPaymentType.getPaymentTypeName() + "] 支付方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，支付方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParPaymentType 
     * @Description: TODO(删除支付方式) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PaymentTypeList_del")
    public Object delParPaymentType(List<String> paymentTypesId, List<String> paymentTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (paymentTypesId.size() > 0) {
        	ParPaymentTypeExample parPaymentTypeExample = new ParPaymentTypeExample();
        	parPaymentTypeExample.createCriteria().andPaymentTypeIdIn(paymentTypesId);
            count = parPaymentTypeMapper.deleteByExample(parPaymentTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(paymentTypeNames, ",") + " ]支付方式信息");
            } else {
                returnResult.setMsg("发生未知错误，支付方式信息删除失败");
            }
        }
        return returnResult;
    }
}
