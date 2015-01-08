package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSellReturn_reasonId;
import com.glacier.frame.entity.basicdatas.ParSellReturn_reasonIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSellReturn_reasonIdMapper {
    int countByExample(ParSellReturn_reasonIdExample example);

    int deleteByExample(ParSellReturn_reasonIdExample example);

    int deleteByPrimaryKey(String returnReasonId);

    int insert(ParSellReturn_reasonId record);

    int insertSelective(ParSellReturn_reasonId record);

    List<ParSellReturn_reasonId> selectByExample(ParSellReturn_reasonIdExample example);

    ParSellReturn_reasonId selectByPrimaryKey(String returnReasonId);

    int updateByExampleSelective(@Param("record") ParSellReturn_reasonId record, @Param("example") ParSellReturn_reasonIdExample example);

    int updateByExample(@Param("record") ParSellReturn_reasonId record, @Param("example") ParSellReturn_reasonIdExample example);

    int updateByPrimaryKeySelective(ParSellReturn_reasonId record);

    int updateByPrimaryKey(ParSellReturn_reasonId record);
}