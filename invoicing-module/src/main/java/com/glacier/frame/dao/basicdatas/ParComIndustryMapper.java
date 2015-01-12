package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComIndustry;
import com.glacier.frame.entity.basicdatas.ParComIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComIndustryMapper {
    int countByExample(ParComIndustryExample example);

    int deleteByExample(ParComIndustryExample example);

    int deleteByPrimaryKey(String industryId);

    int insert(ParComIndustry record);

    int insertSelective(ParComIndustry record);

    List<ParComIndustry> selectByExample(ParComIndustryExample example);

    ParComIndustry selectByPrimaryKey(String industryId);

    int updateByExampleSelective(@Param("record") ParComIndustry record, @Param("example") ParComIndustryExample example);

    int updateByExample(@Param("record") ParComIndustry record, @Param("example") ParComIndustryExample example);

    int updateByPrimaryKeySelective(ParComIndustry record);

    int updateByPrimaryKey(ParComIndustry record);
}