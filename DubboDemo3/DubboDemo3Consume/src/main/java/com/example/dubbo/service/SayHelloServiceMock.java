package com.example.dubbo.service;

public class SayHelloServiceMock implements SayHelloService {

    @Override
    public String sayHello(String desc) {
        System.out.println(desc);
        return "您好，这是mock返回";
    }
}
