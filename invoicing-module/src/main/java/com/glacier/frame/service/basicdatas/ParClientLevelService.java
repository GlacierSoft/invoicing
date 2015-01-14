/**
 * @Title: ParClientLevelService.java 
 * @Package com.glacier.global.service.ParClientLevel
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
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParClientLevelMapper;
import com.glacier.frame.dto.query.basicdatas.ParClientLevelQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParClientLevel;
import com.glacier.frame.entity.basicdatas.ParClientLevelExample;
import com.glacier.frame.entity.basicdatas.ParClientLevelExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParClientLevelService
 * @Description: TODO(客户等级表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParClientLevelService {

	@Autowired
	private ParClientLevelMapper parClientLevelMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有客户等级信息) 
     * @param @param jqPager ParClientLevelQueryDTO clientLevelQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParClientLevelQueryDTO clientLevelQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParClientLevelExample parClientLevelExample = new ParClientLevelExample(); 
        Criteria queryCriteria = parClientLevelExample.createCriteria();
        clientLevelQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parClientLevelExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parClientLevelExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parClientLevelExample.setOrderByClause(jqPager.getOrderBy("temp_par_client_level_"));
        }
        List<ParClientLevel>  parClientLevelList = parClientLevelMapper.selectByExample(parClientLevelExample); // 查询所有客户等级列表
        int total = parClientLevelMapper.countByExample(parClientLevelExample); // 查询总页数
        returnResult.setRows(parClientLevelList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getClientLevelCombo 
     * @Description: TODO(根据客户档案Id查找客户级别信息或查询全部,用于Combo的数据绑定) 
     * @param  @param clientLevelId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getClientLevelCombo(String clientLevelId) {
    	ParClientLevelExample parClientExample = new ParClientLevelExample();
        parClientExample.createCriteria().andEnabledEqualTo("enable");
        List<ParClientLevel> parClientLevels = parClientLevelMapper.selectByExample(parClientExample);
        return JackJson.fromObjectToJson(parClientLevels);
    }
    
    /**
	 * @Title: getParClientLevel 
	 * @Description: TODO(根据客户等级Id获取客户等级信息) 
	 * @param @param parClientLevelId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParClientLevel(String parClientLevelId) {
    	ParClientLevel parClientLevel = parClientLevelMapper.selectByPrimaryKey(parClientLevelId);
        return parClientLevel;
    }
    
    /**
     * @Title: addParClientLevel 
     * @Description: TODO(新增客户等级) 
     * @param @param parClientLevel
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientLevelList_add")
    public Object addParClientLevel(ParClientLevel parClientLevel) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientLevelExample parClientLevelExample = new ParClientLevelExample();
        int count = 0;
        // 防止客户等级名称重复
        parClientLevelExample.createCriteria().andClientLevelNameEqualTo(parClientLevel.getClientLevelName());
        count = parClientLevelMapper.countByExample(parClientLevelExample);
        if (count > 0) {
            returnResult.setMsg("客户等级名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parClientLevel.setClientLevelId(RandomGUID.getRandomGUID());
        parClientLevel.setCreater(pricipalUser.getUserCnName());
        parClientLevel.setCreateTime(new Date());
        parClientLevel.setUpdater(pricipalUser.getUserCnName());
        parClientLevel.setUpdateTime(new Date());
        count = parClientLevelMapper.insert(parClientLevel);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientLevel.getClientLevelName() + "] 客户等级信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户等级信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParClientLevel 
     * @Description: TODO(修改客户等级信息) 
     * @param @param parClientLevel
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientLevelList_edit")
    public Object editParClientLevel(ParClientLevel parClientLevel) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientLevelExample parClientLevelExample = new ParClientLevelExample();
        int count = 0;
        //防止客户等级名称重复
        parClientLevelExample.createCriteria().andClientLevelNameEqualTo(parClientLevel.getClientLevelName()).andClientLevelIdNotEqualTo(parClientLevel.getClientLevelId());
        count = parClientLevelMapper.countByExample(parClientLevelExample);
        if (count > 0) {
            returnResult.setMsg("客户等级名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parClientLevel.setUpdater(pricipalUser.getUserCnName());
        parClientLevel.setUpdateTime(new Date());
        count = parClientLevelMapper.updateByPrimaryKeySelective(parClientLevel);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientLevel.getClientLevelName() + "] 客户等级信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户等级信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParClientLevel 
     * @Description: TODO(删除客户等级) 
     * @param @param clientLevelIds clientLevelName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientLevelList_del")
    public Object delParClientLevel(List<String> clientLevelIds, List<String> clientLevelName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientLevelIds.size() > 0) {
        	ParClientLevelExample parClientLevelExample = new ParClientLevelExample();
        	parClientLevelExample.createCriteria().andClientLevelIdIn(clientLevelIds);
            count = parClientLevelMapper.deleteByExample(parClientLevelExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(clientLevelName, ",") + " ]客户等级信息");
            } else {
                returnResult.setMsg("发生未知错误，客户等级信息删除失败");
            }
        }
        return returnResult;
    }
}
