package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author denghanchen
 * @date 2020/10/22 17:20
 */
@Mapper
public interface OrderDao {

    /**
     * 新建订单
     */
    void create(Order order);

    /**
     * 修改订单状态
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
