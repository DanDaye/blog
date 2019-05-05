package com.blog.service;


import com.blog.entity.Article;
import com.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> getAllArticle(int user_id){
        return articleMapper.getAllArticle(user_id);
    }

    public Article getArticle(long user_id,long article_id){
        return articleMapper.getArticle(user_id,article_id);
    }

    public boolean modifyArticle(Article article){
        return articleMapper.modifyArticle(article);
    }

    public boolean addArticle(Article article){
        return articleMapper.addArticle(article);
    }

    public boolean deleteArticle(long user_id,long article_id){
        return articleMapper.deleteArticle(user_id,article_id);
    }
}
