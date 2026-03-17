package com.oyenavneet.designpatterns.mediatorpattern.mediator;

import com.oyenavneet.designpatterns.mediatorpattern.colleague.User;

public interface ChatMediator {

    void sendMessage(String message, User sender);

    void addUser(User sender);
}
