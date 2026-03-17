package com.oyenavneet.designpatterns.abstractfactorypattern.notification;

import com.oyenavneet.designpatterns.abstractfactorypattern.notification.email.EmailService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.factory.AwsNotificationFactory;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.factory.NotificationFactory;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms.SmsService;

public class NotificationClient {

    public static void main(String[] args) {
        NotificationFactory factory = new AwsNotificationFactory();

        EmailService emailService = factory.createEmailService();
        SmsService smsService = factory.createSmsService();

        emailService.sendEmail("oyenavneet@gmail.com", "Test", "Hi There!");
        smsService.sendSms("Test", "Hi There!");
    }
}
