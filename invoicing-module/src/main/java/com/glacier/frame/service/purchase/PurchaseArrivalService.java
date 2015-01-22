/**
 * @Title: PurchaseArrivalService.java 
 * @Package com.glacier.global.service.PurchaseArrival
 * @author wuting   
 * @email 920339213@qq.com
 * @date 2015-1-9
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.00          
 * @Review (审核人) ：wuting
 * 
 */
package com.glacier.frame.service.purchase; 
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils; 
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional; 
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.basicdatas.GoodsListMapper;
import com.glacier.frame.dao.purchase.PurchaseArrivalDetailMapper;
import com.glacier.frame.dao.purchase.PurchaseArrivalMapper;
import com.glacier.frame.dto.query.purchase.PurchaseArrivalQueryDTO;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.basicdatas.GoodsList;
import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetail;
import com.glacier.frame.entity.purchase.PurchaseArrivalExample;
import com.glacier.frame.entity.purchase.PurchaseArrivalExample.Criteria;
import com.glacier.frame.util.MethodLog;
/*** 
 * @ClassName:  PurchaseArrivalService
 * @Description: TODO(采购到货表业务类)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-9
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class PurchaseArrivalService {

	@Autowired
	private PurchaseArrivalMapper purchaseArrivalMapper;
	
	@Autowired
	private GoodsListMapper goodsListMapper;
	
	@Autowired
	private PurchaseArrivalDetailMapper purchaseArrivalDetailMapper;
	
	/**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有采购到货信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, PurchaseArrivalQueryDTO deliverTypeQueryDTO) {
        JqGridReturn returnResult = new JqGridReturn();
        PurchaseArrivalExample purchaseArrivalExample = new PurchaseArrivalExample(); 
        Criteria queryCriteria = purchaseArrivalExample.createCriteria();
        deliverTypeQueryDTO.setQueryCondition(queryCriteria);
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	purchaseArrivalExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	purchaseArrivalExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	purchaseArrivalExample.setOrderByClause(jqPager.getOrderBy("temp_purchase_arrival_"));
        }
        List<PurchaseArrival>  purchaseArrivalList = purchaseArrivalMapper.selectByExample(purchaseArrivalExample); // 查询所有采购到货列表
        int total = purchaseArrivalMapper.countByExample(purchaseArrivalExample); // 查询总页数
        returnResult.setRows(purchaseArrivalList);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    /**
	 * @Title: getPurchaseArrival 
	 * @Description: TODO(根据采购到货Id获取采购到货信息) 
	 * @param @param deliverTypeId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getPurchaseArrival(String purchaseId) {
    	PurchaseArrival purchaseArrival = purchaseArrivalMapper.selectByPrimaryKey(purchaseId);
        return purchaseArrival;
    }
    
    /**
     * @Title: addPurchaseArrival 
     * @Description: TODO(新增采购到货) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalList_add")
    public Object addPurchaseArrival(PurchaseArrival purchaseArrival,String rows) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        JSONArray array = JSONArray.fromObject(rows);//将Json字符串转换成json数组
        PurchaseArrivalExample purchaseArrivalExample = new PurchaseArrivalExample();
        int count = 0;
        BigDecimal allAmount= new BigDecimal(0);//存储总金额
        for (int i = 0; i < array.toArray().length; i++) {//遍历循环
			JSONObject json = JSONObject.fromObject(array.toArray()[i]);
			BigDecimal Amount= BigDecimal.valueOf(json.getDouble("money"));//转换成BigDecimal
			allAmount = allAmount.add(Amount);
		}
        System.out.println("-----------------------------------:"+purchaseArrival.getInvoice());
        count = purchaseArrivalMapper.countByExample(purchaseArrivalExample);
        //采购到货编号格式:表名_年_月_日_分_秒
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        purchaseArrival.setPurArrivalId(RandomGUID.getRandomGUID());
        purchaseArrival.setDerateMoney(new BigDecimal(0));//应付减免金额
        purchaseArrival.setAlrPayAmo(new BigDecimal(0));//已付款金额
        purchaseArrival.setNotPayAmo(allAmount);//未付款金额
        purchaseArrival.setNotInvAmo(new BigDecimal(0));//未开票金额
        purchaseArrival.setAlrInvAmo(allAmount);//已开票金额
        purchaseArrival.setAlrReturnAmo(new BigDecimal(0));//已退货金额
        purchaseArrival.setNotReturnAmo(allAmount);//未退货金额
        purchaseArrival.setReturnState("noneCancel");//退货状态
        purchaseArrival.setPayState("nonePay");//付款状态
        purchaseArrival.setAuditState("authstr");//审核状态
        purchaseArrival.setInvState("noneInv");//开票状态
        purchaseArrival.setArrivalCode("arrival"+formatDate.format(new Date()));
        purchaseArrival.setCreater(pricipalUser.getUserCnName());
        purchaseArrival.setCreateTime(new Date());
        purchaseArrival.setUpdater(pricipalUser.getUserCnName());
        purchaseArrival.setUpdateTime(new Date());
        count = purchaseArrivalMapper.insert(purchaseArrival);
        if (count == 1) {
        	//采购到货详情信息增加
            for (int i = 0; i < array.toArray().length; i++) {//遍历循环
    			JSONObject json = JSONObject.fromObject(array.toArray()[i]);
    			GoodsList goodsList = goodsListMapper.selectByPrimaryKey(json.getString("goodsId"));
    			PurchaseArrivalDetail purchaseArrivalDetail = new PurchaseArrivalDetail();
    			purchaseArrivalDetail.setPurArrivalDetId(RandomGUID.getRandomGUID());
    			purchaseArrivalDetail.setPurArrivalId(purchaseArrival.getPurArrivalId());
    			purchaseArrivalDetail.setGoodsId(goodsList.getGoodsId());
    			purchaseArrivalDetail.setGoodsCode(goodsList.getGoodsCode());
    			purchaseArrivalDetail.setGoodsName(goodsList.getGoodsName());
    			purchaseArrivalDetail.setGoodsModel(goodsList.getSpecification());
    			purchaseArrivalDetail.setGoodsUnit(goodsList.getUnit());
    			purchaseArrivalDetail.setPrice(BigDecimal.valueOf(json.getDouble("price")));
    			purchaseArrivalDetail.setGoodsMoney(BigDecimal.valueOf(json.getDouble("money")));
    			//purchaseArrivalDetail.setDeadline(json.getString("deadline"));
    			purchaseArrivalDetail.setNotReturnNum(json.getInt("arrival"));
    			purchaseArrivalDetail.setAlrReturnNum(0);
    			purchaseArrivalDetail.setAlrPayNum(0);
    			purchaseArrivalDetail.setNotPayNum(json.getInt("arrival"));
    			purchaseArrivalDetail.setNotInvNum(0);
    			purchaseArrivalDetail.setAlrInvNum(json.getInt("arrival"));
    			purchaseArrivalDetail.setPlaceOfOrigin(json.getString("placeOfOrigin"));
    			purchaseArrivalDetail.setBatchInformation("batchInformation");
    			purchaseArrivalDetail.setArrival(json.getInt("arrival"));
    			purchaseArrivalDetail.setDelivery(json.getInt("delivery"));
    			purchaseArrivalDetail.setRejection(json.getInt("arrival")-json.getInt("delivery"));
    			purchaseArrivalDetail.setOriginalCost(BigDecimal.valueOf(json.getDouble("originalCost")));
    			purchaseArrivalDetail.setDepositRate(BigDecimal.valueOf(json.getDouble("depositRate")));
    			purchaseArrivalDetail.setPutstorage(json.getInt("delivery"));
    			purchaseArrivalDetail.setTakestorage(purchaseArrivalDetail.getRejection());
    			purchaseArrivalDetail.setRemark(json.getString("remark"));
    			purchaseArrivalDetailMapper.insert(purchaseArrivalDetail);//执行增加操作
    		}
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseArrival.getArrivalCode() + "] 采购到货信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editPurchaseArrival 
     * @Description: TODO(修改采购到货信息) 
     * @param @param purchaseArrival
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalList_edit")
    public Object editPurchaseArrival(PurchaseArrival purchaseArrival) {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //更新更新人和更新时间
        purchaseArrival.setUpdater(pricipalUser.getUserCnName());
        purchaseArrival.setUpdateTime(new Date());
        count = purchaseArrivalMapper.updateByPrimaryKeySelective(purchaseArrival);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + purchaseArrival.getArrivalCode() + "] 采购到货信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，采购到货信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delPurchaseArrival 
     * @Description: TODO(删除采购到货) 
     * @param @param gradeIds
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "PurchaseArrivalList_del")
    public Object delPurchaseArrival(List<String> purchaseIds, List<String> ArrivalCodes) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (purchaseIds.size() > 0) {
        	PurchaseArrivalExample purchaseArrivalExample = new PurchaseArrivalExample();
        	purchaseArrivalExample.createCriteria().andPurArrivalIdIn(purchaseIds);
            count = purchaseArrivalMapper.deleteByExample(purchaseArrivalExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(ArrivalCodes, ",") + " ]采购到货信息");
            } else {
                returnResult.setMsg("发生未知错误，采购到货信息删除失败");
            }
        }
        return returnResult;
    }
}
