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
import com.glacier.frame.dto.query.system.RoleQueryDTO;
import com.glacier.frame.entity.system.Role;
import com.glacier.frame.service.system.MenuService;
import com.glacier.frame.service.system.RoleService;

/***
 * @ClassName:  RoleController
 * @Description: TODO(角色Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午5:05:40
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController extends AbstractController{

    @Autowired
    private RoleService roleService;// 注入角色业务Bean
    
    @Autowired
    private MenuService menuService;// 注入菜单业务Bean

    // 进入角色列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("system_mgr/role_mgr/role");
        return mav;
    }
    
    // 进入角色Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRoleFormPage(String roleId) {
        ModelAndView mav = new ModelAndView("system_mgr/role_mgr/role_form");
        if(StringUtils.isNotBlank(roleId)){
            mav.addObject("roleData", roleService.getRole(roleId));
        }
        return mav;
    }
    
    // 进入角色Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRoleDetailPage(String roleId) {
        ModelAndView mav = new ModelAndView("system_mgr/role_mgr/role_detail");
        if(StringUtils.isNotBlank(roleId)){
            mav.addObject("roleData", roleService.getRole(roleId));
        }
        return mav;
    }
    
    // 检索表格结构的角色数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRoleAsGridByMenuId(RoleQueryDTO roleQueryDTO, JqPager pager) {
        return roleService.listAsGrid(roleQueryDTO,pager);
    }
    
    // 增加角色
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRole(@Valid Role role, BindingResult bindingResult) throws Exception {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return roleService.addRole(role);
    }
    
    // 修改角色
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRole(@Valid Role role, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return roleService.editRole(role);
    }
    
    //批量删除角色
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRoles(@RequestParam List<String> roleIds,@RequestParam List<String> roleCnNames) {
        return roleService.delRoles(roleIds, roleCnNames);
    }
}
