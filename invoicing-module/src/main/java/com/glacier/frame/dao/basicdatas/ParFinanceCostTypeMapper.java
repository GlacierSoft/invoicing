package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParFinanceCostType;
import com.glacier.frame.entity.basicdatas.ParFinanceCostTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParFinanceCostTypeMapper {
    int countByExample(ParFinanceCostTypeExample example);

    int deleteByExample(ParFinanceCostTypeExample example);

    int deleteByPrimaryKey(String costTypeId);

    int insert(ParFinanceCostType record);

    int insertSelective(ParFinanceCostType record);

    List<ParFinanceCostType> selectByExample(ParFinanceCostTypeExample example);

    ParFinanceCostType selectByPrimaryKey(String costTypeId);

    int updateByExampleSelective(@Param("record") ParFinanceCostType record, @Param("example") ParFinanceCostTypeExample example);

    int updateByExample(@Param("record") ParFinanceCostType record, @Param("example") ParFinanceCostTypeExample example);

    int updateByPrimaryKeySelective(ParFinanceCostType record);

    int updateByPrimaryKey(ParFinanceCostType record);
}