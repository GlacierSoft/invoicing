package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParPurchaseReturnedType;
import com.glacier.frame.entity.basicdatas.ParPurchaseReturnedTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParPurchaseReturnedTypeMapper {
    int countByExample(ParPurchaseReturnedTypeExample example);

    int deleteByExample(ParPurchaseReturnedTypeExample example);

    int deleteByPrimaryKey(String returnedPurchaseTypeId);

    int insert(ParPurchaseReturnedType record);

    int insertSelective(ParPurchaseReturnedType record);

    List<ParPurchaseReturnedType> selectByExample(ParPurchaseReturnedTypeExample example);

    ParPurchaseReturnedType selectByPrimaryKey(String returnedPurchaseTypeId);

    int updateByExampleSelective(@Param("record") ParPurchaseReturnedType record, @Param("example") ParPurchaseReturnedTypeExample example);

    int updateByExample(@Param("record") ParPurchaseReturnedType record, @Param("example") ParPurchaseReturnedTypeExample example);

    int updateByPrimaryKeySelective(ParPurchaseReturnedType record);

    int updateByPrimaryKey(ParPurchaseReturnedType record);
}