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
import com.glacier.frame.dto.query.basicdatas.ParSellReturnTypeQueryDTO;
import com.glacier.frame.entity.basicdatas.ParSellReturnType;
import com.glacier.frame.service.basicdatas.ParSellReturnTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParSellReturnTypeController
 * @Description: TODO(销售退货方式controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/sellReturnType")
public class ParSellReturnTypeController extends AbstractController{

    @Autowired
    private ParSellReturnTypeService parSellReturnTypeService;
    
    //进入销售退货方式信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellReturnType_mgr/sellReturnType");
        return mav;
    } 
    
    //获取表格结构的所有销售退货方式数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParSellReturnTypeQueryDTO carTypeQueryDTO) {
        return parSellReturnTypeService.listAsGrid(jqPager, carTypeQueryDTO);
    }
      
    //进入销售退货方式信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String returnTypeId) { 
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellReturnType_mgr/sellReturnType_detail");
        if(StringUtils.isNotBlank(returnTypeId)){
            mav.addObject("sellReturnTypeDate", parSellReturnTypeService.getParSellReturnType(returnTypeId));
        }
        return mav;
    }
    
    //进入销售退货方式信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String returnTypeId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/sellReturnType_mgr/sellReturnType_form");
        if(StringUtils.isNotBlank(returnTypeId)){
            mav.addObject("sellReturnTypeDate", parSellReturnTypeService.getParSellReturnType(returnTypeId));
        }
        return mav;
    }
    
    //增加销售退货方式信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParSellReturnType parSellReturnType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parSellReturnTypeService.addParSellReturnType(parSellReturnType);
    }
    
    //修改销售退货方式信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParSellReturnType parSellReturnType, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parSellReturnTypeService.editParSellReturnType(parSellReturnType);
    }
    
    //批量删除销售退货方式信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> returnTypeIds,@RequestParam List<String> returnTypeNames) {
        return parSellReturnTypeService.delParSellReturnType(returnTypeIds, returnTypeNames);
    }
}
