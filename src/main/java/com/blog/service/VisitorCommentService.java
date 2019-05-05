package com.blog.service;

import com.blog.entity.VisitorComment;
import com.blog.mapper.VisitorCommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitorCommentService {
    @Autowired
    private VisitorCommentMapper visitorCommentMapper;
    public List<VisitorComment> getAllVisitorComment(long user_id){
        return visitorCommentMapper.getAllVisitorComment(user_id);
    }

    public List<VisitorComment> getVisitorComment(long user_id,long comment_id){
        return visitorCommentMapper.getVisitorComment(user_id,comment_id);
    }

    public boolean modifyVisitorComment(VisitorComment visitorComment){
        return visitorCommentMapper.modifyVisitorComment(visitorComment);
    }

    public boolean addVisitorComment(VisitorComment visitorComment){
        return visitorCommentMapper.addVisitorComment(visitorComment);
    }
}
