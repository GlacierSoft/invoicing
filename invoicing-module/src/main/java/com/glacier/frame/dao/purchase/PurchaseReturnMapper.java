package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseReturn;
import com.glacier.frame.entity.purchase.PurchaseReturnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseReturnMapper {
    int countByExample(PurchaseReturnExample example);

    int deleteByExample(PurchaseReturnExample example);

    int deleteByPrimaryKey(String purReturnId);

    int insert(PurchaseReturn record);

    int insertSelective(PurchaseReturn record);

    List<PurchaseReturn> selectByExample(PurchaseReturnExample example);

    PurchaseReturn selectByPrimaryKey(String purReturnId);

    int updateByExampleSelective(@Param("record") PurchaseReturn record, @Param("example") PurchaseReturnExample example);

    int updateByExample(@Param("record") PurchaseReturn record, @Param("example") PurchaseReturnExample example);

    int updateByPrimaryKeySelective(PurchaseReturn record);

    int updateByPrimaryKey(PurchaseReturn record);
}