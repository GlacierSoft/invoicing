package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPaymentType;
import com.glacier.frame.entity.basicdatas.ParPaymentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPaymentTypeMapper {
    int countByExample(ParPaymentTypeExample example);

    int deleteByExample(ParPaymentTypeExample example);

    int deleteByPrimaryKey(String paymentTypeId);

    int insert(ParPaymentType record);

    int insertSelective(ParPaymentType record);

    List<ParPaymentType> selectByExample(ParPaymentTypeExample example);

    ParPaymentType selectByPrimaryKey(String paymentTypeId);

    int updateByExampleSelective(@Param("record") ParPaymentType record, @Param("example") ParPaymentTypeExample example);

    int updateByExample(@Param("record") ParPaymentType record, @Param("example") ParPaymentTypeExample example);

    int updateByPrimaryKeySelective(ParPaymentType record);

    int updateByPrimaryKey(ParPaymentType record);
}