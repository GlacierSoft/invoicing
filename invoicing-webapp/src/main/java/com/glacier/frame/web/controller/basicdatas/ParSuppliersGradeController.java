/**
 * @Title: ParSuppliersGradeController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author junjie.zheng  
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午3:05:21 
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

import com.glacier.frame.dto.query.basicdatas.ParSuppliersGradeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersGrade;
import com.glacier.frame.service.basicdatas.ParSuppliersGradeService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName: ParSuppliersGradeController 
 * @Description: TODO(等级信息控制层) 
 * @author junjie.zheng
 * @email 1203807137@qq.com
 * @date 2015-1-8 下午3:05:21
 */

@Controller
@RequestMapping(value = "/suppliersGrade")
public class ParSuppliersGradeController {
	@Autowired
	private ParSuppliersGradeService suppliersGradeService;
	
	// 进入等级信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersGrade_mgr/suppliersGrade");
        return mav;
    } 

    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParSuppliersGradeQueryDTO suppliersGradeQueryDTO) {
        return suppliersGradeService.listAsGrid(jqPager, suppliersGradeQueryDTO);
    }
    
    // 进入等级信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersIndustryDetail(String gradeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersGrade_mgr/suppliersGrade_detail");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("suppliersGradeDate", suppliersGradeService.getSuppliersGrade(gradeId));
        }
	    return mav;
    }
    
    // 进入等级信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String gradeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersGrade_mgr/suppliersGrade_form");
        if(StringUtils.isNotBlank(gradeId)){
            mav.addObject("suppliersGradeDate", suppliersGradeService.getSuppliersGrade(gradeId));
        }
        return mav;
    }
    
    //增加等级信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParSuppliersGrade suppliersGrade, BindingResult bindingResult) {
        return suppliersGradeService.addSuppliersGrade(suppliersGrade);
    }
    
    //修改等级信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParSuppliersGrade suppliersGrade, BindingResult bindingResult) {
        return suppliersGradeService.editSuppliersGrade(suppliersGrade);
    }
    
    //删除等级信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> gradeIds,@RequestParam List<String> gradeNames) {
    	return suppliersGradeService.delSuppliersGrade(gradeIds, gradeNames);
    }
}