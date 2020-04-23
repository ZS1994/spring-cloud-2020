package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 张顺 on 2020/4/22.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    //最熟悉的错误404
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){

        this(code,message,null);
    }

}
