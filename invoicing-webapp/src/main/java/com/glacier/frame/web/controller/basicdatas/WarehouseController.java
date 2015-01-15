/**
 * @Title: WarehouseController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-13 下午2:16:37 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-13
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

import com.glacier.frame.dto.query.basicdatas.WarehouseQueryDTO;
import com.glacier.frame.entity.basicdatas.Warehouse;
import com.glacier.frame.service.basicdatas.ParWarGoodsTypeService;
import com.glacier.frame.service.basicdatas.WarehouseService;
import com.glacier.frame.service.system.DepService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: WarehouseController 
 * @Description: TODO(仓库信息控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-13 下午2:16:37
 */
@Controller
@RequestMapping(value = "/warehouse")
public class WarehouseController {
	@Autowired
	private WarehouseService warehouseService;
	
	@Autowired
	private ParWarGoodsTypeService warGoodsTypeService;
	
	@Autowired
	private DepService depService;// 注入部门业务Bean
	
	//进入仓库信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warehouse_mgr/warehouse");
        return mav;
    } 

    //获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, WarehouseQueryDTO warehouseQueryDTO) {
        return warehouseService.listAsGrid(jqPager, warehouseQueryDTO);
    }
    
    //进入库存信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersIndustryDetail(String warehouseId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/warehouse_mgr/warehouse_detail");
        if(StringUtils.isNotBlank(warehouseId)){
            mav.addObject("warehouseDate", warehouseService.getWarehouse(warehouseId));
        }
	    return mav;
    }
    
    //进入库存信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String warehouseId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warehouse_mgr/warehouse_form");
        mav.addObject("allDepTreeNodeData", depService.getAllTreeDepNode(true));
        //库存货品信息
        mav.addObject("allTypeTreeNodeData", warGoodsTypeService.getAllTreeTypeNode());
        //主键标志判断
        if(StringUtils.isNotBlank(warehouseId)){
            mav.addObject("warehouseDate", warehouseService.getWarehouse(warehouseId));
        }
        return mav;
    }
    
    //增加库存信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid Warehouse warehouse, BindingResult bindingResult,String[] warehouseTypeName) {
    	System.out.println("warehouseTypeName:"+warehouseTypeName.length);
        return warehouseService.addWarehouse(warehouse,warehouseTypeName);
    }
    
    //修改库存信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid Warehouse warehouse, BindingResult bindingResult) {
        return warehouseService.editWarehouse(warehouse);
    }
    
    //删除库存信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> warehouseIds) {
    	return warehouseService.delWarehouse(warehouseIds);
    }
}
