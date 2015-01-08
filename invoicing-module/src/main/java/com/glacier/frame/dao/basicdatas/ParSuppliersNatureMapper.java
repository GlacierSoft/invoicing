package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersNature;
import com.glacier.frame.entity.basicdatas.ParSuppliersNatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersNatureMapper {
    int countByExample(ParSuppliersNatureExample example);

    int deleteByExample(ParSuppliersNatureExample example);

    int deleteByPrimaryKey(String natureId);

    int insert(ParSuppliersNature record);

    int insertSelective(ParSuppliersNature record);

    List<ParSuppliersNature> selectByExample(ParSuppliersNatureExample example);

    ParSuppliersNature selectByPrimaryKey(String natureId);

    int updateByExampleSelective(@Param("record") ParSuppliersNature record, @Param("example") ParSuppliersNatureExample example);

    int updateByExample(@Param("record") ParSuppliersNature record, @Param("example") ParSuppliersNatureExample example);

    int updateByPrimaryKeySelective(ParSuppliersNature record);

    int updateByPrimaryKey(ParSuppliersNature record);
}