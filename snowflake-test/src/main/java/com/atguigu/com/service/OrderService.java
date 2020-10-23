package com.atguigu.com.service;

import com.atguigu.com.config.IdGneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author denghanchen
 * @date 2020/10/23 11:03
 */
@Service
public class OrderService {

    @Autowired
    private IdGneratorSnowflake idGenerator;

    public String getIDBySnowFlake(){
        //创建线程
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <=20 ; i++) {
            threadPool.submit(()->{
                System.out.println(idGenerator.snowflake());
            });
        }
        threadPool.shutdown();
        return "hello snowflake";
    }
}
