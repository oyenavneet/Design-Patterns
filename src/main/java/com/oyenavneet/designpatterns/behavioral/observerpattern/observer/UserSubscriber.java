package com.oyenavneet.designpatterns.observerpattern.observer;

public class UserSubscriber implements Subscriber {

    private String name;

    public UserSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(name + " received notification: New video = " + videoTitle);
    }
}
