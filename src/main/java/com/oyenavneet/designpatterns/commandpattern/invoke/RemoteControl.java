package com.oyenavneet.designpatterns.commandpattern.invoke;

import com.oyenavneet.designpatterns.commandpattern.command.Command;


/*

    The invoker triggers the command but doesn’t know the internal logic.
 */
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
