/**
 * @Title: ParPurchaseTypeService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午5:04:51 
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
import com.glacier.frame.dao.basicdatas.ParPurchaseTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParPurchaseTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPurchaseType;
import com.glacier.frame.entity.basicdatas.ParPurchaseTypeExample;
import com.glacier.frame.entity.basicdatas.ParPurchaseTypeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ParPurchaseTypeService 
 * @Description: TODO(采购类型业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午5:04:51
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParPurchaseTypeService {
	
	@Autowired
	private ParPurchaseTypeMapper purchaseTypeMapper;

	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取所有采购类型信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object listAsGrid(JqPager jqPager,ParPurchaseTypeQueryDTO purchaseTypeQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParPurchaseTypeExample parPurchaseTypeExample = new ParPurchaseTypeExample();
		Criteria queryCriteria =parPurchaseTypeExample.createCriteria();
		purchaseTypeQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			parPurchaseTypeExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			parPurchaseTypeExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			parPurchaseTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_purchase_type_"));
		}
		List<ParPurchaseType> parPurchaseTypeList = purchaseTypeMapper.selectByExample(parPurchaseTypeExample); // 查询所有信息列表
		int total = purchaseTypeMapper.countByExample(parPurchaseTypeExample); // 查询总页数
		returnResult.setRows(parPurchaseTypeList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getPurchaseType
	 * @Description: TODO(获取采购类型对象)
	 * @param @param industryId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getPurchaseType(String purchaseTypeId) {
		ParPurchaseType purchaseType = purchaseTypeMapper.selectByPrimaryKey(purchaseTypeId);
		return purchaseType;
	}

	/**
	 * @Title: addSuppliersGrade
	 * @Description: TODO(新增采购类型)
	 * @param @param suppliersGrade
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "PurchaseTypeList_add")
	public Object addPurchaseType(ParPurchaseType purchaseType) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParPurchaseTypeExample parPurchaseTypeExample = new ParPurchaseTypeExample();
		int count = 0;
		// 防止采购类型名称重复
		parPurchaseTypeExample.createCriteria().andNameEqualTo(purchaseType.getName());
		count = purchaseTypeMapper.countByExample(parPurchaseTypeExample);
		if (count > 0) {
			returnResult.setMsg("采购类型名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		purchaseType.setPurchaseTypeId(RandomGUID.getRandomGUID());
		purchaseType.setCreater(pricipalUser.getUserCnName());
		purchaseType.setCreateTime(new Date());
		purchaseType.setUpdater(pricipalUser.getUserCnName());
		purchaseType.setUpdateTime(new Date());
		count = purchaseTypeMapper.insert(purchaseType);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + purchaseType.getName()+ "】 采购类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，采购类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editSuppliersGrade
	 * @Description: TODO(修改采购类型信息)
	 * @param @param purchaseType
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "PurchaseTypeList_edit")
	public Object editPurchaseType(ParPurchaseType purchaseType) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParPurchaseTypeExample parPurchaseTypeExample = new ParPurchaseTypeExample();
		int count = 0;
		// 防止采购类型名称重复
		parPurchaseTypeExample.createCriteria().andNameEqualTo(purchaseType.getName()).andPurchaseTypeIdNotEqualTo(purchaseType.getPurchaseTypeId());
		count = purchaseTypeMapper.countByExample(parPurchaseTypeExample);
		if (count > 0) {
			returnResult.setMsg("采购类型名称重复");
			return returnResult;
		}
		purchaseType.setUpdater(pricipalUser.getUserCnName());
		purchaseType.setUpdateTime(new Date());
		count = purchaseTypeMapper.updateByPrimaryKeySelective(purchaseType);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + purchaseType.getName()+ "】采购类型信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，采购类型信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: delPurchaseType
	 * @Description: TODO(删除采购类型信息)
	 * @param @param purchaseTypeIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "PurchaseTypeList_del")
	public Object delPurchaseType(List<String> purchaseTypeIds,List<String> names) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (purchaseTypeIds.size() > 0) {
			ParPurchaseTypeExample parPurchaseTypeExample = new ParPurchaseTypeExample();
			parPurchaseTypeExample.createCriteria().andPurchaseTypeIdIn(purchaseTypeIds);
			count = purchaseTypeMapper.deleteByExample(parPurchaseTypeExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + count+ " 】条采购类型信息");
			} else {
				returnResult.setMsg("发生未知错误，采购类型删除失败");
			}
		}
		return returnResult;
	}
}
