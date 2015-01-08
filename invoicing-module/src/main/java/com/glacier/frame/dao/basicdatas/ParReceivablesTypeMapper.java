package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParReceivablesType;
import com.glacier.frame.entity.basicdatas.ParReceivablesTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParReceivablesTypeMapper {
    int countByExample(ParReceivablesTypeExample example);

    int deleteByExample(ParReceivablesTypeExample example);

    int deleteByPrimaryKey(String receivablesTypeId);

    int insert(ParReceivablesType record);

    int insertSelective(ParReceivablesType record);

    List<ParReceivablesType> selectByExample(ParReceivablesTypeExample example);

    ParReceivablesType selectByPrimaryKey(String receivablesTypeId);

    int updateByExampleSelective(@Param("record") ParReceivablesType record, @Param("example") ParReceivablesTypeExample example);

    int updateByExample(@Param("record") ParReceivablesType record, @Param("example") ParReceivablesTypeExample example);

    int updateByPrimaryKeySelective(ParReceivablesType record);

    int updateByPrimaryKey(ParReceivablesType record);
}