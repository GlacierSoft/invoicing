package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseArrivalAffirm;
import com.glacier.frame.entity.purchase.PurchaseArrivalAffirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseArrivalAffirmMapper {
    int countByExample(PurchaseArrivalAffirmExample example);

    int deleteByExample(PurchaseArrivalAffirmExample example);

    int deleteByPrimaryKey(String purArrAffId);

    int insert(PurchaseArrivalAffirm record);

    int insertSelective(PurchaseArrivalAffirm record);

    List<PurchaseArrivalAffirm> selectByExample(PurchaseArrivalAffirmExample example);

    PurchaseArrivalAffirm selectByPrimaryKey(String purArrAffId);

    int updateByExampleSelective(@Param("record") PurchaseArrivalAffirm record, @Param("example") PurchaseArrivalAffirmExample example);

    int updateByExample(@Param("record") PurchaseArrivalAffirm record, @Param("example") PurchaseArrivalAffirmExample example);

    int updateByPrimaryKeySelective(PurchaseArrivalAffirm record);

    int updateByPrimaryKey(PurchaseArrivalAffirm record);
}