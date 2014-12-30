package com.glacier.frame.web.controller.system;

import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.frame.dto.query.system.LoginlogQueryDTO;
import com.glacier.frame.service.system.LoginLogService;

/*** 
 * @ClassName:  LoginLogController
 * @Description: TODO(登录日志)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:01:28
 */
@Controller
@RequestMapping(value = "/loginlog")
public class LoginLogController {
	
	@Autowired
	private LoginLogService loginLogService;
	
	// 进入登录日志列表展示页面
	@RequestMapping(value = "/index.htm")
	public Object intoIndexPage(){
		ModelAndView mav = new ModelAndView("system_mgr/loginlog_mgr/loginlog");
		return mav;
	}
	
	@RequestMapping(value = "/list.json" , method = RequestMethod.POST)
	@ResponseBody
	public Object listActionAsGridByMenuId(LoginlogQueryDTO loginlogQueryDTO,JqPager pager){
		return loginLogService.listAsGrid(loginlogQueryDTO,pager); 
	}
	
	// 进入日志Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoLoginLogDetailPage(String loginlogId) {
        ModelAndView mav = new ModelAndView("system_mgr/loginlog_mgr/loginlog_detail");
        if(StringUtils.isNotBlank(loginlogId)){
            mav.addObject("loginlogData", loginLogService.getLoginLog(loginlogId));
        }
        return mav;
    }
	
	// 删除日志
	@RequestMapping(value = "/del.json" , method = RequestMethod.POST)
	@ResponseBody
	public Object delLoginLog(@RequestParam List<String> loginlogIds , @RequestParam List<String> loginUsers){
		return loginLogService.delLoginLog(loginlogIds, loginUsers);
	}
}
