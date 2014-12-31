package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParameterCarrierCarType;
import com.glacier.frame.entity.basicdatas.ParameterCarrierCarTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterCarrierCarTypeMapper {
    int countByExample(ParameterCarrierCarTypeExample example);

    int deleteByExample(ParameterCarrierCarTypeExample example);

    int deleteByPrimaryKey(String cartypeId);

    int insert(ParameterCarrierCarType record);

    int insertSelective(ParameterCarrierCarType record);

    List<ParameterCarrierCarType> selectByExample(ParameterCarrierCarTypeExample example);

    ParameterCarrierCarType selectByPrimaryKey(String cartypeId);

    int updateByExampleSelective(@Param("record") ParameterCarrierCarType record, @Param("example") ParameterCarrierCarTypeExample example);

    int updateByExample(@Param("record") ParameterCarrierCarType record, @Param("example") ParameterCarrierCarTypeExample example);

    int updateByPrimaryKeySelective(ParameterCarrierCarType record);

    int updateByPrimaryKey(ParameterCarrierCarType record);
}