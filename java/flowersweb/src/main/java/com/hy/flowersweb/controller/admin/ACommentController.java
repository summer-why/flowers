package com.hy.flowersweb.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.entity.Comment;
import com.hy.flowersweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create By hy on 2020/2/28.
 */
@RestController
@RequestMapping("/admin")
public class ACommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/commentList")
    public JSONObject commentList() {
        List<Comment> commentList = commentService.commentList();
        JSONObject json = new JSONObject();
        json.put("code",200);
        json.put("msg","评论列表获取成功");
        json.put("data",commentList);
        return json;
    }

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
}
