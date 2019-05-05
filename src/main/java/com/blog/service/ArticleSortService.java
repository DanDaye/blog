package com.blog.service;

import com.blog.entity.Article;
import com.blog.entity.Sort;
import com.blog.mapper.ArticleSortMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleSortService {
    @Autowired
    private ArticleSortMapper articleSortMapper;

    public Article getArticleBySort(long sort_id){
        return articleSortMapper.getArticleBySort(sort_id);
    }

    public Sort getSortByArticle(long article_id){
        return articleSortMapper.getSortByArticle(article_id);
    }
}
