package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 张顺 on 2020/4/23.
 * 配置类
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * LoadBalancedhi是负载均衡的注解
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
//相当于 aplicationContext.xml <bean id="" class="">