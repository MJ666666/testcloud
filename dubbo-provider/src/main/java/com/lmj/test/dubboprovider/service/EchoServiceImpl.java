package com.lmj.test.dubboprovider.service;

import com.lmj.test.springcloud.service.EchoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * ClassName: EchoServiceImpl
 * Description:
 * date: 2020/4/2 22:02
 *
 * @author MJ
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String echoStr(String str) {
        return "echo hello"+""+str+""+port;
    }
}
