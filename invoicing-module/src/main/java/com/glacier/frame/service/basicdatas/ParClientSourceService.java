/**
 * @Title: ParClientSourceService.java 
 * @Package com.glacier.global.service.ParClientSource
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
import com.glacier.frame.dao.basicdatas.ParClientSourceMapper;
import com.glacier.frame.dto.query.basicdatas.ParClientSourceQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.ParClientSource;
import com.glacier.frame.entity.basicdatas.ParClientSourceExample;
import com.glacier.frame.entity.basicdatas.ParClientSourceExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  ParClientSourceService
 * @Description: TODO(客户来源表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParClientSourceService {

	@Autowired
	private ParClientSourceMapper parClientSourceMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有客户来源信息) 
     * @param @param jqPager ParClientSourceQueryDTO clientLevelQueryDTO
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, ParClientSourceQueryDTO clientLevelQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        ParClientSourceExample parClientSourceExample = new ParClientSourceExample(); 
        Criteria queryCriteria = parClientSourceExample.createCriteria();
        clientLevelQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	parClientSourceExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	parClientSourceExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	parClientSourceExample.setOrderByClause(jqPager.getOrderBy("temp_par_client_source_"));
        }
        List<ParClientSource>  parClientSourceList = parClientSourceMapper.selectByExample(parClientSourceExample); // 查询所有客户来源列表
        int total = parClientSourceMapper.countByExample(parClientSourceExample); // 查询总页数
        returnResult.setRows(parClientSourceList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: getClientSourceCombo 
     * @Description: TODO(根据客户来源Id查找客户来源信息或查询全部,用于Combo的数据绑定) 
     * @param  @param clientSourceId
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public Object getClientSourceCombo(String clientSourceId) {
    	ParClientSourceExample parClientSourceExample = new ParClientSourceExample();
        if (StringUtils.isNotBlank(clientSourceId)) {// 可以根据ID查找，如果参数Id为空，则查找所有的数据
        	parClientSourceExample.createCriteria().andClientSourceIdEqualTo(clientSourceId);
        }
        List<ParClientSource> parClientSources = parClientSourceMapper.selectByExample(parClientSourceExample);
        return JackJson.fromObjectToJson(parClientSources);
    }
    
    /**
	 * @Title: getParClientSource 
	 * @Description: TODO(根据客户来源Id获取客户来源信息) 
	 * @param @param parClientSourceId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getParClientSource(String parClientSourceId) {
    	ParClientSource parClientSource = parClientSourceMapper.selectByPrimaryKey(parClientSourceId);
        return parClientSource;
    }
    
    /**
     * @Title: addParClientSource 
     * @Description: TODO(新增客户来源) 
     * @param @param parClientSource
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientSourceList_add")
    public Object addParClientSource(ParClientSource parClientSource) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientSourceExample parClientSourceExample = new ParClientSourceExample();
        int count = 0;
        // 防止客户来源名称重复
        parClientSourceExample.createCriteria().andClientSourceNameEqualTo(parClientSource.getClientSourceName());
        count = parClientSourceMapper.countByExample(parClientSourceExample);
        if (count > 0) {
            returnResult.setMsg("客户来源名称重复");
            returnResult.setSuccess(false);
            return returnResult;
        }
        parClientSource.setClientSourceId(RandomGUID.getRandomGUID());
        parClientSource.setCreater(pricipalUser.getUserCnName());
        parClientSource.setCreateTime(new Date());
        parClientSource.setUpdater(pricipalUser.getUserCnName());
        parClientSource.setUpdateTime(new Date());
        count = parClientSourceMapper.insert(parClientSource);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientSource.getClientSourceName() + "] 客户来源信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户来源信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParClientSource 
     * @Description: TODO(修改客户来源信息) 
     * @param @param parClientSource
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientSourceList_edit")
    public Object editParClientSource(ParClientSource parClientSource) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParClientSourceExample parClientSourceExample = new ParClientSourceExample();
        int count = 0;
        //防止客户来源名称重复
        parClientSourceExample.createCriteria().andClientSourceNameEqualTo(parClientSource.getClientSourceName()).andClientSourceIdNotEqualTo(parClientSource.getClientSourceId());
        count = parClientSourceMapper.countByExample(parClientSourceExample);
        if (count > 0) {
            returnResult.setMsg("客户来源名称重复");
            return returnResult;
        }
        //更新更新人和更新时间
        parClientSource.setUpdater(pricipalUser.getUserCnName());
        parClientSource.setUpdateTime(new Date());
        count = parClientSourceMapper.updateByPrimaryKeySelective(parClientSource);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parClientSource.getClientSourceName() + "] 客户来源信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，客户来源信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delParClientSource 
     * @Description: TODO(删除客户来源) 
     * @param @param clientLevelIds clientLevelName
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ClientSourceList_del")
    public Object delParClientSource(List<String> clientLevelIds, List<String> clientLevelName) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (clientLevelIds.size() > 0) {
        	ParClientSourceExample parClientSourceExample = new ParClientSourceExample();
        	parClientSourceExample.createCriteria().andClientSourceIdIn(clientLevelIds);
            count = parClientSourceMapper.deleteByExample(parClientSourceExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(clientLevelName, ",") + " ]客户来源信息");
            } else {
                returnResult.setMsg("发生未知错误，客户来源信息删除失败");
            }
        }
        return returnResult;
    }
}
