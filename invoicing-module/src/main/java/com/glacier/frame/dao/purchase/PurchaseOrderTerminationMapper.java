package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseOrderTermination;
import com.glacier.frame.entity.purchase.PurchaseOrderTerminationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderTerminationMapper {
    int countByExample(PurchaseOrderTerminationExample example);

    int deleteByExample(PurchaseOrderTerminationExample example);

    int deleteByPrimaryKey(String purOrderTerId);

    int insert(PurchaseOrderTermination record);

    int insertSelective(PurchaseOrderTermination record);

    List<PurchaseOrderTermination> selectByExample(PurchaseOrderTerminationExample example);

    PurchaseOrderTermination selectByPrimaryKey(String purOrderTerId);

    int updateByExampleSelective(@Param("record") PurchaseOrderTermination record, @Param("example") PurchaseOrderTerminationExample example);

    int updateByExample(@Param("record") PurchaseOrderTermination record, @Param("example") PurchaseOrderTerminationExample example);

    int updateByPrimaryKeySelective(PurchaseOrderTermination record);

    int updateByPrimaryKey(PurchaseOrderTermination record);
}