package com.clf.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.clf.springcloud.entities.Payment;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao extends BaseMapper<Payment> {
}
