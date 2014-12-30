package com.glacier.frame.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.system.OperaLog;
import com.glacier.frame.entity.system.OperaLogExample;

public interface OperaLogMapper {
    int countByExample(OperaLogExample example);

    int deleteByExample(OperaLogExample example);

    int deleteByPrimaryKey(String operalogId);

    int insert(OperaLog record);

    int insertSelective(OperaLog record);

    List<OperaLog> selectByExample(OperaLogExample example);

    OperaLog selectByPrimaryKey(String operalogId);

    int updateByExampleSelective(@Param("record") OperaLog record, @Param("example") OperaLogExample example);

    int updateByExample(@Param("record") OperaLog record, @Param("example") OperaLogExample example);

    int updateByPrimaryKeySelective(OperaLog record);

    int updateByPrimaryKey(OperaLog record);
}