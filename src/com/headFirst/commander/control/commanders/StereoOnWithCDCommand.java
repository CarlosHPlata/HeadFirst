package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand( Stereo stereo ) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCDMode();
        stereo.setVolume(11);
    }
}
