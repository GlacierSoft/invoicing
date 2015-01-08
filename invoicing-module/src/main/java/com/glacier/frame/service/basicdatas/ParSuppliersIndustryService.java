/**
 * @Title: ParSuppliersIndustryService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-8 上午10:05:50 
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
import com.glacier.frame.dao.basicdatas.ParSuppliersIndustryMapper;

import com.glacier.frame.dto.service.basicdatas.ParSuppliersIndustryQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersIndustry;
import com.glacier.frame.entity.basicdatas.ParSuppliersIndustryExample;
import com.glacier.frame.entity.basicdatas.ParSuppliersIndustryExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;



/**
 * @ClassName: ParSuppliersIndustryService 
 * @Description: TODO(供应商行业类型业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 上午10:05:50
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParSuppliersIndustryService {
  
	@Autowired
	private ParSuppliersIndustryMapper suppliersIndustryMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有行业类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	
	public Object listAsGrid(JqPager jqPager,ParSuppliersIndustryQueryDTO suppliersIndustryQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParSuppliersIndustryExample suppliersIndustryExample = new ParSuppliersIndustryExample();
		Criteria queryCriteria = suppliersIndustryExample.createCriteria();
		suppliersIndustryQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			suppliersIndustryExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			suppliersIndustryExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			suppliersIndustryExample.setOrderByClause(jqPager.getOrderBy("temp_par_suppliers_industry_"));
		}
		List<ParSuppliersIndustry> carrierCarTypeList = suppliersIndustryMapper.selectByExample(suppliersIndustryExample); // 查询所有会员列表
		int total = suppliersIndustryMapper.countByExample(suppliersIndustryExample); // 查询总页数
		returnResult.setRows(carrierCarTypeList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getSuppliersIndustry
	 * @Description: TODO(获取行业类型对象)
	 * @param @param industryId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getSuppliersIndustry(String industryId) {
		ParSuppliersIndustry suppliersIndustry = suppliersIndustryMapper.selectByPrimaryKey(industryId);
		return suppliersIndustry;
	}

	/**
	 * @Title: addSuppliersIndustry
	 * @Description: TODO(新增行业类型)
	 * @param @param suppliersIndustry
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "SuppliersIndustry_add")
	public Object addSuppliersIndustry(ParSuppliersIndustry suppliersIndustry) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParSuppliersIndustryExample suppliersIndustryExample = new ParSuppliersIndustryExample();
		int count = 0;
		// 防止行业类型名称重复
		suppliersIndustryExample.createCriteria().andIndustryNameEqualTo(suppliersIndustry.getIndustryName());
		count = suppliersIndustryMapper.countByExample(suppliersIndustryExample);
		if (count > 0) {
			returnResult.setMsg("行业类型名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		suppliersIndustry.setIndustryId(RandomGUID.getRandomGUID());
		suppliersIndustry.setCreater(pricipalUser.getUserCnName());
		suppliersIndustry.setCreateTime(new Date());
		suppliersIndustry.setUpdater(pricipalUser.getUserCnName());
		suppliersIndustry.setUpdateTime(new Date());
		count = suppliersIndustryMapper.insert(suppliersIndustry);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + suppliersIndustry.getIndustryName()+ "】 行业类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，行业类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editSuppliersIndustry
	 * @Description: TODO(修改行业类型信息)
	 * @param @param suppliersIndustry
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "SuppliersIndustry_edit")
	public Object editSuppliersIndustry(ParSuppliersIndustry suppliersIndustry) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParSuppliersIndustryExample suppliersIndustryExample = new ParSuppliersIndustryExample();
		int count = 0;
		// 防止行业类型名称重复
		suppliersIndustryExample.createCriteria().andIndustryNameEqualTo(suppliersIndustry.getIndustryName()).andIndustryIdNotEqualTo(suppliersIndustry.getIndustryId());
		count = suppliersIndustryMapper.countByExample(suppliersIndustryExample);
		if (count > 0) {
			returnResult.setMsg("行业类型名称重复");
			return returnResult;
		}
		suppliersIndustry.setCreater(pricipalUser.getUserCnName());
		suppliersIndustry.setCreateTime(new Date());
		suppliersIndustry.setUpdater(pricipalUser.getUserCnName());
		suppliersIndustry.setUpdateTime(new Date());
		count = suppliersIndustryMapper.updateByPrimaryKeySelective(suppliersIndustry);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + suppliersIndustry.getIndustryName()+ "】行业类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，行业类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: delSuppliersIndustry
	 * @Description: TODO(删除行业类型)
	 * @param @param gradeIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "SuppliersIndustry_del")
	public Object delSuppliersIndustry(List<String> industryIds,List<String> industryNames) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (industryIds.size() > 0) {
			ParSuppliersIndustryExample suppliersIndustryExample = new ParSuppliersIndustryExample();
			suppliersIndustryExample.createCriteria().andIndustryIdIn(industryIds);
			count = suppliersIndustryMapper.deleteByExample(suppliersIndustryExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + industryIds.size()+ " 】	条行业类型信息");
			} else {
				returnResult.setMsg("发生未知错误，行业类型信息删除失败");
			}
		}
		return returnResult;
	}
}
