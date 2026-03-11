package com.oyenavneet.designpatterns.abstractfactorypattern.notification.email;

public class AwsEmailService implements EmailService {


    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("AWS SES sending email to: " + to + "Subject: " + subject + "body: " + body);
    }
}
