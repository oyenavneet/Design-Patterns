package com.oyenavneet.designpatterns.decoratorpattern.concrete;

import com.oyenavneet.designpatterns.decoratorpattern.component.NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL:  " + message);
    }
}
