package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 张顺 on 2020/4/23.

 EnableEurekaServer这个注解表示这类是服务注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {

    public static void main(String[] args){
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
