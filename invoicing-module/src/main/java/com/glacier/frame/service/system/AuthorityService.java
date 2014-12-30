/**
 * @Title: AuthorityService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date  2014-8-18  下午2:47:36
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-8-18
				修改人：songjundong 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：songjundong
 * 
 */
package com.glacier.frame.service.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
import com.glacier.frame.dao.system.ActionMapper;
import com.glacier.frame.dao.system.AuthorityMapper;
import com.glacier.frame.dao.system.MenuMapper;
import com.glacier.frame.dao.system.RoleMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.dao.system.UserRoleMapper;
import com.glacier.frame.dto.service.system.AuthMenuActionDTO;
import com.glacier.frame.entity.common.util.CommonBuiltin;
import com.glacier.frame.entity.system.Action;
import com.glacier.frame.entity.system.ActionExample;
import com.glacier.frame.entity.system.Authority;
import com.glacier.frame.entity.system.AuthorityExample;
import com.glacier.frame.entity.system.Menu;
import com.glacier.frame.entity.system.MenuExample;
import com.glacier.frame.entity.system.Role;
import com.glacier.frame.entity.system.RoleExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.entity.system.UserRoleExample;
import com.glacier.frame.entity.system.UserRoleKey;
import com.glacier.frame.util.MethodLog;
 
/***
 * @ClassName:  AuthorityService
 * @Description: TODO(权限)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18   下午2:47:36
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class AuthorityService {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private ActionMapper actionMapper;

    @Autowired
    private AuthorityMapper authorityMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * @Title: getPrincipalUserMenu
     * @Description: TODO(获取用户可用Menu)
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public Object getPrincipalUserMenu() {
        User principalUser = (User) SecurityUtils.getSubject().getPrincipal();// 获取已认证对象
        List<Menu> principalMenus = menuMapper.selectByUserId(principalUser.getUserId());
        List<Tree> principalMenuTrees = new ArrayList<Tree>();
        for (Menu menu : principalMenus) {
            Tree menuTree = new Tree();
            Map<String, String> treeAttributes = new HashMap<String, String>();
            menuTree.setId(menu.getMenuId());
            menuTree.setPid(menu.getPid());
            menuTree.setText(menu.getMenuCnName());
            menuTree.setIconCls(menu.getIconCls());
            treeAttributes.put("url", menu.getUrl());
            menuTree.setAttributes(treeAttributes);
            //menuTree.setState("closed");//会出现无穷循环
            principalMenuTrees.add(menuTree);
        }
        return principalMenuTrees;
    }

    /**
     * @Title: getAuthsByRoleId
     * @Description: TODO(根据角色获取权限)
     * @param @param roleId
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object getAuthsByRoleId(String roleId) {
        List<AuthMenuActionDTO> returnAuthList = new ArrayList<AuthMenuActionDTO>();// 要返回的List数据
        List<Menu> sysNaviMenus = menuMapper.selectByExample(new MenuExample());// 获取系统导航菜单列表
        if (null != sysNaviMenus && sysNaviMenus.size() > 0) {
            AuthorityExample authorityExample = new AuthorityExample();
            authorityExample.createCriteria().andRoleIdEqualTo(roleId);
            List<Authority> roleAuths = authorityMapper.selectByExample(authorityExample);// 获取角色权限
            Map<String, Authority> authsMap = new HashMap<String, Authority>();
            for (Authority authority : roleAuths) {
                authsMap.put(authority.getMenuId() + "_" + authority.getRoleId(), authority);// 以menuId和roleId构建权限Map
            }
            for (Menu menu : sysNaviMenus) {
                String menuId = menu.getMenuId();
                String menuParentId = menu.getPid();
                String menuCnName = menu.getMenuCnName();
                String iconCls = menu.getIconCls();
                // 构建菜单列表树
                AuthMenuActionDTO authMenuActionVO = new AuthMenuActionDTO();
                authMenuActionVO.setId(menuId);
                authMenuActionVO.setPid(menuParentId);
                authMenuActionVO.setMenuName(menuCnName);
                authMenuActionVO.setIconCls(iconCls);
                if (authsMap.containsKey(menu.getMenuId() + "_" + roleId)) {
                    authMenuActionVO.setChecked(true);
                }
                String[] ownActions = null;
                Authority roleAuth = authsMap.get(menuId + "_" + roleId);
                if (null != roleAuth && StringUtils.isNotBlank(roleAuth.getActions())) {
                    ownActions = roleAuth.getActions().split(",");
                }
                // 查找菜单所有的操作集合
                ActionExample actionExample = new ActionExample();
                actionExample.createCriteria().andMenuIdEqualTo(menuId);
                actionExample.setOrderByClause("temp_action.order_num asc");
                List<Action> actions = actionMapper.selectByExample(actionExample);
                StringBuilder menuActionsBuilder = new StringBuilder();// 构建操作返回字符串，拼复选框，后台编写提高效率
                if (null != actions && actions.size() > 0) {
                    menuActionsBuilder.append("<table class='auth_table'>");
                    Map<String, List<Action>> panelActionsMap = new HashMap<String, List<Action>>();
                    for (Action action : actions) {
                        if (panelActionsMap.containsKey(action.getPanelCnName())) {
                            panelActionsMap.get(action.getPanelCnName()).add(action);
                        } else {
                            List<Action> actionTemps = new ArrayList<Action>();
                            actionTemps.add(action);
                            panelActionsMap.put(action.getPanelCnName(), actionTemps);
                        }
                    }
                    Set<String> keySet = panelActionsMap.keySet();
                    for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
                        String key = it.next();
                        List<Action> actionTemps = panelActionsMap.get(key);
                        menuActionsBuilder.append("<tr><td><span class='label label-info'>");
                        menuActionsBuilder.append(key + "：");
                        menuActionsBuilder.append("</span></td><td>");
                        for (Action action : actionTemps) {
                            menuActionsBuilder.append("<input name='actionCB' type='checkbox' id='" + menu.getMenuId() + ":" + action.getPanelEnName() + "_" + action.getActionEnName() + "' ");
                            boolean checked = false;
                            if (null != ownActions && ownActions.length > 0) {
                                for (String ownAction : ownActions) {
                                    if ((action.getPanelEnName() + "_" + action.getActionEnName()).equals(ownAction)) {
                                        checked = true;
                                    }
                                }
                            }
                            if (checked) {
                                menuActionsBuilder.append("checked=" + checked);
                            }
                            menuActionsBuilder.append(" /><span class='auth_span'>" + action.getActionCnName() + "</span> ");
                        }
                    }
                    menuActionsBuilder.append("</td></tr></table>");
                    String menuActions = menuActionsBuilder.toString();
                    authMenuActionVO.setActions(menuActions);
                }
                returnAuthList.add(authMenuActionVO);
            }
        }
        return returnAuthList;
    }
    
    /**
     * @Title: getRolesAndRational
     * @Description: TODO(根据用户Id获取角色列表)
     * @param @param userId
     * @param @return
     * @throws 备注
     *<p>
     *已检查测试:Green
     *<p>
     */
    public Object getRolesAndRational(String userId) {
        RoleExample roleExample = new RoleExample();// 后面做优化，需要开
        List<Role> roles = roleMapper.selectByExample(roleExample);
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<UserRoleKey> userRoleList = userRoleMapper.selectByExample(userRoleExample);// 查找传入用户Id拥有的角色
        for (Role role : roles) {
            UserRoleKey userRoleKey = new UserRoleKey();
            userRoleKey.setUserId(userId);
            userRoleKey.setRoleId(role.getRoleId());
            if (userRoleList.contains(userRoleKey)) {
                role.setChecked(true);
            }
        }
        return roles;
    }

    /**
     * @Title: saveRoleAuths
     * @Description: TODO(保存角色权限)
     * @param @param roleId
     * @param @param menuIds
     * @param @param authActions
     * @param @return
     * @throws 备注
     *<p>
     *已检查测试:Green
     *<p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RoleList_auth")
    public Object saveRoleAuths(String roleId, Set<String> menuIds, Set<String> authActions) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();//管理员类型用户只有所属创建者才能对其进行分配角色
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        // 管理员类型用户只有所属创建者才能进行修改
        Role originalRole = roleMapper.selectByPrimaryKey(roleId);// 获取原角色相关信息
        // 管理员类型角色只有所属创建者才能进行修改
        if (originalRole.getBuiltin() == CommonBuiltin.admin) {
            if (!pricipalUser.getUserId().equals(originalRole.getCreater())) {
                returnResult.setMsg("管理员类型角色只有所属创建者才能对其进行授权");
                return returnResult;
            }
        }
        AuthorityExample authExample = new AuthorityExample();
        authExample.createCriteria().andRoleIdEqualTo(roleId);
        authorityMapper.deleteByExample(authExample);// 先删除角色权限关联表中的roleId的数据
        if (null != menuIds && menuIds.size() > 0) {// 　判断关联数据是否为空
            for (String menuId : menuIds) {// 循环插入关联表数据
                Authority authorityTemp = new Authority();
                authorityTemp.setRoleId(roleId);
                authorityTemp.setMenuId(menuId);
                count = authorityMapper.insert(authorityTemp);// 插入关联表数据
            }
        }
        if (null != authActions && authActions.size() > 0) {
            Map<String, String> menuMap = new HashMap<String, String>();
            for (String menuAction : authActions) {
                String[] menuActionString = menuAction.split(":");
                String menuId = menuActionString[0];
                String actionString = menuActionString[1];
                if (menuMap.containsKey(menuId)) {
                    StringBuilder actions = new StringBuilder(menuMap.get(menuId));
                    actions.append("," + actionString);
                    menuMap.put(menuId, actions.toString());
                } else {
                    menuMap.put(menuId, actionString);
                }
            }
            for (Entry<String, String> entry : menuMap.entrySet()) {
                Authority Authority = new Authority();
                Authority.setRoleId(roleId);
                Authority.setMenuId(entry.getKey());
                Authority.setActions(entry.getValue());
                count = authorityMapper.updateByPrimaryKey(Authority);
            }
        }
        if (count > 0) {
            returnResult.setSuccess(true);
            returnResult.setMsg("权限信息已保存");
        } else {
            returnResult.setMsg("权限信息更新失败");
        }
        return returnResult;
    }

    /**
     * @Title: saveRolesAndRational
     * @Description: TODO(保存用户角色关联)
     * @param @param userId
     * @param @param roleIds
     * @param @return
     * @throws 备注
     *<p>
     *已检查测试:Green
     *<p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RoleList_assign")
    public Object saveRolesAndRational(String userId, Set<String> roleIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();//管理员类型用户只有所属创建者才能对其进行分配角色
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        User originalUser = userMapper.selectByPrimaryKey(userId);// 获取原用户相关信息
        // 管理员类型用户只有所属创建者才能进行修改
        if (originalUser.getBuiltin() == CommonBuiltin.admin) {
            if (!pricipalUser.getUserId().equals(originalUser.getCreater())) {
                returnResult.setMsg("管理员类型用户只有所属创建者才能对其进行分配角色");
                return returnResult;
            }
        }
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(userId);
        count = userRoleMapper.deleteByExample(userRoleExample);
        if (null != roleIds && roleIds.size() > 0) {
            for (String roleId : roleIds) {
                UserRoleKey userRoleKey = new UserRoleKey();
                userRoleKey.setUserId(userId);
                userRoleKey.setRoleId(roleId);
                count += userRoleMapper.insert(userRoleKey);// 插入用户和角色关联表数据
            }
        }
        if (count > 0) {
            returnResult.setSuccess(true);
            returnResult.setMsg("角色分配成功");
        } else {
            returnResult.setMsg("系统出现未知错误，角色分配失败");
        }
        return returnResult;
    }
}
