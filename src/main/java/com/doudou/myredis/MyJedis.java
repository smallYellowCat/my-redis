package com.doudou.myredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author 豆豆
 * @date 2019/10/15 19:34
 * @flag 以万物智能，化百千万亿身
 */
@Component
public class MyJedis implements MyJedisCommands{

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Override
    public boolean append(String key, String value) {
        try {
            Integer n = redisTemplate.opsForValue().append(key, value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String auth(String password) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer delete(String... keys) {
        return null;
    }

    @Override
    public byte[] get(byte[] key) {
        return new byte[0];
    }
}
