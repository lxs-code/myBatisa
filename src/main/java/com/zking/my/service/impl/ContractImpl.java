package com.zking.my.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.ContractMapper;
import com.zking.my.service.IContract;
import com.zking.my.util.PageBean;
import com.zking.my.vo.ConTVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractImpl implements IContract{
    @Autowired
    private ContractMapper contractMapper;

    public  List<ConTVo> list( PageBean pageBean){
        if (null != pageBean && pageBean.isPagination()) {
            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
        }
        List<ConTVo> list = contractMapper.list();//pb

        if (null != pageBean && pageBean.isPagination()) {
            PageInfo pageInfo = new PageInfo(list);
            pageBean.setTotal(pageInfo.getTotal() + "");
        }
        return list;


    }


    public ConTVo list1(ConTVo conTVo){

        return contractMapper.list1(conTVo);
    }
}
