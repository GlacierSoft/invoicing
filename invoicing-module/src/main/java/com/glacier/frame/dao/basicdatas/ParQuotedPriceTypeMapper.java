package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParQuotedPriceType;
import com.glacier.frame.entity.basicdatas.ParQuotedPriceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParQuotedPriceTypeMapper {
    int countByExample(ParQuotedPriceTypeExample example);

    int deleteByExample(ParQuotedPriceTypeExample example);

    int deleteByPrimaryKey(String quotedPriceTypeId);

    int insert(ParQuotedPriceType record);

    int insertSelective(ParQuotedPriceType record);

    List<ParQuotedPriceType> selectByExample(ParQuotedPriceTypeExample example);

    ParQuotedPriceType selectByPrimaryKey(String quotedPriceTypeId);

    int updateByExampleSelective(@Param("record") ParQuotedPriceType record, @Param("example") ParQuotedPriceTypeExample example);

    int updateByExample(@Param("record") ParQuotedPriceType record, @Param("example") ParQuotedPriceTypeExample example);

    int updateByPrimaryKeySelective(ParQuotedPriceType record);

    int updateByPrimaryKey(ParQuotedPriceType record);
}