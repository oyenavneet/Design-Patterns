package com.oyenavneet.designpatterns.strategypattern.strategy;

public class PaytmPayment implements PaymentStrategy
{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using PayTm");
    }
}
