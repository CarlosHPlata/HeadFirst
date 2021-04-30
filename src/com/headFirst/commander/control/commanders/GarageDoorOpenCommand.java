package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.lightOn();
        door.up(1);
    }
}
