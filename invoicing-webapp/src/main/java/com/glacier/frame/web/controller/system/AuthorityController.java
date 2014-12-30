package com.glacier.frame.web.controller.system;

import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.glacier.frame.service.system.AuthorityService;

/**
 * @ClassName: AuthorityController
 * @Description: TODO(权限控制器，处理所有权限相关请求、权限资源获取)
 * @author songjundong
 * @email 985776597@qq.com
 * @date 2014-08-18 上午10:45:58
 */

@Controller
@RequestMapping(value = "/auth")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;// 注入菜单业务Bean

    // 获取当前用户授权菜单树
    @RequestMapping(value = "/getPrincipalUserMenu.json", method = RequestMethod.POST)
    @ResponseBody
    private Object getPrincipalUserMenu() {
        return authorityService.getPrincipalUserMenu();
    }

    // 根据角色Id获取面板操作权限
    @RequestMapping(value = "/getAuthsByRoleId.json")
    @ResponseBody
    public Object getAuthsByRoleId(@RequestParam String roleId) {
        return authorityService.getAuthsByRoleId(roleId);
    }
    
    // 根据用户Id获取角色列表
    @RequestMapping(value = "/getRolesAndRational.json")
    @ResponseBody
    public Object getRolesAndRational(@RequestParam String userId) {
        return authorityService.getRolesAndRational(userId);
    }

    //保存菜单操作关联
    @RequestMapping(value = "/saveMenuActions", method = RequestMethod.POST)
    @ResponseBody
    public Object saveMenuActions(@RequestParam String roleId, @RequestParam Set<String> menuIds, @RequestParam Set<String> authActions) {
        return authorityService.saveRoleAuths(roleId, menuIds, authActions);
    }
    
    //保存用户角色关联
    @RequestMapping(value = "/saveRolesAndRational", method = RequestMethod.POST)
    @ResponseBody
    public Object saveRolesAndRational(@RequestParam String userId, @RequestParam Set<String> roleIds) {
        return authorityService.saveRolesAndRational(userId, roleIds);
    }
    
    
}
