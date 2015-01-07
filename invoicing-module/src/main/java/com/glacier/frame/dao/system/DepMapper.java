package com.glacier.frame.dao.system;

import com.glacier.frame.entity.system.Dep;
import com.glacier.frame.entity.system.DepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepMapper {
    int countByExample(DepExample example);

    int deleteByExample(DepExample example);

    int deleteByPrimaryKey(String depId);

    int insert(Dep record);

    int insertSelective(Dep record);

    List<Dep> selectByExample(DepExample example);

    Dep selectByPrimaryKey(String depId);

    int updateByExampleSelective(@Param("record") Dep record, @Param("example") DepExample example);

    int updateByExample(@Param("record") Dep record, @Param("example") DepExample example);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}