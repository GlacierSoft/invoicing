package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersSize;
import com.glacier.frame.entity.basicdatas.ParSuppliersSizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersSizeMapper {
    int countByExample(ParSuppliersSizeExample example);

    int deleteByExample(ParSuppliersSizeExample example);

    int deleteByPrimaryKey(String sizeId);

    int insert(ParSuppliersSize record);

    int insertSelective(ParSuppliersSize record);

    List<ParSuppliersSize> selectByExample(ParSuppliersSizeExample example);

    ParSuppliersSize selectByPrimaryKey(String sizeId);

    int updateByExampleSelective(@Param("record") ParSuppliersSize record, @Param("example") ParSuppliersSizeExample example);

    int updateByExample(@Param("record") ParSuppliersSize record, @Param("example") ParSuppliersSizeExample example);

    int updateByPrimaryKeySelective(ParSuppliersSize record);

    int updateByPrimaryKey(ParSuppliersSize record);
}