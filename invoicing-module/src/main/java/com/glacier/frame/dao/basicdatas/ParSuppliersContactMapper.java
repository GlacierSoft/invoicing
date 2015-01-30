package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersContact;
import com.glacier.frame.entity.basicdatas.ParSuppliersContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersContactMapper {
    int countByExample(ParSuppliersContactExample example);

    int deleteByExample(ParSuppliersContactExample example);

    int deleteByPrimaryKey(String supplierContactId);

    int insert(ParSuppliersContact record);

    int insertSelective(ParSuppliersContact record);

    List<ParSuppliersContact> selectByExample(ParSuppliersContactExample example);

    ParSuppliersContact selectByPrimaryKey(String supplierContactId);

    int updateByExampleSelective(@Param("record") ParSuppliersContact record, @Param("example") ParSuppliersContactExample example);

    int updateByExample(@Param("record") ParSuppliersContact record, @Param("example") ParSuppliersContactExample example);

    int updateByPrimaryKeySelective(ParSuppliersContact record);

    int updateByPrimaryKey(ParSuppliersContact record);
}