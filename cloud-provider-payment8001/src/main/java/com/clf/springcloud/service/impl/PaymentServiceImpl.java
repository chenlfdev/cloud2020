package com.clf.springcloud.service.impl;

import com.clf.springcloud.dao.PaymentDao;
import com.clf.springcloud.entities.Payment;
import com.clf.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.selectById(id);
    }
}
