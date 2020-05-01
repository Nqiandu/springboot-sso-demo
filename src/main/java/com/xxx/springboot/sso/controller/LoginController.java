package com.xxx.springboot.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LoginController {

    @RequestMapping("/")
    public String turnIndexPage() {
        return "index";
    }

    @RequestMapping("/buyIphone")
    public String turnBuyPage() {
        return "buy_iphone";
    }

}
