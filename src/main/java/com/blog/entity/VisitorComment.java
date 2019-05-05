package com.blog.entity;

import java.sql.Date;

public class VisitorComment {

    private long comment_id;
    private long user_id;
    private long article_id;
    private String comment_name;
    private Date comment_time;
    private String comment_context;
    private String comment_url;

    public long getComment_id() {
        return comment_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public long getArticle_id() {
        return article_id;
    }

    public String getComment_name() {
        return comment_name;
    }

    public String getComment_context() {
        return comment_context;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public String getComment_url() {
        return comment_url;
    }

    public void setComment_id(long comment_id) {
        this.comment_id = comment_id;
    }

    public void setArticle_id(long article_id) {
        this.article_id = article_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setComment_context(String comment_context) {
        this.comment_context = comment_context;
    }

    public void setComment_name(String comment_name) {
        this.comment_name = comment_name;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    public void setComment_url(String comment_url) {
        this.comment_url = comment_url;
    }
}
