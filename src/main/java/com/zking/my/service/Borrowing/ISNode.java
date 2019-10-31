package com.zking.my.service.Borrowing;

import com.zking.my.model.SYSNode;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISNode {

    List<SYSNode>  getnode(Long noid);
}
