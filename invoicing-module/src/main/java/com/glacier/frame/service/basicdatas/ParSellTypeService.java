/**
 * @Title: ParSellTypeService.java 
 * @Package com.glacier.global.service.ParSellType
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
import com.glacier.frame.dao.basicdatas.ParSellTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParSellTypeQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParSellType;
import com.glacier.frame.entity.basicdatas.ParSellTypeExample;
import com.glacier.frame.entity.basicdatas.ParSellTypeExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParSellTypeService
 * @Description: TODO(销售类型表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParSellTypeService {

    @Autowired
    private ParSellTypeMapper parSellTypeMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有销售类型信息) 
     * @param @param jqPager ParSellTypeQueryDTO SellTypeQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParSellTypeQueryDTO parSellTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSellTypeExample parSellTypeExample = new ParSellTypeExample(); 
        Criteria queryCriteria = parSellTypeExample.createCriteria();
        parSellTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parSellTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parSellTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parSellTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_sell_type_"));
        }
        List<ParSellType>  parSellTypeList = parSellTypeMapper.selectByExample(parSellTypeExample); // 查询所有销售类型列表
        int total = parSellTypeMapper.countByExample(parSellTypeExample); // 查询总页数
        returnResult.setRows(parSellTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParSellType 
     * @Description: TODO(根据销售类型Id获取销售类型信息) 
     * @param @param parSellTypeId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParSellType(String parSellTypeId) {
        ParSellType parSellType = parSellTypeMapper.selectByPrimaryKey(parSellTypeId);
        return parSellType;
    }
    
    /**
     * @Title: addParSellType 
     * @Description: TODO(新增销售类型) 
     * @param @param parSellType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellTypeList_add")
    public Object addParSellType(ParSellType parSellType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSellTypeExample parSellTypeExample = new ParSellTypeExample();
        int count = 0;
        // 防止销售类型名称重复
        parSellTypeExample.createCriteria().andSellTypeNameEqualTo(parSellType.getSellTypeName());
        count = parSellTypeMapper.countByExample(parSellTypeExample);
        if (count > 0) {
            returnResult.setMsg("销售类型名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parSellType.setSellTypeId(RandomGUID.getRandomGUID());
        parSellType.setCreater(pricipalUser.getUserCnName());
        parSellType.setCreateTime(new Date());
        parSellType.setUpdater(pricipalUser.getUserCnName());
        parSellType.setUpdateTime(new Date());
        count = parSellTypeMapper.insert(parSellType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSellType.getSellTypeName() + "] 销售类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，销售类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParSellType 
     * @Description: TODO(修改销售类型信息) 
     * @param @param parSellType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellTypeList_edit")
    public Object editParSellType(ParSellType parSellType) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSellTypeExample parSellTypeExample = new ParSellTypeExample();
        int count = 0;
        //防止销售类型名称重复
        parSellTypeExample.createCriteria().andSellTypeNameEqualTo(parSellType.getSellTypeName()).andSellTypeIdNotEqualTo(parSellType.getSellTypeId());
        count = parSellTypeMapper.countByExample(parSellTypeExample);
        if (count > 0) {
            returnResult.setMsg("销售类型名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parSellType.setUpdater(pricipalUser.getUserCnName());
        parSellType.setUpdateTime(new Date());
        count = parSellTypeMapper.updateByPrimaryKeySelective(parSellType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSellType.getSellTypeName() + "] 销售类型信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，销售类型信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParSellType 
     * @Description: TODO(删除销售类型) 
     * @param @param SellTypeIds SellTypeName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellTypeList_del")
    public Object delParSellType(List<String> sellTypeIds, List<String> sellTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (sellTypeIds.size() > 0) {
            ParSellTypeExample parSellTypeExample = new ParSellTypeExample();
            parSellTypeExample.createCriteria().andSellTypeIdIn(sellTypeIds);
            count = parSellTypeMapper.deleteByExample(parSellTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(sellTypeNames, ",") + " ]销售类型信息");
            } else {
                returnResult.setMsg("发生未知错误，销售类型信息删除失败");
            }
        }
        return returnResult;
    }
}
