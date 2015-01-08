package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParCompanySize;
import com.glacier.frame.entity.basicdatas.ParCompanySizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParCompanySizeMapper {
    int countByExample(ParCompanySizeExample example);

    int deleteByExample(ParCompanySizeExample example);

    int deleteByPrimaryKey(String companySizeId);

    int insert(ParCompanySize record);

    int insertSelective(ParCompanySize record);

    List<ParCompanySize> selectByExample(ParCompanySizeExample example);

    ParCompanySize selectByPrimaryKey(String companySizeId);

    int updateByExampleSelective(@Param("record") ParCompanySize record, @Param("example") ParCompanySizeExample example);

    int updateByExample(@Param("record") ParCompanySize record, @Param("example") ParCompanySizeExample example);

    int updateByPrimaryKeySelective(ParCompanySize record);

    int updateByPrimaryKey(ParCompanySize record);
}