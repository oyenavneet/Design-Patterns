package com.oyenavneet.designpatterns.singleton.loggerservice.controller;

import com.oyenavneet.designpatterns.singleton.loggerservice.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String pay() {
        paymentService.processPayment();
        return "Payment Completed";
    }
}
