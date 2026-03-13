package com.oyenavneet.designpatterns.commandpattern.receiver;


/*

    The receiver performs the real work.
 */
public class Light {

    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}
