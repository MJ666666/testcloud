package com.lmj.test.dubboconsumer.controller;

import com.lmj.test.springcloud.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 * Description:
 * date: 2020/4/2 22:17
 *
 * @author MJ
 */
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping("/echo/{str}")
    public String echoStr(@PathVariable("str") String str) {
        return echoService.echoStr(str);

    }

}
