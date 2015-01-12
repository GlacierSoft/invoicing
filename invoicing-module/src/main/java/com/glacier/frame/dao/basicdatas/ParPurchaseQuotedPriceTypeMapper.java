package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPurchaseQuotedPriceType;
import com.glacier.frame.entity.basicdatas.ParPurchaseQuotedPriceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPurchaseQuotedPriceTypeMapper {
    int countByExample(ParPurchaseQuotedPriceTypeExample example);

    int deleteByExample(ParPurchaseQuotedPriceTypeExample example);

    int deleteByPrimaryKey(String quotedPriceTypeId);

    int insert(ParPurchaseQuotedPriceType record);

    int insertSelective(ParPurchaseQuotedPriceType record);

    List<ParPurchaseQuotedPriceType> selectByExample(ParPurchaseQuotedPriceTypeExample example);

    ParPurchaseQuotedPriceType selectByPrimaryKey(String quotedPriceTypeId);

    int updateByExampleSelective(@Param("record") ParPurchaseQuotedPriceType record, @Param("example") ParPurchaseQuotedPriceTypeExample example);

    int updateByExample(@Param("record") ParPurchaseQuotedPriceType record, @Param("example") ParPurchaseQuotedPriceTypeExample example);

    int updateByPrimaryKeySelective(ParPurchaseQuotedPriceType record);

    int updateByPrimaryKey(ParPurchaseQuotedPriceType record);
}