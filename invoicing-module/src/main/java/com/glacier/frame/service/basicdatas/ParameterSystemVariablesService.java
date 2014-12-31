/*
 * @(#)ParameterSystemVariablesService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.frame.service.basicdatas;

import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.frame.dao.basicdatas.ParameterSystemVariablesMapper;
import com.glacier.frame.dao.system.UserMapper;
import com.glacier.frame.entity.basicdatas.ParameterSystemVariables;
import com.glacier.frame.entity.basicdatas.ParameterSystemVariablesExample;
import com.glacier.frame.entity.system.User;
import com.glacier.frame.util.MethodLog;

/**
 * @ClassName: ParameterSystemVariablesService
 * @Description: TODO(系统变量业务类)
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterSystemVariablesService {

    @Autowired
    private ParameterSystemVariablesMapper systemVariablesMapper;

    @Autowired
    private UserMapper userMapper;

    /**
     * @Title: getSystemVariables
     * @Description: TODO(根据系统变量Id获取系统变量信息)
     * @param @param systemVariablesId
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object getSystemVariables(String systemVariablesId) {
    	ParameterSystemVariables systemVariables = systemVariablesMapper.selectByPrimaryKey(systemVariablesId);
        return systemVariables;
    }

    /**
     * @Title: listAsGrid
     * @Description: TODO(获取所有系统变量信息)
     * @param @param optgroupId
     * @param @param pager
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    public Object listAsGrid(String variablesId, JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        ParameterSystemVariablesExample parameterSystemVariablesExample = new ParameterSystemVariablesExample();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            parameterSystemVariablesExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            parameterSystemVariablesExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
            parameterSystemVariablesExample.setOrderByClause(pager.getOrderBy("temp_parameter_system_variables_"));// 必须外键inner join temp_parameter
        }
        List<ParameterSystemVariables> parameterSystemVariabless = systemVariablesMapper.selectByExample(parameterSystemVariablesExample); // 查询所有操作列表
        int total = systemVariablesMapper.countByExample(parameterSystemVariablesExample); // 查询总页数
        returnResult.setRows(parameterSystemVariabless);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addSystemVariables
     * @Description: TODO(新增系统变量)
     * @param @param systemVariables
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SystemVariablesList_add")
    public Object addSystemVariables(ParameterSystemVariables systemVariables) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        systemVariables.setVariablesId(RandomGUID.getRandomGUID());
        systemVariables.setCreater(pricipalUser.getUserId());
        systemVariables.setCreateTime(new Date());
        systemVariables.setUpdater(pricipalUser.getUserId());
        systemVariables.setUpdateTime(new Date());
        count = systemVariablesMapper.insert(systemVariables);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + systemVariables.getVariableName() + "] 系统变量信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，系统变量信息保存失败");
        }
        return returnResult;
    }

    /**
     * @Title: editSystemVariables
     * @Description: TODO(修改系统变量)
     * @param @param systemVariables
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SystemVariablesList_edit")
    public Object editSystemVariables(ParameterSystemVariables systemVariables) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        systemVariables.setUpdater(pricipalUser.getUserId());
        systemVariables.setUpdateTime(new Date());
        count = systemVariablesMapper.updateByPrimaryKeySelective(systemVariables);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + systemVariables.getVariableName() + "] 系统变量信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，系统变量信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delSystemVariables
     * @Description: TODO(删除系统变量)
     * @param @param systemVariablesIds
     * @param @param systemVariablesNames
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "SystemVariablesList_del")
    public Object delSystemVariables(List<String> variablesIds, List<String> variableNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (variablesIds.size() > 0) {
            ParameterSystemVariablesExample parameterSystemVariablesExample = new ParameterSystemVariablesExample();
            parameterSystemVariablesExample.createCriteria().andVariablesIdIn(variablesIds);
            count = systemVariablesMapper.deleteByExample(parameterSystemVariablesExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(variableNames, ",") + " ]系统变量");
            } else {
                returnResult.setMsg("发生未知错误，系统变量信息删除失败");
            }
        }
        return returnResult;
    }
}
