package com.rubafikri.apigateay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {

    @GetMapping("/orderServiceFallback")
    public String orderServiceFallbackMethod(){

        return "Order Service is taking longer than Expected."+
                "Please try again later";
    }

    @GetMapping("/cartServiceFallback")
    public String cartServiceFallbackMethod(){

        return "Cart Service is taking longer than Expected."+
                "Please try again later";
    }
}
