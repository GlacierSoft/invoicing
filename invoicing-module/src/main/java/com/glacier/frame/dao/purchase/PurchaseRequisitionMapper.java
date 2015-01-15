package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseRequisition;
import com.glacier.frame.entity.purchase.PurchaseRequisitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseRequisitionMapper {
    int countByExample(PurchaseRequisitionExample example);

    int deleteByExample(PurchaseRequisitionExample example);

    int deleteByPrimaryKey(String purReqId);

    int insert(PurchaseRequisition record);

    int insertSelective(PurchaseRequisition record);

    List<PurchaseRequisition> selectByExample(PurchaseRequisitionExample example);

    PurchaseRequisition selectByPrimaryKey(String purReqId);

    int updateByExampleSelective(@Param("record") PurchaseRequisition record, @Param("example") PurchaseRequisitionExample example);

    int updateByExample(@Param("record") PurchaseRequisition record, @Param("example") PurchaseRequisitionExample example);

    int updateByPrimaryKeySelective(PurchaseRequisition record);

    int updateByPrimaryKey(PurchaseRequisition record);
}