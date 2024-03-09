package com.example.dubbo.service;

import com.example.dubbo.HelloDubbo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class HelloService {

    @Reference
    HelloDubbo helloDubbo;

    public void sayHello() {
        helloDubbo.sayHello();
    }
}
