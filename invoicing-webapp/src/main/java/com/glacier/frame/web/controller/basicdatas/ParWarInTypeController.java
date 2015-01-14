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
import com.glacier.frame.dto.query.basicdatas.ParWarInTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParWarInType;
import com.glacier.frame.service.basicdatas.ParWarInTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParWarInTypeController
 * @Description: TODO(入库业务类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/warInType")
public class ParWarInTypeController extends AbstractController{

	@Autowired
	private ParWarInTypeService parWarInTypeService;
	
	//进入入库业务类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warInType_mgr/warInType");
        return mav;
    } 
    
    //获取表格结构的所有入库业务类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParWarInTypeQueryDTO carTypeQueryDTO) {
        return parWarInTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入入库业务类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String warInTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/warInType_mgr/warInType_detail");
        if(StringUtils.isNotBlank(warInTypeId)){
            mav.addObject("warInTypeDate", parWarInTypeService.getParWarInType(warInTypeId));
        }
	    return mav;
    }
    
    //进入入库业务类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String warInTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warInType_mgr/warInType_form");
        if(StringUtils.isNotBlank(warInTypeId)){
            mav.addObject("warInTypeDate", parWarInTypeService.getParWarInType(warInTypeId));
        }
        return mav;
    }
    
    //增加入库业务类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParWarInType parWarInType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarInTypeService.addParWarInType(parWarInType);
    }
    
    //修改入库业务类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParWarInType parWarInType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarInTypeService.editParWarInType(parWarInType);
    }
    
    //批量删除入库业务类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parWarInTypeIds,@RequestParam List<String> parWarInTypeNames) {
    	return parWarInTypeService.delParWarInType(parWarInTypeIds, parWarInTypeNames);
    }
}
