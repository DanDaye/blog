package com.blog.mapper;

import com.blog.entity.Article;

import java.util.List;

public interface ArticleMapper {
    public List<Article> getAllArticle(int user_id);

    public Article getArticle(long user_id,long article_id);

    public boolean modifyArticle(Article article);

    public boolean addArticle(Article article);

    public boolean deleteArticle(long user_id,long article_id);
}
