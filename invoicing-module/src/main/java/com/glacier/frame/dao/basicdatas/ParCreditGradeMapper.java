package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParCreditGrade;
import com.glacier.frame.entity.basicdatas.ParCreditGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParCreditGradeMapper {
    int countByExample(ParCreditGradeExample example);

    int deleteByExample(ParCreditGradeExample example);

    int deleteByPrimaryKey(String creditId);

    int insert(ParCreditGrade record);

    int insertSelective(ParCreditGrade record);

    List<ParCreditGrade> selectByExample(ParCreditGradeExample example);

    ParCreditGrade selectByPrimaryKey(String creditId);

    int updateByExampleSelective(@Param("record") ParCreditGrade record, @Param("example") ParCreditGradeExample example);

    int updateByExample(@Param("record") ParCreditGrade record, @Param("example") ParCreditGradeExample example);

    int updateByPrimaryKeySelective(ParCreditGrade record);

    int updateByPrimaryKey(ParCreditGrade record);
}