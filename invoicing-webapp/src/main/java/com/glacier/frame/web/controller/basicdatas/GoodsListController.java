/**
 * @Title: GoodsListController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-9 下午3:48:53 
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
package com.glacier.frame.web.controller.basicdatas;

import java.util.List; 
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.frame.dto.query.basicdatas.GoodsListQueryDTO;
import com.glacier.frame.entity.basicdatas.GoodsList;
import com.glacier.frame.service.basicdatas.GoodsListService;
import com.glacier.frame.service.basicdatas.ParWarGoodsTypeService;
import com.glacier.frame.service.basicdatas.WarehouseService;
import com.glacier.frame.service.purchase.PurchaseOrderService;
import com.glacier.frame.service.system.DepService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: GoodsListController 
 * @Description: TODO(货物档案信息控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-9 下午3:48:53
 */
@Controller
@RequestMapping(value = "/goodsList")
public class GoodsListController {
	
	@Autowired
	private GoodsListService goodsListService;
	
	@Autowired
    private ParWarGoodsTypeService warGoodsTypeService;
	
	@Autowired
	private WarehouseService warehouseService;
	
	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	@Autowired
	private DepService depService;
	
	//进入货物档案信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/goodsList_mgr/goodsList");
        //库存货品信息
        mav.addObject("allTypeTreeNodeData", warGoodsTypeService.getAllTreeTypeNode());
        //仓库信息获取
        mav.addObject("allWareHouseDate",warehouseService.getWareHouseCombo());
        //返回结果集
        return mav;
    } 
    
    //获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, GoodsListQueryDTO goodsListQueryDTO,String storageVal) {
    	goodsListQueryDTO.setWarehouseTypeId(storageVal);
    	return goodsListService.listAsGrid(jqPager, goodsListQueryDTO);
    } 
     
    //获取特定仓库下的所有货物档案信息
    @RequestMapping(value = "/listPartGoods.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listPartGoods(String warehouseTypeId) {
    	return goodsListService.listPartGoodsList(warehouseTypeId);
    }
     
    //进入货物档案信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersIndustryDetail(String goodsId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/goodsList_mgr/goodsList_detail");
        if(StringUtils.isNotBlank(goodsId)){
            mav.addObject("goodsListDate", goodsListService.getGoodsList(goodsId));
        }
	    return mav;
    }
    
    //进入货物档案信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String goodsId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/goodsList_mgr/goodsList_form");
        //部门信息
        mav.addObject("allDepTreeNodeData", depService.getAllTreeDepNode(true));
        //库存货品信息
        mav.addObject("allTypeTreeNodeData", warGoodsTypeService.getAllTreeTypeNode());
        //主键标志判断
        if(StringUtils.isNotBlank(goodsId)){
            mav.addObject("goodsListDate", goodsListService.getGoodsList(goodsId));
        }
        return mav;
    }
    
    //增加货物档案信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid GoodsList goodsList, BindingResult bindingResult) {
        return goodsListService.addGoodsList(goodsList);
    }
    
    //修改货物档案信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid GoodsList goodsList, BindingResult bindingResult) {
        return goodsListService.editGoodsList(goodsList);
    }
    
    //删除货物档案信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> goodsIds) {
    	return goodsListService.delGoodsList(goodsIds);
    }
}
