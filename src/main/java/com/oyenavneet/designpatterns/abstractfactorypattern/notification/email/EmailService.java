package com.oyenavneet.designpatterns.abstractfactorypattern.notification.email;

public interface EmailService {
    void sendEmail(String to, String subject, String body);
}
