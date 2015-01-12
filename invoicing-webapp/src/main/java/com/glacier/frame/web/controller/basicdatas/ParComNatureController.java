/**
 * @Title: ParComNatureController.java 
 * @Package com.glacier.frame.web.controller.basicdatas 
 * @author song.jundong   
 * @email 985776597@qq.com
 * @date 2015-1-8 下午3:18:24 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2015-1-8
                修改人：song.jundong 
                修改内容简介 ：
            </p>              
 * @Review (审核人) ：song.jundong 
 * 
 */
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
import com.glacier.frame.dto.query.basicdatas.ParComNatureQueryDTO; 
import com.glacier.frame.entity.basicdatas.ParComNature; 
import com.glacier.frame.service.basicdatas.ParComNatureService;
import com.glacier.jqueryui.util.JqPager;

/**
 * @ClassName:  ParComNatureController
 * @Description: TODO(公司性质控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2015-1-8  下午3:18:24
 */
@Controller
@RequestMapping(value = "/comNature")
public class ParComNatureController extends AbstractController{


    @Autowired
    private ParComNatureService parComNatureService;// 注入service
    
    // 进入列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexParea() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comNature_mgr/suppliersNature");
        return mav;
    }
     
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager jqPager, ParComNatureQueryDTO parComNatureQueryDTO) {
        return parComNatureService.listAsGrid(jqPager, parComNatureQueryDTO);
    }
    
     // 进入表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object inForme(String suppliersNatureId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comNature_mgr/suppliersNature_form");
        if(StringUtils.isNotBlank(suppliersNatureId)){
            mav.addObject("suppliersNatureData", parComNatureService.getParComNature(suppliersNatureId));
        }
        return mav;
    }
    
    // 进入Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoParComNatureDetailPage(String suppliersNatureId) {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/comNature_mgr/suppliersNature_detail");
        if(StringUtils.isNotBlank(suppliersNatureId)){
            mav.addObject("suppliersNatureData", parComNatureService.getParComNature(suppliersNatureId));
        }
        return mav;
    }
    
     //新增公司规模
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addSuppliersNature(@Valid ParComNature parComNature, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return parComNatureService.addParComNature(parComNature);
    }  
    
    // 修改公司规模
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid ParComNature parComNature, BindingResult bindingResult) {
         return parComNatureService.editParComNature(parComNature);
    }
    
    // 删除公司规模
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object del(@RequestParam List<String> suppliersNatureIds,@RequestParam List<String> suppliersNatureNames) {
        return parComNatureService.delSuppliersNature(suppliersNatureIds, suppliersNatureNames);
    }

}
