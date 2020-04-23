package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;

/**
 * Created by 张顺 on 2020/4/22.
 */
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    private Logger log = LoggerFactory.getLogger(getClass());

    @PostMapping(value = "/payment")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*******插入数据********",result);
        if (result>0){
            return new CommonResult<Integer>(200,"插入数据成功",result);
        }else{
            return new CommonResult<Integer>(444,"插入数据失败",result);
        }
    }

    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        Payment payment = paymentService.getPayment(id);
        log.info("*******查询数据********",payment);
        if (payment != null){
            return new CommonResult<Payment>(200,"数据查询成功",payment);
        }else{
            return new CommonResult<Payment>(444,"没有对应记录，查询ID",null);
        }
    }
}
