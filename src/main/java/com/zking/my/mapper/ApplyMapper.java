package com.zking.my.mapper;

import com.zking.my.model.Apply;
import com.zking.my.model.shh.*;

import java.util.List;

public interface ApplyMapper {
    int deleteByPrimaryKey(Long applyId);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Long applyId);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);



    List<Apply>  getapply(Apply apply);

int     getcount(Integer minid);


List<Apply> getapplymin(Apply apply);

    int upd(Long applyId);


    List<AppCusRoles> select(AppCusRoles app );

    List<Repayment> selectRep(Repayment rep );

    List<Overdue> selectOve();

    List<Overdue> selectOvetwo();

    Saa max();

    int insertLed(Ledger2 ledger);

    int insertRep(Repayment repayment);




    List<Apply> fj(Apply apply);

 }