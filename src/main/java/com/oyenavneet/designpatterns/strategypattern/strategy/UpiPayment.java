package com.oyenavneet.designpatterns.strategypattern.strategy;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using upi");
    }
}
