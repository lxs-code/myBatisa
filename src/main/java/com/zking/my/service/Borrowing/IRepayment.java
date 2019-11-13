package com.zking.my.service.Borrowing;

import com.zking.my.model.shh.Repayment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IRepayment {



    List<Repayment>    selectRepayment(Repayment repayment);


    Repayment  selectByPrimaryKey(Repayment repayment);

    int uprepaument(Repayment repayment);


    int   crerepament(Repayment repayment);
}
