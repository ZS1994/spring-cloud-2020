package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * Created by 张顺 on 2020/4/22.
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPayment(Long id);

}
