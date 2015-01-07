/**
 * @Title: DepService.java 
 * @Package com.glacier.frame.service.system 
 * @author songjundong   
 * @email 985776597@qq.com
 * @date 2014-8-18 下午2:51:30 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
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
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.frame.dao.system.DepMapper;
import com.glacier.frame.dao.system.RoleMapper;
import com.glacier.frame.dto.query.system.DepQueryDTO;
import com.glacier.frame.entity.system.Dep;
import com.glacier.frame.entity.system.DepExample;
import com.glacier.frame.entity.system.DepExample.Criteria;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;

/**
 * @ClassName: DepService
 * @Description: TODO(管理员业务实现)
 * @author songjundong
 * @email 985776597@qq.com
 * @date 2014-8-18 下午2:51:30
 */
@Service
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public class DepService {

    @Autowired
    private DepMapper depMapper;
    
    @Autowired
    private RoleMapper roleMapper;
    
    /** 
     * @Title: FineDep  
     * @Description: TODO(获取当前部门名)  
     * @param @return    设定文件  
     * @return Object    返回类型  
     * @throws
     */ 
    public Object FineDep(){
        Subject pricipalSubject = SecurityUtils.getSubject();
        Dep pricipalDep = (Dep) pricipalSubject.getPrincipal();
        return pricipalDep;
    }

    /**
     * @Title: getDep
     * @Description: TODO(通过主键depId查询部门)
     * @param @param depId
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object getDep(String depId) {
        return depMapper.selectByPrimaryKey(depId);
    }

    /**
     * @Title: listAsGrid
     * @Description: TODO(分页浏览管理员列表)
     * @param @param pager
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(DepQueryDTO depQueryDTO, JqPager pager) {
        JqGridReturn returnResulte = new JqGridReturn();
        DepExample depExample = new DepExample();

        Criteria queryCriteria = depExample.createCriteria();
        depQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            depExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            depExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getOrder()) && StringUtils.isNotBlank(pager.getSort())) {// 设置排序信息
            depExample.setOrderByClause(pager.getOrderBy("temp_dep_"));
        }
        List<Dep> deps = depMapper.selectByExample(depExample);
        int total = depMapper.countByExample(depExample);
        returnResulte.setRows(deps);
        returnResulte.setTotal(total);
        return returnResulte;
    }

    /**
     * @Title: addDep
     * @Description: TODO(增加管理员)
     * @param @param dep
     * @param @return
     * @throws Exception 
     * @throws 备注
     * <p>
     * 已检查测试:Green
     * <p>
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "DepList_add")
    public Object addDep(Dep dep) throws Exception {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        DepExample depExample = new DepExample();
        int count = 0;
        // 防止管理员名称重复
        depExample.createCriteria().andCnNameEqualTo(dep.getCnName());
        count = depMapper.countByExample(depExample);// 查找相同管理员名称数量
        if (count > 0) {
            returnResult.setMsg("部门名称重复");
            return returnResult;
        }
        // 初始化管理员信息
        dep.setDepId(RandomGUID.getRandomGUID());
        if (dep.getParentId().equals("ROOT") || dep.getParentId().equals("")) {// 如果父级部门的Id为"ROOT"或为空，则将父级部门的值设置为null保存到数据库
            dep.setParentId(null);
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        dep.setCreater(pricipalUser.getUsername());
        dep.setCreateTime(new Date());
        count = depMapper.insert(dep);
        if (count == 1) {
            returnResult.setMsg("[" + dep.getCnName() + "]" + "管理员信息已保存");
            returnResult.setSuccess(true);
        } else {
            returnResult.setMsg("发生未知错误，管理员信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editDep
     * @Description: TODO(修改管理员信息)
     * @param @param dep
     * @param @return设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "DepList_edit")
    public Object editDep(Dep dep) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        List<String> retrunDepList = new ArrayList<String>();// 修改上级所属部门时，禁止选择部门本身及子级部门作为部门的父级部门
        retrunDepList = getDepChild(dep.getDepId(), retrunDepList);// 查找部门本身及子级部门
        retrunDepList.add(dep.getDepId());
        if (retrunDepList.contains(dep.getParentId())) {// 如果用户是选择部门本身及子级部门作为部门的父级部门，则返回错误提示信息
            returnResult.setMsg("禁止选择该部门本身以及子部门作为上级部门");
            return returnResult;
        }
        DepExample depExample = new DepExample();
        // 防止管理员名称重复
        depExample.createCriteria().andCnNameEqualTo(dep.getCnName()).andDepIdNotEqualTo(dep.getDepId());
        int count = 0;
        count = depMapper.countByExample(depExample);// 查找相同管理员名称数量
        if (count > 0) {
            returnResult.setMsg("部门名称重复");
            return returnResult;
        }
        if (dep.getParentId().equals("ROOT") || dep.getParentId().equals("")) {// 如果父级部门的Id为"ROOT"或为空，则将父级部门的值设置为null保存到数据库
            dep.setParentId(null);
        }
        Dep oldDep = depMapper.selectByPrimaryKey(dep.getDepId());
        dep.setCreater(oldDep.getCreater());
        dep.setCreateTime(oldDep.getCreateTime());
        count = depMapper.updateByPrimaryKey(dep);
        if (count == 1) {
            returnResult.setMsg("[" + dep.getCnName() + "]" + "部门信息已修改");
            returnResult.setSuccess(true);
        } else {
            returnResult.setMsg("发生未知错误，部门信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getAllTreeDepNode 
     * @Description: TODO(获取部门树结构菜单) 
     * @param  @param virtualRoot
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    public String getAllTreeDepNode(boolean virtualRoot) {
        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree depItem = new Tree();// 增加总的树节点作为部门导航
            depItem.setId("ROOT");
            depItem.setText("部门导航");
            items.add(depItem);
        }
        DepExample depExample = new DepExample();
        depExample.setOrderByClause("temp_dep.order_num asc");
        List<Dep> depList = depMapper.selectByExample(depExample);
        if (null != depList && depList.size() > 0) {
            for (Dep dep : depList) {
                Tree item = new Tree();// 将查询到的部门记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(dep.getDepId());
                item.setText(dep.getCnName());
                if (StringUtils.isNotBlank(dep.getParentId())) {
                    item.setPid(dep.getParentId());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }
                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }
    
    /**
     * @Title: getOptgroupChild 
     * @Description: TODO(递归获取部门和部门子节点) 
     * @param @param optgroupId
     * @param @param retrunOptgroupList 返回的所有部门信息
     * @param @return    设定文件 
     * @return List<String>    返回类型 
     * @throws
     */
    private List<String> getDepChild(String depId, List<String> retrunDepList) {
        DepExample depExample = new DepExample();
        depExample.createCriteria().andParentIdEqualTo(depId);// 查询子部门
        List<Dep> depList = depMapper.selectByExample(depExample);
        if (depList.size() > 0) {// 如果存在子部门则遍历
            for (Dep dep : depList) {
                this.getDepChild(dep.getDepId(), retrunDepList);// 递归查询是否存在子部门
            }
        }
        retrunDepList.add(depId);
        return retrunDepList;
    }
}
