package com.example.dubbo.service;

import com.example.dubbo.service.impl.HelloDubboImpl;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.config.bootstrap.builders.ProtocolBuilder;
import org.apache.dubbo.config.bootstrap.builders.RegistryBuilder;
import org.apache.dubbo.config.bootstrap.builders.ServiceBuilder;

public class ProviderBootstrap {
    public static void main(String[] args) {

        DubboBootstrap.getInstance()
                .application("provider")
                .service(ServiceBuilder.newBuilder().interfaceClass(HelloDubbo.class).ref(new HelloDubboImpl()).build())
                .registry(RegistryBuilder.newBuilder().address("zookeeper://192.168.119.145:2181").timeout(100000).parameter("blockUntilConnectedWait", "50").build())
                .protocol(ProtocolBuilder.newBuilder().name("dubbo").port(28081).build())
                .start()
                .await();
    }
}
