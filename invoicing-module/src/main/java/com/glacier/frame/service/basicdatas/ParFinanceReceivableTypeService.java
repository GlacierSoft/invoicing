/**
 * @Title: ParFinanceReceivableTypeService.java 
 * @Package com.glacier.global.service.ParFinanceReceivableType
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
import com.glacier.frame.dao.basicdatas.ParFinanceReceivableTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParFinanceReceivableTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParFinanceReceivableType;
import com.glacier.frame.entity.basicdatas.ParFinanceReceivableTypeExample;
import com.glacier.frame.entity.basicdatas.ParFinanceReceivableTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParFinanceReceivableTypeService
 * @Description: TODO(应收类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParFinanceReceivableTypeService {

    @Autowired
    private ParFinanceReceivableTypeMapper parFinanceReceivableTypeMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有应收类型信息) 
     * @param @param jqPager ParFinanceReceivableTypeQueryDTO financeCostTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParFinanceReceivableTypeQueryDTO financeCostTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParFinanceReceivableTypeExample parFinanceReceivableTypeExample = new ParFinanceReceivableTypeExample(); 
        Criteria queryCriteria = parFinanceReceivableTypeExample.createCriteria();
        financeCostTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parFinanceReceivableTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parFinanceReceivableTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parFinanceReceivableTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_finance_receivable_type_"));
        }
        List<ParFinanceReceivableType>  parFinanceReceivableTypeList = parFinanceReceivableTypeMapper.selectByExample(parFinanceReceivableTypeExample); // 查询所有应收类型列表
        int total = parFinanceReceivableTypeMapper.countByExample(parFinanceReceivableTypeExample); // 查询总页数
        returnResult.setRows(parFinanceReceivableTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParFinanceReceivableType 
     * @Description: TODO(根据应收类型Id获取应收类型信息) 
     * @param @param parFinanceReceivableTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParFinanceReceivableType(String parFinanceReceivableTypeId) {
        ParFinanceReceivableType parFinanceReceivableType = parFinanceReceivableTypeMapper.selectByPrimaryKey(parFinanceReceivableTypeId);
        return parFinanceReceivableType;
    }
    
    /**
     * @Title: addParFinanceReceivableType 
     * @Description: TODO(新增应收类型) 
     * @param @param parFinanceReceivableType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_add")
    public Object addParFinanceReceivableType(ParFinanceReceivableType parFinanceReceivableType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParFinanceReceivableTypeExample parFinanceReceivableTypeExample = new ParFinanceReceivableTypeExample();
        int count = 0;
        // 防止应收类型名称重复
        parFinanceReceivableTypeExample.createCriteria().andNameEqualTo(parFinanceReceivableType.getName());
        count = parFinanceReceivableTypeMapper.countByExample(parFinanceReceivableTypeExample);
        if (count > 0) {
            returnResult.setMsg("应收类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parFinanceReceivableType.setReceivableTypeId(RandomGUID.getRandomGUID());
        parFinanceReceivableType.setCreater(pricipalUser.getUserCnName());
        parFinanceReceivableType.setCreateTime(new Date());
        parFinanceReceivableType.setUpdater(pricipalUser.getUserCnName());
        parFinanceReceivableType.setUpdateTime(new Date());
        count = parFinanceReceivableTypeMapper.insert(parFinanceReceivableType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parFinanceReceivableType.getName() + "] 应收类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，应收类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParFinanceReceivableType 
     * @Description: TODO(修改应收类型信息) 
     * @param @param parFinanceReceivableType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_edit")
    public Object editParFinanceReceivableType(ParFinanceReceivableType parFinanceReceivableType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParFinanceReceivableTypeExample parFinanceReceivableTypeExample = new ParFinanceReceivableTypeExample();
        int count = 0;
        //防止应收类型名称重复
        parFinanceReceivableTypeExample.createCriteria().andNameEqualTo(parFinanceReceivableType.getName()).andReceivableTypeIdNotEqualTo(parFinanceReceivableType.getReceivableTypeId());
        count = parFinanceReceivableTypeMapper.countByExample(parFinanceReceivableTypeExample);
        if (count > 0) {
            returnResult.setMsg("应收类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parFinanceReceivableType.setUpdater(pricipalUser.getUserCnName());
        parFinanceReceivableType.setUpdateTime(new Date());
        count = parFinanceReceivableTypeMapper.updateByPrimaryKeySelective(parFinanceReceivableType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parFinanceReceivableType.getName() + "] 应收类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，应收类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParFinanceReceivableType 
     * @Description: TODO(删除应收类型) 
     * @param @param receivableTypeIds names
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "FinanceCostTypeList_del")
    public Object delParFinanceReceivableType(List<String> receivableTypeIds, List<String> names) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (receivableTypeIds.size() > 0) {
            ParFinanceReceivableTypeExample parFinanceReceivableTypeExample = new ParFinanceReceivableTypeExample();
            parFinanceReceivableTypeExample.createCriteria().andReceivableTypeIdIn(receivableTypeIds);
            count = parFinanceReceivableTypeMapper.deleteByExample(parFinanceReceivableTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(names, ",") + " ]应收类型信息");
            } else {
                returnResult.setMsg("发生未知错误，应收类型信息删除失败");
            }
        }
        return returnResult;
    }
}
