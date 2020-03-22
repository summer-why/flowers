package com.hy.flowersweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hy.flowersweb.dao")
public class FlowerswebApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowerswebApplication.class, args);
    }
}
