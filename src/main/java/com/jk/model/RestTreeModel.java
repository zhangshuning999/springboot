package com.jk.model;

import java.util.List;

public class RestTreeModel {

    private Integer id;
    private String  text;
    private String  url;
    private Integer pid;
    private List<RestTreeModel> nodes;
    private Boolean selectable;


    @Override
    public String toString() {
        return "RestTreeModel{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<RestTreeModel> getNodes() {
        return nodes;
    }

    public void setNodes(List<RestTreeModel> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }
}
