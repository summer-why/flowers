package com.hy.flowersweb.service.impl;

import com.hy.flowersweb.dao.CommentMapper;
import com.hy.flowersweb.entity.Comment;
import com.hy.flowersweb.entity.CommentExample;
import com.hy.flowersweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public List<Comment> commentList() {
        CommentExample example = new CommentExample();
        List<Comment> commentList = commentMapper.selectByExample(example);
        return commentList;
    }

    @Override
    public List<Comment> uCommentList(Comment comment) {
        CommentExample example = new CommentExample();
        example.createCriteria().andUser_idEqualTo(comment.getUser_id());
        List<Comment> uCommentList = commentMapper.selectByExample(example);
        return uCommentList;
    }


    @Override
    public List<Comment> fCommentList(Comment comment) {
        CommentExample example = new CommentExample();
        example.createCriteria().andFlower_idEqualTo(comment.getFlower_id());
        List<Comment> fCommentList = commentMapper.selectByExample(example);
        return fCommentList;
    }

    @Override
    public int addComment(Comment comment) {
        return commentMapper.insertSelective(comment);
    }

    @Override
    public int updateComment(Comment comment) {
        CommentExample example = new CommentExample();
        example.createCriteria().andIdEqualTo(comment.getId());
        return commentMapper.updateByExampleSelective(comment,example);
    }

    @Override
    public int delComment(int id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Comment commentDetail(int id) {
        return commentMapper.selectByPrimaryKey(id);
    }
}
