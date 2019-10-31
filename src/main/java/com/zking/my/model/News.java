package com.zking.my.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class News {
    private Integer newsId;

    private String title;

 private  Integer cid;
    private List<Category> categoryList =new ArrayList<>();

    public News(Integer newsId, String title) {
        this.newsId = newsId;
        this.title = title;
    }

    public News() {
        super();
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}