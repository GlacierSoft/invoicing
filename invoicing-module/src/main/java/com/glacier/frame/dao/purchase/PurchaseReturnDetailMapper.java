package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseReturnDetail;
import com.glacier.frame.entity.purchase.PurchaseReturnDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseReturnDetailMapper {
    int countByExample(PurchaseReturnDetailExample example);

    int deleteByExample(PurchaseReturnDetailExample example);

    int deleteByPrimaryKey(String purReturnDetId);

    int insert(PurchaseReturnDetail record);

    int insertSelective(PurchaseReturnDetail record);

    List<PurchaseReturnDetail> selectByExample(PurchaseReturnDetailExample example);

    PurchaseReturnDetail selectByPrimaryKey(String purReturnDetId);

    int updateByExampleSelective(@Param("record") PurchaseReturnDetail record, @Param("example") PurchaseReturnDetailExample example);

    int updateByExample(@Param("record") PurchaseReturnDetail record, @Param("example") PurchaseReturnDetailExample example);

    int updateByPrimaryKeySelective(PurchaseReturnDetail record);

    int updateByPrimaryKey(PurchaseReturnDetail record);
}