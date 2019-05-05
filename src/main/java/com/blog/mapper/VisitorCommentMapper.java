package com.blog.mapper;

import com.blog.entity.VisitorComment;

import java.util.List;

public interface VisitorCommentMapper {

    public List<VisitorComment>  getAllVisitorComment(long user_id);

    public List<VisitorComment> getVisitorComment(long user_id,long comment_id);

    public boolean modifyVisitorComment(VisitorComment visitorComment);

    public boolean addVisitorComment(VisitorComment visitorComment);
//    暂时不提供删除功能
}
