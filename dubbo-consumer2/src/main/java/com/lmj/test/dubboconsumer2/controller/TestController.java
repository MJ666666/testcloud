package com.lmj.test.dubboconsumer2.controller;

import com.lmj.test.springcloud.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 * Description:
 * date: 2020/4/5 10:04
 *
 * @author MJ
 */
@RestController
public class TestController {
    @Reference(version = "${demo.service.version}")
    private EchoService echoService;

    @GetMapping("/echo/{str}")
    public String echoTest(@PathVariable("str") String str) {
      return   echoService.echoStr(str);

    }

}
