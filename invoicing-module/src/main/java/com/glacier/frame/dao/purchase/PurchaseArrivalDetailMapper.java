package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseArrivalDetail;
import com.glacier.frame.entity.purchase.PurchaseArrivalDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseArrivalDetailMapper {
    int countByExample(PurchaseArrivalDetailExample example);

    int deleteByExample(PurchaseArrivalDetailExample example);

    int deleteByPrimaryKey(String purArrivalDetId);

    int insert(PurchaseArrivalDetail record);

    int insertSelective(PurchaseArrivalDetail record);

    List<PurchaseArrivalDetail> selectByExample(PurchaseArrivalDetailExample example);

    PurchaseArrivalDetail selectByPrimaryKey(String purArrivalDetId);

    int updateByExampleSelective(@Param("record") PurchaseArrivalDetail record, @Param("example") PurchaseArrivalDetailExample example);

    int updateByExample(@Param("record") PurchaseArrivalDetail record, @Param("example") PurchaseArrivalDetailExample example);

    int updateByPrimaryKeySelective(PurchaseArrivalDetail record);

    int updateByPrimaryKey(PurchaseArrivalDetail record);
}