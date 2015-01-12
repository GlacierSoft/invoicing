package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersType;
import com.glacier.frame.entity.basicdatas.ParSuppliersTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersTypeMapper {
    int countByExample(ParSuppliersTypeExample example);

    int deleteByExample(ParSuppliersTypeExample example);

    int deleteByPrimaryKey(String typeId);

    int insert(ParSuppliersType record);

    int insertSelective(ParSuppliersType record);

    List<ParSuppliersType> selectByExample(ParSuppliersTypeExample example);

    ParSuppliersType selectByPrimaryKey(String typeId);

    int updateByExampleSelective(@Param("record") ParSuppliersType record, @Param("example") ParSuppliersTypeExample example);

    int updateByExample(@Param("record") ParSuppliersType record, @Param("example") ParSuppliersTypeExample example);

    int updateByPrimaryKeySelective(ParSuppliersType record);

    int updateByPrimaryKey(ParSuppliersType record);
}