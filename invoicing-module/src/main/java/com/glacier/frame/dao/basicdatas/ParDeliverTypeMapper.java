package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParDeliverType;
import com.glacier.frame.entity.basicdatas.ParDeliverTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParDeliverTypeMapper {
    int countByExample(ParDeliverTypeExample example);

    int deleteByExample(ParDeliverTypeExample example);

    int deleteByPrimaryKey(String deliverTypeId);

    int insert(ParDeliverType record);

    int insertSelective(ParDeliverType record);

    List<ParDeliverType> selectByExample(ParDeliverTypeExample example);

    ParDeliverType selectByPrimaryKey(String deliverTypeId);

    int updateByExampleSelective(@Param("record") ParDeliverType record, @Param("example") ParDeliverTypeExample example);

    int updateByExample(@Param("record") ParDeliverType record, @Param("example") ParDeliverTypeExample example);

    int updateByPrimaryKeySelective(ParDeliverType record);

    int updateByPrimaryKey(ParDeliverType record);
}