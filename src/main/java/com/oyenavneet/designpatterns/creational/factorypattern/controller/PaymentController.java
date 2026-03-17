package com.oyenavneet.designpatterns.factorypattern.controller;


import com.oyenavneet.designpatterns.factorypattern.paymentservice.PaymentFactory;
import com.oyenavneet.designpatterns.factorypattern.factory.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("factory-payment")
public class PaymentController {

    private final PaymentFactory paymentFactory;

    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }


    @GetMapping("/pay")
    public String pay(@RequestParam("paymentType") String paymentType, @RequestParam("amount") double amount) {
        PaymentService paymentService = paymentFactory.getPaymentService(paymentType);
        paymentService.processPayment(amount);
        return "Payment is successful using "+paymentType;
    }

}
