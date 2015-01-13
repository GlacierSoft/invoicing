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
import com.glacier.frame.dto.query.basicdatas.ParComContactTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParComContactType;
import com.glacier.frame.service.basicdatas.ParComContactTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParComContactTypeController
 * @Description: TODO(联系人类型Controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-08
 */
@Controller
@RequestMapping(value = "/comContactType")
public class ParComContactTypeController extends AbstractController{

	@Autowired
	private ParComContactTypeService parComContactTypeService;
	
	//进入联系人类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comContactType_mgr/comContactType");
        return mav;
    } 
    
    //获取表格结构的所有联系人类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParComContactTypeQueryDTO carTypeQueryDTO) {
        return parComContactTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入联系人类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String contactTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/comContactType_mgr/comContactType_detail");
        if(StringUtils.isNotBlank(contactTypeId)){
            mav.addObject("contactTypeDate", parComContactTypeService.getParComContactType(contactTypeId));
        }
	    return mav;
    }
    
    //进入联系人类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String contactTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comContactType_mgr/comContactType_form");
        if(StringUtils.isNotBlank(contactTypeId)){
            mav.addObject("contactTypeDate", parComContactTypeService.getParComContactType(contactTypeId));
        }
        return mav;
    }
    
    //增加联系人类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParComContactType parComContactType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parComContactTypeService.addParComContactType(parComContactType);
    }
    
    //修改联系人类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParComContactType parComContactType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parComContactTypeService.editParComContactType(parComContactType);
    }
    
    //批量删除联系人类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parComContactTypeIds,@RequestParam List<String> parComContactTypeNames) {
    	return parComContactTypeService.delParComContactType(parComContactTypeIds, parComContactTypeNames);
    }
}
