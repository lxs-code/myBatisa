package com.zking.my.model;

import lombok.ToString;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@ToString
public class Book {


    //    验证分组
    public static interface ValidateGrups {
        public static interface Add {

        }

        public static interface Edit {

        }

    }
    @NotNull(message = "id不能为空" ,groups = {ValidateGrups.Edit.class})
    private Integer bookId;
    @NotBlank(message = "书名不能为空",groups = {ValidateGrups.Add.class,ValidateGrups.Edit.class})
    private String bookName;
    // @NotBlank(message = "价格不能为空")

    @DecimalMin(value = "1", message = "价格要大于1",groups = {ValidateGrups.Add.class,ValidateGrups.Edit.class})
    private Float bookPrice;
    @NotBlank(message = "简介不能为空",groups = {ValidateGrups.Add.class,ValidateGrups.Edit.class})
    private String bookBrief;

    public Book(Integer bookId, String bookName, Float bookPrice, String bookBrief) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookBrief = bookBrief;
    }

    public Book() {
        super();
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookBrief() {
        return bookBrief;
    }

    public void setBookBrief(String bookBrief) {
        this.bookBrief = bookBrief;
    }
}