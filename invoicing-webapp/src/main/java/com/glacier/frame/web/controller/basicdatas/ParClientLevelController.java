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
import com.glacier.frame.dto.query.basicdatas.ParClientLevelQueryDTO;
import com.glacier.frame.entity.basicdatas.ParClientLevel;
import com.glacier.frame.service.basicdatas.ParClientLevelService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParClientLevelController
 * @Description: TODO(客户等级controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/clientLevel")
public class ParClientLevelController extends AbstractController{

	@Autowired
	private ParClientLevelService parClientLevelService;
	
	//进入客户等级信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientLevel_mgr/clientLevel");
        return mav;
    } 
    
    //获取表格结构的所有客户等级数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParClientLevelQueryDTO carTypeQueryDTO) {
        return parClientLevelService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入客户等级信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String clientLevelId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/clientLevel_mgr/clientLevel_detail");
        if(StringUtils.isNotBlank(clientLevelId)){
            mav.addObject("clientLevelDate", parClientLevelService.getParClientLevel(clientLevelId));
        }
	    return mav;
    }
    
    //进入客户等级信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String clientLevelId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientLevel_mgr/clientLevel_form");
        if(StringUtils.isNotBlank(clientLevelId)){
            mav.addObject("clientLevelDate", parClientLevelService.getParClientLevel(clientLevelId));
        }
        return mav;
    }
    
    //增加客户等级信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParClientLevel parClientLevel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientLevelService.addParClientLevel(parClientLevel);
    }
    
    //修改客户等级信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParClientLevel parClientLevel, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientLevelService.editParClientLevel(parClientLevel);
    }
    
    //批量删除客户等级信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parClientLevelIds,@RequestParam List<String> parClientLevelNames) {
    	return parClientLevelService.delParClientLevel(parClientLevelIds, parClientLevelNames);
    }
}
