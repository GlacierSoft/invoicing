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
import com.glacier.frame.dto.query.basicdatas.ParFinanceReceivableTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParFinanceReceivableType;
import com.glacier.frame.service.basicdatas.ParFinanceReceivableTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParFinanceReceivableTypeController
 * @Description: TODO(应收类型controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/financeReceivableType")
public class ParFinanceReceivableTypeController extends AbstractController{

	@Autowired
	private ParFinanceReceivableTypeService parFinanceReceivableTypeService;
	
	//进入应收类型信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/financeReceivableType_mgr/financeReceivableType");
        return mav;
    } 
    
    //获取表格结构的所有应收类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParFinanceReceivableTypeQueryDTO carTypeQueryDTO) {
        return parFinanceReceivableTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入应收类型信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String receivableTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/financeReceivableType_mgr/financeReceivableType_detail");
        if(StringUtils.isNotBlank(receivableTypeId)){
            mav.addObject("financeReceivableTypeDate", parFinanceReceivableTypeService.getParFinanceReceivableType(receivableTypeId));
        }
	    return mav;
    }
    
    //进入应收类型信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String receivableTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/financeReceivableType_mgr/financeReceivableType_form");
        if(StringUtils.isNotBlank(receivableTypeId)){
            mav.addObject("financeReceivableTypeDate", parFinanceReceivableTypeService.getParFinanceReceivableType(receivableTypeId));
        }
        return mav;
    }
    
    //增加应收类型信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParFinanceReceivableType parFinanceReceivableType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parFinanceReceivableTypeService.addParFinanceReceivableType(parFinanceReceivableType);
    }
    
    //修改应收类型信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParFinanceReceivableType parFinanceReceivableType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parFinanceReceivableTypeService.editParFinanceReceivableType(parFinanceReceivableType);
    }
    
    //批量删除应收类型信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> receivableTypeIds,@RequestParam List<String> names) {
    	return parFinanceReceivableTypeService.delParFinanceReceivableType(receivableTypeIds, names);
    }
}
