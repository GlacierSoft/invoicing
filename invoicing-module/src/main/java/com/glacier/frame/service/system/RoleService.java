/**
 * @Title: RoleService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18  下午4:57:34
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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.system.ActionMapper;
import com.glacier.frame.dao.system.AuthorityMapper;
import com.glacier.frame.dao.system.RoleMapper;
import com.glacier.frame.dto.query.system.RoleQueryDTO;
import com.glacier.frame.entity.common.util.CommonBuiltin;
import com.glacier.frame.entity.system.AuthorityExample;
import com.glacier.frame.entity.system.Role;
import com.glacier.frame.entity.system.RoleExample;
import com.glacier.frame.entity.system.RoleExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/***
 * 
 * @ClassName:  RoleService
 * @Description: TODO(角色管理)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-8-18  下午4:57:34
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AuthorityMapper authorityMapper;

    @Autowired
    private ActionMapper actionMapper;
    
    /**
     * @Title: getRole
     * @Description: TODO(根据角色ID获取角色信息)
     * @param @param roleId
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    public Object getRole(String roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    /**
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示角色列表)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(RoleQueryDTO roleQueryDTO, JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        RoleExample roleExample = new RoleExample();
        Criteria queryCriteria = roleExample.createCriteria();
        roleQueryDTO.setQueryCondition(queryCriteria);
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            roleExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            roleExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
            roleExample.setOrderByClause(pager.getOrderBy("temp_role_"));
        }
        // 高级检索
        List<Role> Roles = roleMapper.selectByExample(roleExample); // 查询所有操作列表
        int total = roleMapper.countByExample(roleExample); // 查询总页数
        returnResult.setRows(Roles);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRole
     * @Description: TODO(增加角色)
     * @param @param role
     * @param @return
     * @throws Exception 
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RoleList_add")
    public Object addRole(Role role) throws Exception {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        RoleExample roleExample = new RoleExample();
        int count = 0;
        // 防止角色名称重复
        roleExample.createCriteria().andRoleCnNameEqualTo(role.getRoleCnName());
        count = roleMapper.countByExample(roleExample);// 查找相同中文名称的角色数量
        if (count > 0) {
            returnResult.setMsg("角色名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        roleExample.clear();
        roleExample.createCriteria().andRoleEnNameEqualTo(role.getRoleEnName());
        count = roleMapper.countByExample(roleExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复");
            return returnResult;
        }
        role.setRoleId(RandomGUID.getRandomGUID());// 初始化新建角色信息
        role.setBuiltin(CommonBuiltin.custom);// 在业务新建的角色为自定义
        role.setCreater(pricipalUser.getUserId());
        //构建时间字符串
        Calendar cal = Calendar.getInstance();  
        int year = cal.get(Calendar.YEAR);//获取年份  
        int month=cal.get(Calendar.MONTH)+1;//获取月份   
        int day=cal.get(Calendar.DATE);//获取日   
        //int hour=cal.get(Calendar.HOUR);//小时  
        @SuppressWarnings("deprecation")
		int hour=new Date().getHours();
        int minute=cal.get(Calendar.MINUTE);//分              
        int second=cal.get(Calendar.SECOND);//秒 
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate=year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second;
        Date dates=sdf.parse(strDate);
        role.setCreateTime(dates);
        count = roleMapper.insert(role);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + role.getRoleCnName() + "] 角色信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，角色信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editRole
     * @Description: TODO(修改角色)
     * @param @param role
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RoleList_edit")
    public Object editRole(Role role) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        RoleExample roleExample = new RoleExample();
        int count = 0;
        Role originalRole = roleMapper.selectByPrimaryKey(role.getRoleId());// 获取原角色相关信息
        // 管理员类型角色只有所属创建者才能进行修改
        if (originalRole.getBuiltin() == CommonBuiltin.admin) {
            if (!pricipalUser.getUserId().equals(originalRole.getCreater())) {
                returnResult.setMsg("管理员类型角色只有所属创建者才能对其进行修改");
                return returnResult;
            }
        }
        // 防止角色名称重复
        roleExample.createCriteria().andRoleIdNotEqualTo(role.getRoleId()).andRoleCnNameEqualTo(role.getRoleCnName());
        count = roleMapper.countByExample(roleExample);// 查找相同中文名称的角色数量
        if (count > 0) {
            returnResult.setMsg("角色名称重复");
            return returnResult;
        }
        // 防止英文名称重复
        roleExample.clear();
        roleExample.createCriteria().andRoleIdNotEqualTo(role.getRoleId()).andRoleEnNameEqualTo(role.getRoleEnName());
        count = roleMapper.countByExample(roleExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复");
            return returnResult;
        }
        role.setCreater(pricipalUser.getUserId());//初始化插入角色信息
        role.setCreateTime(new Date());
        count = roleMapper.updateByPrimaryKeySelective(role);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + role.getRoleCnName() + "] 角色信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，角色信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: delRoles
     * @Description: TODO(批量删除角色)
     * @param @param roleIds
     * @param @param roleCnNames
     * @param @return
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RoleList_del")
    public Object delRoles(List<String> roleIds, List<String> roleCnNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        //记录删除成功数量
        int rightNumber=0;
        //设置消息终止变量
        boolean isFlag=true;
        //设置返回结果
        String result_set="";
        //判断数据行
        if (roleIds.size() > 0) {
        	//匹配删除信息
        	for(int i=0;i<roleIds.size();i++){
        		//关联表t_authority
        		AuthorityExample authorityExample=new AuthorityExample();
            	authorityExample.createCriteria().andRoleIdEqualTo(roleIds.get(i));
            	int authority_nunmber=authorityMapper.countByExample(authorityExample);
            	if(authority_nunmber<=0){
            		 RoleExample roleExample = new RoleExample();
                     roleExample.createCriteria().andRoleIdEqualTo(roleIds.get(i));
                     int number=roleMapper.deleteByExample(roleExample);
                     rightNumber+=number;
            	}else{
                   if(isFlag){
                	   result_set="选中第<font style='color:red;font-weight: bold;'>【"+ (i + 1)+ "】</font>行数据" +
                	   		"与【操作管理】存在<font style='color:red;font-weight: bold;'>【"+ authority_nunmber+ "】</font>条依赖关系," +
                	   		"须先删除【操作管理】中<font style='color:red;font-weight: bold;'>【"+ authority_nunmber + "】</font>条依赖数据"; 
                   }
                   isFlag=false;
            	}
            }
        	if (rightNumber > 0) {
				//删除成功数量大于0即为操作成功,且提示关联信息 
				returnResult.setMsg("已成功删除<font style='color:red;font-weight: bold;'>【"+ rightNumber + "】</font>条数据," + result_set);
				returnResult.setSuccess(true);
			} else {
				//删除失败信息设置
				returnResult.setMsg(result_set);
			}
        }
        return returnResult;
    }
}
