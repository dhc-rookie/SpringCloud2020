package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author denghanchen
 * @date 2020/10/22 19:42
 */
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
