package com.zking.my.model;




public class Dict {
    private Long dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Boolean dictIdEditable;

    public Dict(Long dictId, String dictType, String dictItem, String dictValue, Boolean dictIdEditable) {
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIdEditable = dictIdEditable;
    }

    public Dict() {
        super();
    }

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Boolean getDictIdEditable() {
        return dictIdEditable;
    }

    public void setDictIdEditable(Boolean dictIdEditable) {
        this.dictIdEditable = dictIdEditable;
    }
}