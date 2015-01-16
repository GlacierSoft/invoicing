package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParWarGoodsClassify;
import com.glacier.frame.entity.basicdatas.ParWarGoodsClassifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParWarGoodsClassifyMapper {
    int countByExample(ParWarGoodsClassifyExample example);

    int deleteByExample(ParWarGoodsClassifyExample example);

    int deleteByPrimaryKey(String warehouseClassifyId);

    int insert(ParWarGoodsClassify record);

    int insertSelective(ParWarGoodsClassify record);

    List<ParWarGoodsClassify> selectByExample(ParWarGoodsClassifyExample example);

    ParWarGoodsClassify selectByPrimaryKey(String warehouseClassifyId);

    int updateByExampleSelective(@Param("record") ParWarGoodsClassify record, @Param("example") ParWarGoodsClassifyExample example);

    int updateByExample(@Param("record") ParWarGoodsClassify record, @Param("example") ParWarGoodsClassifyExample example);

    int updateByPrimaryKeySelective(ParWarGoodsClassify record);

    int updateByPrimaryKey(ParWarGoodsClassify record);
}