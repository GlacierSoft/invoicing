package com.glacier.frame.dao.system;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.glacier.frame.entity.system.Panel;
import com.glacier.frame.entity.system.PanelExample;

public interface PanelMapper {
    int countByExample(PanelExample example);

    int deleteByExample(PanelExample example);

    int deleteByPrimaryKey(String panelId);

    int insert(Panel record);

    int insertSelective(Panel record);

    List<Panel> selectByExample(PanelExample example);

    Panel selectByPrimaryKey(String panelId);

    int updateByExampleSelective(@Param("record") Panel record, @Param("example") PanelExample example);

    int updateByExample(@Param("record") Panel record, @Param("example") PanelExample example);

    int updateByPrimaryKeySelective(Panel record);

    int updateByPrimaryKey(Panel record);
}