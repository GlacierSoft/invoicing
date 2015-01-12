package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComNature;
import com.glacier.frame.entity.basicdatas.ParComNatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComNatureMapper {
    int countByExample(ParComNatureExample example);

    int deleteByExample(ParComNatureExample example);

    int deleteByPrimaryKey(String natureId);

    int insert(ParComNature record);

    int insertSelective(ParComNature record);

    List<ParComNature> selectByExample(ParComNatureExample example);

    ParComNature selectByPrimaryKey(String natureId);

    int updateByExampleSelective(@Param("record") ParComNature record, @Param("example") ParComNatureExample example);

    int updateByExample(@Param("record") ParComNature record, @Param("example") ParComNatureExample example);

    int updateByPrimaryKeySelective(ParComNature record);

    int updateByPrimaryKey(ParComNature record);
}