package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParWarDeployType;
import com.glacier.frame.entity.basicdatas.ParWarDeployTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParWarDeployTypeMapper {
    int countByExample(ParWarDeployTypeExample example);

    int deleteByExample(ParWarDeployTypeExample example);

    int deleteByPrimaryKey(String deployTypeId);

    int insert(ParWarDeployType record);

    int insertSelective(ParWarDeployType record);

    List<ParWarDeployType> selectByExample(ParWarDeployTypeExample example);

    ParWarDeployType selectByPrimaryKey(String deployTypeId);

    int updateByExampleSelective(@Param("record") ParWarDeployType record, @Param("example") ParWarDeployTypeExample example);

    int updateByExample(@Param("record") ParWarDeployType record, @Param("example") ParWarDeployTypeExample example);

    int updateByPrimaryKeySelective(ParWarDeployType record);

    int updateByPrimaryKey(ParWarDeployType record);
}