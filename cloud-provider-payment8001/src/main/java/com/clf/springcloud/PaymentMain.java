package com.clf.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clf.springcloud.dao")
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class,args);
    }
}
