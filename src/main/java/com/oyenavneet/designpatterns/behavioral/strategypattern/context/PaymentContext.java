package com.oyenavneet.designpatterns.strategypattern.context;

import com.oyenavneet.designpatterns.strategypattern.strategy.PaymentStrategy;

public class PaymentContext {


    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
