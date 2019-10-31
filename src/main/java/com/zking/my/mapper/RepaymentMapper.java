package com.zking.my.mapper;

import com.zking.my.model.Repayment;

public interface RepaymentMapper {
    int deleteByPrimaryKey(Long repaymentId);

    int insert(Repayment record);

    int insertSelective(Repayment record);

    Repayment selectByPrimaryKey(Long repaymentId);

    int updateByPrimaryKeySelective(Repayment record);

    int updateByPrimaryKey(Repayment record);
}