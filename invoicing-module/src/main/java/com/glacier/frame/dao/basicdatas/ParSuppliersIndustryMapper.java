package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersIndustry;
import com.glacier.frame.entity.basicdatas.ParSuppliersIndustryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersIndustryMapper {
    int countByExample(ParSuppliersIndustryExample example);

    int deleteByExample(ParSuppliersIndustryExample example);

    int deleteByPrimaryKey(String industryId);

    int insert(ParSuppliersIndustry record);

    int insertSelective(ParSuppliersIndustry record);

    List<ParSuppliersIndustry> selectByExample(ParSuppliersIndustryExample example);

    ParSuppliersIndustry selectByPrimaryKey(String industryId);

    int updateByExampleSelective(@Param("record") ParSuppliersIndustry record, @Param("example") ParSuppliersIndustryExample example);

    int updateByExample(@Param("record") ParSuppliersIndustry record, @Param("example") ParSuppliersIndustryExample example);

    int updateByPrimaryKeySelective(ParSuppliersIndustry record);

    int updateByPrimaryKey(ParSuppliersIndustry record);
}