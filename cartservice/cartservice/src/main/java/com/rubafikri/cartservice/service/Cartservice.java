package com.rubafikri.cartservice.service;

import com.rubafikri.cartservice.VO.LibOrder;
import com.rubafikri.cartservice.VO.ResponceTemplateVC;
import com.rubafikri.cartservice.entity.LLibCart;
import com.rubafikri.cartservice.reporesity.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Cartservice {

    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private RestTemplate restTemplate;

    public LLibCart saveCart(LLibCart libCart) {
        return cartRepo.save(libCart);
    }

    public ResponceTemplateVC getCartWithOrderId(Long id) {
        ResponceTemplateVC vo = new ResponceTemplateVC();
        LLibCart libCart = cartRepo.findByCartId(id);
            LibOrder libOrder = restTemplate.getForObject("http://ORDER-SERVICE/orders/" + libCart.getCartId(), LibOrder.class);
       vo.setLibCart(libCart);
       vo.setLibOrder(libOrder);
       return vo;

    }
}
