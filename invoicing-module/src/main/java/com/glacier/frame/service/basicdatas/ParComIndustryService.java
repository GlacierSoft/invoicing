/**
 * @Title: ParComIndustryService.java 
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
import com.glacier.frame.dao.basicdatas.ParComIndustryMapper;

import com.glacier.frame.dto.query.basicdatas.ParComIndustryQueryDTO;
import com.glacier.frame.entity.basicdatas.ParComIndustry;
import com.glacier.frame.entity.basicdatas.ParComIndustryExample;
import com.glacier.frame.entity.basicdatas.ParComIndustryExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ParComIndustryService 
 * @Description: TODO(行业类型业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 上午10:05:50
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParComIndustryService {
  
	@Autowired
	private ParComIndustryMapper parComIndustryMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有行业类型信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
	public Object listAsGrid(JqPager jqPager,ParComIndustryQueryDTO parComIndustryQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParComIndustryExample parComIndustryExample = new ParComIndustryExample();
		Criteria queryCriteria = parComIndustryExample.createCriteria();
		parComIndustryQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			parComIndustryExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			parComIndustryExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			parComIndustryExample.setOrderByClause(jqPager.getOrderBy("temp_par_com_industry_"));
		}
		List<ParComIndustry> carrierCarTypeList = parComIndustryMapper.selectByExample(parComIndustryExample); // 查询所有行业类型列表
		int total = parComIndustryMapper.countByExample(parComIndustryExample); // 查询总页数
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
		ParComIndustry parComIndustry = parComIndustryMapper.selectByPrimaryKey(industryId);
		return parComIndustry;
	}

	/**
	 * @Title: addSuppliersIndustry
	 * @Description: TODO(新增行业类型)
	 * @param @param parComIndustry
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ComIndustryList_add")
	public Object addSuppliersIndustry(ParComIndustry parComIndustry) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParComIndustryExample parComIndustryExample = new ParComIndustryExample();
		int count = 0;
		// 防止行业类型名称重复
		parComIndustryExample.createCriteria().andIndustryNameEqualTo(parComIndustry.getIndustryName());
		count = parComIndustryMapper.countByExample(parComIndustryExample);
		if (count > 0) {
			returnResult.setMsg("行业类型名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		parComIndustry.setIndustryId(RandomGUID.getRandomGUID());
		parComIndustry.setCreater(pricipalUser.getUserCnName());
		parComIndustry.setCreateTime(new Date());
		parComIndustry.setUpdater(pricipalUser.getUserCnName());
		parComIndustry.setUpdateTime(new Date());
		count = parComIndustryMapper.insert(parComIndustry);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + parComIndustry.getIndustryName()+ "】 行业类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，行业类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editSuppliersIndustry
	 * @Description: TODO(修改行业类型信息)
	 * @param @param parComIndustry
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ComIndustryList_edit")
	public Object editSuppliersIndustry(ParComIndustry parComIndustry) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParComIndustryExample parComIndustryExample = new ParComIndustryExample();
		int count = 0;
		// 防止行业类型名称重复
		parComIndustryExample.createCriteria().andIndustryNameEqualTo(parComIndustry.getIndustryName()).andIndustryIdNotEqualTo(parComIndustry.getIndustryId());
		count = parComIndustryMapper.countByExample(parComIndustryExample);
		if (count > 0) {
			returnResult.setMsg("行业类型名称重复");
			return returnResult;
		}
		parComIndustry.setCreater(pricipalUser.getUserCnName());
		parComIndustry.setCreateTime(new Date());
		parComIndustry.setUpdater(pricipalUser.getUserCnName());
		parComIndustry.setUpdateTime(new Date());
		count = parComIndustryMapper.updateByPrimaryKeySelective(parComIndustry);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + parComIndustry.getIndustryName()+ "】行业类型信息已保存");
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
	@MethodLog(opera = "ComIndustryList_del")
	public Object delSuppliersIndustry(List<String> industryIds,List<String> industryNames) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (industryIds.size() > 0) {
			ParComIndustryExample parComIndustryExample = new ParComIndustryExample();
			parComIndustryExample.createCriteria().andIndustryIdIn(industryIds);
			count = parComIndustryMapper.deleteByExample(parComIndustryExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + industryIds.size()+ " 】条行业类型信息");
			} else {
				returnResult.setMsg("发生未知错误，行业类型信息删除失败");
			}
		}
		return returnResult;
	}
}
