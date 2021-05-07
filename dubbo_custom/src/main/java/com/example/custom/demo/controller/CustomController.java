package com.example.custom.demo.controller;

import com.example.custom.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/custom")
public class CustomController {

    @DubboReference(version = "1.0.1")
    DemoService demoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello(String name) {
        return demoService.say(name);

    }
}
