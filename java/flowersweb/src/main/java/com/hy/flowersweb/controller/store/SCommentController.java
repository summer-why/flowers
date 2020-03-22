package com.hy.flowersweb.controller.store;

import com.alibaba.fastjson.JSONObject;
import com.hy.flowersweb.annotation.StoreLoginToken;
import com.hy.flowersweb.entity.Comment;
import com.hy.flowersweb.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Create By hy on 2020/2/28.
 */
@RestController
@RequestMapping("/store")
public class SCommentController {

    @Autowired
    private CommentService commentService;

    @StoreLoginToken
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
