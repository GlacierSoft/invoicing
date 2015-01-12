package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParSuppliersGrade;
import com.glacier.frame.entity.basicdatas.ParSuppliersGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParSuppliersGradeMapper {
    int countByExample(ParSuppliersGradeExample example);

    int deleteByExample(ParSuppliersGradeExample example);

    int deleteByPrimaryKey(String gradeId);

    int insert(ParSuppliersGrade record);

    int insertSelective(ParSuppliersGrade record);

    List<ParSuppliersGrade> selectByExample(ParSuppliersGradeExample example);

    ParSuppliersGrade selectByPrimaryKey(String gradeId);

    int updateByExampleSelective(@Param("record") ParSuppliersGrade record, @Param("example") ParSuppliersGradeExample example);

    int updateByExample(@Param("record") ParSuppliersGrade record, @Param("example") ParSuppliersGradeExample example);

    int updateByPrimaryKeySelective(ParSuppliersGrade record);

    int updateByPrimaryKey(ParSuppliersGrade record);
}