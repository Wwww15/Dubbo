package com.example.dubbo.service.impl;

import com.example.dubbo.service.SayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloDubboServiceImpl implements SayHelloService {

    @Override
    public String sayHello(String desc) {
        int a = 2/0;
        System.out.println("你好啊");
        return "dubbo say " + desc;
    }
}
