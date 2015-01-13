/**
 * @Title: ParFinanceCostTypeService.java 
 * @Package com.glacier.global.service.ParFinanceCostType
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
import com.glacier.frame.dao.basicdatas.ParFinanceCostTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParFinanceCostTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParFinanceCostType;
import com.glacier.frame.entity.basicdatas.ParFinanceCostTypeExample;
import com.glacier.frame.entity.basicdatas.ParFinanceCostTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParFinanceCostTypeService
 * @Description: TODO(费用类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParFinanceCostTypeService {

    @Autowired
    private ParFinanceCostTypeMapper parFinanceCostTypeMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有费用类型信息) 
     * @param @param jqPager ParFinanceCostTypeQueryDTO financeCostTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParFinanceCostTypeQueryDTO financeCostTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParFinanceCostTypeExample parFinanceCostTypeExample = new ParFinanceCostTypeExample(); 
        Criteria queryCriteria = parFinanceCostTypeExample.createCriteria();
        financeCostTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parFinanceCostTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parFinanceCostTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parFinanceCostTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_finance_cost_type_"));
        }
        List<ParFinanceCostType>  parFinanceCostTypeList = parFinanceCostTypeMapper.selectByExample(parFinanceCostTypeExample); // 查询所有费用类型列表
        int total = parFinanceCostTypeMapper.countByExample(parFinanceCostTypeExample); // 查询总页数
        returnResult.setRows(parFinanceCostTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParFinanceCostType 
     * @Description: TODO(根据费用类型Id获取费用类型信息) 
     * @param @param parFinanceCostTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParFinanceCostType(String parFinanceCostTypeId) {
        ParFinanceCostType parFinanceCostType = parFinanceCostTypeMapper.selectByPrimaryKey(parFinanceCostTypeId);
        return parFinanceCostType;
    }
    
    /**
     * @Title: addParFinanceCostType 
     * @Description: TODO(新增费用类型) 
     * @param @param parFinanceCostType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_add")
    public Object addParFinanceCostType(ParFinanceCostType parFinanceCostType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParFinanceCostTypeExample parFinanceCostTypeExample = new ParFinanceCostTypeExample();
        int count = 0;
        // 防止费用类型名称重复
        parFinanceCostTypeExample.createCriteria().andNameEqualTo(parFinanceCostType.getName());
        count = parFinanceCostTypeMapper.countByExample(parFinanceCostTypeExample);
        if (count > 0) {
            returnResult.setMsg("费用类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parFinanceCostType.setCostTypeId(RandomGUID.getRandomGUID());
        parFinanceCostType.setCreater(pricipalUser.getUserCnName());
        parFinanceCostType.setCreateTime(new Date());
        parFinanceCostType.setUpdater(pricipalUser.getUserCnName());
        parFinanceCostType.setUpdateTime(new Date());
        count = parFinanceCostTypeMapper.insert(parFinanceCostType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parFinanceCostType.getName() + "] 费用类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，费用类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParFinanceCostType 
     * @Description: TODO(修改费用类型信息) 
     * @param @param parFinanceCostType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_edit")
    public Object editParFinanceCostType(ParFinanceCostType parFinanceCostType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParFinanceCostTypeExample parFinanceCostTypeExample = new ParFinanceCostTypeExample();
        int count = 0;
        //防止费用类型名称重复
        parFinanceCostTypeExample.createCriteria().andNameEqualTo(parFinanceCostType.getName()).andCostTypeIdNotEqualTo(parFinanceCostType.getCostTypeId());
        count = parFinanceCostTypeMapper.countByExample(parFinanceCostTypeExample);
        if (count > 0) {
            returnResult.setMsg("费用类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parFinanceCostType.setUpdater(pricipalUser.getUserCnName());
        parFinanceCostType.setUpdateTime(new Date());
        count = parFinanceCostTypeMapper.updateByPrimaryKeySelective(parFinanceCostType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parFinanceCostType.getName() + "] 费用类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，费用类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParFinanceCostType 
     * @Description: TODO(删除费用类型) 
     * @param @param costTypeIds names
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_del")
    public Object delParFinanceCostType(List<String> costTypeIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (costTypeIds.size() > 0) {
            ParFinanceCostTypeExample parFinanceCostTypeExample = new ParFinanceCostTypeExample();
            parFinanceCostTypeExample.createCriteria().andCostTypeIdIn(costTypeIds);
            count = parFinanceCostTypeMapper.deleteByExample(parFinanceCostTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(names, ",") + " ]费用类型信息");
            } else {
                returnResult.setMsg("发生未知错误，费用类型信息删除失败");
            }
        }
        return returnResult;
    }
}
