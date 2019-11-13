package com.zking.my.service;

import com.zking.my.vo.LedgerVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ILedger {
    @Transactional(readOnly = true)
    List<LedgerVo> selectqn();

    @Transactional(readOnly = true)
    List<LedgerVo> selectjn();
}
