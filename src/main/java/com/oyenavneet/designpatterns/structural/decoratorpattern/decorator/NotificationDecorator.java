package com.oyenavneet.designpatterns.decoratorpattern.decorator;

import com.oyenavneet.designpatterns.decoratorpattern.component.NotificationService;

public abstract class NotificationDecorator implements NotificationService {

    protected NotificationService notificationService;

    public NotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
