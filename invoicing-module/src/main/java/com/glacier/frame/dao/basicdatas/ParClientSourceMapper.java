package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParClientSource;
import com.glacier.frame.entity.basicdatas.ParClientSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParClientSourceMapper {
    int countByExample(ParClientSourceExample example);

    int deleteByExample(ParClientSourceExample example);

    int deleteByPrimaryKey(String clientSourceId);

    int insert(ParClientSource record);

    int insertSelective(ParClientSource record);

    List<ParClientSource> selectByExample(ParClientSourceExample example);

    ParClientSource selectByPrimaryKey(String clientSourceId);

    int updateByExampleSelective(@Param("record") ParClientSource record, @Param("example") ParClientSourceExample example);

    int updateByExample(@Param("record") ParClientSource record, @Param("example") ParClientSourceExample example);

    int updateByPrimaryKeySelective(ParClientSource record);

    int updateByPrimaryKey(ParClientSource record);
}