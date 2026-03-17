package com.oyenavneet.designpatterns.factorypattern.paymentservice;

import com.oyenavneet.designpatterns.factorypattern.factory.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentService implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of amount : "+amount);
    }
}
