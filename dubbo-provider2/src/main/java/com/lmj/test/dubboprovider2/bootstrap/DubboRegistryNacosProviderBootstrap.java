package com.lmj.test.dubboprovider2.bootstrap;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@EnableAutoConfiguration
public class DubboRegistryNacosProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboRegistryNacosProviderBootstrap.class)
                .run(args);
    }
}