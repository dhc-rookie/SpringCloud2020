package com.atguigu.com.controller;

import com.atguigu.com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author denghanchen
 * @date 2020/10/23 11:00
 */
@RestController
public class OrderControllerr {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/snowflake")
    public String index() {
        return orderService.getIDBySnowFlake();
    }
}
