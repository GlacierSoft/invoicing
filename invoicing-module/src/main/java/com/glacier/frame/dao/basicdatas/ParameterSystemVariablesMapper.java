package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterSystemVariables;
import com.glacier.frame.entity.basicdatas.ParameterSystemVariablesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterSystemVariablesMapper {
    int countByExample(ParameterSystemVariablesExample example);

    int deleteByExample(ParameterSystemVariablesExample example);

    int deleteByPrimaryKey(String variablesId);

    int insert(ParameterSystemVariables record);

    int insertSelective(ParameterSystemVariables record);

    List<ParameterSystemVariables> selectByExample(ParameterSystemVariablesExample example);

    ParameterSystemVariables selectByPrimaryKey(String variablesId);

    int updateByExampleSelective(@Param("record") ParameterSystemVariables record, @Param("example") ParameterSystemVariablesExample example);

    int updateByExample(@Param("record") ParameterSystemVariables record, @Param("example") ParameterSystemVariablesExample example);

    int updateByPrimaryKeySelective(ParameterSystemVariables record);

    int updateByPrimaryKey(ParameterSystemVariables record);
}