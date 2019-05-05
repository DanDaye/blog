package com.blog.service;

import com.blog.entity.Sort;
import com.blog.mapper.SortMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {
    @Autowired
    private SortMapper sortMapper;
    public List<Sort> getAllSort(long user_id){
        return sortMapper.getAllSort(user_id);
    }

    public Sort getSort(long user_id,long sort_id){
        return sortMapper.getSort(user_id,sort_id);
    }

    public boolean modifySort(Sort sort){
        return sortMapper.modifySort(sort);
    }

    public boolean addSort(Sort sort){
        return sortMapper.addSort(sort);
    }

    public boolean deleteSort(long user_id,long sort_id){
        return sortMapper.deleteSort(user_id,sort_id);
    }
}
