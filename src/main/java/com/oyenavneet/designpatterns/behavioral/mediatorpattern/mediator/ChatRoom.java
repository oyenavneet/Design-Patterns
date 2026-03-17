package com.oyenavneet.designpatterns.mediatorpattern.mediator;

import com.oyenavneet.designpatterns.mediatorpattern.colleague.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {

    private List<User> users = new ArrayList<User>();


    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(User sender) {
        users.add(sender);
    }
}
