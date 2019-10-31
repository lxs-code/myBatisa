package com.zking.my.service;

import com.zking.my.mapper.BookMapper;
import com.zking.my.model.Book;
import com.zking.my.service.impl.BookServiceImpl;
import com.zking.my.util.MybatisSessionFactoryUtils;
import com.zking.my.util.PageBean;
import com.zking.my.vo.BookVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IBookServiceTest extends  test21{
@Autowired
    private IBookService bookService;


    private Book book;

    @Before
    public void before (){

        book = new Book();
    }

    @After
    public void after() {

    }

    @Test
    public void add() throws Exception {

            book.setBookId(null);
            book.setBookPrice(61f);
            book.setBookBrief("好书，值得推荐");
            book.setBookName("西游记第"+22223+"章");
            int rowCount = this.bookService.add(book);



        System.out.println(book.getBookId());
    }

    @Test
    public void list()  {

        PageBean pp=new PageBean();

       List<Book>  list= this.bookService.list(book,pp);
        for (Book book: list) {
            System.out.println(book);
        }
        System.out.println(pp);
        System.out.println("xxxxxxxxxxx");
        List<Book>  list1= this.bookService.list(book,pp);
        for (Book book: list1) {
            System.out.println(book);
        }
        System.out.println(list1.size());
    }

    @Test
    public void del() throws Exception {
        book.setBookId(2);
        int del = bookService.del(book);
        System.out.println(
                del
        );
    }

    @Test
    public void up() throws Exception {
        book.setBookId(1);
        book.setBookPrice( 1000f );
        int del = bookService.updete(book);
        System.out.println(
                del
        );
    }


    @Test
    public void load() throws Exception {
            book.setBookId(12);
        Book del = bookService.load(book);
        System.out.println(
                del
        );


    }

    @Test
    public void delall() throws Exception {
        BookVo bv=new BookVo();
        bv.setBookIds(new Integer[]{1,2,3});
        int i = bookService.delAll(bv);
        System.out.println(i);

    }
    @Test
    public void gete() throws Exception {
        BookVo bv=new BookVo();
bv.setMin(30f);
bv.setMax(60f);
        final List<Book> getmax = bookService.getmax(bv);
        for (Book hh: getmax
             ) {
            System.out.println(hh);
        }

    }
}