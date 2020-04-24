package com.atguigu.springcloud.lib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by 张顺 on 2020/4/24.
 */
@Component
@Slf4j
public class MyLB implements LoadBalance {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 得到原子性的第几次访问
     * @return
     */
    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            //2147483647 因为int的最大整形数 , compareAndSet修改了就会返回true
            next = current >= 2147483647 ? 0 : current + 1;
        }while(!atomicInteger.compareAndSet(current,next));
        log.info("*****第几次访问*****next**********"+next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
