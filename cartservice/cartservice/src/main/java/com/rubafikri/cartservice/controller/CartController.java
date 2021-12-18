package com.rubafikri.cartservice.controller;

import com.rubafikri.cartservice.VO.ResponceTemplateVC;
import com.rubafikri.cartservice.entity.LLibCart;
import com.rubafikri.cartservice.service.Cartservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
@Slf4j
@Controller
public class CartController {
    @Autowired
   private Cartservice cartservice;

    @PostMapping("/")
    public LLibCart saveCart(@RequestBody LLibCart libCart){
        return cartservice.saveCart(libCart);
    }
    @GetMapping("/{id}")
    public ResponceTemplateVC getCartWithOrderId(@PathVariable("id") Long cartId){
        return  cartservice.getCartWithOrderId(cartId);
    }
}
