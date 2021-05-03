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
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomOn, livingRoomOff);
        remoteControl.setCommand(1, kitchenRoomOn, kitchenRoomOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageOpen, garageClose);
        remoteControl.setCommand(4, stereoOn, stereoOff);
        //You can use lambda expresion only if your interface has just one method
        //remoteControl.setCommand(4, () -> { stereo.on(); }, () -> { stereo.off(); });

        System.out.println(remoteControl.toString());
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println("===================================");
        remoteControl.undoButtonWasPushed();
        System.out.println("===================================");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
