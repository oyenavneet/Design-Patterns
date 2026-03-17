package com.oyenavneet.designpatterns.decoratorpattern;

import com.oyenavneet.designpatterns.decoratorpattern.component.NotificationService;
import com.oyenavneet.designpatterns.decoratorpattern.concrete.EmailNotification;
import com.oyenavneet.designpatterns.decoratorpattern.decorators.SlackDecorator;
import com.oyenavneet.designpatterns.decoratorpattern.decorators.SmsDecorator;

public class NotificationClient {

    public static void main(String[] args) {

        NotificationService notification =
                new SlackDecorator(
                        new SmsDecorator(
                                new EmailNotification()));

        notification.send("Hi there");

        /*
        - output
            Sending EMAIL:  Hi there
            Send SMS: Hi there
            Sending Slack Notification : Hi there
         */
    }
}
