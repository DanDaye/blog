package com.blog.entity;

public class Sort {

    private long sort_id;
    private long user_id;
    private String sort_name;
    private int sort_num;

    public long getUser_id() {
        return user_id;
    }

    public int getSort_num() {
        return sort_num;
    }

    public long getSort_id() {
        return sort_id;
    }

    public String getSort_name() {
        return sort_name;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setSort_id(long sort_id) {
        this.sort_id = sort_id;
    }

    public void setSort_name(String sort_name) {
        this.sort_name = sort_name;
    }

    public void setSort_num(int sort_num) {
        this.sort_num = sort_num;
    }
}
