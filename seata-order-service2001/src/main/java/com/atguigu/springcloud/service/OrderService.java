package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;

/**
 * @author denghanchen
 * @date 2020/10/22 19:13
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
