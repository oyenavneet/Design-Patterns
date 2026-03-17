package com.oyenavneet.designpatterns.abstractfactorypattern.notification.email;

public class TwilioEmailService implements EmailService{
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("SendGrid sending email to: " + to + "Subject: " + subject + "body: " + body);
    }
}
