package com.rubafikri.orderservice.controller;

import com.rubafikri.orderservice.entity.LLibOrder;
import com.rubafikri.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@Slf4j
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/")
    public LLibOrder saveOrder(@RequestBody LLibOrder LLibOrder){
        log.info("Inside save LLibOrder controler");
        return  orderService.saveOrder(LLibOrder);
    }

    @GetMapping("/{id}")
    public LLibOrder findOrderById(@PathVariable("id") Long orderid){
        log.info("Inside find order controler");
        return  orderService.findOrderById(orderid);
    }
}
