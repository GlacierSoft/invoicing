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
import com.glacier.frame.dto.query.basicdatas.ParSellTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSellType;
import com.glacier.frame.service.basicdatas.ParSellTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParSellTypeController
 * @Description: TODO(销销售类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/sellType")
public class ParSellTypeController extends AbstractController{

	@Autowired
	private ParSellTypeService parSellTypeService;
	
	//进入销销售类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellType_mgr/sellType");
        return mav;
    } 
    
    //获取表格结构的所有销销售类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParSellTypeQueryDTO carTypeQueryDTO) {
        return parSellTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入销销售类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String sellTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/sellType_mgr/sellType_detail");
        if(StringUtils.isNotBlank(sellTypeId)){
            mav.addObject("sellTypeDate", parSellTypeService.getParSellType(sellTypeId));
        }
	    return mav;
    }
    
    //进入销销售类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String sellTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellType_mgr/sellType_form");
        if(StringUtils.isNotBlank(sellTypeId)){
            mav.addObject("sellTypeDate", parSellTypeService.getParSellType(sellTypeId));
        }
        return mav;
    }
    
    //增加销销售类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParSellType parSellType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parSellTypeService.addParSellType(parSellType);
    }
    
    //修改销销售类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParSellType parSellType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parSellTypeService.editParSellType(parSellType);
    }
    
    //批量删除销销售类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> sellTypeIds,@RequestParam List<String> sellTypeNames) {
    	return parSellTypeService.delParSellType(sellTypeIds, sellTypeNames);
    }
}
