package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.Suppliers;
import com.glacier.frame.entity.basicdatas.SuppliersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SuppliersMapper {
    int countByExample(SuppliersExample example);

    int deleteByExample(SuppliersExample example);

    int deleteByPrimaryKey(String supplierId);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);
    
  //倒序查询班次编号
    @Select("SELECT supplier_number FROM t_suppliers ORDER BY supplier_number DESC LIMIT 1")
    String selectTop();

    List<Suppliers> selectByExample(SuppliersExample example);

    Suppliers selectByPrimaryKey(String supplierId);

    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKey(Suppliers record);
}