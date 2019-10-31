package com.zking.my.mapper;

import com.zking.my.model.Ledger;

public interface LedgerMapper {
    int deleteByPrimaryKey(Long ledgerId);

    int insert(Ledger record);

    int insertSelective(Ledger record);

    Ledger selectByPrimaryKey(Long ledgerId);

    int updateByPrimaryKeySelective(Ledger record);

    int updateByPrimaryKey(Ledger record);
}