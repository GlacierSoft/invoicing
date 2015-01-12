package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSellReturnReason;
import com.glacier.frame.entity.basicdatas.ParSellReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSellReturnReasonMapper {
    int countByExample(ParSellReturnReasonExample example);

    int deleteByExample(ParSellReturnReasonExample example);

    int deleteByPrimaryKey(String returnReasonId);

    int insert(ParSellReturnReason record);

    int insertSelective(ParSellReturnReason record);

    List<ParSellReturnReason> selectByExample(ParSellReturnReasonExample example);

    ParSellReturnReason selectByPrimaryKey(String returnReasonId);

    int updateByExampleSelective(@Param("record") ParSellReturnReason record, @Param("example") ParSellReturnReasonExample example);

    int updateByExample(@Param("record") ParSellReturnReason record, @Param("example") ParSellReturnReasonExample example);

    int updateByPrimaryKeySelective(ParSellReturnReason record);

    int updateByPrimaryKey(ParSellReturnReason record);
}