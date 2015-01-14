/**
 * @Title: ParSellReturnTypeService.java 
 * @Package com.glacier.global.service.ParSellReturnType
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
import com.glacier.frame.dao.basicdatas.ParSellReturnTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParSellReturnTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParSellReturnType;
import com.glacier.frame.entity.basicdatas.ParSellReturnTypeExample;
import com.glacier.frame.entity.basicdatas.ParSellReturnTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParSellReturnTypeService
 * @Description: TODO(销售退货方式表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParSellReturnTypeService {

    @Autowired
    private ParSellReturnTypeMapper parSellReturnTypeMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有销售退货方式信息) 
     * @param @param jqPager ParSellReturnTypeQueryDTO sellReturnReasonQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParSellReturnTypeQueryDTO sellReturnReasonQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSellReturnTypeExample parSellReturnTypeExample = new ParSellReturnTypeExample(); 
        Criteria queryCriteria = parSellReturnTypeExample.createCriteria();
        sellReturnReasonQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parSellReturnTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parSellReturnTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parSellReturnTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_sell_return_type_"));
        }
        List<ParSellReturnType>  parSellReturnTypeList = parSellReturnTypeMapper.selectByExample(parSellReturnTypeExample); // 查询所有销售退货方式列表
        int total = parSellReturnTypeMapper.countByExample(parSellReturnTypeExample); // 查询总页数
        returnResult.setRows(parSellReturnTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParSellReturnType 
     * @Description: TODO(根据销售退货方式Id获取销售退货方式信息) 
     * @param @param parSellReturnTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParSellReturnType(String parSellReturnTypeId) {
        ParSellReturnType parSellReturnType = parSellReturnTypeMapper.selectByPrimaryKey(parSellReturnTypeId);
        return parSellReturnType;
    }
    
    /**
     * @Title: addParSellReturnType 
     * @Description: TODO(新增销售退货方式) 
     * @param @param parSellReturnType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellReturnReasonList_add")
    public Object addParSellReturnType(ParSellReturnType parSellReturnType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSellReturnTypeExample parSellReturnTypeExample = new ParSellReturnTypeExample();
        int count = 0;
        // 防止销售退货方式名称重复
        parSellReturnTypeExample.createCriteria().andReturnTypeNameEqualTo(parSellReturnType.getReturnTypeName());
        count = parSellReturnTypeMapper.countByExample(parSellReturnTypeExample);
        if (count > 0) {
            returnResult.setMsg("销售退货方式名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parSellReturnType.setReturnTypeId(RandomGUID.getRandomGUID());
        parSellReturnType.setCreater(pricipalUser.getUserCnName());
        parSellReturnType.setCreateTime(new Date());
        parSellReturnType.setUpdater(pricipalUser.getUserCnName());
        parSellReturnType.setUpdateTime(new Date());
        count = parSellReturnTypeMapper.insert(parSellReturnType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSellReturnType.getReturnTypeName() + "] 销售退货方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，销售退货方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParSellReturnType 
     * @Description: TODO(修改销售退货方式信息) 
     * @param @param parSellReturnType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellReturnReasonList_edit")
    public Object editParSellReturnType(ParSellReturnType parSellReturnType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSellReturnTypeExample parSellReturnTypeExample = new ParSellReturnTypeExample();
        int count = 0;
        //防止销售退货方式名称重复
        parSellReturnTypeExample.createCriteria().andReturnTypeNameEqualTo(parSellReturnType.getReturnTypeName()).andReturnTypeIdNotEqualTo(parSellReturnType.getReturnTypeId());
        count = parSellReturnTypeMapper.countByExample(parSellReturnTypeExample);
        if (count > 0) {
            returnResult.setMsg("销售退货方式名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parSellReturnType.setUpdater(pricipalUser.getUserCnName());
        parSellReturnType.setUpdateTime(new Date());
        count = parSellReturnTypeMapper.updateByPrimaryKeySelective(parSellReturnType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSellReturnType.getReturnTypeName() + "] 销售退货方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，销售退货方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParSellReturnType 
     * @Description: TODO(删除销售退货方式) 
     * @param @param sellReturnReasonIds sellReturnReasonName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellReturnReasonList_del")
    public Object delParSellReturnType(List<String> returnTypeIds, List<String> returnTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (returnTypeIds.size() > 0) {
            ParSellReturnTypeExample parSellReturnTypeExample = new ParSellReturnTypeExample();
            parSellReturnTypeExample.createCriteria().andReturnTypeIdIn(returnTypeIds);
            count = parSellReturnTypeMapper.deleteByExample(parSellReturnTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(returnTypeNames, ",") + " ]销售退货方式信息");
            } else {
                returnResult.setMsg("发生未知错误，销售退货方式信息删除失败");
            }
        }
        return returnResult;
    }
}
