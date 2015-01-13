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
import com.glacier.frame.dto.query.basicdatas.ParClientSourceQueryDTO;
import com.glacier.frame.entity.basicdatas.ParClientSource;
import com.glacier.frame.service.basicdatas.ParClientSourceService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParClientSourceController
 * @Description: TODO(客户来源controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/clientSource")
public class ParClientSourceController extends AbstractController{

	@Autowired
	private ParClientSourceService parClientSourceService;
	
	//进入客户来源信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientSource_mgr/clientSource");
        return mav;
    } 
    
    //获取表格结构的所有客户来源数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParClientSourceQueryDTO carTypeQueryDTO) {
        return parClientSourceService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入客户来源信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String clientSourceId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/clientSource_mgr/clientSource_detail");
        if(StringUtils.isNotBlank(clientSourceId)){
            mav.addObject("clientSourceDate", parClientSourceService.getParClientSource(clientSourceId));
        }
	    return mav;
    }
    
    //进入客户来源信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String clientSourceId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientSource_mgr/clientSource_form");
        if(StringUtils.isNotBlank(clientSourceId)){
            mav.addObject("clientSourceDate", parClientSourceService.getParClientSource(clientSourceId));
        }
        return mav;
    }
    
    //增加客户来源信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParClientSource parClientSource, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientSourceService.addParClientSource(parClientSource);
    }
    
    //修改客户来源信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParClientSource parClientSource, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientSourceService.editParClientSource(parClientSource);
    }
    
    //批量删除客户来源信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parClientSourceIds,@RequestParam List<String> parClientSourceNames) {
    	return parClientSourceService.delParClientSource(parClientSourceIds, parClientSourceNames);
    }
}
