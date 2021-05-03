package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private CeilingFan fan;

    public CeilingFanOnCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.setMediumMode();
    }

    @Override
    public void undo() {
        this.fan.off();
    }
}
