package com.example.dubbo.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

public class ConsummerBootStrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        applicationContext.start();
        HelloService helloService = applicationContext.getBean(HelloService.class);
        helloService.sayHello();
    }

    @Configuration
    @PropertySource("classpath:/dubbo-conf.properties")
    @EnableDubbo(scanBasePackages = "com.example.dubbo.service")
    @ComponentScan("com.example.dubbo.service")
     static class ConsumerConfiguration {

    }

}
