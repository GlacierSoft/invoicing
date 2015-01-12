package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParFinanceReceivableType;
import com.glacier.frame.entity.basicdatas.ParFinanceReceivableTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParFinanceReceivableTypeMapper {
    int countByExample(ParFinanceReceivableTypeExample example);

    int deleteByExample(ParFinanceReceivableTypeExample example);

    int deleteByPrimaryKey(String receivableTypeId);

    int insert(ParFinanceReceivableType record);

    int insertSelective(ParFinanceReceivableType record);

    List<ParFinanceReceivableType> selectByExample(ParFinanceReceivableTypeExample example);

    ParFinanceReceivableType selectByPrimaryKey(String receivableTypeId);

    int updateByExampleSelective(@Param("record") ParFinanceReceivableType record, @Param("example") ParFinanceReceivableTypeExample example);

    int updateByExample(@Param("record") ParFinanceReceivableType record, @Param("example") ParFinanceReceivableTypeExample example);

    int updateByPrimaryKeySelective(ParFinanceReceivableType record);

    int updateByPrimaryKey(ParFinanceReceivableType record);
}