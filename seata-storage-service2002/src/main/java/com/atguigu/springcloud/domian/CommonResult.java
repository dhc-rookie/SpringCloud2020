package com.atguigu.springcloud.domian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author denghanchen
 * @date 2020/10/22 17:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {


    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
