package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParReceivableType;
import com.glacier.frame.entity.basicdatas.ParReceivableTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParReceivableTypeMapper {
    int countByExample(ParReceivableTypeExample example);

    int deleteByExample(ParReceivableTypeExample example);

    int deleteByPrimaryKey(String receivableTypeId);

    int insert(ParReceivableType record);

    int insertSelective(ParReceivableType record);

    List<ParReceivableType> selectByExample(ParReceivableTypeExample example);

    ParReceivableType selectByPrimaryKey(String receivableTypeId);

    int updateByExampleSelective(@Param("record") ParReceivableType record, @Param("example") ParReceivableTypeExample example);

    int updateByExample(@Param("record") ParReceivableType record, @Param("example") ParReceivableTypeExample example);

    int updateByPrimaryKeySelective(ParReceivableType record);

    int updateByPrimaryKey(ParReceivableType record);
}