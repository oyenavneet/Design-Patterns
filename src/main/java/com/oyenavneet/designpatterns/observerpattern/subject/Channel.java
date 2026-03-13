package com.oyenavneet.designpatterns.observerpattern.subject;

import com.oyenavneet.designpatterns.observerpattern.observer.Subscriber;

import java.util.Observer;

public interface Channel {

    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}
