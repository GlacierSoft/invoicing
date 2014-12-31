/*
 * @(#)ParameterOptgroupService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.service.basicdatas;

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
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.jqueryui.util.Tree;
import com.glacier.frame.dao.basicdatas.ParameterOptgroupMapper;
import com.glacier.frame.dao.basicdatas.ParameterOptgroupValueMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterOptgroup;
import com.glacier.frame.entity.basicdatas.ParameterOptgroupExample;
import com.glacier.frame.entity.basicdatas.ParameterOptgroupValueExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/** 
 * @ClassName: ParameterOptgroupService 
 * @Description: TODO(下拉项业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterOptgroupService {

	@Autowired
    private ParameterOptgroupMapper optgroupMapper;

	@Autowired
    private ParameterOptgroupValueMapper optgroupValueMapper;
	
	@Autowired
    private UserMapper userMapper;
	/**
	 * @Title: getOptgroup 
	 * @Description: TODO(根据下拉项Id获取下拉项信息) 
	 * @param @param optgroupId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getOptgroup(String optgroupId) {
        return optgroupMapper.selectByPrimaryKey(optgroupId);
    }
    
    /**
     * @Title: listAsTree 
     * @Description: TODO(获取下拉项下的树结构的所有下拉项数据) 
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsTree() {
    	ParameterOptgroupExample OptgroupExample=new ParameterOptgroupExample();
    	OptgroupExample.setOrderByClause("temp_parameter_optgroup.optgroup_num asc");
        List<ParameterOptgroup> optgroupList = optgroupMapper.selectByExample(OptgroupExample);
        return optgroupList;
    }

    /**
     * @Title: addOptgroup 
     * @Description: TODO(新增下拉项) 
     * @param @param optgroup
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "OptgroupTree_add")
    public Object addOptgroup(ParameterOptgroup optgroup) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
        int count = 0;
        // 防止下拉项名称重复
        optgroupExample.createCriteria().andOptgroupNameEqualTo(optgroup.getOptgroupName());
        count = optgroupMapper.countByExample(optgroupExample);// 查找相同名称的下拉项数量
        if (count > 0) {
            returnResult.setMsg("下拉项名称重复");
            return returnResult;
        }
        optgroup.setOptgroupId(RandomGUID.getRandomGUID());
        if (optgroup.getOptgroupPid().equals("ROOT") || optgroup.getOptgroupPid().equals("")) {// 如果父级下拉项的Id为"ROOT"或为空，则将父级下拉项的值设置为null保存到数据库
        	optgroup.setOptgroupPid(null);
        }
        optgroup.setCreater(pricipalUser.getUserId());
        optgroup.setCreateTime(new Date());
        optgroup.setUpdater(pricipalUser.getUserId());
        optgroup.setUpdateTime(new Date());
        count = optgroupMapper.insert(optgroup);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroup.getOptgroupName() + "] 下拉项信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，下拉项信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getAllTreeOptgroupNode
     * @Description: TODO(获取全部的下拉项数据组装成EasyUI树节点JSON)
     * @param @param virtualRoot 是否构建虚拟ROOT -> 系统下拉项作为导航
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    public String getAllTreeOptgroupNode(boolean virtualRoot) {
        List<Tree> items = new ArrayList<Tree>();
        if (virtualRoot) {
            Tree optgroupItem = new Tree();// 增加总的树节点作为下拉项导航
            optgroupItem.setId("ROOT");
            optgroupItem.setText("下拉项导航");
            items.add(optgroupItem);
        }
        ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
        optgroupExample.setOrderByClause("temp_parameter_optgroup.optgroup_num asc");
        List<ParameterOptgroup> optgroupList = optgroupMapper.selectByExample(optgroupExample);
        if (null != optgroupList && optgroupList.size() > 0) {
            for (ParameterOptgroup optgroup : optgroupList) {
                Tree item = new Tree();// 将查询到的下拉项记录某些属性值设置在ComboTreeItem中，用于页面的ComboTree的数据绑定
                item.setId(optgroup.getOptgroupId());
                item.setText(optgroup.getOptgroupName());
                if (StringUtils.isNotBlank(optgroup.getOptgroupPid())) {
                    item.setPid(optgroup.getOptgroupPid());
                } else if (virtualRoot) {
                    item.setPid("ROOT");// 如果父节点为空说明上一级为总节点
                }
                items.add(item);
            }
        }
        return JackJson.fromObjectToJson(items);
    }
    
    /**
     * @Title: editOptgroup 
     * @Description: TODO(修改下拉项) 
     * @param @param optgroup
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "OptgroupTree_edit")
    public Object editOptgroup(ParameterOptgroup optgroup) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        List<String> retrunOptgroupList = new ArrayList<String>();// 修改上级所属下拉项时，禁止选择下拉项本身及子级下拉项作为下拉项的父级下拉项
        retrunOptgroupList = getOptgroupChild(optgroup.getOptgroupId(), retrunOptgroupList);// 查找下拉项本身及子级下拉项
        retrunOptgroupList.add(optgroup.getOptgroupId());
        if (retrunOptgroupList.contains(optgroup.getOptgroupPid())) {// 如果用户是选择下拉项本身及子级下拉项作为下拉项的父级下拉项，则返回错误提示信息
        	returnResult.setMsg("禁止选择该下拉项本身以及子下拉项作为上级下拉项");
            return returnResult;
        }
        ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
        int count = 0;
        // 防止下拉项名称重复
        optgroupExample.createCriteria().andOptgroupIdNotEqualTo(optgroup.getOptgroupId()).andOptgroupNameEqualTo(optgroup.getOptgroupName());
        count = optgroupMapper.countByExample(optgroupExample);// 查找相同名称的下拉项数量
        if (count > 0) {
            returnResult.setMsg("下拉项名称重复");
            return returnResult;
        }
        if (optgroup.getOptgroupPid().equals("ROOT") || optgroup.getOptgroupPid().equals("")) {// 如果父级下拉项的Id为"ROOT"或为空，则将父级下拉项的值设置为null保存到数据库
        	optgroup.setOptgroupPid(null);
        }
        ParameterOptgroup oldOptgroup = optgroupMapper.selectByPrimaryKey(optgroup.getOptgroupId()) ;
        optgroup.setCreater(oldOptgroup.getCreater());
        optgroup.setCreateTime(oldOptgroup.getCreateTime());
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        optgroup.setUpdater(pricipalUser.getUserId());
        optgroup.setUpdateTime(new Date());
        count = optgroupMapper.updateByPrimaryKey(optgroup);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroup.getOptgroupName() + "] 下拉项信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，下拉项信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: getOptgroupChild 
     * @Description: TODO(递归获取下拉项和下拉项子节点) 
     * @param @param optgroupId
     * @param @param retrunOptgroupList 返回的所有下拉项信息
     * @param @return    设定文件 
     * @return List<String>    返回类型 
     * @throws
     */
    private List<String> getOptgroupChild(String optgroupId, List<String> retrunOptgroupList) {
    	ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
    	optgroupExample.createCriteria().andOptgroupPidEqualTo(optgroupId);// 查询子下拉项
        List<ParameterOptgroup> optgroupList = optgroupMapper.selectByExample(optgroupExample);
        if (optgroupList.size() > 0) {// 如果存在子下拉项则遍历
            for (ParameterOptgroup optgroup : optgroupList) {
                this.getOptgroupChild(optgroup.getOptgroupId(), retrunOptgroupList);// 递归查询是否存在子下拉项
            }
        }
        retrunOptgroupList.add(optgroupId);
        return retrunOptgroupList;
    }
    
    /**
     * @Title: delArea 
     * @Description: TODO(删除下拉项) 
     * @param @param optgroupId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "OptgroupTree_del")
    public Object delOptgroup(String optgroupId) {
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	if (StringUtils.isBlank(optgroupId)) {// 判断是否选择一条下拉项信息
            returnResult.setMsg("请选择一条下拉项信息，再进行删除");
            return returnResult;
        }
    	ParameterOptgroupExample parameterOptgroupExample = new ParameterOptgroupExample();
    	parameterOptgroupExample.createCriteria().andOptgroupPidEqualTo(optgroupId);
        if (optgroupMapper.countByExample(parameterOptgroupExample) > 0) {// 判断该下拉项是否存在子级下拉项，有则不能删除
            returnResult.setMsg("该下拉项存在子级下拉项，如需删除请先删除子下拉项");
        }else {
        	ParameterOptgroupValueExample parameterOptgroupValueExample = new ParameterOptgroupValueExample();
        	parameterOptgroupValueExample.createCriteria().andOptgroupIdEqualTo(optgroupId);
        	if (optgroupValueMapper.countByExample(parameterOptgroupValueExample)>0) {// 判断该下拉项是否存在所属下拉值，有则不能删除
        		returnResult.setMsg("该下拉项存在所属下拉值，如需删除请先删除所属下拉值");
        	}else {
        		ParameterOptgroup optgroup= optgroupMapper.selectByPrimaryKey(optgroupId);
                int result = optgroupMapper.deleteByPrimaryKey(optgroupId);//根据下拉项Id，进行删除下拉项
                if (result == 1) {
                    returnResult.setSuccess(true);
                    returnResult.setMsg("[" + optgroup.getOptgroupName() + "] 下拉项信息已删除");
                } else {
                    returnResult.setMsg("发生未知错误，下拉项信息删除失败");
                }
        	}
        }
		return returnResult;
     }
}
