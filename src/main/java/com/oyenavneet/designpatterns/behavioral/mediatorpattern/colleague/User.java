package com.oyenavneet.designpatterns.mediatorpattern.colleague;

import com.oyenavneet.designpatterns.mediatorpattern.mediator.ChatMediator;
import com.oyenavneet.designpatterns.mediatorpattern.mediator.ChatRoom;

public abstract class User {

    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
