/**
 * @Title: SuppliersController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-9 下午1:40:22 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-9
				修改人：song.jundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：song.jundong 
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

import com.glacier.core.controller.AbstractController;   
import com.glacier.frame.dto.query.basicdatas.SuppliersQueryDTO;
import com.glacier.frame.entity.basicdatas.Suppliers;
import com.glacier.frame.service.basicdatas.SuppliersService;
import com.glacier.jqueryui.util.JqPager;
 
/**
 * @ClassName:  SuppliersController
 * @Description: TODO(供应商资料控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-9  下午1:40:22
 */ 
@Controller
@RequestMapping(value = "/suppliers")
public class SuppliersController extends AbstractController{ 
	  
    @Autowired
    private SuppliersService suppliersService;// 注入service
    
    // 进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliers_mgr/suppliers");
        return mav;
    }
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, SuppliersQueryDTO suppliersQueryDTO) {
        return suppliersService.listAsGrid(jqPager, suppliersQueryDTO);
    }
    
     // 进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String suppliersId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliers_mgr/suppliers_form");
        if(StringUtils.isNotBlank(suppliersId)){
            mav.addObject("suppliersData", suppliersService.getSuppliers(suppliersId));
        }
        return mav;
    }
    
    // 进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoParsuppliersDetailPage(String suppliersId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliers_mgr/suppliers_detail");
        if(StringUtils.isNotBlank(suppliersId)){
            mav.addObject("suppliersData", suppliersService.getSuppliers(suppliersId));
        }
        return mav;
    }
    
     //新增供应商
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addsuppliers(@Valid Suppliers suppliers, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return suppliersService.addSuppliers(suppliers);
    }  
    
    // 修改供应商
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid Suppliers suppliers, BindingResult bindingResult) {
         return suppliersService.editSuppliers(suppliers);
    }
    
    // 删除供应商
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> suppliersIds,@RequestParam List<String> suppliersNames) {
    	return suppliersService.delSuppliers(suppliersIds, suppliersNames);
    }
   
}
