package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseOrder;
import com.glacier.frame.entity.purchase.PurchaseOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderMapper {
    int countByExample(PurchaseOrderExample example);

    int deleteByExample(PurchaseOrderExample example);

    int deleteByPrimaryKey(String purOrderId);

    int insert(PurchaseOrder record);

    int insertSelective(PurchaseOrder record);

    List<PurchaseOrder> selectByExampleWithBLOBs(PurchaseOrderExample example);

    List<PurchaseOrder> selectByExample(PurchaseOrderExample example);

    PurchaseOrder selectByPrimaryKey(String purOrderId);

    int updateByExampleSelective(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    int updateByExample(@Param("record") PurchaseOrder record, @Param("example") PurchaseOrderExample example);

    int updateByPrimaryKeySelective(PurchaseOrder record);

    int updateByPrimaryKeyWithBLOBs(PurchaseOrder record);

    int updateByPrimaryKey(PurchaseOrder record);
}