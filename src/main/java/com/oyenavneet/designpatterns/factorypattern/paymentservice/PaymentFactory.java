package com.oyenavneet.designpatterns.factorypattern.paymentservice;

import com.oyenavneet.designpatterns.factorypattern.factory.PaymentService;
import org.springframework.stereotype.Component;

@Component
public class PaymentFactory {

    public PaymentService getPaymentService(String type) {
        if(type.equalsIgnoreCase("CREDIT_CARD")) {
            return new CreditCardPaymentService();
        }else if(type.equalsIgnoreCase("UPI")) {
            return new UpiPaymentService();
        }else if(type.equalsIgnoreCase("PAYTM")) {
            return new PayTmPaymentService();
        }
        throw new IllegalArgumentException("Invalid Payment Type");
    }
}
