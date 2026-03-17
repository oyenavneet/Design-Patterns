package com.oyenavneet.designpatterns.decoratorpattern.decorators;

import com.oyenavneet.designpatterns.decoratorpattern.component.NotificationService;
import com.oyenavneet.designpatterns.decoratorpattern.decorator.NotificationDecorator;

public class SmsDecorator extends NotificationDecorator {

    public SmsDecorator(NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String message) {
        notificationService.send(message);

        System.out.println("Send SMS: " + message);

    }
}
