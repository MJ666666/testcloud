package com.lmj.test.redisservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com.lmj")
@EnableDiscoveryClient
public class RedisService2Application {

    public static void main(String[] args) {
        SpringApplication.run(RedisService2Application.class, args);
    }

}
