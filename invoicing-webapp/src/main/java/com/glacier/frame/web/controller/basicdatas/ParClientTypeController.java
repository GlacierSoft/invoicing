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
import com.glacier.frame.dto.query.basicdatas.ParClientTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParClientType;
import com.glacier.frame.service.basicdatas.ParClientTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParClientTypeController
 * @Description: TODO(客户类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/clientType")
public class ParClientTypeController extends AbstractController{

	@Autowired
	private ParClientTypeService parClientTypeService;
	
	//进入客户类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientType_mgr/clientType");
        return mav;
    } 
    
    //获取表格结构的所有客户类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParClientTypeQueryDTO carTypeQueryDTO) {
        return parClientTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入客户类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String clientTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/clientType_mgr/clientType_detail");
        if(StringUtils.isNotBlank(clientTypeId)){
            mav.addObject("clientTypeDate", parClientTypeService.getParClientType(clientTypeId));
        }
	    return mav;
    }
    
    //进入客户类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String clientTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientType_mgr/clientType_form");
        if(StringUtils.isNotBlank(clientTypeId)){
            mav.addObject("clientTypeDate", parClientTypeService.getParClientType(clientTypeId));
        }
        return mav;
    }
    
    //增加客户类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParClientType parClientType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientTypeService.addParClientType(parClientType);
    }
    
    //修改客户类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParClientType parClientType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientTypeService.editParClientType(parClientType);
    }
    
    //批量删除客户类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parClientTypeIds,@RequestParam List<String> parClientTypeNames) {
    	return parClientTypeService.delParClientType(parClientTypeIds, parClientTypeNames);
    }
}
