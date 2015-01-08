/**
 * @Title: ParSuppliersNatureService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-8 下午3:00:01 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-8
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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
import com.glacier.frame.dao.basicdatas.ParSuppliersNatureMapper; 
import com.glacier.frame.dto.query.basicdatas.ParSuppliersNatureQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersNature;
import com.glacier.frame.entity.basicdatas.ParSuppliersNatureExample;
import com.glacier.frame.entity.basicdatas.ParSuppliersNatureExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParSuppliersNatureService
 * @Description: TODO(公司性质ervice)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-8  下午3:00:01
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParSuppliersNatureService {
 
	@Autowired
    private ParSuppliersNatureMapper parSuppliersNatureMapper;
	  
	 /***
	  * @Title: getParSuppliersNature  
	  * @Description: TODO(根据id获取公司性质)  
	  * @param @param ParSuppliersNatureId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getParSuppliersNature(String ParSuppliersNatureId) {
        return parSuppliersNatureMapper.selectByPrimaryKey(ParSuppliersNatureId);
    } 
    
    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有公司性质信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */ 
    public Object listAsGrid(JqPager jqPager, ParSuppliersNatureQueryDTO parSuppliersNatureQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParSuppliersNatureExample parSuppliersNatureExample = new ParSuppliersNatureExample(); 
        Criteria queryCriteria = parSuppliersNatureExample.createCriteria();
        parSuppliersNatureQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	parSuppliersNatureExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parSuppliersNatureExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 parSuppliersNatureExample.setOrderByClause(jqPager.getOrderBy("temp_par_suppliers_nature_"));
        } 
        List<ParSuppliersNature>  carrierCarTypeList = parSuppliersNatureMapper.selectByExample(parSuppliersNatureExample); // 查询所有列表
        int total = parSuppliersNatureMapper.countByExample(parSuppliersNatureExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addParSuppliersNature  
      * @Description: TODO(新增公司性质)  
      * @param @param ParSuppliersNature
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersNatureList_add")
    public Object addParSuppliersNature(ParSuppliersNature parSuppliersNature) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersNatureExample ParSuppliersNatureExample = new ParSuppliersNatureExample();
        int count = 0;
        // 防止名称重复
        ParSuppliersNatureExample.createCriteria().andNatureNameEqualTo(parSuppliersNature.getNatureName());
        count = parSuppliersNatureMapper.countByExample(ParSuppliersNatureExample);
        if (count > 0) {
            returnResult.setMsg("公司性质名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parSuppliersNature.setNatureId(RandomGUID.getRandomGUID());
        parSuppliersNature.setCreater(pricipalUser.getUserCnName());
        parSuppliersNature.setCreateTime(new Date());
        parSuppliersNature.setUpdater(pricipalUser.getUserCnName());
        parSuppliersNature.setUpdateTime(new Date());
        count = parSuppliersNatureMapper.insert(parSuppliersNature);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParSuppliersNature  
      * @Description: TODO(这修改公司性质信息)  
      * @param @param ParSuppliersNature
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersNatureList_edit")
    public Object editParSuppliersNature(ParSuppliersNature parSuppliersNature) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParSuppliersNatureExample ParSuppliersNatureExample = new ParSuppliersNatureExample();
        int count = 0; 
       // 防止名称重复
        ParSuppliersNatureExample.createCriteria().andNatureNameEqualTo(parSuppliersNature.getNatureName());
        count = parSuppliersNatureMapper.countByExample(ParSuppliersNatureExample);
        if (count > 0) {
            returnResult.setMsg("公司性质名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parSuppliersNature.setUpdater(pricipalUser.getUserCnName());
        parSuppliersNature.setUpdateTime(new Date());
        count = parSuppliersNatureMapper.updateByPrimaryKeySelective(parSuppliersNature);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
    /** 
     * @Title: delCarType  
     * @Description: TODO(删除公司性质信息)  
     * @param @param ParSuppliersNatureIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersNatureList_del")
    public Object delSuppliersNature(List<String> parSuppliersNatureIds, List<String> parCompanyNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (parSuppliersNatureIds.size() > 0) {
        	ParSuppliersNatureExample ParSuppliersNatureExample = new ParSuppliersNatureExample();
        	ParSuppliersNatureExample.createCriteria().andNatureIdIn(parSuppliersNatureIds);
            count = parSuppliersNatureMapper.deleteByExample(ParSuppliersNatureExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了公司性质为:[ " + CollectionsUtil.convertToString(parCompanyNames, ",") + " ]的信息");
            } else {
                returnResult.setMsg("发生未知错误，信息删除失败");
            }
        }
        return returnResult;
    }
     
}
