package com.zking.my.service.impl;

import com.zking.my.model.News;
import com.zking.my.service.INews;
import com.zking.my.service.test21;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class NewsImplTest extends test21 {

@Autowired
    private INews iNews;


private News news;
    @Override
    public void before() {
        super.before();
        news=new News();
    }

    @Test
    public void load() throws Exception {


        news.setNewsId(3);
        News load = iNews.load(news);
        System.out.println(load);
    }
    @Test
    public void doGrantCategory() throws Exception {

        news.setCid(3);
        news.setNewsId(1);
      iNews.doGrantCategory(news);

    }
    @Test
    public void dorevoCategory() throws Exception {

        news.setCid(3);
        news.setNewsId(1);
        iNews.doRevokeCategory(news);

    }
    @Test
    public void del() throws Exception {


        news.setNewsId(2);
        int del = iNews.del(news);
        System.out.println(del);

    }
    @Test
    public void del1() throws Exception {


        news.setNewsId(2);
        int del = iNews.del(news);
        System.out.println(del);

    }


}