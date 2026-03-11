package com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms;

public interface SmsService {

    void sendSms(String phone, String body);
}
