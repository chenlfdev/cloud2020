package com.clf.springcloud.service;

import com.clf.springcloud.entities.CommonResult;
import com.clf.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {

    @GetMapping("/get/{id}")
     CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
