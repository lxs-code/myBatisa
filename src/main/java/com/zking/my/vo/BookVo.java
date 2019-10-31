package com.zking.my.vo;

import com.zking.my.model.Book;

public class BookVo extends Book{

    private Integer [] bookIds;


    private  Float min;
    private  Float max;

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Integer[] getBookIds() {
        return bookIds;
    }

    public void setBookIds(Integer[] bookIds) {
        this.bookIds = bookIds;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }
}
