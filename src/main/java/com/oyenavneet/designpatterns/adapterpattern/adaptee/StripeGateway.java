package com.oyenavneet.designpatterns.adapterpattern.adaptee;


/*
    Just for Demo
    - Some third-party SDK like Stripe
 */
public class StripeGateway {
    // The method name is different, so it's incompatible with our system
    public void makeStripePayment(double amount) {
        System.out.println("Payment processed unsing stripe : " + amount);
    }
}
