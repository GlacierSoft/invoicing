/**
 * @Title: ParSuppliersGradeService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午2:29:20 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-8
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
import com.glacier.frame.dao.basicdatas.ParSuppliersGradeMapper;
import com.glacier.frame.dto.service.basicdatas.ParSuppliersGradeQueryDTO;

import com.glacier.frame.entity.basicdatas.ParSuppliersGrade;
import com.glacier.frame.entity.basicdatas.ParSuppliersGradeExample;
import com.glacier.frame.entity.basicdatas.ParSuppliersGradeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ParSuppliersGradeService 
 * @Description: TODO(等级信息业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午2:29:20
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParSuppliersGradeService {
	@Autowired
	private ParSuppliersGradeMapper suppliersGradeMapper;

	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取所有等级信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */

	public Object listAsGrid(JqPager jqPager,ParSuppliersGradeQueryDTO suppliersGradeQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParSuppliersGradeExample suppliersGradeExample = new ParSuppliersGradeExample();
		Criteria queryCriteria = suppliersGradeExample.createCriteria();
		suppliersGradeQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			suppliersGradeExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			suppliersGradeExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			suppliersGradeExample.setOrderByClause(jqPager.getOrderBy("temp_par_suppliers_grade_"));
		}
		List<ParSuppliersGrade> suppliersGradeList = suppliersGradeMapper.selectByExample(suppliersGradeExample); // 查询所有会员列表
		int total = suppliersGradeMapper.countByExample(suppliersGradeExample); // 查询总页数
		returnResult.setRows(suppliersGradeList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getSuppliersGrade
	 * @Description: TODO(获取等级对象)
	 * @param @param industryId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getSuppliersGrade(String gradeId) {
		ParSuppliersGrade suppliersGrade = suppliersGradeMapper.selectByPrimaryKey(gradeId);
		return suppliersGrade;
	}

	/**
	 * @Title: addSuppliersGrade
	 * @Description: TODO(新增等级类型)
	 * @param @param suppliersGrade
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "SuppliersGrade_add")
	public Object addSuppliersGrade(ParSuppliersGrade suppliersGrade) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParSuppliersGradeExample suppliersGradeExample = new ParSuppliersGradeExample();
		int count = 0;
		// 防止行业类型名称重复
		suppliersGradeExample.createCriteria().andGradeNameEqualTo(suppliersGrade.getGradeName());
		count = suppliersGradeMapper.countByExample(suppliersGradeExample);
		if (count > 0) {
			returnResult.setMsg("等级名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		suppliersGrade.setGradeId(RandomGUID.getRandomGUID());
		suppliersGrade.setCreater(pricipalUser.getUserCnName());
		suppliersGrade.setCreateTime(new Date());
		suppliersGrade.setUpdater(pricipalUser.getUserCnName());
		suppliersGrade.setUpdateTime(new Date());
		count = suppliersGradeMapper.insert(suppliersGrade);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + suppliersGrade.getGradeName()+ "】 等级信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，等级信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editSuppliersGrade
	 * @Description: TODO(修改行业类型信息)
	 * @param @param suppliersIndustry
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "SuppliersGrade_edit")
	public Object editSuppliersGrade(ParSuppliersGrade suppliersGrade) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParSuppliersGradeExample suppliersGradeExample = new ParSuppliersGradeExample();
		int count = 0;
		// 防止行业类型名称重复
		suppliersGradeExample.createCriteria().andGradeNameEqualTo(suppliersGrade.getGradeName()).andGradeIdNotEqualTo(suppliersGrade.getGradeId());
		count = suppliersGradeMapper.countByExample(suppliersGradeExample);
		if (count > 0) {
			returnResult.setMsg("等级名称重复");
			return returnResult;
		}
		suppliersGrade.setCreater(pricipalUser.getUserCnName());
		suppliersGrade.setCreateTime(new Date());
		suppliersGrade.setUpdater(pricipalUser.getUserCnName());
		suppliersGrade.setUpdateTime(new Date());
		count = suppliersGradeMapper.updateByPrimaryKeySelective(suppliersGrade);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + suppliersGrade.getGradeName()+ "】等级信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，等级信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: delSuppliersGrade
	 * @Description: TODO(删除等级信息)
	 * @param @param gradeIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "SuppliersGrade_del")
	public Object delSuppliersGrade(List<String> gradeIds,List<String> gradeNames) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (gradeIds.size() > 0) {
			ParSuppliersGradeExample suppliersGradeExample = new ParSuppliersGradeExample();
			suppliersGradeExample.createCriteria().andGradeIdIn(gradeIds);
			count = suppliersGradeMapper.deleteByExample(suppliersGradeExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + count+ " 】条等级信息");
			} else {
				returnResult.setMsg("发生未知错误，等级信息删除失败");
			}
		}
		return returnResult;
	}
}