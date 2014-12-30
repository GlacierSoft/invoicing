/**
 * @Title: MenuService.java 
 * @Package com.glacier.permissions.service 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-08-17 下午4:00:46 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2014-08-17
                修改人：zhenfei.zhang 
                修改内容简介 ：新建面板业务类
            </p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.frame.service.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
import com.glacier.frame.dao.system.ActionMapper;
import com.glacier.frame.dao.system.AuthorityMapper;
import com.glacier.frame.dao.system.MenuMapper;
import com.glacier.frame.dao.system.PanelMapper;
import com.glacier.frame.entity.system.ActionExample;
import com.glacier.frame.entity.system.Authority;
import com.glacier.frame.entity.system.AuthorityExample;
import com.glacier.frame.entity.system.Menu;
import com.glacier.frame.entity.system.MenuExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: MenuService
 * @Description: TODO(菜单业务类：为控制器提供服务)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-08-17 下午4:00:46
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MenuService {

    @Autowired
    private PanelMapper panelMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Autowired
    private ActionMapper actionMapper;

    @Autowired
    private AuthorityMapper authorityMapper;
    
    /**
     * @Title: getMenu
     * @Description: TODO(根据菜单ID获取角色信息)
     * @param @param roleId
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object getMenu(String menuId) {
        return menuMapper.selectByPrimaryKey(menuId);
    }

    /**
     * @Title: addMenu
     * @Description: TODO(增加菜单)
     * @param @param menu
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MenuTree_add")
    public Object addMenu(Menu menu) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MenuExample menuExample = new MenuExample();
        int count = 0;
        // 防止菜单名称重复
        menuExample.createCriteria().andMenuCnNameEqualTo(menu.getMenuCnName());
        count = menuMapper.countByExample(menuExample);// 查找相同中文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("菜单名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        menuExample.clear();
        menuExample.createCriteria().andMenuEnNameEqualTo(menu.getMenuEnName());
        count = menuMapper.countByExample(menuExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复");
            return returnResult;
        }
        menu.setMenuId(RandomGUID.getRandomGUID());
        if (menu.getPid().equals("ROOT") || menu.getPid().equals("")) {// 如果父级菜单的Id为"ROOT"或为空，则将父级菜单的值设置为null保存到数据库
            menu.setPid(null);
        }
        count = menuMapper.insert(menu);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + menu.getMenuCnName() + "] 菜单信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，菜单信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editMenu
     * @Description: TODO(修改菜单)
     * @param @param menu
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MenuTree_edit")
    public Object editMenu(Menu menu) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        // 防止选择自身作为父菜单，引起死循环
        List<String> retrunMenuList = new ArrayList<String>();
        retrunMenuList = getMenuChild(menu.getMenuId(), retrunMenuList);
        retrunMenuList.add(menu.getMenuId());
        if (retrunMenuList.contains(menu.getPid())) {
            returnResult.setMsg("禁止选择菜单本身及子菜单作为上级菜单");
            return returnResult;
        }
        MenuExample menuExample = new MenuExample();
        int count = 0;
        // 防止菜单名称重复
        menuExample.createCriteria().andMenuCnNameEqualTo(menu.getMenuCnName()).andMenuIdNotEqualTo(menu.getMenuId());
        count = menuMapper.countByExample(menuExample);// 查找相同中文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("菜单名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        menuExample.clear();
        menuExample.createCriteria().andMenuEnNameEqualTo(menu.getMenuEnName()).andMenuIdNotEqualTo(menu.getMenuId());
        count = menuMapper.countByExample(menuExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复");
            return returnResult;
        }
        if (menu.getPid().equals("ROOT") || menu.getPid().equals("")) {// 如果父级菜单的Id为"ROOT"或为空，则将父级菜单的值设置为null保存到数据库
            menu.setPid(null);
        }
        count = menuMapper.updateByPrimaryKey(menu);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + menu.getMenuCnName() + "] 菜单信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，菜单信息更新失败");
        }
        return returnResult;
    }

    /**
     * @Title: delMenu
     * @Description: TODO(删除菜单)
     * @param @param menu
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MenuTree_del")
    public Object delMenu(Menu menu) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int menuCount = 0;
        //删除菜单先检查菜单是否有子菜单
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andPidEqualTo(menu.getMenuId());
        List<Menu> menus = menuMapper.selectByExample(menuExample);
        if(menus.size() > 0){
            returnResult.setSuccess(false);
            returnResult.setMsg("菜单删除失败，不能删除有子菜单的菜单");
            return returnResult;
        }else{
        	// 删除菜单必须先删除菜单对应的操作
            ActionExample actionExample = new ActionExample();
            actionExample.createCriteria().andMenuIdEqualTo(menu.getMenuId());
            menuCount = actionMapper.countByExample(actionExample);
            if (menuCount > 0) {
                returnResult.setSuccess(false);
                returnResult.setMsg("该菜单下存在对应的操作，请先删除其操作再尝试!");
                return returnResult;
            }
            // 同时删除权限表中引用的菜单
            AuthorityExample authorityExample = new AuthorityExample();
            authorityExample.createCriteria().andMenuIdEqualTo(menu.getMenuId());
            authorityMapper.deleteByExample(authorityExample);
            // 删除菜单
            menuCount = menuMapper.deleteByPrimaryKey(menu.getMenuId());
            if (menuCount > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除名称为：[ " + menu.getMenuCnName() + " ]菜单");
                return returnResult;
            }else{
            	returnResult.setMsg("发生未知错误，[ " + menu.getMenuCnName() + " ]菜单删除失败");        	
            }
        }
        return returnResult;
    }

    /**
     * @Title: getMenuChild
     * @Description: TODO(递归获取菜单和菜单子节点)
     * @param @param menuId 要获取的当前菜单
     * @param @param retrunMenuList 返回的所有菜单信息
     * @param @return 设定文件
     * @return List<String> 返回类型
     * @throws
     */
    private List<String> getMenuChild(String menuId, List<String> retrunMenuList) {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andPidEqualTo(menuId);// 查询子菜单
        List<Menu> menuList = menuMapper.selectByExample(menuExample);
        if (menuList.size() > 0) {// 如果存在子菜单则遍历
            for (Menu menu : menuList) {
                this.getMenuChild(menu.getMenuId(), retrunMenuList);// 递归查询是否存在子菜单
            }
        }
        retrunMenuList.add(menuId);
        return retrunMenuList;
    }

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
            principalMenuTrees.add(menuTree);
        }
        return principalMenuTrees;
    }

    /**
     * @Title: listAsTree
     * @Description: TODO(以树结构展示菜单列表)
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsTree() {
        MenuExample menuExample = new MenuExample();
        menuExample.setOrderByClause("temp_menu.order_num asc");
        List<Menu> menuList = menuMapper.selectByExample(menuExample);
        return menuList;
    }

    /**
     * @Title: getAllTreeMenuNode
     * @Description: TODO(获取全部的菜单数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统菜单作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeMenuNode(boolean virtualRoot, String roleId) {
        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree menuItem = new Tree();// 增加总的树节点作为菜单导航
            menuItem.setId("ROOT");
            menuItem.setText("导航");
            menuItem.setIconCls("anchor");
            items.add(menuItem);
        }
        MenuExample menuExample = new MenuExample();
        menuExample.setOrderByClause("temp_menu.order_num asc");
        List<Menu> menuList = menuMapper.selectByExample(menuExample);
        if (null != menuList && menuList.size() > 0) {
            List<Authority> authorities = null;
            if (StringUtils.isNotBlank(roleId)) {
                AuthorityExample authorityExample = new AuthorityExample();
                authorityExample.createCriteria().andRoleIdEqualTo(roleId);
                authorities = authorityMapper.selectByExample(authorityExample);
            }
            for (Menu menu : menuList) {
                Tree item = new Tree();// 将查询到的菜单记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(menu.getMenuId());
                item.setText(menu.getMenuCnName());
                if (StringUtils.isNotBlank(menu.getPid())) {
                    item.setPid(menu.getPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }
                if (null != authorities && authorities.size() > 0) {
                    Authority authority = new Authority();
                    authority.setMenuId(menu.getMenuId());
                    authority.setRoleId(roleId);
                    if (StringUtils.isNotBlank(menu.getUrl()) && authorities.contains(authority)) {
                        item.setChecked(true);
                    }
                }
                if (StringUtils.isNotBlank(menu.getUrl())) {
                    Map<String, String> treeAttributes = new HashMap<String, String>();
                    treeAttributes.put("url", menu.getUrl());
                    item.setAttributes(treeAttributes);
                }
                item.setIconCls(menu.getIconCls());
                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }

}
