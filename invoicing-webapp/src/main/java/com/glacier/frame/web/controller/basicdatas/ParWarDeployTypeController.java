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
import com.glacier.frame.dto.query.basicdatas.ParWarDeployTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParWarDeployType;
import com.glacier.frame.service.basicdatas.ParWarDeployTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParWarDeployTypeController
 * @Description: TODO(调拨类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-14
 */
@Controller
@RequestMapping(value = "/warDeployType")
public class ParWarDeployTypeController extends AbstractController{

	@Autowired
	private ParWarDeployTypeService parWarDeployTypeService;
	
	//进入调拨类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoDeploydexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warDeployType_mgr/warDeployType");
        return mav;
    } 
    
    //获取表格结构的所有调拨类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParWarDeployTypeQueryDTO carTypeQueryDTO) {
        return parWarDeployTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入调拨类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String warDeployTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/warDeployType_mgr/warDeployType_detail");
        if(StringUtils.isNotBlank(warDeployTypeId)){
            mav.addObject("warDeployTypeDate", parWarDeployTypeService.getParWarDeployType(warDeployTypeId));
        }
	    return mav;
    }
    
    //进入调拨类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String warDeployTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warDeployType_mgr/warDeployType_form");
        if(StringUtils.isNotBlank(warDeployTypeId)){
            mav.addObject("warDeployTypeDate", parWarDeployTypeService.getParWarDeployType(warDeployTypeId));
        }
        return mav;
    }
    
    //增加调拨类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParWarDeployType parWarDeployType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarDeployTypeService.addParWarDeployType(parWarDeployType);
    }
    
    //修改调拨类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParWarDeployType parWarDeployType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarDeployTypeService.editParWarDeployType(parWarDeployType);
    }
    
    //批量删除调拨类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parWarDeployTypeIds,@RequestParam List<String> parWarDeployTypeNames) {
    	return parWarDeployTypeService.delParWarDeployType(parWarDeployTypeIds, parWarDeployTypeNames);
    }
}
