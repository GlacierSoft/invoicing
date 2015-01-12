package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComContactType;
import com.glacier.frame.entity.basicdatas.ParComContactTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComContactTypeMapper {
    int countByExample(ParComContactTypeExample example);

    int deleteByExample(ParComContactTypeExample example);

    int deleteByPrimaryKey(String contactTypeId);

    int insert(ParComContactType record);

    int insertSelective(ParComContactType record);

    List<ParComContactType> selectByExample(ParComContactTypeExample example);

    ParComContactType selectByPrimaryKey(String contactTypeId);

    int updateByExampleSelective(@Param("record") ParComContactType record, @Param("example") ParComContactTypeExample example);

    int updateByExample(@Param("record") ParComContactType record, @Param("example") ParComContactTypeExample example);

    int updateByPrimaryKeySelective(ParComContactType record);

    int updateByPrimaryKey(ParComContactType record);
}