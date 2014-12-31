package com.glacier.frame.dao.basicdatas;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.basicdatas.ParameterOptgroup;
import com.glacier.frame.entity.basicdatas.ParameterOptgroupExample;

public interface ParameterOptgroupMapper {
    int countByExample(ParameterOptgroupExample example);

    int deleteByExample(ParameterOptgroupExample example);

    int deleteByPrimaryKey(String optgroupId);

    int insert(ParameterOptgroup record);

    int insertSelective(ParameterOptgroup record);

    List<ParameterOptgroup> selectByExample(ParameterOptgroupExample example);

    ParameterOptgroup selectByPrimaryKey(String optgroupId);

    int updateByExampleSelective(@Param("record") ParameterOptgroup record, @Param("example") ParameterOptgroupExample example);

    int updateByExample(@Param("record") ParameterOptgroup record, @Param("example") ParameterOptgroupExample example);

    int updateByPrimaryKeySelective(ParameterOptgroup record);

    int updateByPrimaryKey(ParameterOptgroup record);
}