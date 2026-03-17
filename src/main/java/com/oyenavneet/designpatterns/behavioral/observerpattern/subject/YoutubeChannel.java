package com.oyenavneet.designpatterns.observerpattern.subject;

import com.oyenavneet.designpatterns.observerpattern.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{

    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;


    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.latestVideo);
        }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;

        System.out.println("New video uploaded : " + videoTitle);
        notifySubscribers();
    }
}
