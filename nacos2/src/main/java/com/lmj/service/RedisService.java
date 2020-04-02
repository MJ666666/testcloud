package com.lmj.service;

import com.lmj.pojo.RedisProperty;
import com.lmj.service.fallback.RedisServiceFallBack;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: RedisService
 * Description:
 * date: 2020/3/30 10:21
 *
 * @author MJ
 */

@FeignClient(value = "redis-service",fallback = RedisServiceFallBack.class)
public interface RedisService {

    @GetMapping(value="/fetch/{key}")
     String getRedisValue(@PathVariable String key);

    @GetMapping(value="/store/{key}/{value}")
     String setRedisValue(@PathVariable("key") String key,@PathVariable("value") String value);


    @GetMapping(value="/delete/{key}")
    Long deleteKey(@PathVariable("key") String key);


    @GetMapping(value="/expire/{key}/{time}")
    Long expireKey(@PathVariable("key") String key,@PathVariable("time") int time);

    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    public String getIpAndPort();
}
