package com.zking.my.mapper;

import com.zking.my.model.Ledger;
import com.zking.my.vo.LedgerVo;

import java.util.List;

public interface LedgerMapper {
    int deleteByPrimaryKey(Long ledgerId);

    int insert(Ledger record);

    int insertSelective(Ledger record);

    Ledger selectByPrimaryKey(Long ledgerId);

    int updateByPrimaryKeySelective(Ledger record);

    int updateByPrimaryKey(Ledger record);



    List<LedgerVo> selectqn();

    List<LedgerVo> selectjn();
}