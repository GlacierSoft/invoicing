package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPurchaseType;
import com.glacier.frame.entity.basicdatas.ParPurchaseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPurchaseTypeMapper {
    int countByExample(ParPurchaseTypeExample example);

    int deleteByExample(ParPurchaseTypeExample example);

    int deleteByPrimaryKey(String purchaseTypeId);

    int insert(ParPurchaseType record);

    int insertSelective(ParPurchaseType record);

    List<ParPurchaseType> selectByExample(ParPurchaseTypeExample example);

    ParPurchaseType selectByPrimaryKey(String purchaseTypeId);

    int updateByExampleSelective(@Param("record") ParPurchaseType record, @Param("example") ParPurchaseTypeExample example);

    int updateByExample(@Param("record") ParPurchaseType record, @Param("example") ParPurchaseTypeExample example);

    int updateByPrimaryKeySelective(ParPurchaseType record);

    int updateByPrimaryKey(ParPurchaseType record);
}