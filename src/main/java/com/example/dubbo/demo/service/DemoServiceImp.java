package com.example.dubbo.demo.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.1" ,timeout = 1000, interfaceClass = DemoService.class)
public class DemoServiceImp implements DemoService {
    @Override
    public String say(String name){
        return "hello: "+name;
    }
}
