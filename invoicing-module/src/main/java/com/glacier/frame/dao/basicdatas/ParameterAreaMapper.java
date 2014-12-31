package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterArea;
import com.glacier.frame.entity.basicdatas.ParameterAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterAreaMapper {
    int countByExample(ParameterAreaExample example);

    int deleteByExample(ParameterAreaExample example);

    int deleteByPrimaryKey(String areaId);

    int insert(ParameterArea record);

    int insertSelective(ParameterArea record);

    List<ParameterArea> selectByExample(ParameterAreaExample example);

    ParameterArea selectByPrimaryKey(String areaId);

    int updateByExampleSelective(@Param("record") ParameterArea record, @Param("example") ParameterAreaExample example);

    int updateByExample(@Param("record") ParameterArea record, @Param("example") ParameterAreaExample example);

    int updateByPrimaryKeySelective(ParameterArea record);

    int updateByPrimaryKey(ParameterArea record);
}