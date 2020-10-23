package com.atguigu.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author denghanchen
 * @date 2020/10/23 11:59
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MainAPP {
    public static void main(String[] args) {
        SpringApplication.run(MainAPP.class, args);
    }
}
