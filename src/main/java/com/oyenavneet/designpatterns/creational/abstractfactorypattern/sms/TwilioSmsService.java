package com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms;

public class TwilioSmsService implements SmsService {
    @Override
    public void sendSms(String phone, String body) {
        System.out.println("Twilio  sending SMS to: " + phone + "body: " + body);
    }
}
