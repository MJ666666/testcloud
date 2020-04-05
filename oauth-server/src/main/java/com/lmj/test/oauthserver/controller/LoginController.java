package com.lmj.test.oauthserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: LoginController
 * Description:
 * date: 2020/4/3 11:36
 *
 * @author MJ
 */
@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return"login";
    }

    @GetMapping("/")
    public String index() {
        return"index";
    }
}
