package com.oyenavneet.designpatterns.adapterpattern.client;

import com.oyenavneet.designpatterns.adapterpattern.adaptee.StripeGateway;
import com.oyenavneet.designpatterns.adapterpattern.adapter.StripePaymentAdapter;
import com.oyenavneet.designpatterns.adapterpattern.target.PaymentProcessor;

public class PaymentService {

    public static void main(String[] args) {
        StripeGateway stripeGateway = new StripeGateway();

        PaymentProcessor paymentProcessor= new StripePaymentAdapter(stripeGateway);

        paymentProcessor.processPayment(5000);
    }

}
