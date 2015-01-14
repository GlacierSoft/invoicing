/**
 * @Title: ParWarGoodsTypeService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-14 下午1:13:50 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-14
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
import com.glacier.frame.dao.basicdatas.ParWarGoodsTypeMapper;
import com.glacier.frame.dto.query.basicdatas.ParWarGoodsTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParWarGoodsType;
import com.glacier.frame.entity.basicdatas.ParWarGoodsTypeExample;
import com.glacier.frame.entity.basicdatas.ParWarGoodsTypeExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: ParWarGoodsTypeService 
 * @Description: TODO(仓库货品分类业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-14 下午1:13:50
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class ParWarGoodsTypeService {
   
	@Autowired
	private ParWarGoodsTypeMapper parWarGoodsTypeMapper;

	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取所有仓库货品分类信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */

	public Object listAsGrid(JqPager jqPager,ParWarGoodsTypeQueryDTO parWarGoodsTypeQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		ParWarGoodsTypeExample parWarGoodsTypeExample = new ParWarGoodsTypeExample();
		Criteria queryCriteria = parWarGoodsTypeExample.createCriteria();
		parWarGoodsTypeQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			parWarGoodsTypeExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			parWarGoodsTypeExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			parWarGoodsTypeExample.setOrderByClause(jqPager.getOrderBy("temp_par_war_goods_type_"));
		}
		List<ParWarGoodsType> parWarGoodsTypeList = parWarGoodsTypeMapper.selectByExample(parWarGoodsTypeExample); // 查询所有仓库货品分类
		int total = parWarGoodsTypeMapper.countByExample(parWarGoodsTypeExample); // 查询总页数
		returnResult.setRows(parWarGoodsTypeList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getParWarGoodsType
	 * @Description: TODO(获取仓库货品分类对象)
	 * @param @param warGoodsTypeId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getParWarGoodsType(String warGoodsTypeId) {
		ParWarGoodsType parWarGoodsType = parWarGoodsTypeMapper.selectByPrimaryKey(warGoodsTypeId);
		return parWarGoodsType;
	}

	/**
	 * @Title: addParWarGoodsType
	 * @Description: TODO(新增仓库货品分类信息)
	 * @param @param parWarGoodsType
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ParWarGoodsType_add")
	public Object addParWarGoodsType(ParWarGoodsType parWarGoodsType) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParWarGoodsTypeExample parWarGoodsTypeExample = new ParWarGoodsTypeExample();
		int count = 0;
		// 防止货品仓库类型名称重复
		parWarGoodsTypeExample.createCriteria().andNameEqualTo(parWarGoodsType.getName());
		count = parWarGoodsTypeMapper.countByExample(parWarGoodsTypeExample);
		if (count > 0) {
			returnResult.setMsg("货品仓库类型名称重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		parWarGoodsType.setWarGoodsTypeId(RandomGUID.getRandomGUID());
		parWarGoodsType.setCreater(pricipalUser.getUserCnName());
		parWarGoodsType.setCreateTime(new Date());
		parWarGoodsType.setUpdater(pricipalUser.getUserCnName());
		parWarGoodsType.setUpdateTime(new Date());
		count = parWarGoodsTypeMapper.insert(parWarGoodsType);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + parWarGoodsType.getName()+ "】仓库货品分类信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，仓库货品分类信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editParWarGoodsType
	 * @Description: TODO(修改仓库货品分类信息)
	 * @param @param parPurchaseReturnReason
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ParWarGoodsType_edit")
	public Object editParWarGoodsType(ParWarGoodsType parWarGoodsType) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		ParWarGoodsTypeExample parWarGoodsTypeExample = new ParWarGoodsTypeExample();
		int count = 0;
		// 防止仓库货品分类信息名称重复
		parWarGoodsTypeExample.createCriteria().andNameEqualTo(parWarGoodsType.getName()).andWarGoodsTypeIdNotEqualTo(parWarGoodsType.getWarGoodsTypeId());
		count = parWarGoodsTypeMapper.countByExample(parWarGoodsTypeExample);
		if (count > 0) {
			returnResult.setMsg("仓库货品分类信息名称重复");
			return returnResult;
		}
		parWarGoodsType.setUpdater(pricipalUser.getUserCnName());
		parWarGoodsType.setUpdateTime(new Date());
		count = parWarGoodsTypeMapper.updateByPrimaryKeySelective(parWarGoodsType);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + parWarGoodsType.getName()+ "】仓库货品信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，仓库货品信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: delReturnReason
	 * @Description: TODO(删除仓库货品分类信息)
	 * @param @param warGoodsTypeIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "ParWarGoodsType_del")
	public Object delParWarGoodsType(List<String> warGoodsTypeIds) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (warGoodsTypeIds.size() > 0) {
			ParWarGoodsTypeExample parWarGoodsTypeExample = new ParWarGoodsTypeExample();
			parWarGoodsTypeExample.createCriteria().andWarGoodsTypeIdIn(warGoodsTypeIds);
			count = parWarGoodsTypeMapper.deleteByExample(parWarGoodsTypeExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + count+ " 】条仓库货品分类信息");
			} else {
				returnResult.setMsg("发生未知错误，仓库货品分类信息删除失败");
			}
		}
		return returnResult;
	}
}
