package com.oyenavneet.designpatterns.abstractfactorypattern.notification.factory;

import com.oyenavneet.designpatterns.abstractfactorypattern.notification.email.EmailService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.email.TwilioEmailService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms.SmsService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms.TwilioSmsService;

public class TwilioNotificationFactory implements NotificationFactory {
    @Override
    public EmailService createEmailService() {
        return new TwilioEmailService();
    }

    @Override
    public SmsService createSmsService() {
        return new TwilioSmsService();
    }
}
