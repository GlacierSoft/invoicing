package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParWarOccupationType;
import com.glacier.frame.entity.basicdatas.ParWarOccupationTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParWarOccupationTypeMapper {
    int countByExample(ParWarOccupationTypeExample example);

    int deleteByExample(ParWarOccupationTypeExample example);

    int deleteByPrimaryKey(String occupationTypeId);

    int insert(ParWarOccupationType record);

    int insertSelective(ParWarOccupationType record);

    List<ParWarOccupationType> selectByExample(ParWarOccupationTypeExample example);

    ParWarOccupationType selectByPrimaryKey(String occupationTypeId);

    int updateByExampleSelective(@Param("record") ParWarOccupationType record, @Param("example") ParWarOccupationTypeExample example);

    int updateByExample(@Param("record") ParWarOccupationType record, @Param("example") ParWarOccupationTypeExample example);

    int updateByPrimaryKeySelective(ParWarOccupationType record);

    int updateByPrimaryKey(ParWarOccupationType record);
}