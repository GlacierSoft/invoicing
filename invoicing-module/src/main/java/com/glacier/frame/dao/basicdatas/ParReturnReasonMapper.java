package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.ParReturnReason;
import com.glacier.frame.entity.basicdatas.ParReturnReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParReturnReasonMapper {
    int countByExample(ParReturnReasonExample example);

    int deleteByExample(ParReturnReasonExample example);

    int deleteByPrimaryKey(String returnReasonId);

    int insert(ParReturnReason record);

    int insertSelective(ParReturnReason record);

    List<ParReturnReason> selectByExample(ParReturnReasonExample example);

    ParReturnReason selectByPrimaryKey(String returnReasonId);

    int updateByExampleSelective(@Param("record") ParReturnReason record, @Param("example") ParReturnReasonExample example);

    int updateByExample(@Param("record") ParReturnReason record, @Param("example") ParReturnReasonExample example);

    int updateByPrimaryKeySelective(ParReturnReason record);

    int updateByPrimaryKey(ParReturnReason record);
}