package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author denghanchen
 * @date 2020/10/19 15:21
 */
@Component
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    public  RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
