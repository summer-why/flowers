package com.hy.flowersweb.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hy.flowersweb.entity.Store;
import com.hy.flowersweb.entity.User;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Create By hy on 2020/2/28.
 */
@Service
public class TokenService {
    public String getToken(User user) {
//        Date start = new Date();
//        long currentTime = System.currentTimeMillis() + 60 * 60 * 1000;//一小时有效时间
//        Date end = new Date(currentTime);
        String token = "";

//        token = JWT.create().withAudience(user.getId().toString()).withIssuedAt(start).withExpiresAt(end)
//                .sign(Algorithm.HMAC256(user.getPassword()));
        token = JWT.create().withAudience(user.getId().toString()).sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }

    public String getStoreToken(Store store) {
//        Date start = new Date();
//        long currentTime = System.currentTimeMillis() + 60 * 60 * 1000;//一小时有效时间
//        Date end = new Date(currentTime);
        String token = "";

        token = JWT.create().withAudience(store.getId().toString()).sign(Algorithm.HMAC256(store.getPassword()));
        return token;
    }
}
