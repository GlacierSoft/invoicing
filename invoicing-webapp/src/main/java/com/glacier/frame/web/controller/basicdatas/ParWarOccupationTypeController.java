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
import com.glacier.frame.dto.query.basicdatas.ParWarOccupationTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParWarOccupationType;
import com.glacier.frame.service.basicdatas.ParWarOccupationTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParWarOccupationTypeController
 * @Description: TODO(锁定类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-14
 */
@Controller
@RequestMapping(value = "/warOccupationType")
public class ParWarOccupationTypeController extends AbstractController{

	@Autowired
	private ParWarOccupationTypeService parWarOccupationTypeService;
	
	//进入锁定类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoOccupationdexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warOccupationType_mgr/warOccupationType");
        return mav;
    } 
    
    //获取表格结构的所有锁定类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParWarOccupationTypeQueryDTO carTypeQueryDTO) {
        return parWarOccupationTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入锁定类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String warOccupationTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/warOccupationType_mgr/warOccupationType_detail");
        if(StringUtils.isNotBlank(warOccupationTypeId)){
            mav.addObject("warOccupationTypeDate", parWarOccupationTypeService.getParWarOccupationType(warOccupationTypeId));
        }
	    return mav;
    }
    
    //进入锁定类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String warOccupationTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/warOccupationType_mgr/warOccupationType_form");
        if(StringUtils.isNotBlank(warOccupationTypeId)){
            mav.addObject("warOccupationTypeDate", parWarOccupationTypeService.getParWarOccupationType(warOccupationTypeId));
        }
        return mav;
    }
    
    //增加锁定类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParWarOccupationType parWarOccupationType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarOccupationTypeService.addParWarOccupationType(parWarOccupationType);
    }
    
    //修改锁定类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParWarOccupationType parWarOccupationType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parWarOccupationTypeService.editParWarOccupationType(parWarOccupationType);
    }
    
    //批量删除锁定类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parWarOccupationTypeIds,@RequestParam List<String> parWarOccupationTypeNames) {
    	return parWarOccupationTypeService.delParWarOccupationType(parWarOccupationTypeIds, parWarOccupationTypeNames);
    }
}
