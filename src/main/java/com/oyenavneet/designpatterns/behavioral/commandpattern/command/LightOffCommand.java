package com.oyenavneet.designpatterns.commandpattern.command;

import com.oyenavneet.designpatterns.commandpattern.receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
