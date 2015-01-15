package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseArrival;
import com.glacier.frame.entity.purchase.PurchaseArrivalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseArrivalMapper {
    int countByExample(PurchaseArrivalExample example);

    int deleteByExample(PurchaseArrivalExample example);

    int deleteByPrimaryKey(String purArrivalId);

    int insert(PurchaseArrival record);

    int insertSelective(PurchaseArrival record);

    List<PurchaseArrival> selectByExample(PurchaseArrivalExample example);

    PurchaseArrival selectByPrimaryKey(String purArrivalId);

    int updateByExampleSelective(@Param("record") PurchaseArrival record, @Param("example") PurchaseArrivalExample example);

    int updateByExample(@Param("record") PurchaseArrival record, @Param("example") PurchaseArrivalExample example);

    int updateByPrimaryKeySelective(PurchaseArrival record);

    int updateByPrimaryKey(PurchaseArrival record);
}