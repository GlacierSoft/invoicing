/**
 * @Title: ParSuppliersIndustryController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-8 上午10:42:21 
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

import com.glacier.frame.dto.service.basicdatas.ParSuppliersIndustryQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersIndustry;
import com.glacier.frame.service.basicdatas.ParSuppliersIndustryService;
import com.glacier.jqueryui.util.JqPager;


/**
 * @ClassName: ParSuppliersIndustryController 
 * @Description: TODO(行业类型信息控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 上午10:42:21
 */

@Controller
@RequestMapping(value = "/suppliersIndustry")
public class ParSuppliersIndustryController {
	
	@Autowired
	private ParSuppliersIndustryService suppliersIndustryService;
	
	// 进入行业类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersIndustry_mgr/suppliersIndustry");
        return mav;
    } 

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParSuppliersIndustryQueryDTO suppliersIndustryQueryDTO) {
        return suppliersIndustryService.listAsGrid(jqPager, suppliersIndustryQueryDTO);
    }
    
    // 进入行业类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersIndustryDetail(String industryId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersIndustry_mgr/suppliersIndustry_detail");
        if(StringUtils.isNotBlank(industryId)){
            mav.addObject("suppliersIndustryDate", suppliersIndustryService.getSuppliersIndustry(industryId));
        }
	    return mav;
    }
    
    // 进入行业类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String industryId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersIndustry_mgr/suppliersIndustry_form");
        if(StringUtils.isNotBlank(industryId)){
            mav.addObject("suppliersIndustryDate", suppliersIndustryService.getSuppliersIndustry(industryId));
        }
        return mav;
    }
    
    //增加行业类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParSuppliersIndustry suppliersIndustry, BindingResult bindingResult) {
        return suppliersIndustryService.addSuppliersIndustry(suppliersIndustry);
    }
    
    //修改行业类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParSuppliersIndustry suppliersIndustry, BindingResult bindingResult) {
        return suppliersIndustryService.editSuppliersIndustry(suppliersIndustry);
    }
    
    //删除行业类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> industryIds,@RequestParam List<String> industryNames) {
    	return suppliersIndustryService.delSuppliersIndustry(industryIds, industryNames);
    }
 }