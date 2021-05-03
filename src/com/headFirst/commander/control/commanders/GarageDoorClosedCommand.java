package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.GarageDoor;

public class GarageDoorClosedCommand implements Command {
    private GarageDoor door;

    public GarageDoorClosedCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down(1);
        door.lightOff();
    }

    @Override
    public void undo() {
        door.up(1);
        door.lightOn();
    }
}
