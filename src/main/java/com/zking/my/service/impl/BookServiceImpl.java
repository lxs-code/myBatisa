package com.zking.my.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.my.mapper.BookMapper;
import com.zking.my.model.Book;
import com.zking.my.service.IBookService;
import com.zking.my.util.PageBean;
import com.zking.my.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService {
@Autowired
    private BookMapper bookMapper;

    public BookServiceImpl() {

    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int add(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public Book load(Book book) {
        return bookMapper.selectByPrimaryKey(book.getBookId());
    }

    @Override
    public int updete(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public List<Book> list(Book book, PageBean pageBean) {
//        if (null!=pageBean && pageBean.isPagination()){
//            PageHelper.startPage(pageBean.getPage(),pageBean.getRows());
//        }
//
//        List<Book> bookList=bookMapper.list(book);
//        System.out.println(bookList.getClass().getName());
//        if (null!=pageBean && pageBean.isPagination()){
//            PageInfo pageInfo=new PageInfo(bookList);
//            pageBean.setTotal(pageInfo.getTotal()+"");
//        }

        return bookMapper.list(book);
    }

    @Override
    public int del(Book book) {
        return bookMapper.deleteByPrimaryKey(book.getBookId());
    }

    @Override
    public int delAll(BookVo bv) {
        return bookMapper.delall(bv);
    }

    @Override
    public List<Book> getmax(BookVo bv) {
        return bookMapper.getmax(bv);
    }
}
