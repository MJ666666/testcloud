package com.lmj.test.dubboprovider2.service;

import com.lmj.test.springcloud.service.EchoService;
import org.apache.dubbo.config.annotation.Service;


@Service(version = "${demo.service.version}")
public class EchoServiceImpl implements EchoService {



    @Override
    public String echoStr(String str) {
        return "echo hello"+str;
    }

    /*  *//**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     *//*
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }*/
}