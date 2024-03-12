package com.example.dubbo.service.impl;

import com.example.dubbo.service.HelloDubbo;

public class HelloDubboImpl implements HelloDubbo {
    @Override
    public String sayHello(String name) {
        System.out.println(name +"say hello dubbo!");
        return "dubbo provider";
    }
}
