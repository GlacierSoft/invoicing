/**
 * @Title: ParPurchaseReturnReasonService.java 
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
import com.glacier.frame.dao.basicdatas.ParPurchaseReturnReasonMapper;
import com.glacier.frame.dto.service.basicdatas.ParPurchaseReturnReasonQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnReason;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnReasonExample;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnReasonExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ParPurchaseReturnReasonService 
 * @Description: TODO(退货类型业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-9 上午9:29:30
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParPurchaseReturnReasonService {
   
	@Autowired
	private ParPurchaseReturnReasonMapper parPurchaseReturnReasonMapper;

	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取所有脱货类型信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */

	public Object listAsGrid(JqPager jqPager,ParPurchaseReturnReasonQueryDTO parPurchaseReturnReasonQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParPurchaseReturnReasonExample parPurchaseReturnReasonExample = new ParPurchaseReturnReasonExample();
		Criteria queryCriteria = parPurchaseReturnReasonExample.createCriteria();
		parPurchaseReturnReasonQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			parPurchaseReturnReasonExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			parPurchaseReturnReasonExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			parPurchaseReturnReasonExample.setOrderByClause(jqPager.getOrderBy("temp_par_purchase_return_reason_"));
		}
		List<ParPurchaseReturnReason> parPurchaseReturnReasonList = parPurchaseReturnReasonMapper.selectByExample(parPurchaseReturnReasonExample); // 查询所有会员列表
		int total = parPurchaseReturnReasonMapper.countByExample(parPurchaseReturnReasonExample); // 查询总页数
		returnResult.setRows(parPurchaseReturnReasonList);
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
	public Object getReturnReason(String parPurchaseReturnReasonId) {
		ParPurchaseReturnReason parPurchaseReturnReason = parPurchaseReturnReasonMapper.selectByPrimaryKey(parPurchaseReturnReasonId);
		return parPurchaseReturnReason;
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
	public Object addReturnReason(ParPurchaseReturnReason parPurchaseReturnReason) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParPurchaseReturnReasonExample parPurchaseReturnReasonExample = new ParPurchaseReturnReasonExample();
		int count = 0;
		// 防止行业类型名称重复
		parPurchaseReturnReasonExample.createCriteria().andNameEqualTo(parPurchaseReturnReason.getName());
		count = parPurchaseReturnReasonMapper.countByExample(parPurchaseReturnReasonExample);
		if (count > 0) {
			returnResult.setMsg("退货类型名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		parPurchaseReturnReason.setReturnReasonId(RandomGUID.getRandomGUID());
		parPurchaseReturnReason.setCreater(pricipalUser.getUserCnName());
		parPurchaseReturnReason.setCreateTime(new Date());
		parPurchaseReturnReason.setUpdater(pricipalUser.getUserCnName());
		parPurchaseReturnReason.setUpdateTime(new Date());
		count = parPurchaseReturnReasonMapper.insert(parPurchaseReturnReason);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + parPurchaseReturnReason.getName()+ "】 退货类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，退货类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editReturnReason
	 * @Description: TODO(修改退货类型类型信息)
	 * @param @param parPurchaseReturnReason
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ReturnReason_edit")
	public Object editReturnReason(ParPurchaseReturnReason parPurchaseReturnReason) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParPurchaseReturnReasonExample parPurchaseReturnReasonExample = new ParPurchaseReturnReasonExample();
		int count = 0;
		// 防止行业类型名称重复
		parPurchaseReturnReasonExample.createCriteria().andNameEqualTo(parPurchaseReturnReason.getName()).andReturnReasonIdNotEqualTo(parPurchaseReturnReason.getReturnReasonId());
		count = parPurchaseReturnReasonMapper.countByExample(parPurchaseReturnReasonExample);
		if (count > 0) {
			returnResult.setMsg("退货类型名称重复");
			return returnResult;
		}
		parPurchaseReturnReason.setUpdater(pricipalUser.getUserCnName());
		parPurchaseReturnReason.setUpdateTime(new Date());
		count = parPurchaseReturnReasonMapper.updateByPrimaryKeySelective(parPurchaseReturnReason);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + parPurchaseReturnReason.getName()+ "】退货类型信息已保存");
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
	public Object delReturnReason(List<String> parPurchaseReturnReasonIds,List<String> names) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (parPurchaseReturnReasonIds.size() > 0) {
			ParPurchaseReturnReasonExample parPurchaseReturnReasonExample = new ParPurchaseReturnReasonExample();
			parPurchaseReturnReasonExample.createCriteria().andReturnReasonIdIn(parPurchaseReturnReasonIds);
			count = parPurchaseReturnReasonMapper.deleteByExample(parPurchaseReturnReasonExample);
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