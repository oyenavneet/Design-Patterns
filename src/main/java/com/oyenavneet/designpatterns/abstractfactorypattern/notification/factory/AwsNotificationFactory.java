package com.oyenavneet.designpatterns.abstractfactorypattern.notification.factory;

import com.oyenavneet.designpatterns.abstractfactorypattern.notification.email.AwsEmailService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.email.EmailService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms.AwsSmsService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms.SmsService;

public class AwsNotificationFactory implements NotificationFactory {
    @Override
    public EmailService createEmailService() {
        return new AwsEmailService();
    }

    @Override
    public SmsService createSmsService() {
        return new AwsSmsService();
    }
}
