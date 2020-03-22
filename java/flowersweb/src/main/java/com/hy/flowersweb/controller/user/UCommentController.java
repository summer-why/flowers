package com.hy.flowersweb.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.UserLoginToken;
import com.hy.flowersweb.entity.Comment;
import com.hy.flowersweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Create By hy on 2020/2/27.
 */
@RestController
@RequestMapping("/user")
public class UCommentController {
    @Autowired
    private CommentService commentService;

    @UserLoginToken
    @PostMapping("/uCommentList")
    public JSONObject uCommentList(@RequestBody Comment comment) {
        List<Comment> uCommentList = commentService.uCommentList(comment);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","用户评论列表获取成功");
        json.put("data",uCommentList);
        return json;
    }

    @PostMapping("/fCommentList")
    public JSONObject fCommentList(@RequestBody Comment comment) {
        List<Comment> fCommentList = commentService.fCommentList(comment);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","商品评论获取成功");
        json.put("data",fCommentList);
        return json;
    }

    @UserLoginToken
    @PostMapping("/addComment")
    public JSONObject addComment(@RequestBody Comment comment) {
        comment.setCreate_time(new Date());
        commentService.addComment(comment);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","添加评论成功");
        return json;
    }

    @UserLoginToken
    @PostMapping("/updateComment")
    public JSONObject updateComment(@RequestBody Comment comment) {
        comment.setUpdate_time(new Date());
        commentService.updateComment(comment);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","修改评论成功");
        json.put("data",comment);
        return json;
    }

    @UserLoginToken
    @GetMapping("/delComment/{id}")
    public JSONObject delComment(@PathVariable("id") int id) {
        commentService.delComment(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","评论删除成功");
        return json;
    }

    @UserLoginToken
    @GetMapping("/commentDetail/{id}")
    public JSONObject commentDetail(@PathVariable("id") int id) {
        Comment commentDetail = commentService.commentDetail(id);
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","评论详情获取成功");
        json.put("data",commentDetail);
        return json;
    }
}
