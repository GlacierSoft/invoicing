/**
 * @Title: ParSuppliersSourceController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-13 下午2:02:43 
 * @company (开发供应商)    珠海市冰川软件有限供应商
 * @copyright (版权)    本文件归属珠海市冰川软件有限供应商所有
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
import com.glacier.frame.dto.query.basicdatas.ParSuppliersSourceQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSuppliersSource;
import com.glacier.frame.service.basicdatas.ParSuppliersSourceService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ParSuppliersSourceController
 * @Description: TODO(供应商信息来源控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-13  下午2:02:43
 */ 
@Controller
@RequestMapping(value = "/suppliersSource")
public class ParSuppliersSourceController extends AbstractController{


    @Autowired
    private ParSuppliersSourceService suppliersSourceService;// 注入service
    
    //进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersSource_mgr/suppliersSource");
        return mav;
    }
     
    //获取表格结构的所有供应商来源数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listSuppliersSource(JqPager jqPager, ParSuppliersSourceQueryDTO parSuppliersSourceQueryDTO) {
        return suppliersSourceService.listAsGrid(jqPager, parSuppliersSourceQueryDTO);
    }
    
    //进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String sourceId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersSource_mgr/suppliersSource_form");
        if(StringUtils.isNotBlank(sourceId)){
            mav.addObject("suppliersSourceData", suppliersSourceService.getSuppliersSource(sourceId));
        }
        return mav;
    }
    
    //进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSuppliersSource(String sourceId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/suppliersSource_mgr/suppliersSource_detail");
        if(StringUtils.isNotBlank(sourceId)){
            mav.addObject("suppliersSourceData", suppliersSourceService.getSuppliersSource(sourceId));
        }
        return mav;
    }
    
    //新增供应商来源
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object adSuppliersSource(@Valid ParSuppliersSource parSuppliersSource, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return suppliersSourceService.addSuppliersSource(parSuppliersSource);
    }  
    
    //修改供应商来源
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editSuppliersSource(@Valid ParSuppliersSource parSuppliersSource, BindingResult bindingResult) {
         return suppliersSourceService.editSuppliersSource(parSuppliersSource);
    }
    
    //删除供应商来源
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delSuppliersSource(@RequestParam List<String> sourceIds,@RequestParam List<String> sourceNames) {
    	return suppliersSourceService.delSuppliersSource(sourceIds, sourceNames);
    }

}
