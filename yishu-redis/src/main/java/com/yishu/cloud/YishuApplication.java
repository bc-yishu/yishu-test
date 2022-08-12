package com.yishu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.yishu.cloud.dao")
@SpringBootApplication
public class YishuApplication {

    public static void main(String[] args) {
        SpringApplication.run(YishuApplication.class,args);
    }

}
