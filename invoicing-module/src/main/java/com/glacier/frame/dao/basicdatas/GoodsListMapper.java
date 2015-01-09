package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.GoodsList;
import com.glacier.frame.entity.basicdatas.GoodsListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsListMapper {
    int countByExample(GoodsListExample example);

    int deleteByExample(GoodsListExample example);

    int deleteByPrimaryKey(String goodsId);

    int insert(GoodsList record);

    int insertSelective(GoodsList record);

    List<GoodsList> selectByExample(GoodsListExample example);

    GoodsList selectByPrimaryKey(String goodsId);

    int updateByExampleSelective(@Param("record") GoodsList record, @Param("example") GoodsListExample example);

    int updateByExample(@Param("record") GoodsList record, @Param("example") GoodsListExample example);

    int updateByPrimaryKeySelective(GoodsList record);

    int updateByPrimaryKey(GoodsList record);
}