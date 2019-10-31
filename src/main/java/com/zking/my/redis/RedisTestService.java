package com.zking.my.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class RedisTestService {


    private RedisUtil redisUtil;

    public void setValue(String key, Object value) {
        redisUtil.set(key, value);
    }

    public Object getValue(String key) {
        return redisUtil.get(key);
    }
}
