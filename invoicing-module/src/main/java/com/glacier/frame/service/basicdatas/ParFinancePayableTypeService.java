/**
 * @Title: ParFinancePayableTypeService.java 
 * @Package com.glacier.global.service.ParFinancePayableType
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
import com.glacier.frame.dao.basicdatas.ParFinancePayableTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParFinancePayableTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParFinancePayableType;
import com.glacier.frame.entity.basicdatas.ParFinancePayableTypeExample;
import com.glacier.frame.entity.basicdatas.ParFinancePayableTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParFinancePayableTypeService
 * @Description: TODO(应付类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParFinancePayableTypeService {

    @Autowired
    private ParFinancePayableTypeMapper parFinancePayableTypeMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有应付类型信息) 
     * @param @param jqPager ParFinancePayableTypeQueryDTO financeCostTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParFinancePayableTypeQueryDTO financeCostTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParFinancePayableTypeExample parFinancePayableTypeExample = new ParFinancePayableTypeExample(); 
        Criteria queryCriteria = parFinancePayableTypeExample.createCriteria();
        financeCostTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parFinancePayableTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parFinancePayableTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parFinancePayableTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_finance_payable_type_"));
        }
        List<ParFinancePayableType>  parFinancePayableTypeList = parFinancePayableTypeMapper.selectByExample(parFinancePayableTypeExample); // 查询所有应付类型列表
        int total = parFinancePayableTypeMapper.countByExample(parFinancePayableTypeExample); // 查询总页数
        returnResult.setRows(parFinancePayableTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParFinancePayableType 
     * @Description: TODO(根据应付类型Id获取应付类型信息) 
     * @param @param parFinancePayableTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParFinancePayableType(String parFinancePayableTypeId) {
        ParFinancePayableType parFinancePayableType = parFinancePayableTypeMapper.selectByPrimaryKey(parFinancePayableTypeId);
        return parFinancePayableType;
    }
    
    /**
     * @Title: addParFinancePayableType 
     * @Description: TODO(新增应付类型) 
     * @param @param parFinancePayableType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_add")
    public Object addParFinancePayableType(ParFinancePayableType parFinancePayableType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParFinancePayableTypeExample parFinancePayableTypeExample = new ParFinancePayableTypeExample();
        int count = 0;
        // 防止应付类型名称重复
        parFinancePayableTypeExample.createCriteria().andNameEqualTo(parFinancePayableType.getName());
        count = parFinancePayableTypeMapper.countByExample(parFinancePayableTypeExample);
        if (count > 0) {
            returnResult.setMsg("应付类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parFinancePayableType.setPayableTypeId(RandomGUID.getRandomGUID());
        parFinancePayableType.setCreater(pricipalUser.getUserCnName());
        parFinancePayableType.setCreateTime(new Date());
        parFinancePayableType.setUpdater(pricipalUser.getUserCnName());
        parFinancePayableType.setUpdateTime(new Date());
        count = parFinancePayableTypeMapper.insert(parFinancePayableType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parFinancePayableType.getName() + "] 应付类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，应付类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParFinancePayableType 
     * @Description: TODO(修改应付类型信息) 
     * @param @param parFinancePayableType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_edit")
    public Object editParFinancePayableType(ParFinancePayableType parFinancePayableType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParFinancePayableTypeExample parFinancePayableTypeExample = new ParFinancePayableTypeExample();
        int count = 0;
        //防止应付类型名称重复
        parFinancePayableTypeExample.createCriteria().andNameEqualTo(parFinancePayableType.getName()).andPayableTypeIdNotEqualTo(parFinancePayableType.getPayableTypeId());
        count = parFinancePayableTypeMapper.countByExample(parFinancePayableTypeExample);
        if (count > 0) {
            returnResult.setMsg("应付类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parFinancePayableType.setUpdater(pricipalUser.getUserCnName());
        parFinancePayableType.setUpdateTime(new Date());
        count = parFinancePayableTypeMapper.updateByPrimaryKeySelective(parFinancePayableType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parFinancePayableType.getName() + "] 应付类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，应付类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParFinancePayableType 
     * @Description: TODO(删除应付类型) 
     * @param @param payableTypeIds names
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_del")
    public Object delParFinancePayableType(List<String> payableTypeIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (payableTypeIds.size() > 0) {
            ParFinancePayableTypeExample parFinancePayableTypeExample = new ParFinancePayableTypeExample();
            parFinancePayableTypeExample.createCriteria().andPayableTypeIdIn(payableTypeIds);
            count = parFinancePayableTypeMapper.deleteByExample(parFinancePayableTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(names, ",") + " ]应付类型信息");
            } else {
                returnResult.setMsg("发生未知错误，应付类型信息删除失败");
            }
        }
        return returnResult;
    }
}
