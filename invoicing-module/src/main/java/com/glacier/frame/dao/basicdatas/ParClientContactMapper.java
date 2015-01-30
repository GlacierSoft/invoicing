package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParClientContact;
import com.glacier.frame.entity.basicdatas.ParClientContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParClientContactMapper {
    int countByExample(ParClientContactExample example);

    int deleteByExample(ParClientContactExample example);

    int deleteByPrimaryKey(String clientContactId);

    int insert(ParClientContact record);

    int insertSelective(ParClientContact record);

    List<ParClientContact> selectByExample(ParClientContactExample example);

    ParClientContact selectByPrimaryKey(String clientContactId);

    int updateByExampleSelective(@Param("record") ParClientContact record, @Param("example") ParClientContactExample example);

    int updateByExample(@Param("record") ParClientContact record, @Param("example") ParClientContactExample example);

    int updateByPrimaryKeySelective(ParClientContact record);

    int updateByPrimaryKey(ParClientContact record);
}