package com.zking.my.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest extends IBookServiceTest {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    @Test
    public void  test(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        redisTemplate.opsForValue().set("name2","zs2");
    }
}
