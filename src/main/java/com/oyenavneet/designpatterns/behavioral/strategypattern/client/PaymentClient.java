package com.oyenavneet.designpatterns.strategypattern.client;

import com.oyenavneet.designpatterns.strategypattern.context.PaymentContext;
import com.oyenavneet.designpatterns.strategypattern.strategy.PaytmPayment;
import com.oyenavneet.designpatterns.strategypattern.strategy.UpiPayment;
/*
    With Strategy Pattern
        - We just add new , if we want to add other payment method like, phone pay, or bill desk
        - no changes required in existing code

 */


public class PaymentClient {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext(new UpiPayment());
        context.executePayment(1000);

        context =  new PaymentContext(new PaytmPayment());
        context.executePayment(2000);
    }
}
