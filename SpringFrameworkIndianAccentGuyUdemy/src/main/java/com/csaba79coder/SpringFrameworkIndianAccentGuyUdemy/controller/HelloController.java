package com.csaba79coder.SpringFrameworkIndianAccentGuyUdemy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.name}")
    private String appName;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, SpringBoot! The name of application:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + appName;
    }

    @RequestMapping("/")
    public int getNumber() {
        return 10;
    }
}