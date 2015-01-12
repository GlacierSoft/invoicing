package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComPaymentType;
import com.glacier.frame.entity.basicdatas.ParComPaymentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComPaymentTypeMapper {
    int countByExample(ParComPaymentTypeExample example);

    int deleteByExample(ParComPaymentTypeExample example);

    int deleteByPrimaryKey(String paymentTypeId);

    int insert(ParComPaymentType record);

    int insertSelective(ParComPaymentType record);

    List<ParComPaymentType> selectByExample(ParComPaymentTypeExample example);

    ParComPaymentType selectByPrimaryKey(String paymentTypeId);

    int updateByExampleSelective(@Param("record") ParComPaymentType record, @Param("example") ParComPaymentTypeExample example);

    int updateByExample(@Param("record") ParComPaymentType record, @Param("example") ParComPaymentTypeExample example);

    int updateByPrimaryKeySelective(ParComPaymentType record);

    int updateByPrimaryKey(ParComPaymentType record);
}