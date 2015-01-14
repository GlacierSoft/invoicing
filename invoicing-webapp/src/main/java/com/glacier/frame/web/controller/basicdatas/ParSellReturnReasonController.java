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
import com.glacier.frame.dto.query.basicdatas.ParSellReturnReasonQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSellReturnReason;
import com.glacier.frame.service.basicdatas.ParSellReturnReasonService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParSellReturnReasonController
 * @Description: TODO(销售退货原因controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/sellReturnReason")
public class ParSellReturnReasonController extends AbstractController{

	@Autowired
	private ParSellReturnReasonService parSellReturnReasonService;
	
	//进入销售退货原因信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellReturnReason_mgr/sellReturnReason");
        return mav;
    } 
    
    //获取表格结构的所有销售退货原因数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParSellReturnReasonQueryDTO carTypeQueryDTO) {
        return parSellReturnReasonService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入销售退货原因信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String returnReasonId) { 
    	ModelAndView mav = new ModelAndView("basicdatas_mgr/sellReturnReason_mgr/sellReturnReason_detail");
        if(StringUtils.isNotBlank(returnReasonId)){
            mav.addObject("sellReturnReasonDate", parSellReturnReasonService.getParSellReturnReason(returnReasonId));
        }
	    return mav;
    }
    
    //进入销售退货原因信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String returnReasonId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellReturnReason_mgr/sellReturnReason_form");
        if(StringUtils.isNotBlank(returnReasonId)){
            mav.addObject("sellReturnReasonDate", parSellReturnReasonService.getParSellReturnReason(returnReasonId));
        }
        return mav;
    }
    
    //增加销售退货原因信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParSellReturnReason parSellReturnReason, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parSellReturnReasonService.addParSellReturnReason(parSellReturnReason);
    }
    
    //修改销售退货原因信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParSellReturnReason parSellReturnReason, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parSellReturnReasonService.editParSellReturnReason(parSellReturnReason);
    }
    
    //批量删除销售退货原因信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> returnReasonIds,@RequestParam List<String> returnReasonNames) {
    	return parSellReturnReasonService.delParSellReturnReason(returnReasonIds, returnReasonNames);
    }
}
