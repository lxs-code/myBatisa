package com.zking.my.service.impl;

import com.zking.my.mapper.NewsMapper;
import com.zking.my.model.News;
import com.zking.my.service.INews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsImpl implements INews {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public News load(News news) {
        return newsMapper.loadCasecade(news);
    }

    @Override
    public int doGrantCategory(News news) {
        System.out.println(12);
        return newsMapper.doGranaTCategory(news);
    }

    @Override
    public int doRevokeCategory(News news) {
        return newsMapper.doRevokeCategory(news);
    }

    @Override
    public int del(News news) {
        return newsMapper.deleteBynewid(news.getNewsId());
    }
}
