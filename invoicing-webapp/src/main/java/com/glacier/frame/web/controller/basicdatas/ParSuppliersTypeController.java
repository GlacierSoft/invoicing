/**
 * @Title: ParSuppliersTypeController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 下午2:02:14 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2015-1-13
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
import com.glacier.frame.dto.query.basicdatas.ParSuppliersTypeQueryDTO; 
import com.glacier.frame.entity.basicdatas.ParSuppliersType;
import com.glacier.frame.service.basicdatas.ParSuppliersTypeService; 
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ParSuppliersTypeController
 * @Description: TODO(供应商类型控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13  下午2:02:14
 */
@Controller
@RequestMapping(value = "/suppliersType")
public class ParSuppliersTypeController extends AbstractController{
 
    @Autowired
    private ParSuppliersTypeService suppliersTypeService;// 注入service
    
    //进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersType_mgr/suppliersType");
        return mav;
    }
     
    //获取表格结构的所有供应商类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listSuppliersType(JqPager jqPager, ParSuppliersTypeQueryDTO parSuppliersTypeQueryDTO) {
        return suppliersTypeService.listAsGrid(jqPager, parSuppliersTypeQueryDTO);
    }
    
    //进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String typeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersType_mgr/suppliersType_form");
        if(StringUtils.isNotBlank(typeId)){
            mav.addObject("suppliersTypeData", suppliersTypeService.getSuppliersType(typeId));
        }
        return mav;
    }
    
    //进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersType(String typeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersType_mgr/suppliersType_detail");
        if(StringUtils.isNotBlank(typeId)){
            mav.addObject("suppliersTypeData", suppliersTypeService.getSuppliersType(typeId));
        }
        return mav;
    }
    
    //新增供应商类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object adSuppliersType(@Valid ParSuppliersType parSuppliersType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return suppliersTypeService.addSuppliersType(parSuppliersType);
    }  
    
    //修改供应商类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editSuppliersType(@Valid ParSuppliersType parSuppliersType, BindingResult bindingResult) {
         return suppliersTypeService.editSuppliersType(parSuppliersType);
    }
    
    //删除供应商类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delSuppliersType(@RequestParam List<String> typeIds,@RequestParam List<String> typeNames) {
    	return suppliersTypeService.delSuppliersType(typeIds, typeNames);
    }
  
}
