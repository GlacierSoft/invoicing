package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersSource;
import com.glacier.frame.entity.basicdatas.ParSuppliersSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersSourceMapper {
    int countByExample(ParSuppliersSourceExample example);

    int deleteByExample(ParSuppliersSourceExample example);

    int deleteByPrimaryKey(String sourceId);

    int insert(ParSuppliersSource record);

    int insertSelective(ParSuppliersSource record);

    List<ParSuppliersSource> selectByExample(ParSuppliersSourceExample example);

    ParSuppliersSource selectByPrimaryKey(String sourceId);

    int updateByExampleSelective(@Param("record") ParSuppliersSource record, @Param("example") ParSuppliersSourceExample example);

    int updateByExample(@Param("record") ParSuppliersSource record, @Param("example") ParSuppliersSourceExample example);

    int updateByPrimaryKeySelective(ParSuppliersSource record);

    int updateByPrimaryKey(ParSuppliersSource record);
}