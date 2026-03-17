package com.oyenavneet.designpatterns.mediatorpattern.client;

import com.oyenavneet.designpatterns.mediatorpattern.colleague.ChatUser;
import com.oyenavneet.designpatterns.mediatorpattern.mediator.ChatMediator;
import com.oyenavneet.designpatterns.mediatorpattern.mediator.ChatRoom;

public class MediatorDemo {

    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();


        ChatUser user1 = new ChatUser(chatRoom, "Navneet");
        ChatUser user2 = new ChatUser(chatRoom, "Sri");
        ChatUser user3 = new ChatUser(chatRoom, "sw");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("hi");


        /*

        Navneet sends : hi
        Sri receives : hi
        sw receives : hi

         */

    }
}
