package com.oyenavneet.designpatterns.creational.singleton.loggerservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final LoggerService loggerService;

    public PaymentService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void processPayment() {
        loggerService.logInfo("Payment processing started");

        // business logic

        loggerService.logInfo("Payment processed successfully");
    }
}
