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
import com.glacier.frame.dto.query.basicdatas.ParComDeliverTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParComDeliverType;
import com.glacier.frame.service.basicdatas.ParComDeliverTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParComDeliverTypeController
 * @Description: TODO(交货方式controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-08
 */
@Controller
@RequestMapping(value = "/deliverType")
public class ParComDeliverTypeController extends AbstractController{

	@Autowired
	private ParComDeliverTypeService parComDeliverTypeService;
	
	// 进入交货方式信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comDeliverType_mgr/parComDeliverType");
        return mav;
    } 
    
    // 获取表格结构的所有交货方式数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParComDeliverTypeQueryDTO carTypeQueryDTO) {
        return parComDeliverTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    // 进入交货方式信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String deliverTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/comDeliverType_mgr/parComDeliverType_detail");
        if(StringUtils.isNotBlank(deliverTypeId)){
            mav.addObject("deliverTypeDate", parComDeliverTypeService.getParComDeliverType(deliverTypeId));
        }
	    return mav;
    }
    
    // 进入交货方式信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String deliverTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comDeliverType_mgr/parComDeliverType_form");
        if(StringUtils.isNotBlank(deliverTypeId)){
            mav.addObject("deliverTypeDate", parComDeliverTypeService.getParComDeliverType(deliverTypeId));
        }
        return mav;
    }
    
    // 增加交货方式信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParComDeliverType parComDeliverType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parComDeliverTypeService.addParComDeliverType(parComDeliverType);
    }
    
    //修改交货方式信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParComDeliverType parComDeliverType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parComDeliverTypeService.editParComDeliverType(parComDeliverType);
    }
    
    //批量删除交货方式信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parComDeliverTypeIds,@RequestParam List<String> parComDeliverTypeNames) {
    	return parComDeliverTypeService.delParComDeliverType(parComDeliverTypeIds, parComDeliverTypeNames);
    }
}
