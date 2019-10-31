package com.zking.my.service;

import com.zking.my.model.Book;
import com.zking.my.util.PageBean;
import com.zking.my.vo.BookVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface IBookService {
    int add(Book book);
    @Transactional(readOnly = true)
    Book load(Book book);
 int updete(Book book);

 int   delAll(BookVo bv);
    @Transactional(readOnly = true)
    List<Book> list(Book book, PageBean pageBean);


    int del(Book book);
    @Transactional(readOnly = true)
    List<Book> getmax(BookVo bv);

}
