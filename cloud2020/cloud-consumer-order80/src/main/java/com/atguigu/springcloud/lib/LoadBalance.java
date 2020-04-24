package com.atguigu.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created by 张顺 on 2020/4/24.
 *
 * 自定义的负载均衡算法
 */
public interface LoadBalance {

    ServiceInstance instance(List<ServiceInstance> serviceInstances);


}
