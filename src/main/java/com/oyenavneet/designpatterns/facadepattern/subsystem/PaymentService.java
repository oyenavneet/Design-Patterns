package com.oyenavneet.designpatterns.facadepattern.subsystem;

public class PaymentService {
    public void makePayment(double amount) {
        System.out.println("Processing payment: " + amount);
    }
}
