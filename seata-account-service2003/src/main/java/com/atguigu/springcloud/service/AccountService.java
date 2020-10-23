package com.atguigu.springcloud.service;

import java.math.BigDecimal;

/**
 * @author denghanchen
 * @date 2020/10/22 19:59
 */
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(Long userId,BigDecimal money);
}
