package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParReturnedPurchaseType;
import com.glacier.frame.entity.basicdatas.ParReturnedPurchaseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParReturnedPurchaseTypeMapper {
    int countByExample(ParReturnedPurchaseTypeExample example);

    int deleteByExample(ParReturnedPurchaseTypeExample example);

    int deleteByPrimaryKey(String returnedPurchaseTypeId);

    int insert(ParReturnedPurchaseType record);

    int insertSelective(ParReturnedPurchaseType record);

    List<ParReturnedPurchaseType> selectByExample(ParReturnedPurchaseTypeExample example);

    ParReturnedPurchaseType selectByPrimaryKey(String returnedPurchaseTypeId);

    int updateByExampleSelective(@Param("record") ParReturnedPurchaseType record, @Param("example") ParReturnedPurchaseTypeExample example);

    int updateByExample(@Param("record") ParReturnedPurchaseType record, @Param("example") ParReturnedPurchaseTypeExample example);

    int updateByPrimaryKeySelective(ParReturnedPurchaseType record);

    int updateByPrimaryKey(ParReturnedPurchaseType record);
}