package com.zking.my.service.Impls;

import com.zking.my.mapper.SYSNodeMapper;
import com.zking.my.model.SYSNode;
import com.zking.my.service.Borrowing.ISNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISNodeImpl implements ISNode {

@Autowired
private SYSNodeMapper sysNodeMapper;

    public List<SYSNode> getnode(Long noid) {


        return sysNodeMapper.getNnods( noid);
    }
}
