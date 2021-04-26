package com.headFirst.commander.control;

import com.headFirst.commander.control.commanders.LightOnCommand;
import com.headFirst.commander.control.objects.Light;

public class FirstRemoteControllerTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
