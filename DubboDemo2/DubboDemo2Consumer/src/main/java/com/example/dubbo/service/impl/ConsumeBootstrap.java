package com.example.dubbo.service.impl;

import com.example.dubbo.service.HelloDubbo;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.config.bootstrap.builders.ReferenceBuilder;
import org.apache.dubbo.config.bootstrap.builders.RegistryBuilder;

import java.io.IOException;

public class ConsumeBootstrap {

    public static void main(String[] args) throws IOException {
        ReferenceConfig<HelloDubbo> referenceConfig = ReferenceBuilder.<HelloDubbo>newBuilder()
                .interfaceClass(HelloDubbo.class)
                .timeout(100000)
                .build();
        DubboBootstrap.getInstance()
                .registry(RegistryBuilder.newBuilder().address("zookeeper://192.168.119.145:2181").timeout(100000).parameter("blockUntilConnectedWait", "50").build())
                .application("consumer")
                .reference(referenceConfig)
                .start();
        HelloDubbo helloDubbo = referenceConfig.get();
        String result = helloDubbo.sayHello("DubboDemo2");
        System.out.println(result);
    }
}
