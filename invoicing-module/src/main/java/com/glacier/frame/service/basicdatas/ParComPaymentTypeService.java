/**
 * @Title: ParComPaymentTypeService.java 
 * @Package com.glacier.global.service.ParComPaymentType
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
import com.glacier.frame.dao.basicdatas.ParComPaymentTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParComPaymentTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParComPaymentType;
import com.glacier.frame.entity.basicdatas.ParComPaymentTypeExample;
import com.glacier.frame.entity.basicdatas.ParComPaymentTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParComPaymentTypeService
 * @Description: TODO(支付方式表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-8
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParComPaymentTypeService {

	@Autowired
	private ParComPaymentTypeMapper parComPaymentTypeMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有支付方式信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParComPaymentTypeQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParComPaymentTypeExample parComPaymentTypeExample = new ParComPaymentTypeExample(); 
        Criteria queryCriteria = parComPaymentTypeExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parComPaymentTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parComPaymentTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parComPaymentTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_com_payment_type_"));
        }
        List<ParComPaymentType>  parComPaymentTypeList = parComPaymentTypeMapper.selectByExample(parComPaymentTypeExample); // 查询所有支付方式列表
        int total = parComPaymentTypeMapper.countByExample(parComPaymentTypeExample); // 查询总页数
        returnResult.setRows(parComPaymentTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getParComPaymentType 
	 * @Description: TODO(根据支付方式Id获取支付方式信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParComPaymentType(String deliverTypeId) {
    	ParComPaymentType parComPaymentType = parComPaymentTypeMapper.selectByPrimaryKey(deliverTypeId);
        return parComPaymentType;
    }
    
    /**
     * @Title: addParComPaymentType 
     * @Description: TODO(新增支付方式) 
     * @param @param parComPaymentType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PaymentTypeList_add")
    public Object addParComPaymentType(ParComPaymentType parComPaymentType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComPaymentTypeExample parComPaymentTypeExample = new ParComPaymentTypeExample();
        int count = 0;
        // 防止支付方式名称重复
        parComPaymentTypeExample.createCriteria().andPaymentTypeNameEqualTo(parComPaymentType.getPaymentTypeName());
        count = parComPaymentTypeMapper.countByExample(parComPaymentTypeExample);
        if (count > 0) {
            returnResult.setMsg("支付方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parComPaymentType.setPaymentTypeId(RandomGUID.getRandomGUID());
        parComPaymentType.setCreater(pricipalUser.getUserCnName());
        parComPaymentType.setCreateTime(new Date());
        parComPaymentType.setUpdater(pricipalUser.getUserCnName());
        parComPaymentType.setUpdateTime(new Date());
        count = parComPaymentTypeMapper.insert(parComPaymentType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parComPaymentType.getPaymentTypeName() + "] 支付方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，支付方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParComPaymentType 
     * @Description: TODO(修改支付方式信息) 
     * @param @param parComPaymentType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PaymentTypeList_edit")
    public Object editParComPaymentType(ParComPaymentType parComPaymentType) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComPaymentTypeExample parComPaymentTypeExample = new ParComPaymentTypeExample();
        int count = 0;
        // 防止支付方式名称重复
        parComPaymentTypeExample.createCriteria().andPaymentTypeNameEqualTo(parComPaymentType.getPaymentTypeName()).andPaymentTypeIdNotEqualTo(parComPaymentType.getPaymentTypeId());
        count = parComPaymentTypeMapper.countByExample(parComPaymentTypeExample);
        if (count > 0) {
            returnResult.setMsg("支付方式名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parComPaymentType.setUpdater(pricipalUser.getUserCnName());
        parComPaymentType.setUpdateTime(new Date());
        count = parComPaymentTypeMapper.updateByPrimaryKeySelective(parComPaymentType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parComPaymentType.getPaymentTypeName() + "] 支付方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，支付方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParComPaymentType 
     * @Description: TODO(删除支付方式) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PaymentTypeList_del")
    public Object delParComPaymentType(List<String> paymentTypesId, List<String> paymentTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (paymentTypesId.size() > 0) {
        	ParComPaymentTypeExample parComPaymentTypeExample = new ParComPaymentTypeExample();
        	parComPaymentTypeExample.createCriteria().andPaymentTypeIdIn(paymentTypesId);
            count = parComPaymentTypeMapper.deleteByExample(parComPaymentTypeExample);
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
