package com.zking.my.service;

import com.zking.my.model.Apply;
import com.zking.my.model.shh.*;
import com.zking.my.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IApplyService {
    /**
     * 查询所有信息
     * @return
     */
    @Transactional(readOnly = true)
    List<AppCusRoles> select(PageBean pageBean, AppCusRoles app);// PageBean pb
    @Transactional(readOnly = true)
    List<Repayment> selectRep(PageBean pageBean, Repayment rep);// PageBean pb

    /**
     * 查询逾期表的数据
     * @return
     */
    @Transactional(readOnly = true)
    List<Overdue> selectOve(PageBean pageBean);

    /**
     * 查询逾期表的数据
     * @return
     */
    @Transactional(readOnly = true)
    List<Overdue> selectOvetwo(PageBean pageBean);

    int insertLed(Ledger2 ledger);

    int insertRep(Repayment repayment);

    int insert(Apply app);

    int upda(Apply app);

    int update(Apply apply);

    Saa max();



    Apply  getapply(Apply apply);
}
