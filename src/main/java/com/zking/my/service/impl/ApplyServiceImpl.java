package com.zking.my.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.ApplyMapper;
import com.zking.my.mapper.CustomerMapper;
import com.zking.my.model.Apply;
import com.zking.my.model.Customer;
import com.zking.my.model.shh.*;
import com.zking.my.service.IApplyService;
import com.zking.my.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplyServiceImpl implements IApplyService {
    @Autowired
    private ApplyMapper applyMapper;
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<AppCusRoles> select(PageBean pb,AppCusRoles app ) {//PageBean pb
        if (null != pb && pb.isPagination()) {
            PageHelper.startPage(pb.getPage(), pb.getRows());
        }
        List<AppCusRoles> list = applyMapper.select(app);//pb

        if (null != pb && pb.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pb.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<Repayment> selectRep(PageBean pb, Repayment rep) {
        if (null != pb && pb.isPagination()) {
            PageHelper.startPage(pb.getPage(), pb.getRows());
        }
        List<Repayment> list = applyMapper.selectRep(rep);

        if (null != pb && pb.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pb.setTotal(pageInfo.getTotal() + "");
        }
        return list;
    }

    @Override
    public List<Overdue> selectOve(PageBean pb) {
        if (null != pb && pb.isPagination()) {
            PageHelper.startPage(pb.getPage(), pb.getRows());
        }
        List<Overdue> list = applyMapper.selectOve();

        if (null != pb && pb.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pb.setTotal(pageInfo.getTotal() + "");
        }

        return list;
    }

    @Override
    public List<Overdue> selectOvetwo(PageBean pb) {
        if (null != pb && pb.isPagination()) {
            PageHelper.startPage(pb.getPage(), pb.getRows());
        }
        List<Overdue> list = applyMapper.selectOvetwo();

        if (null != pb && pb.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pb.setTotal(pageInfo.getTotal() + "");
        }

        return list;
    }

    @Override
    public int insertLed(Ledger2 ledger) {
        return applyMapper.insertLed(ledger);
    }

    @Override
    public int insertRep(Repayment repayment) {
        return applyMapper.insertRep(repayment);
    }

    @Override
    public int insert(Apply app) {
        return applyMapper.insert(app);
    }

    @Override
    public int upda(Apply app) {
        Apply apply=new Apply();
        Customer customer1 = customerMapper.selectByPrimaryKey(app.getCustomerId());
       customer1.setCustmoerTotalMoney(customer1.getCustmoerTotalMoney()+app.getTotalMoney());
        customer1.setCustmoerConsumptionMoney(customer1.getCustmoerConsumptionMoney()-app.getTotalMoney());
        customerMapper.updateByPrimaryKeySelective(customer1);
         app.setTotalMoney(null);
        return applyMapper.updateByPrimaryKeySelective(app);
    }

    @Override
    public int update(Apply apply) {
        return applyMapper.updateByPrimaryKeySelective(apply);
    }

    @Override
    public Saa max() {
        return applyMapper.max();
    }

    @Override
    public Apply getapply(Apply apply) {
        return applyMapper.selectByPrimaryKey(apply.getApplyId());
    }
}
