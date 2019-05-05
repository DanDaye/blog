package com.blog.mapper;

import com.blog.entity.Sort;

import java.util.List;

public interface SortMapper {

    public List<Sort> getAllSort(long user_id);

    public Sort getSort(long user_id,long sort_id);

    public boolean modifySort(Sort sort);

    public boolean addSort(Sort sort);

    public boolean deleteSort(long user_id,long sort_id);

}
