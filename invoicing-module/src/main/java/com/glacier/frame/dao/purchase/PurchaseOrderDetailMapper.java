package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseOrderDetail;
import com.glacier.frame.entity.purchase.PurchaseOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderDetailMapper {
    int countByExample(PurchaseOrderDetailExample example);

    int deleteByExample(PurchaseOrderDetailExample example);

    int deleteByPrimaryKey(String purOrderDetId);

    int insert(PurchaseOrderDetail record);

    int insertSelective(PurchaseOrderDetail record);

    List<PurchaseOrderDetail> selectByExample(PurchaseOrderDetailExample example);

    PurchaseOrderDetail selectByPrimaryKey(String purOrderDetId);

    int updateByExampleSelective(@Param("record") PurchaseOrderDetail record, @Param("example") PurchaseOrderDetailExample example);

    int updateByExample(@Param("record") PurchaseOrderDetail record, @Param("example") PurchaseOrderDetailExample example);

    int updateByPrimaryKeySelective(PurchaseOrderDetail record);

    int updateByPrimaryKey(PurchaseOrderDetail record);
}