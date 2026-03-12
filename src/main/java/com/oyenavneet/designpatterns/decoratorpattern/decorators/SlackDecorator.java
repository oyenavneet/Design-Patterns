package com.oyenavneet.designpatterns.decoratorpattern.decorators;

import com.oyenavneet.designpatterns.decoratorpattern.component.NotificationService;
import com.oyenavneet.designpatterns.decoratorpattern.decorator.NotificationDecorator;

public class SlackDecorator extends NotificationDecorator {

    public SlackDecorator(NotificationService notificationService) {
        super(notificationService);
    }


    @Override
    public void send(String message) {
        notificationService.send(message);

        System.out.println("Sending Slack Notification : " + message);
    }
}
