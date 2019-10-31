package com.zking.my.service;

import com.zking.my.model.News;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INews {


    News load(News news);

    int doGrantCategory(News news);

    int doRevokeCategory(News news);
    int del(News news);
}
