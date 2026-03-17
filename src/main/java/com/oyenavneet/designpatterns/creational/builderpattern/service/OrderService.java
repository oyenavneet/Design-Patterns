package com.oyenavneet.designpatterns.builderpattern.service;

import com.oyenavneet.designpatterns.builderpattern.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public Order createOrder() {
        return new Order.Builder("123", "USER123")
                .totalAmount(1500)
                .shippingAddress("Lucknow")
                .couponCode("FIRSTTIME")
                .giftWrap(true)
                .expressDelivery(true)
                .build();
    }
}
