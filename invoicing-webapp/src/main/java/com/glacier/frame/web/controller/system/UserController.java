package com.glacier.frame.web.controller.system;

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
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.system.UserQueryDTO;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.service.system.UserService;

/*** 
 * @ClassName:  UserController
 * @Description: TODO(用户controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:05:59
 */

@Controller
@RequestMapping(value = "/user")
public class UserController extends AbstractController{
	
	@Autowired
	private UserService userService;// 注入用户业务Bean
	
	//进入用户业务列表展示页面
	@RequestMapping(value = "/index.htm")
	private Object intoIndexPage(){
		ModelAndView mav = new ModelAndView("system_mgr/user_mgr/user");
		return mav;
	}
	
	// 进入用户Form表单页面
	@RequestMapping(value = "/intoForm.htm")
	private Object intoUsertFormPage(String userId){
		ModelAndView mav = new ModelAndView("system_mgr/user_mgr/user_form");
		if(StringUtils.isNotBlank(userId)){
			mav.addObject("userData", userService.getUser(userId));
		}
		return mav;
	}
	
    // 进入用户Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoUserDetailPage(String userId) {
        ModelAndView mav = new ModelAndView("system_mgr/user_mgr/user_detail");
        if(StringUtils.isNotBlank(userId)){
            mav.addObject("UserData", userService.getUser(userId));
        }
        return mav;
    }
	
	// 获取表格结构的所有用户数据
	@RequestMapping(value = "/list.json", method = RequestMethod.POST)
	@ResponseBody
	private Object listActionAsGridByMenuId(UserQueryDTO userQueryDTO,JqPager pager){
		return userService.listAsGrid(userQueryDTO,pager);
	}
	
	//增加用户信息
	@RequestMapping(value = "/add.json", method = RequestMethod.POST)
	@ResponseBody
	private Object addUser(@Valid User user,BindingResult bindingResult) throws Exception{
		if(bindingResult.hasErrors()){// 后台校验的错误信息
			return returnErrorBindingResult(bindingResult);
		}
		return userService.addUser(user);
	}
	//修改用户信息
	@RequestMapping(value = "/edit.json" , method = RequestMethod.POST)
	@ResponseBody
	private Object editUser(@Valid User user , BindingResult bindingResult){
		if(bindingResult.hasErrors()){// 后台校验的错误信息
			return returnErrorBindingResult(bindingResult);
		}
		return userService.editUser(user);
	}
	//删除用户信息
	@RequestMapping(value = "/del.json" ,method = RequestMethod.POST)
	@ResponseBody
	private Object delUser(@RequestParam List<String> userIds,@RequestParam List<String> usernames){
		return userService.delUser(userIds, usernames);
	}
	
	//修改用户密码方法
	@RequestMapping(value = "/modifyPsd.json", method = RequestMethod.POST)
    @ResponseBody
    public Object modifyPsd(String oldPassword, String newPassword) {
        return userService.modifyPsd(oldPassword, newPassword);
    }
}
