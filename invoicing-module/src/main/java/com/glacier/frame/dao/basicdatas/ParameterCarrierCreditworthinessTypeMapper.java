package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessType;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCreditworthinessTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterCarrierCreditworthinessTypeMapper {
    int countByExample(ParameterCarrierCreditworthinessTypeExample example);

    int deleteByExample(ParameterCarrierCreditworthinessTypeExample example);

    int deleteByPrimaryKey(String creditworthinessTypeId);

    int insert(ParameterCarrierCreditworthinessType record);

    int insertSelective(ParameterCarrierCreditworthinessType record);

    List<ParameterCarrierCreditworthinessType> selectByExample(ParameterCarrierCreditworthinessTypeExample example);

    ParameterCarrierCreditworthinessType selectByPrimaryKey(String creditworthinessTypeId);

    int updateByExampleSelective(@Param("record") ParameterCarrierCreditworthinessType record, @Param("example") ParameterCarrierCreditworthinessTypeExample example);

    int updateByExample(@Param("record") ParameterCarrierCreditworthinessType record, @Param("example") ParameterCarrierCreditworthinessTypeExample example);

    int updateByPrimaryKeySelective(ParameterCarrierCreditworthinessType record);

    int updateByPrimaryKey(ParameterCarrierCreditworthinessType record);
}