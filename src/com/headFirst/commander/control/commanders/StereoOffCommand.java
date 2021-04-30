package com.headFirst.commander.control.commanders;

import com.headFirst.commander.control.Command;
import com.headFirst.commander.control.objects.Stereo;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
