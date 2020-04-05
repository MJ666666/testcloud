package com.lmj.test.dubboconsumer2;

import com.lmj.test.springcloud.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Dubbo Registry Nacos Consumer Bootstrap
 */
@SpringBootApplication(scanBasePackages = "com.lmj.test.dubboconsumer2")
public class DubboRegistryNacosConsumerBootstrap {




    public static void main(String[] args) {

            SpringApplication.run(DubboRegistryNacosConsumerBootstrap.class, args);

    }


}