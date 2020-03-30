package com.lmj.controller;

import com.lmj.pojo.RedisProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.JedisCluster;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName: RedisServiceController
 * Description:
 * date: 2020/3/29 15:24
 *
 * @author MJ
 */
@RestController
public class RedisServiceController {

    @Autowired
    private JedisCluster jedisCluster;

    @RequestMapping(value = "/fetch/{key}",method = RequestMethod.GET)
    public String getValue(@PathVariable("key") String key) {
        return jedisCluster.get(key);
    }


    @RequestMapping(value="/store/{key}/{value}",method = RequestMethod.GET)
    public String storeValue(@PathVariable("key") String key,@PathVariable("value") String value) {
        return jedisCluster.set(key,value);
    }



    @RequestMapping(value = "/getIp", method = RequestMethod.GET)
    public String getPortAndIp(HttpServletRequest request) {
        String localAddr = request.getLocalAddr();
        int localPort = request.getLocalPort();
        String ipAndPort=localAddr+":"+localPort;
        return ipAndPort;
    }
}
