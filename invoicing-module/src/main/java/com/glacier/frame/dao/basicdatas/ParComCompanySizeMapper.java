package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComCompanySize;
import com.glacier.frame.entity.basicdatas.ParComCompanySizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComCompanySizeMapper {
    int countByExample(ParComCompanySizeExample example);

    int deleteByExample(ParComCompanySizeExample example);

    int deleteByPrimaryKey(String companySizeId);

    int insert(ParComCompanySize record);

    int insertSelective(ParComCompanySize record);

    List<ParComCompanySize> selectByExample(ParComCompanySizeExample example);

    ParComCompanySize selectByPrimaryKey(String companySizeId);

    int updateByExampleSelective(@Param("record") ParComCompanySize record, @Param("example") ParComCompanySizeExample example);

    int updateByExample(@Param("record") ParComCompanySize record, @Param("example") ParComCompanySizeExample example);

    int updateByPrimaryKeySelective(ParComCompanySize record);

    int updateByPrimaryKey(ParComCompanySize record);
}