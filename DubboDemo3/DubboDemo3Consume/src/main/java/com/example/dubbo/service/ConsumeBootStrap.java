package com.example.dubbo.service;

import com.example.dubbo.service.impl.WantToSayHelloService;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubbo
public class ConsumeBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConsumeBootStrap.class, args);
        WantToSayHelloService wantToSayHelloService = applicationContext.getBean(WantToSayHelloService.class);
        wantToSayHelloService.say();
    }
}
