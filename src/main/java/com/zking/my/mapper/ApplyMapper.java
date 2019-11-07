package com.zking.my.mapper;

import com.zking.my.model.Apply;

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

 }