package com.zking.my.mapper;

import com.zking.my.model.Book;
import com.zking.my.vo.BookVo;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List <Book> list(Book record);

    int delall(BookVo bv);

    List <Book> getmax(BookVo bv);
}