package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParWarInType;
import com.glacier.frame.entity.basicdatas.ParWarInTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParWarInTypeMapper {
    int countByExample(ParWarInTypeExample example);

    int deleteByExample(ParWarInTypeExample example);

    int deleteByPrimaryKey(String inTypeId);

    int insert(ParWarInType record);

    int insertSelective(ParWarInType record);

    List<ParWarInType> selectByExample(ParWarInTypeExample example);

    ParWarInType selectByPrimaryKey(String inTypeId);

    int updateByExampleSelective(@Param("record") ParWarInType record, @Param("example") ParWarInTypeExample example);

    int updateByExample(@Param("record") ParWarInType record, @Param("example") ParWarInTypeExample example);

    int updateByPrimaryKeySelective(ParWarInType record);

    int updateByPrimaryKey(ParWarInType record);
}