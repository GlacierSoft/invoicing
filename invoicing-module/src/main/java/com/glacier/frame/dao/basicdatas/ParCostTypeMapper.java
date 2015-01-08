package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParCostType;
import com.glacier.frame.entity.basicdatas.ParCostTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParCostTypeMapper {
    int countByExample(ParCostTypeExample example);

    int deleteByExample(ParCostTypeExample example);

    int deleteByPrimaryKey(String costTypeId);

    int insert(ParCostType record);

    int insertSelective(ParCostType record);

    List<ParCostType> selectByExample(ParCostTypeExample example);

    ParCostType selectByPrimaryKey(String costTypeId);

    int updateByExampleSelective(@Param("record") ParCostType record, @Param("example") ParCostTypeExample example);

    int updateByExample(@Param("record") ParCostType record, @Param("example") ParCostTypeExample example);

    int updateByPrimaryKeySelective(ParCostType record);

    int updateByPrimaryKey(ParCostType record);
}