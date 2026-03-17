package com.oyenavneet.designpatterns.commandpattern.client;


import com.oyenavneet.designpatterns.commandpattern.command.LightOffCommand;
import com.oyenavneet.designpatterns.commandpattern.command.LightOnCommand;
import com.oyenavneet.designpatterns.commandpattern.invoke.RemoteControl;
import com.oyenavneet.designpatterns.commandpattern.receiver.Light;

/*
    The client wires everything together.
 */
public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();

        /*
            Light is ON
            Light is OFF


              Client
                ↓
            Command Object
                ↓
            Invoker (Remote)
                ↓
            Receiver (Light)

            The Invoker doesn't know how the command works internally.
         */

    }
}
