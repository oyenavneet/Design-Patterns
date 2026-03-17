package com.oyenavneet.designpatterns.observerpattern.client;

import com.oyenavneet.designpatterns.observerpattern.observer.UserSubscriber;
import com.oyenavneet.designpatterns.observerpattern.subject.YoutubeChannel;

public class ObserverDemo {

    public static void main(String[] args) {

        YoutubeChannel channel = new YoutubeChannel();

        UserSubscriber user1 = new UserSubscriber("Navneet");
        UserSubscriber user2 = new UserSubscriber("Sri");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.uploadVideo("Test video");

        /*
        New video uploaded : Test video
        Navneet received notification: New video = Test video
        Sri received notification: New video = Test video

         */
    }
}
