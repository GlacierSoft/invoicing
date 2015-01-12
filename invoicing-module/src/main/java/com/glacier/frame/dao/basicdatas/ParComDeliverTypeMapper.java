package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComDeliverType;
import com.glacier.frame.entity.basicdatas.ParComDeliverTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComDeliverTypeMapper {
    int countByExample(ParComDeliverTypeExample example);

    int deleteByExample(ParComDeliverTypeExample example);

    int deleteByPrimaryKey(String deliverTypeId);

    int insert(ParComDeliverType record);

    int insertSelective(ParComDeliverType record);

    List<ParComDeliverType> selectByExample(ParComDeliverTypeExample example);

    ParComDeliverType selectByPrimaryKey(String deliverTypeId);

    int updateByExampleSelective(@Param("record") ParComDeliverType record, @Param("example") ParComDeliverTypeExample example);

    int updateByExample(@Param("record") ParComDeliverType record, @Param("example") ParComDeliverTypeExample example);

    int updateByPrimaryKeySelective(ParComDeliverType record);

    int updateByPrimaryKey(ParComDeliverType record);
}