package com.glacier.frame.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.system.UserSetting;
import com.glacier.frame.entity.system.UserSettingExample;

public interface UserSettingMapper {
    int countByExample(UserSettingExample example);

    int deleteByExample(UserSettingExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserSetting record);

    int insertSelective(UserSetting record);

    List<UserSetting> selectByExample(UserSettingExample example);

    UserSetting selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByExample(@Param("record") UserSetting record, @Param("example") UserSettingExample example);

    int updateByPrimaryKeySelective(UserSetting record);

    int updateByPrimaryKey(UserSetting record);
}