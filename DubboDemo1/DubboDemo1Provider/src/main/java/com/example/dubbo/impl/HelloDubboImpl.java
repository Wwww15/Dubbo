package com.example.dubbo.impl;

import com.example.dubbo.HelloDubbo;
import org.apache.dubbo.config.annotation.Service;

@Service
public class HelloDubboImpl implements HelloDubbo {

    @Override
    public void sayHello() {
        System.out.println("你好,dubbo");
    }
}
