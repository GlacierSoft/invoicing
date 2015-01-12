package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPurchaseReturnReason;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPurchaseReturnReasonMapper {
    int countByExample(ParPurchaseReturnReasonExample example);

    int deleteByExample(ParPurchaseReturnReasonExample example);

    int deleteByPrimaryKey(String returnReasonId);

    int insert(ParPurchaseReturnReason record);

    int insertSelective(ParPurchaseReturnReason record);

    List<ParPurchaseReturnReason> selectByExample(ParPurchaseReturnReasonExample example);

    ParPurchaseReturnReason selectByPrimaryKey(String returnReasonId);

    int updateByExampleSelective(@Param("record") ParPurchaseReturnReason record, @Param("example") ParPurchaseReturnReasonExample example);

    int updateByExample(@Param("record") ParPurchaseReturnReason record, @Param("example") ParPurchaseReturnReasonExample example);

    int updateByPrimaryKeySelective(ParPurchaseReturnReason record);

    int updateByPrimaryKey(ParPurchaseReturnReason record);
}