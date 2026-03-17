package com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms;

public class AwsSmsService implements SmsService {
    @Override
    public void sendSms(String phone, String body) {
        System.out.println("AWS SNS sending SMS to: " + phone + "body: " + body);
    }
}
