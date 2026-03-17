package com.oyenavneet.designpatterns.commandpattern.command;

import com.oyenavneet.designpatterns.commandpattern.receiver.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
