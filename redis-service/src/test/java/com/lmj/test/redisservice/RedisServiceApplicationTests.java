package com.lmj.test.redisservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.JedisCluster;


@SpringBootTest(classes = RedisServiceApplication.class)
class RedisServiceApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private JedisCluster jedisCluster;

    @Test
    public void test1() {
        String number = jedisCluster.set("number", "888");
        System.out.println(number);
    }

    @Test
    public void test2() {
        String number = jedisCluster.get("number");
        System.out.println(number);
    }
}
