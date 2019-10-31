package com.zking.my.mapper;

import com.zking.my.model.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(Long proId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long proId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}