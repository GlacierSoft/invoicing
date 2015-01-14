/**
 * @Title: ParSellReturnReasonService.java 
 * @Package com.glacier.global.service.ParSellReturnReason
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
import com.glacier.frame.dao.basicdatas.ParSellReturnReasonMapper;
import com.glacier.frame.dto.query.basicdatas.ParSellReturnReasonQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParSellReturnReason;
import com.glacier.frame.entity.basicdatas.ParSellReturnReasonExample;
import com.glacier.frame.entity.basicdatas.ParSellReturnReasonExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParSellReturnReasonService
 * @Description: TODO(销售退货原因表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParSellReturnReasonService {

    @Autowired
    private ParSellReturnReasonMapper parSellReturnReasonMapper;
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有销售退货原因信息) 
     * @param @param jqPager ParSellReturnReasonQueryDTO sellReturnReasonQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParSellReturnReasonQueryDTO sellReturnReasonQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSellReturnReasonExample parSellReturnReasonExample = new ParSellReturnReasonExample(); 
        Criteria queryCriteria = parSellReturnReasonExample.createCriteria();
        sellReturnReasonQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
            parSellReturnReasonExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
            parSellReturnReasonExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
            parSellReturnReasonExample.setOrderByClause(jqPager.getOrderBy("temp_par_sell_return_reason_"));
        }
        List<ParSellReturnReason>  parSellReturnReasonList = parSellReturnReasonMapper.selectByExample(parSellReturnReasonExample); // 查询所有销售退货原因列表
        int total = parSellReturnReasonMapper.countByExample(parSellReturnReasonExample); // 查询总页数
        returnResult.setRows(parSellReturnReasonList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getParSellReturnReason 
     * @Description: TODO(根据销售退货原因Id获取销售退货原因信息) 
     * @param @param parSellReturnReasonId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getParSellReturnReason(String parSellReturnReasonId) {
        ParSellReturnReason parSellReturnReason = parSellReturnReasonMapper.selectByPrimaryKey(parSellReturnReasonId);
        return parSellReturnReason;
    }
    
    /**
     * @Title: addParSellReturnReason 
     * @Description: TODO(新增销售退货原因) 
     * @param @param parSellReturnReason
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellReturnReasonList_add")
    public Object addParSellReturnReason(ParSellReturnReason parSellReturnReason) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSellReturnReasonExample parSellReturnReasonExample = new ParSellReturnReasonExample();
        int count = 0;
        // 防止销售退货原因名称重复
        parSellReturnReasonExample.createCriteria().andReturnReasonNameEqualTo(parSellReturnReason.getReturnReasonName());
        count = parSellReturnReasonMapper.countByExample(parSellReturnReasonExample);
        if (count > 0) {
            returnResult.setMsg("销售退货原因名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parSellReturnReason.setReturnReasonId(RandomGUID.getRandomGUID());
        parSellReturnReason.setCreater(pricipalUser.getUserCnName());
        parSellReturnReason.setCreateTime(new Date());
        parSellReturnReason.setUpdater(pricipalUser.getUserCnName());
        parSellReturnReason.setUpdateTime(new Date());
        count = parSellReturnReasonMapper.insert(parSellReturnReason);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSellReturnReason.getReturnReasonName() + "] 销售退货原因信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，销售退货原因信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParSellReturnReason 
     * @Description: TODO(修改销售退货原因信息) 
     * @param @param parSellReturnReason
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellReturnReasonList_edit")
    public Object editParSellReturnReason(ParSellReturnReason parSellReturnReason) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSellReturnReasonExample parSellReturnReasonExample = new ParSellReturnReasonExample();
        int count = 0;
        //防止销售退货原因名称重复
        parSellReturnReasonExample.createCriteria().andReturnReasonNameEqualTo(parSellReturnReason.getReturnReasonName()).andReturnReasonIdNotEqualTo(parSellReturnReason.getReturnReasonId());
        count = parSellReturnReasonMapper.countByExample(parSellReturnReasonExample);
        if (count > 0) {
            returnResult.setMsg("销售退货原因名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parSellReturnReason.setUpdater(pricipalUser.getUserCnName());
        parSellReturnReason.setUpdateTime(new Date());
        count = parSellReturnReasonMapper.updateByPrimaryKeySelective(parSellReturnReason);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parSellReturnReason.getReturnReasonName() + "] 销售退货原因信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，销售退货原因信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParSellReturnReason 
     * @Description: TODO(删除销售退货原因) 
     * @param @param sellReturnReasonIds sellReturnReasonName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SellReturnReasonList_del")
    public Object delParSellReturnReason(List<String> returnReasonIds, List<String> returnReasonNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (returnReasonIds.size() > 0) {
            ParSellReturnReasonExample parSellReturnReasonExample = new ParSellReturnReasonExample();
            parSellReturnReasonExample.createCriteria().andReturnReasonIdIn(returnReasonIds);
            count = parSellReturnReasonMapper.deleteByExample(parSellReturnReasonExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(returnReasonNames, ",") + " ]销售退货原因信息");
            } else {
                returnResult.setMsg("发生未知错误，销售退货原因信息删除失败");
            }
        }
        return returnResult;
    }
}
