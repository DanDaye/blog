package com.blog.mapper;

import com.blog.entity.Article;
import com.blog.entity.Sort;

public interface ArticleSortMapper {
    public Article getArticleBySort(long sort_id);

    public Sort getSortByArticle(long article_id);
}
