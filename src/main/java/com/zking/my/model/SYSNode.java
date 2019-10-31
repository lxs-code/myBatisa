package com.zking.my.model;

import lombok.ToString;

@ToString
public class SYSNode {
    private Long treeNodeId;

    private String treeNodeName;

    private Long treeNodeType;

    private Long parentNodeId;

    private String url;

    private String position;

    private String icon;

    public SYSNode(Long treeNodeId, String treeNodeName, Long treeNodeType, Long parentNodeId, String url, String position, String icon) {
        this.treeNodeId = treeNodeId;
        this.treeNodeName = treeNodeName;
        this.treeNodeType = treeNodeType;
        this.parentNodeId = parentNodeId;
        this.url = url;
        this.position = position;
        this.icon = icon;
    }

    public SYSNode() {
        super();
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public String getTreeNodeName() {
        return treeNodeName;
    }

    public void setTreeNodeName(String treeNodeName) {
        this.treeNodeName = treeNodeName;
    }

    public Long getTreeNodeType() {
        return treeNodeType;
    }

    public void setTreeNodeType(Long treeNodeType) {
        this.treeNodeType = treeNodeType;
    }

    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}