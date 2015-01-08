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
import com.glacier.frame.dto.query.basicdatas.ParPaymentTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParPaymentType;
import com.glacier.frame.service.basicdatas.ParPaymentTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParPaymentTypeController
 * @Description: TODO(支付方式controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-08
 */
@Controller
@RequestMapping(value = "/paymentType")
public class ParPaymentTypeController extends AbstractController{

	@Autowired
	private ParPaymentTypeService parPaymentTypeService;
	
	// 进入支付方式信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parPaymentType_mgr/parPaymentType");
        return mav;
    } 
    
    // 获取表格结构的所有支付方式数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParPaymentTypeQueryDTO carTypeQueryDTO) {
        return parPaymentTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    // 进入支付方式信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String paymentTypeId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/parPaymentType_mgr/parPaymentType_detail");
        if(StringUtils.isNotBlank(paymentTypeId)){
            mav.addObject("paymentTypeDate", parPaymentTypeService.getParPaymentType(paymentTypeId));
        }
	    return mav;
    }
    
    // 进入支付方式信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String paymentTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/parPaymentType_mgr/parPaymentType_form");
        if(StringUtils.isNotBlank(paymentTypeId)){
            mav.addObject("paymentTypeDate", parPaymentTypeService.getParPaymentType(paymentTypeId));
        }
        return mav;
    }
    
    // 增加支付方式信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParPaymentType parPaymentType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parPaymentTypeService.addParPaymentType(parPaymentType);
    }
    
    //修改支付方式信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParPaymentType parPaymentType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parPaymentTypeService.editParPaymentType(parPaymentType);
    }
    
    //批量删除支付方式信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> parPaymentTypeIds,@RequestParam List<String> parPaymentTypeNames) {
    	return parPaymentTypeService.delParPaymentType(parPaymentTypeIds, parPaymentTypeNames);
    }
}
