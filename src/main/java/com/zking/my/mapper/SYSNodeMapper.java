package com.zking.my.mapper;

import com.zking.my.model.SYSNode;

import java.util.List;

public interface SYSNodeMapper {
    int deleteByPrimaryKey(Long treeNodeId);

    int insert(SYSNode record);

    int insertSelective(SYSNode record);

    SYSNode selectByPrimaryKey(Long treeNodeId);

    int updateByPrimaryKeySelective(SYSNode record);

    int updateByPrimaryKey(SYSNode record);



    List<SYSNode> getNnods(Long treeNodeId);
}