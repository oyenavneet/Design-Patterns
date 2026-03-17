package com.oyenavneet.designpatterns.builderpattern.controller;

import com.oyenavneet.designpatterns.builderpattern.model.Order;
import com.oyenavneet.designpatterns.builderpattern.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order-builder")
public class OrderController {

    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/order")
    public Order getOrder() {
        return orderService.createOrder();
    }
}
