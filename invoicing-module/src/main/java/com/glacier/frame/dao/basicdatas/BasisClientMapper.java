package com.glacier.frame.dao.basicdatas;

import com.glacier.frame.entity.basicdatas.BasisClient;
import com.glacier.frame.entity.basicdatas.BasisClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasisClientMapper {
    int countByExample(BasisClientExample example);

    int deleteByExample(BasisClientExample example);

    int deleteByPrimaryKey(String clientId);

    int insert(BasisClient record);

    int insertSelective(BasisClient record);

    List<BasisClient> selectByExample(BasisClientExample example);

    BasisClient selectByPrimaryKey(String clientId);

    int updateByExampleSelective(@Param("record") BasisClient record, @Param("example") BasisClientExample example);

    int updateByExample(@Param("record") BasisClient record, @Param("example") BasisClientExample example);

    int updateByPrimaryKeySelective(BasisClient record);

    int updateByPrimaryKey(BasisClient record);
}