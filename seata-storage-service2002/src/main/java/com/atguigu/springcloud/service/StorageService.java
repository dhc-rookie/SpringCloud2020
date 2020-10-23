package com.atguigu.springcloud.service;

/**
 * @author denghanchen
 * @date 2020/10/22 19:48
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
