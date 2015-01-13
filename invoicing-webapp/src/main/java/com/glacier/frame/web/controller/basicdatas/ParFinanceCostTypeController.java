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
import com.glacier.frame.dto.query.basicdatas.ParFinanceCostTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParFinanceCostType;
import com.glacier.frame.service.basicdatas.ParFinanceCostTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParFinanceCostTypeController
 * @Description: TODO(费用类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/financeCostType")
public class ParFinanceCostTypeController extends AbstractController{

	@Autowired
	private ParFinanceCostTypeService parFinanceCostTypeService;
	
	//进入费用类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/financeCostType_mgr/financeCostType");
        return mav;
    } 
    
    //获取表格结构的所有费用类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParFinanceCostTypeQueryDTO carTypeQueryDTO) {
        return parFinanceCostTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入费用类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String costTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/financeCostType_mgr/financeCostType_detail");
        if(StringUtils.isNotBlank(costTypeId)){
            mav.addObject("financeCostTypeDate", parFinanceCostTypeService.getParFinanceCostType(costTypeId));
        }
	    return mav;
    }
    
    //进入费用类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String costTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/financeCostType_mgr/financeCostType_form");
        if(StringUtils.isNotBlank(costTypeId)){
            mav.addObject("financeCostTypeDate", parFinanceCostTypeService.getParFinanceCostType(costTypeId));
        }
        return mav;
    }
    
    //增加费用类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParFinanceCostType parFinanceCostType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parFinanceCostTypeService.addParFinanceCostType(parFinanceCostType);
    }
    
    //修改费用类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParFinanceCostType parFinanceCostType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parFinanceCostTypeService.editParFinanceCostType(parFinanceCostType);
    }
    
    //批量删除费用类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> costTypeIds,@RequestParam List<String> names) {
    	return parFinanceCostTypeService.delParFinanceCostType(costTypeIds, names);
    }
}
