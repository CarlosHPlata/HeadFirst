package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.CeilingFan;

public class CeilingFanOffCommand implements Command {

    private CeilingFan fan;

    public CeilingFanOffCommand( CeilingFan fan ) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.off();
    }

    @Override
    public void undo() {
        this.fan.setMediumMode();
    }
}
