package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParClientLevel;
import com.glacier.frame.entity.basicdatas.ParClientLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParClientLevelMapper {
    int countByExample(ParClientLevelExample example);

    int deleteByExample(ParClientLevelExample example);

    int deleteByPrimaryKey(String clientLevelId);

    int insert(ParClientLevel record);

    int insertSelective(ParClientLevel record);

    List<ParClientLevel> selectByExample(ParClientLevelExample example);

    ParClientLevel selectByPrimaryKey(String clientLevelId);

    int updateByExampleSelective(@Param("record") ParClientLevel record, @Param("example") ParClientLevelExample example);

    int updateByExample(@Param("record") ParClientLevel record, @Param("example") ParClientLevelExample example);

    int updateByPrimaryKeySelective(ParClientLevel record);

    int updateByPrimaryKey(ParClientLevel record);
}