/**
 * @Title: LoginLogService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date  2014-8-18  下午4:47:36
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.system;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.LoginLogMapper;
import com.glacier.frame.dto.query.system.LoginlogQueryDTO;
import com.glacier.frame.entity.system.LoginLog;
import com.glacier.frame.entity.system.LoginLogExample;
import com.glacier.frame.entity.system.LoginLogExample.Criteria;
import com.glacier.frame.util.MethodLog;

/***
 * @ClassName:  LoginLogService
 * @Description: TODO(登录日志)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午4:47:36
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class LoginLogService {
	
	@Autowired
	private LoginLogMapper loginLogMapper;
	
	/**
	 * @Title: listAsGrid 
	 * @Description: TODO(以表格结构展示登录日志列表) 
	 * @param  @param pager
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
	public Object listAsGrid(LoginlogQueryDTO loginlogQueryDTO,JqPager pager){
		JqGridReturn returnResult = new JqGridReturn();
		LoginLogExample loginLogExample = new LoginLogExample();
		Criteria queryCriteria = loginLogExample.createCriteria();
		loginlogQueryDTO.setQueryCondition(queryCriteria);
		if(null != pager.getPage() && null != pager.getRows()){// 设置排序信息
			loginLogExample.setLimitStart((pager.getPage()-1)*pager.getRows());
			loginLogExample.setLimitEnd(pager.getRows());
		}
		if(StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())){// 设置排序信息
			loginLogExample.setOrderByClause(pager.getOrderBy("temp_loginlog_"));
		}
		// 高级检索
		List<LoginLog> loginLogs = loginLogMapper.selectByExample(loginLogExample);// 查询所有登录日志列表
		int total = loginLogMapper.countByExample(loginLogExample);// 查询总页数
		returnResult.setRows(loginLogs);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}
	
	/**
	 * @Title: getLoginLog 
	 * @Description: TODO(根据d登录日志的id进行查询) 
	 * @param  @param creditId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	public Object getLoginLog(String loginlogId){
		LoginLog loginLog = loginLogMapper.selectByPrimaryKey(loginlogId);
        return loginLog;
	}
	
	/**
	 * @Title: delLoginLog 
	 * @Description: TODO(删除登录日志) 
	 * @param  @param loginlogId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera="LoginlogList_del")
	public Object delLoginLog(List<String> loginlogIds , List<String> loginUsers){
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if(loginlogIds.size() > 0){
			LoginLogExample loginLogExample = new LoginLogExample();
			loginLogExample.createCriteria().andLoginlogIdIn(loginlogIds);
			count = loginLogMapper.deleteByExample(loginLogExample);
			if(count >0){
				returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(loginUsers, ",") + " ]操作");
				returnResult.setSuccess(true);
			}else{
				returnResult.setMsg("发生未知错误，登录日志信息删除失败");
			}
		}
		return returnResult;
	}
}
