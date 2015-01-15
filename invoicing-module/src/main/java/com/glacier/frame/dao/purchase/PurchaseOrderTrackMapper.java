package com.glacier.frame.dao.purchase;

import com.glacier.frame.entity.purchase.PurchaseOrderTrack;
import com.glacier.frame.entity.purchase.PurchaseOrderTrackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseOrderTrackMapper {
    int countByExample(PurchaseOrderTrackExample example);

    int deleteByExample(PurchaseOrderTrackExample example);

    int deleteByPrimaryKey(String purOrderTraId);

    int insert(PurchaseOrderTrack record);

    int insertSelective(PurchaseOrderTrack record);

    List<PurchaseOrderTrack> selectByExample(PurchaseOrderTrackExample example);

    PurchaseOrderTrack selectByPrimaryKey(String purOrderTraId);

    int updateByExampleSelective(@Param("record") PurchaseOrderTrack record, @Param("example") PurchaseOrderTrackExample example);

    int updateByExample(@Param("record") PurchaseOrderTrack record, @Param("example") PurchaseOrderTrackExample example);

    int updateByPrimaryKeySelective(PurchaseOrderTrack record);

    int updateByPrimaryKey(PurchaseOrderTrack record);
}