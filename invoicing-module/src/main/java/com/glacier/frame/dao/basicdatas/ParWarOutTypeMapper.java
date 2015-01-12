package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParWarOutType;
import com.glacier.frame.entity.basicdatas.ParWarOutTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParWarOutTypeMapper {
    int countByExample(ParWarOutTypeExample example);

    int deleteByExample(ParWarOutTypeExample example);

    int deleteByPrimaryKey(String outTypeId);

    int insert(ParWarOutType record);

    int insertSelective(ParWarOutType record);

    List<ParWarOutType> selectByExample(ParWarOutTypeExample example);

    ParWarOutType selectByPrimaryKey(String outTypeId);

    int updateByExampleSelective(@Param("record") ParWarOutType record, @Param("example") ParWarOutTypeExample example);

    int updateByExample(@Param("record") ParWarOutType record, @Param("example") ParWarOutTypeExample example);

    int updateByPrimaryKeySelective(ParWarOutType record);

    int updateByPrimaryKey(ParWarOutType record);
}