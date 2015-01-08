package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSellType;
import com.glacier.frame.entity.basicdatas.ParSellTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSellTypeMapper {
    int countByExample(ParSellTypeExample example);

    int deleteByExample(ParSellTypeExample example);

    int deleteByPrimaryKey(String sellTypeId);

    int insert(ParSellType record);

    int insertSelective(ParSellType record);

    List<ParSellType> selectByExample(ParSellTypeExample example);

    ParSellType selectByPrimaryKey(String sellTypeId);

    int updateByExampleSelective(@Param("record") ParSellType record, @Param("example") ParSellTypeExample example);

    int updateByExample(@Param("record") ParSellType record, @Param("example") ParSellTypeExample example);

    int updateByPrimaryKeySelective(ParSellType record);

    int updateByPrimaryKey(ParSellType record);
}