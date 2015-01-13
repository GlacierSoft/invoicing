package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParWarGoodsType;
import com.glacier.frame.entity.basicdatas.ParWarGoodsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParWarGoodsTypeMapper {
    int countByExample(ParWarGoodsTypeExample example);

    int deleteByExample(ParWarGoodsTypeExample example);

    int deleteByPrimaryKey(String warGoodsTypeId);

    int insert(ParWarGoodsType record);

    int insertSelective(ParWarGoodsType record);

    List<ParWarGoodsType> selectByExample(ParWarGoodsTypeExample example);

    ParWarGoodsType selectByPrimaryKey(String warGoodsTypeId);

    int updateByExampleSelective(@Param("record") ParWarGoodsType record, @Param("example") ParWarGoodsTypeExample example);

    int updateByExample(@Param("record") ParWarGoodsType record, @Param("example") ParWarGoodsTypeExample example);

    int updateByPrimaryKeySelective(ParWarGoodsType record);

    int updateByPrimaryKey(ParWarGoodsType record);
}