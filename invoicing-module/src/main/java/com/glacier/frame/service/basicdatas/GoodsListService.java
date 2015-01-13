/**
 * @Title: GoodsListService.java 
 * @Package com.glacier.frame.service.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-9 下午3:30:56 
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
import com.glacier.frame.dao.basicdatas.GoodsListMapper;
import com.glacier.frame.dto.query.basicdatas.GoodsListQueryDTO;
import com.glacier.frame.entity.basicdatas.GoodsList;
import com.glacier.frame.entity.basicdatas.GoodsListExample;
import com.glacier.frame.entity.basicdatas.GoodsListExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;

/**
 * @ClassName: GoodsListService 
 * @Description: TODO(货物档案信息业务层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-9 下午3:30:56
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class GoodsListService {
	
	@Autowired
	private GoodsListMapper goodsListMapper;
	
	/**
	 * @Title: listAsGrid
	 * @Description: TODO(获取所有货物档案信息)
	 * @param @param pager
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object listAsGrid(JqPager jqPager,GoodsListQueryDTO goodsListQueryDTO) {
		JqGridReturn returnResult = new JqGridReturn();
		GoodsListExample goodsListExample = new GoodsListExample();
		Criteria queryCriteria = goodsListExample.createCriteria();
		goodsListQueryDTO.setQueryCondition(queryCriteria);
		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			goodsListExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			goodsListExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			goodsListExample.setOrderByClause(jqPager.getOrderBy("temp_goods_list_"));
		}
		List<GoodsList> goodsList = goodsListMapper.selectByExample(goodsListExample); // 查询所有会员列表
		int total = goodsListMapper.countByExample(goodsListExample); // 查询总页数
		returnResult.setRows(goodsList);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	 * @Title: getGoodsList
	 * @Description: TODO(获取货物档案信息对象)
	 * @param @param goodsId
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	public Object getGoodsList(String goodsId) {
		GoodsList goodsList = goodsListMapper.selectByPrimaryKey(goodsId);
		return goodsList;
	}
	
	/**
	 * @Title: addGoodsList
	 * @Description: TODO(新增货物档案信息)
	 * @param @param suppliersGrade
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "GoodsList_add")
	public Object addGoodsList(GoodsList goodsList) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		GoodsListExample goodsListExample = new GoodsListExample();
		int count = 0;
		// 防止货物档案名称重复
		goodsListExample.createCriteria().andGoodsNameEqualTo(goodsList.getGoodsName());
		count = goodsListMapper.countByExample(goodsListExample);
		if (count > 0) {
			returnResult.setMsg("货物档案信息重复,请重新填写!");
			returnResult.setSuccess(false);
			return returnResult;
		}
		goodsList.setGoodsId(RandomGUID.getRandomGUID());
		goodsList.setCreater(pricipalUser.getUserCnName());
		goodsList.setCreateTime(new Date());
		goodsList.setUpdater(pricipalUser.getUserCnName());
		goodsList.setUpdateTime(new Date());
		count = goodsListMapper.insert(goodsList);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + goodsList.getGoodsName()+ "】 货物档案信息信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，货物档案信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: editGoodsList
	 * @Description: TODO(修改货物档案信息)
	 * @param @param suppliersIndustry
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "GoodsList_edit")
	public Object editGoodsList(GoodsList goodsList) {
		Subject pricipalSubject = SecurityUtils.getSubject();
		User pricipalUser = (User) pricipalSubject.getPrincipal();
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		goodsList.setCreater(pricipalUser.getUserCnName());
		goodsList.setCreateTime(new Date());
		goodsList.setUpdater(pricipalUser.getUserCnName());
		goodsList.setUpdateTime(new Date());
		count = goodsListMapper.updateByPrimaryKeySelective(goodsList);
		if (count == 1) {
			returnResult.setSuccess(true);
			returnResult.setMsg("【" + goodsList.getGoodsName()+ "】货物档案信息已保存");
		} else {
			returnResult.setMsg("发生未知错误，货物档案信息保存失败");
		}
		return returnResult;
	}

	/**
	 * @Title: delGoodsList
	 * @Description: TODO(删除货物档案信息)
	 * @param @param gradeIds
	 * @param @return 设定文件
	 * @return Object 返回类型
	 * @throws
	 */
	@Transactional(readOnly = false)
	@MethodLog(opera = "GoodsList_del")
	public Object delGoodsList(List<String> goodsId) {
		JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
		int count = 0;
		if (goodsId.size() > 0) {
			GoodsListExample goodsListExample = new GoodsListExample();
			goodsListExample.createCriteria().andGoodsIdIn(goodsId);
			count = goodsListMapper.deleteByExample(goodsListExample);
			if (count > 0) {
				returnResult.setSuccess(true);
				returnResult.setMsg("成功删除了【 " + count+ " 】条货物档案信息");
			} else {
				returnResult.setMsg("发生未知错误，货物档案信息删除失败");
			}
		}
		return returnResult;
	}
}