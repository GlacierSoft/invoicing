package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParComCreditGrade;
import com.glacier.frame.entity.basicdatas.ParComCreditGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParComCreditGradeMapper {
    int countByExample(ParComCreditGradeExample example);

    int deleteByExample(ParComCreditGradeExample example);

    int deleteByPrimaryKey(String creditId);

    int insert(ParComCreditGrade record);

    int insertSelective(ParComCreditGrade record);

    List<ParComCreditGrade> selectByExample(ParComCreditGradeExample example);

    ParComCreditGrade selectByPrimaryKey(String creditId);

    int updateByExampleSelective(@Param("record") ParComCreditGrade record, @Param("example") ParComCreditGradeExample example);

    int updateByExample(@Param("record") ParComCreditGrade record, @Param("example") ParComCreditGradeExample example);

    int updateByPrimaryKeySelective(ParComCreditGrade record);

    int updateByPrimaryKey(ParComCreditGrade record);
}