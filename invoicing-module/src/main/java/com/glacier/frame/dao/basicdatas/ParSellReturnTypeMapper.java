package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSellReturnType;
import com.glacier.frame.entity.basicdatas.ParSellReturnTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSellReturnTypeMapper {
    int countByExample(ParSellReturnTypeExample example);

    int deleteByExample(ParSellReturnTypeExample example);

    int deleteByPrimaryKey(String returnTypeId);

    int insert(ParSellReturnType record);

    int insertSelective(ParSellReturnType record);

    List<ParSellReturnType> selectByExample(ParSellReturnTypeExample example);

    ParSellReturnType selectByPrimaryKey(String returnTypeId);

    int updateByExampleSelective(@Param("record") ParSellReturnType record, @Param("example") ParSellReturnTypeExample example);

    int updateByExample(@Param("record") ParSellReturnType record, @Param("example") ParSellReturnTypeExample example);

    int updateByPrimaryKeySelective(ParSellReturnType record);

    int updateByPrimaryKey(ParSellReturnType record);
}