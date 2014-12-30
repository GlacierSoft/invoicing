package com.glacier.frame.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.system.Action;
import com.glacier.frame.entity.system.ActionExample;

public interface ActionMapper {
    int countByExample(ActionExample example);

    int deleteByExample(ActionExample example);

    int deleteByPrimaryKey(String actionId);

    int insert(Action record); 
    
    int insertSelective(Action record);

    List<Action> selectByExample(ActionExample example);

    Action selectByPrimaryKey(String actionId);

    int updateByExampleSelective(@Param("record") Action record, @Param("example") ActionExample example);

    int updateByExample(@Param("record") Action record, @Param("example") ActionExample example);

    int updateByPrimaryKeySelective(Action record);

    int updateByPrimaryKey(Action record);
}