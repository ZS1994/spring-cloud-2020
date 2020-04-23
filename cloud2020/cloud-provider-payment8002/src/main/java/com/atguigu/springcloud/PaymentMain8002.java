package com.atguigu.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 张顺 on 2020/4/22.
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class PaymentMain8002 {

    public static void main(String[] arg){
        SpringApplication.run(PaymentMain8002.class,arg);
    }
}
