package com.suyo.springauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apu/v1/demo")
public class DemoController {

    @GetMapping
    public String sayHello() {
        return "ok doki";
    }
}
