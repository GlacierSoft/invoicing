/**
 * @Title: ParReturnReasonService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-9 上午9:29:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-9
				修改人：xichao.dong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：xichao.dong
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

import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.ParReturnReasonMapper;
import com.glacier.frame.dto.service.basicdatas.ParReturnReasonQueryDTO;
import com.glacier.frame.entity.basicdatas.ParReturnReason;
import com.glacier.frame.entity.basicdatas.ParReturnReasonExample;
import com.glacier.frame.entity.basicdatas.ParReturnReasonExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ParReturnReasonService 
 * @Description: TODO(退货类型业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-9 上午9:29:30
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParReturnReasonService {
   
	@Autowired
	private ParReturnReasonMapper returnReasonMapper;

	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取所有脱货类型信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */

	public Object listAsGrid(JqPager jqPager,ParReturnReasonQueryDTO returnReasonQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParReturnReasonExample returnReasonExample = new ParReturnReasonExample();
		Criteria queryCriteria = returnReasonExample.createCriteria();
		returnReasonQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			returnReasonExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			returnReasonExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			returnReasonExample.setOrderByClause(jqPager.getOrderBy("temp_par_return_reason_"));
		}
		List<ParReturnReason> returnReasonList = returnReasonMapper.selectByExample(returnReasonExample); // 查询所有会员列表
		int total = returnReasonMapper.countByExample(returnReasonExample); // 查询总页数
		returnResult.setRows(returnReasonList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getReturnReason
	 * @Description: TODO(获取退货类型对象)
	 * @param @param industryId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getReturnReason(String returnReasonId) {
		ParReturnReason returnReason = returnReasonMapper.selectByPrimaryKey(returnReasonId);
		return returnReason;
	}

	/**
	 * @Title: addReturnReason
	 * @Description: TODO(新增退货类型类型)
	 * @param @param suppliersGrade
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ReturnReason_add")
	public Object addReturnReason(ParReturnReason returnReason) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParReturnReasonExample returnReasonExample = new ParReturnReasonExample();
		int count = 0;
		// 防止行业类型名称重复
		returnReasonExample.createCriteria().andNameEqualTo(returnReason.getName());
		count = returnReasonMapper.countByExample(returnReasonExample);
		if (count > 0) {
			returnResult.setMsg("退货类型名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		returnReason.setReturnReasonId(RandomGUID.getRandomGUID());
		returnReason.setCreater(pricipalUser.getUserCnName());
		returnReason.setCreateTime(new Date());
		returnReason.setUpdater(pricipalUser.getUserCnName());
		returnReason.setUpdateTime(new Date());
		count = returnReasonMapper.insert(returnReason);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + returnReason.getName()+ "】 退货类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，退货类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editReturnReason
	 * @Description: TODO(修改退货类型类型信息)
	 * @param @param returnReason
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ReturnReason_edit")
	public Object editReturnReason(ParReturnReason returnReason) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParReturnReasonExample returnReasonExample = new ParReturnReasonExample();
		int count = 0;
		// 防止行业类型名称重复
		returnReasonExample.createCriteria().andNameEqualTo(returnReason.getName()).andReturnReasonIdNotEqualTo(returnReason.getReturnReasonId());
		count = returnReasonMapper.countByExample(returnReasonExample);
		if (count > 0) {
			returnResult.setMsg("退货类型名称重复");
			return returnResult;
		}
		returnReason.setUpdater(pricipalUser.getUserCnName());
		returnReason.setUpdateTime(new Date());
		count = returnReasonMapper.updateByPrimaryKeySelective(returnReason);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + returnReason.getName()+ "】退货类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，退货类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: delReturnReason
	 * @Description: TODO(删除退货类型信息)
	 * @param @param gradeIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ReturnReason_del")
	public Object delReturnReason(List<String> returnReasonIds,List<String> names) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (returnReasonIds.size() > 0) {
			ParReturnReasonExample returnReasonExample = new ParReturnReasonExample();
			returnReasonExample.createCriteria().andReturnReasonIdIn(returnReasonIds);
			count = returnReasonMapper.deleteByExample(returnReasonExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + count+ " 】条退货类型信息");
			} else {
				returnResult.setMsg("发生未知错误，退货类型信息删除失败");
			}
		}
		return returnResult;
	}
}