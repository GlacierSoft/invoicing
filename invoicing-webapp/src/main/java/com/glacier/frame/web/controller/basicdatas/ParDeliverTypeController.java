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
import com.glacier.frame.dto.query.basicdatas.ParDeliverTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParDeliverType;
import com.glacier.frame.service.basicdatas.ParDeliverTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParDeliverTypeController
 * @Description: TODO(交货方式controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-08
 */
@Controller
@RequestMapping(value = "/deliverType")
public class ParDeliverTypeController extends AbstractController{

	@Autowired
	private ParDeliverTypeService parDeliverTypeService;
	
	// 进入交货方式信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parDeliverType_mgr/parDeliverType");
        return mav;
    } 
    
    // 获取表格结构的所有交货方式数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParDeliverTypeQueryDTO carTypeQueryDTO) {
        return parDeliverTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    // 进入交货方式信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String deliverTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/parDeliverType_mgr/parDeliverType_detail");
        if(StringUtils.isNotBlank(deliverTypeId)){
            mav.addObject("deliverTypeDate", parDeliverTypeService.getParDeliverType(deliverTypeId));
        }
	    return mav;
    }
    
    // 进入交货方式信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String deliverTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parDeliverType_mgr/parDeliverType_form");
        if(StringUtils.isNotBlank(deliverTypeId)){
            mav.addObject("deliverTypeDate", parDeliverTypeService.getParDeliverType(deliverTypeId));
        }
        return mav;
    }
    
    // 增加交货方式信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParDeliverType parDeliverType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parDeliverTypeService.addParDeliverType(parDeliverType);
    }
    
    //修改交货方式信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParDeliverType parDeliverType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parDeliverTypeService.editParDeliverType(parDeliverType);
    }
    
    //批量删除交货方式信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parDeliverTypeIds,@RequestParam List<String> parDeliverTypeNames) {
    	return parDeliverTypeService.delParDeliverType(parDeliverTypeIds, parDeliverTypeNames);
    }
}
