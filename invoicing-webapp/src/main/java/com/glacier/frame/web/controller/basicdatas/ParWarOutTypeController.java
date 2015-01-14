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
import com.glacier.frame.dto.query.basicdatas.ParWarOutTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParWarOutType;
import com.glacier.frame.service.basicdatas.ParWarOutTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParWarOutTypeController
 * @Description: TODO(出库业务类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-14
 */
@Controller
@RequestMapping(value = "/warOutType")
public class ParWarOutTypeController extends AbstractController{

	@Autowired
	private ParWarOutTypeService parWarOutTypeService;
	
	//进出出库业务类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoOutdexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warOutType_mgr/warOutType");
        return mav;
    } 
    
    //获取表格结构的所有出库业务类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParWarOutTypeQueryDTO carTypeQueryDTO) {
        return parWarOutTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进出出库业务类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String warOutTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/warOutType_mgr/warOutType_detail");
        if(StringUtils.isNotBlank(warOutTypeId)){
            mav.addObject("warOutTypeDate", parWarOutTypeService.getParWarOutType(warOutTypeId));
        }
	    return mav;
    }
    
    //进出出库业务类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String warOutTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warOutType_mgr/warOutType_form");
        if(StringUtils.isNotBlank(warOutTypeId)){
            mav.addObject("warOutTypeDate", parWarOutTypeService.getParWarOutType(warOutTypeId));
        }
        return mav;
    }
    
    //增加出库业务类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParWarOutType parWarOutType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarOutTypeService.addParWarOutType(parWarOutType);
    }
    
    //修改出库业务类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParWarOutType parWarOutType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarOutTypeService.editParWarOutType(parWarOutType);
    }
    
    //批量删除出库业务类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parWarOutTypeIds,@RequestParam List<String> parWarOutTypeNames) {
    	return parWarOutTypeService.delParWarOutType(parWarOutTypeIds, parWarOutTypeNames);
    }
}
