package com.zking.my.service.impl;

import com.zking.my.mapper.RepaymentMapper;
import com.zking.my.model.shh.Repayment;
import com.zking.my.service.Borrowing.IRepayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IRepaymentImpl implements IRepayment {




    @Autowired
    private RepaymentMapper repaymentMapper;
    @Override
    public List<Repayment> selectRepayment(Repayment repayment) {
        return repaymentMapper.selectRepayment(repayment);
    }

    @Override
    public Repayment selectByPrimaryKey(Repayment repayment) {
        return repaymentMapper.selectByPrimaryKey(repayment.getRepaymentId());
    }

    @Override
    public int uprepaument(Repayment repayment) {
        return repaymentMapper.updateByPrimaryKeySelective(repayment);
    }

    @Override
    public int crerepament(Repayment repayment) {
        return repaymentMapper.insert(repayment);
    }
}
