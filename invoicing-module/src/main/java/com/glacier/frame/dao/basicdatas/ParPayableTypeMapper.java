package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPayableType;
import com.glacier.frame.entity.basicdatas.ParPayableTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPayableTypeMapper {
    int countByExample(ParPayableTypeExample example);

    int deleteByExample(ParPayableTypeExample example);

    int deleteByPrimaryKey(String payableTypeId);

    int insert(ParPayableType record);

    int insertSelective(ParPayableType record);

    List<ParPayableType> selectByExample(ParPayableTypeExample example);

    ParPayableType selectByPrimaryKey(String payableTypeId);

    int updateByExampleSelective(@Param("record") ParPayableType record, @Param("example") ParPayableTypeExample example);

    int updateByExample(@Param("record") ParPayableType record, @Param("example") ParPayableTypeExample example);

    int updateByPrimaryKeySelective(ParPayableType record);

    int updateByPrimaryKey(ParPayableType record);
}