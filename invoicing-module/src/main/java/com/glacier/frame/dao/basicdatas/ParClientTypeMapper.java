package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParClientType;
import com.glacier.frame.entity.basicdatas.ParClientTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParClientTypeMapper {
    int countByExample(ParClientTypeExample example);

    int deleteByExample(ParClientTypeExample example);

    int deleteByPrimaryKey(String clientTypeid);

    int insert(ParClientType record);

    int insertSelective(ParClientType record);

    List<ParClientType> selectByExample(ParClientTypeExample example);

    ParClientType selectByPrimaryKey(String clientTypeid);

    int updateByExampleSelective(@Param("record") ParClientType record, @Param("example") ParClientTypeExample example);

    int updateByExample(@Param("record") ParClientType record, @Param("example") ParClientTypeExample example);

    int updateByPrimaryKeySelective(ParClientType record);

    int updateByPrimaryKey(ParClientType record);
}