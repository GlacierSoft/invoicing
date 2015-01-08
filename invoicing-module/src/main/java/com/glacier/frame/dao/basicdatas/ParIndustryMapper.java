package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParIndustry;
import com.glacier.frame.entity.basicdatas.ParIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParIndustryMapper {
    int countByExample(ParIndustryExample example);

    int deleteByExample(ParIndustryExample example);

    int deleteByPrimaryKey(String industryId);

    int insert(ParIndustry record);

    int insertSelective(ParIndustry record);

    List<ParIndustry> selectByExample(ParIndustryExample example);

    ParIndustry selectByPrimaryKey(String industryId);

    int updateByExampleSelective(@Param("record") ParIndustry record, @Param("example") ParIndustryExample example);

    int updateByExample(@Param("record") ParIndustry record, @Param("example") ParIndustryExample example);

    int updateByPrimaryKeySelective(ParIndustry record);

    int updateByPrimaryKey(ParIndustry record);
}