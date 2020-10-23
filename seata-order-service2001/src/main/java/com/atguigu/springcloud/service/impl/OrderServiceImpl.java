package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author denghanchen
 * @date 2020/10/22 19:14
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    /**
     * 创建订单
     * @param order
     */
    @Override
    public void create(Order order) {
        //1.新建订单
        log.info("-------->新建订单");
        orderDao.create(order);

        //2.扣减库存
        log.info("------->订单微服务调用库存,扣减Count开始");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------->订单微服务调用库存,扣减Count结束");

        //3.扣减账户
        log.info("------->订单微服务调用账户,扣减Money开始");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------->订单微服务调用账户,扣减Money结束");

        //4.修改订单状态  0==>1
        log.info("------->修改订单状态");
        orderDao.update(order.getUserId(),0);

        log.info("------->下单结束!!!");
    }
}
