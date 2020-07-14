package com.clf.springcloud.service;

import com.clf.springcloud.entities.Payment;


public interface PaymentService  {
    int create(Payment payment);

    Payment getPaymentById( Long id);
}
