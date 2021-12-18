package com.rubafikri.orderservice.service;

import com.rubafikri.orderservice.entity.LLibOrder;
import com.rubafikri.orderservice.reporistry.OrderReporisity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderReporisity orderReporisity;

    public LLibOrder saveOrder(LLibOrder LLibOrder) {
        log.info("Inside save LLibOrder service");
        return orderReporisity.save(LLibOrder);
    }

    public LLibOrder findOrderById(Long id) {
        log.info("Inside find order service");
        return  orderReporisity.findByOrderid(id);
    }
}
