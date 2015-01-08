package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPlanType;
import com.glacier.frame.entity.basicdatas.ParPlanTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPlanTypeMapper {
    int countByExample(ParPlanTypeExample example);

    int deleteByExample(ParPlanTypeExample example);

    int deleteByPrimaryKey(String planTypeId);

    int insert(ParPlanType record);

    int insertSelective(ParPlanType record);

    List<ParPlanType> selectByExample(ParPlanTypeExample example);

    ParPlanType selectByPrimaryKey(String planTypeId);

    int updateByExampleSelective(@Param("record") ParPlanType record, @Param("example") ParPlanTypeExample example);

    int updateByExample(@Param("record") ParPlanType record, @Param("example") ParPlanTypeExample example);

    int updateByPrimaryKeySelective(ParPlanType record);

    int updateByPrimaryKey(ParPlanType record);
}