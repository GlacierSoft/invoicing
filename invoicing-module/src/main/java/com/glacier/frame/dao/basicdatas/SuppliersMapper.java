package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.Suppliers;
import com.glacier.frame.entity.basicdatas.SuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliersMapper {
    int countByExample(SuppliersExample example);

    int deleteByExample(SuppliersExample example);

    int deleteByPrimaryKey(String supplierId);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    List<Suppliers> selectByExample(SuppliersExample example);

    Suppliers selectByPrimaryKey(String supplierId);

    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKey(Suppliers record);
}