package com.lmj.service.fallback;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.lmj.service.RedisService;
import org.springframework.stereotype.Component;

/**
 * ClassName: RedisServiceFallBack
 * Description:
 * date: 2020/3/30 13:47
 *
 * @author MJ
 */
@Component
public class RedisServiceFallBack implements RedisService {


    @Override
    public String getRedisValue(String key) {
        System.out.println("降级啦："+key);
        return "error";
    }

    @Override
    public String setRedisValue(String key, String value) {
        System.out.println("降级啦："+key+","+value);

        return "error";
    }

    @Override
    public String getIpAndPort() {
        System.out.println("拿不到端口，降级啦");
        return "error";
    }
}
