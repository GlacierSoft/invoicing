package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseRequisitionDetail;
import com.glacier.frame.entity.purchase.PurchaseRequisitionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseRequisitionDetailMapper {
    int countByExample(PurchaseRequisitionDetailExample example);

    int deleteByExample(PurchaseRequisitionDetailExample example);

    int deleteByPrimaryKey(String purReqDetId);

    int insert(PurchaseRequisitionDetail record);

    int insertSelective(PurchaseRequisitionDetail record);

    List<PurchaseRequisitionDetail> selectByExample(PurchaseRequisitionDetailExample example);

    PurchaseRequisitionDetail selectByPrimaryKey(String purReqDetId);

    int updateByExampleSelective(@Param("record") PurchaseRequisitionDetail record, @Param("example") PurchaseRequisitionDetailExample example);

    int updateByExample(@Param("record") PurchaseRequisitionDetail record, @Param("example") PurchaseRequisitionDetailExample example);

    int updateByPrimaryKeySelective(PurchaseRequisitionDetail record);

    int updateByPrimaryKey(PurchaseRequisitionDetail record);
}