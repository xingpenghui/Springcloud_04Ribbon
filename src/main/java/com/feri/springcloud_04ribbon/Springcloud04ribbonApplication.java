package com.feri.springcloud_04ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//客户端
@EnableDiscoveryClient//发现服务
public class Springcloud04ribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud04ribbonApplication.class, args);
    }
}
