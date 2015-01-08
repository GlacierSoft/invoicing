package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParContactType;
import com.glacier.frame.entity.basicdatas.ParContactTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParContactTypeMapper {
    int countByExample(ParContactTypeExample example);

    int deleteByExample(ParContactTypeExample example);

    int deleteByPrimaryKey(String contactTypeId);

    int insert(ParContactType record);

    int insertSelective(ParContactType record);

    List<ParContactType> selectByExample(ParContactTypeExample example);

    ParContactType selectByPrimaryKey(String contactTypeId);

    int updateByExampleSelective(@Param("record") ParContactType record, @Param("example") ParContactTypeExample example);

    int updateByExample(@Param("record") ParContactType record, @Param("example") ParContactTypeExample example);

    int updateByPrimaryKeySelective(ParContactType record);

    int updateByPrimaryKey(ParContactType record);
}