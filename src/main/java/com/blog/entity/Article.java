package com.blog.entity;

import java.sql.Date;

public class Article {
    private long article_id;
    private long user_id;
    private String article_title;
    private String article_content;
    private long article_views;
    private long article_comment;
    private Date article_time;
    private long article_like_count;
    private int article_type;


    public long getUser_id() {
        return user_id;
    }

    public Date getArticle_time() {
        return article_time;
    }

    public int getArticle_type() {
        return article_type;
    }

    public long getArticle_comment() {
        return article_comment;
    }

    public long getArticle_id() {
        return article_id;
    }

    public long getArticle_like_count() {
        return article_like_count;
    }

    public long getArticle_views() {
        return article_views;
    }

    public String getArticle_content() {
        return article_content;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setArticle_comment(long article_comment) {
        this.article_comment = article_comment;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public void setArticle_id(long article_id) {
        this.article_id = article_id;
    }

    public void setArticle_like_count(long article_like_count) {
        this.article_like_count = article_like_count;
    }

    public void setArticle_time(Date article_time) {
        this.article_time = article_time;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public void setArticle_type(int article_type) {
        this.article_type = article_type;
    }

    public void setArticle_views(long article_views) {
        this.article_views = article_views;
    }
}
