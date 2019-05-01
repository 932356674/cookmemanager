package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.qf.config")//扫描servlet的相关注解
@MapperScan(basePackages = "com.qf.mapper")
public class CookmemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookmemanagerApplication.class, args);
    }

}
