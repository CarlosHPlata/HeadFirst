package com.headFirst.commander.control;

import com.headFirst.commander.control.commanders.*;
import com.headFirst.commander.control.objects.CeilingFan;
import com.headFirst.commander.control.objects.GarageDoor;
import com.headFirst.commander.control.objects.Light;
import com.headFirst.commander.control.objects.Stereo;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenlight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor door = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand livingRoomOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomOn = new LightOnCommand(kitchenlight);
        LightOffCommand kitchenRoomOff = new LightOffCommand(kitchenlight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);
        GarageDoorClosedCommand garageClose = new GarageDoorClosedCommand(door);
    }
}
