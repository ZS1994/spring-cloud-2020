package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 张顺 on 2020/4/22.
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);

}
