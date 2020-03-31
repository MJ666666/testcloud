package com.lmj.test.test_rw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lmj")
@MapperScan("com.lmj.dao")
public class TestRwApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestRwApplication.class, args);
    }

}
