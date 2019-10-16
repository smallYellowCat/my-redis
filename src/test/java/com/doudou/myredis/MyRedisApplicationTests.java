package com.doudou.myredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRedisApplicationTests {

    @Autowired
    private MyJedisCommands myJedis;

    @Test
    public void contextLoads() {
        myJedis.append("k", "hello redis");
        System.out.println("");
    }

}
