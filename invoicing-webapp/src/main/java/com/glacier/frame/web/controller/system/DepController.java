package com.glacier.frame.web.controller.system;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.frame.dto.query.system.DepQueryDTO;
import com.glacier.frame.entity.system.Dep;
import com.glacier.frame.service.system.DepService;
import com.glacier.jqueryui.util.JqPager;

/*** 
 * @ClassName:  DepController
 * @Description: TODO(部门controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:05:59
 */

@Controller
@RequestMapping(value = "/dep")
public class DepController extends AbstractController{
	
	@Autowired
	private DepService depService;// 注入部门业务Bean
	
	//进入部门业务列表展示页面
	@RequestMapping(value = "/index.htm")
	private Object intoIndexPage(){
		ModelAndView mav = new ModelAndView("system_mgr/dep_mgr/dep");
		return mav;
	}
	
	// 进入部门Form表单页面
	@RequestMapping(value = "/intoForm.htm")
	private Object intoDeptFormPage(String depId){
		ModelAndView mav = new ModelAndView("system_mgr/dep_mgr/dep_form");
		mav.addObject("allDepTreeNodeData", depService.getAllTreeDepNode(true));
		if(StringUtils.isNotBlank(depId)){
			mav.addObject("DepData", depService.getDep(depId));
		}
		return mav;
	}
	
    // 进入部门Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoDepDetailPage(String depId) {
        ModelAndView mav = new ModelAndView("system_mgr/dep_mgr/dep_detail");
        if(StringUtils.isNotBlank(depId)){
            mav.addObject("DepData", depService.getDep(depId));
        }
        return mav;
    }
	
	// 获取表格结构的所有部门数据
	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
	@ResponseBody
	private Object listActionAsGridByMenuId(DepQueryDTO depQueryDTO,JqPager pager){
		return depService.listAsGrid(depQueryDTO,pager);
	}
	
	//增加部门信息
	@RequestMapping(value = "/add.json", method = RequestMethod.POST)
	@ResponseBody
	private Object addDep(@Valid Dep dep,BindingResult bindingResult) throws Exception{
		if(bindingResult.hasErrors()){// 后台校验的错误信息
			return returnErrorBindingResult(bindingResult);
		}
		return depService.addDep(dep);
	}
	//修改部门信息
	@RequestMapping(value = "/edit.json" , method = RequestMethod.POST)
	@ResponseBody
	private Object editDep(@Valid Dep dep , BindingResult bindingResult){
		if(bindingResult.hasErrors()){// 后台校验的错误信息
			return returnErrorBindingResult(bindingResult);
		}
		return depService.editDep(dep);
	}
	
}
