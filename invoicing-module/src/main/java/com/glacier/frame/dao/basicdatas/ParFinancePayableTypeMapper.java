package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParFinancePayableType;
import com.glacier.frame.entity.basicdatas.ParFinancePayableTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParFinancePayableTypeMapper {
    int countByExample(ParFinancePayableTypeExample example);

    int deleteByExample(ParFinancePayableTypeExample example);

    int deleteByPrimaryKey(String payableTypeId);

    int insert(ParFinancePayableType record);

    int insertSelective(ParFinancePayableType record);

    List<ParFinancePayableType> selectByExample(ParFinancePayableTypeExample example);

    ParFinancePayableType selectByPrimaryKey(String payableTypeId);

    int updateByExampleSelective(@Param("record") ParFinancePayableType record, @Param("example") ParFinancePayableTypeExample example);

    int updateByExample(@Param("record") ParFinancePayableType record, @Param("example") ParFinancePayableTypeExample example);

    int updateByPrimaryKeySelective(ParFinancePayableType record);

    int updateByPrimaryKey(ParFinancePayableType record);
}