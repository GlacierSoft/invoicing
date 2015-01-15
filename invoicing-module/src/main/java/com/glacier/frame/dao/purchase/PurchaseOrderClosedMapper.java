package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseOrderClosed;
import com.glacier.frame.entity.purchase.PurchaseOrderClosedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderClosedMapper {
    int countByExample(PurchaseOrderClosedExample example);

    int deleteByExample(PurchaseOrderClosedExample example);

    int deleteByPrimaryKey(String purOrderColId);

    int insert(PurchaseOrderClosed record);

    int insertSelective(PurchaseOrderClosed record);

    List<PurchaseOrderClosed> selectByExample(PurchaseOrderClosedExample example);

    PurchaseOrderClosed selectByPrimaryKey(String purOrderColId);

    int updateByExampleSelective(@Param("record") PurchaseOrderClosed record, @Param("example") PurchaseOrderClosedExample example);

    int updateByExample(@Param("record") PurchaseOrderClosed record, @Param("example") PurchaseOrderClosedExample example);

    int updateByPrimaryKeySelective(PurchaseOrderClosed record);

    int updateByPrimaryKey(PurchaseOrderClosed record);
}