package com.glacier.frame.dao.system;

import com.glacier.frame.entity.system.DepRoleExample;
import com.glacier.frame.entity.system.DepRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepRoleMapper {
    int countByExample(DepRoleExample example);

    int deleteByExample(DepRoleExample example);

    int deleteByPrimaryKey(DepRoleKey key);

    int insert(DepRoleKey record);

    int insertSelective(DepRoleKey record);

    List<DepRoleKey> selectByExample(DepRoleExample example);

    int updateByExampleSelective(@Param("record") DepRoleKey record, @Param("example") DepRoleExample example);

    int updateByExample(@Param("record") DepRoleKey record, @Param("example") DepRoleExample example);
}