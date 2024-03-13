package com.example.dubbo.service.impl;

import com.example.dubbo.service.SayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class WantToSayHelloService {

    @DubboReference(mock = "true",check = false)
    public SayHelloService helloService;

    public void say() {
        System.out.println("开始啦");
        System.out.println("做其他事儿");
        System.out.println("准备调用sayHello");
        String result = helloService.sayHello("就是干！");
        System.out.println("获取到的结果："+result);
        System.out.println("调用完毕啦！");
    }
}
