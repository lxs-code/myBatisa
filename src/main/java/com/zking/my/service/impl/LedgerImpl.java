package com.zking.my.service.impl;

import com.zking.my.mapper.LedgerMapper;
import com.zking.my.service.ILedger;
import com.zking.my.vo.LedgerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LedgerImpl implements ILedger{
    @Autowired
    private LedgerMapper ledgerMapper;
    @Override
    public List<LedgerVo> selectqn(){
        return ledgerMapper.selectqn();
    }

    @Override
    public List<LedgerVo> selectjn(){
        return ledgerMapper.selectjn();
    }
}
