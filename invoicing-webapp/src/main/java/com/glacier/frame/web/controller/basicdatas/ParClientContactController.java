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
import com.glacier.frame.dto.query.basicdatas.ParClientContactQueryDTO;
import com.glacier.frame.entity.basicdatas.ParClientContact;
import com.glacier.frame.service.basicdatas.BasisClientService;
import com.glacier.frame.service.basicdatas.ParClientContactService;
import com.glacier.frame.service.basicdatas.ParComContactTypeService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  ParClientContactController
 * @Description: TODO(客户联系人controller)
 * @author wuting
 * @email 920339213@QQ.com
 * @date 2015-1-13
 */
@Controller
@RequestMapping(value = "/clientContact")
public class ParClientContactController extends AbstractController{

    @Autowired
    private ParClientContactService parClientContactService;
    
    @Autowired
    private ParComContactTypeService parComContactTypeService;
    
    @Autowired
    private BasisClientService basisClientService;
    
    //进入客户联系人信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientContact_mgr/clientContact");
        return mav;
    } 
    
    //获取表格结构的所有客户联系人数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParClientContactQueryDTO clientContactQueryDTO) {
        return parClientContactService.listAsGrid(jqPager, clientContactQueryDTO);
    }
      
    //进入客户联系人信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberGradeDetailPage(String clientContactId) { 
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientContact_mgr/clientContact_detail");
        if(StringUtils.isNotBlank(clientContactId)){
            mav.addObject("clientContactDate", parClientContactService.getParClientContact(clientContactId));
        }
        return mav;
    }
    
    //进入客户联系人信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoGradeFormPnews(String clientContactId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/clientContact_mgr/clientContact_form");
        if(StringUtils.isNotBlank(clientContactId)){
            mav.addObject("clientContactDate", parClientContactService.getParClientContact(clientContactId));
        }
        mav.addObject("contactType", parComContactTypeService.getContactTypeCombo());
        mav.addObject("client", basisClientService.getClientCombo());
        return mav;
    }
    
    //增加客户联系人信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addGrade(@Valid ParClientContact parClientContact, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientContactService.addParClientContact(parClientContact);
    }
    
    //修改客户联系人信息
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editGrade(@Valid ParClientContact parClientContact, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parClientContactService.editParClientContact(parClientContact);
    }
    
    //批量删除客户联系人信息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delGrade(@RequestParam List<String> clientContactIds,@RequestParam List<String> names) {
        return parClientContactService.delParClientContact(clientContactIds, names);
    }
}
