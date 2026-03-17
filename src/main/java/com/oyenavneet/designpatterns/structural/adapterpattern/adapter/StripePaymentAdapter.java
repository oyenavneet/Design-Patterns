package com.oyenavneet.designpatterns.adapterpattern.adapter;

import com.oyenavneet.designpatterns.adapterpattern.adaptee.StripeGateway;
import com.oyenavneet.designpatterns.adapterpattern.target.PaymentProcessor;

public class StripePaymentAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StripePaymentAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.makeStripePayment(amount);
    }
}
