package com.hy.flowersweb.service;

import com.hy.flowersweb.entity.Comment;

import java.util.List;

/**
 * Create By hy on 2020/2/25.
 */
public interface CommentService {
    List<Comment> commentList();
    List<Comment> uCommentList(Comment comment);
    List<Comment> fCommentList(Comment comment);
    int addComment(Comment comment);
    int updateComment(Comment comment);
    int delComment(int id);
    Comment commentDetail(int id);
}
