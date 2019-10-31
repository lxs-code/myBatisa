package com.zking.my.mapper;

import com.zking.my.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer newsId);


    int deleteBynewid(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    News loadCasecade(News news);


    int doGranaTCategory(News news);

    int doRevokeCategory(News news);
}