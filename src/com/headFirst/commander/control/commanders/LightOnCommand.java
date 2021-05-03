package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
