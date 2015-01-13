/**
 * @Title: ParComNatureService.java 
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
import com.glacier.frame.dao.basicdatas.ParComNatureMapper; 
import com.glacier.frame.dto.query.basicdatas.ParComNatureQueryDTO;
import com.glacier.frame.entity.basicdatas.ParComNature;
import com.glacier.frame.entity.basicdatas.ParComNatureExample;
import com.glacier.frame.entity.basicdatas.ParComNatureExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName:  ParComNatureService
 * @Description: TODO(公司性质Service)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-8  下午3:00:01
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParComNatureService {
 
	@Autowired
    private ParComNatureMapper parComNatureMapper;
	  
	 /***
	  * @Title: getParComNature  
	  * @Description: TODO(根据id获取公司性质)  
	  * @param @param ParComNatureId
	  * @param @return    设定文件  
	  * @return Object    返回类型  
	  * @throws
	  */
    public Object getParComNature(String ParComNatureId) {
        return parComNatureMapper.selectByPrimaryKey(ParComNatureId);
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
    public Object listAsGrid(JqPager jqPager, ParComNatureQueryDTO parComNatureQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParComNatureExample parComNatureExample = new ParComNatureExample(); 
        Criteria queryCriteria = parComNatureExample.createCriteria();
        parComNatureQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息 
        	parComNatureExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parComNatureExample.setLimitEnd(jqPager.getRows());
        }
         if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	 parComNatureExample.setOrderByClause(jqPager.getOrderBy("temp_par_com_nature_"));
        } 
        List<ParComNature>  carrierCarTypeList = parComNatureMapper.selectByExample(parComNatureExample); // 查询所有列表
        int total = parComNatureMapper.countByExample(parComNatureExample); // 查询总页数
        returnResult.setRows(carrierCarTypeList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
     /**
      * 
      * @Title: addParComNature  
      * @Description: TODO(新增公司性质)  
      * @param @param ParComNature
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SuppliersNatureList_add")
    public Object addParComNature(ParComNature parComNature) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParComNatureExample ParComNatureExample = new ParComNatureExample();
        int count = 0;
        // 防止名称重复
        ParComNatureExample.createCriteria().andNatureNameEqualTo(parComNature.getNatureName());
        count = parComNatureMapper.countByExample(ParComNatureExample);
        if (count > 0) {
            returnResult.setMsg("公司性质名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parComNature.setNatureId(RandomGUID.getRandomGUID());
        parComNature.setCreater(pricipalUser.getUserCnName());
        parComNature.setCreateTime(new Date());
        parComNature.setUpdater(pricipalUser.getUserCnName());
        parComNature.setUpdateTime(new Date());
        count = parComNatureMapper.insert(parComNature);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，信息保存失败");
        }
        return returnResult;
    }
    
     /** 
      * @Title: editParComNature  
      * @Description: TODO(这修改公司性质信息)  
      * @param @param ParComNature
      * @param @return    设定文件  
      * @return Object    返回类型  
      * @throws
      */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersNatureList_edit")
    public Object editParComNature(ParComNature parComNature) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0; 
        parComNature.setUpdater(pricipalUser.getUserCnName());
        parComNature.setUpdateTime(new Date());
        count = parComNatureMapper.updateByPrimaryKeySelective(parComNature);
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
     * @param @param ParComNatureIds
     * @param @param parCompanyNames
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */
    @Transactional(readOnly = false) 
    @MethodLog(opera = "SuppliersNatureList_del")
    public Object delSuppliersNature(List<String> parComNatureIds, List<String> parCompanyNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (parComNatureIds.size() > 0) {
        	ParComNatureExample ParComNatureExample = new ParComNatureExample();
        	ParComNatureExample.createCriteria().andNatureIdIn(parComNatureIds);
            count = parComNatureMapper.deleteByExample(ParComNatureExample);
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
