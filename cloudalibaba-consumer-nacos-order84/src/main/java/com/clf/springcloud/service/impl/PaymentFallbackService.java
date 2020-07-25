package com.clf.springcloud.service.impl;

import com.clf.springcloud.entities.CommonResult;
import com.clf.springcloud.entities.Payment;
import com.clf.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
