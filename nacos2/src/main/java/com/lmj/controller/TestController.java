package com.lmj.controller;

import com.lmj.pojo.RedisProperty;
import com.lmj.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

   @Autowired
    private  RedisService redisService;






    private final RestTemplate restTemplate;

        @Autowired
        public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

        @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
        public String echo(@PathVariable String str) {
            return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
        }


        @GetMapping("/fetch/{key}")
        public String getRediValue(@PathVariable("key") String key) {

           return redisService.getRedisValue(key);
        }



        @RequestMapping(value="/store",method = RequestMethod.POST)
        public String setRedisValue(RedisProperty redisProperty) {
            String key = redisProperty.getKey();
            String value = redisProperty.getValue();
            return redisService.setRedisValue(key,value);
        }


    @GetMapping("/expire/{key}/{time}")
    public Long expireKey(@PathVariable("key") String key,@PathVariable("time") int time) {

        return redisService.expireKey(key,time);
    }
    @GetMapping("/delete/{key}")
    public Long deleteKey(@PathVariable("key") String key) {

        return redisService.deleteKey(key);
    }


    @GetMapping("/getIp")
    public String getIpAndPort() {
            return redisService.getIpAndPort();
        }
    }