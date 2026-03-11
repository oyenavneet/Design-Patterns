package com.oyenavneet.designpatterns.abstractfactorypattern.notification.factory;

import com.oyenavneet.designpatterns.abstractfactorypattern.notification.email.EmailService;
import com.oyenavneet.designpatterns.abstractfactorypattern.notification.sms.SmsService;

public interface NotificationFactory {
    EmailService createEmailService();
    SmsService createSmsService();
}
