package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, SpringBoot!";
    }

    @RequestMapping("/")
    public int getNumber() {
        return 10;
    }
}
