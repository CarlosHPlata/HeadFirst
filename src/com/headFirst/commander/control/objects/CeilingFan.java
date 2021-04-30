package com.headFirst.commander.control.objects;

public class CeilingFan {

    public static enum Mode { HIGH, MEDIUM, LOW, OFF }
    private Mode mode;
    private final String room;

    public CeilingFan(String room) {
        this.room = room;
    }

    public void setHighMode() {
        mode = Mode.HIGH;
    }

    public void setMediumMode() {
        mode = Mode.MEDIUM;
        printMode();
    }

    public void setLowMode() {
        mode = Mode.LOW;
        printMode();
    }

    public void off() {
        mode = Mode.OFF;
        printMode();
    }

    public Mode getSpeed() {
        return mode;
    }

    public void printMode() {
        System.out.printf("The fan is: %s. On room %s\n", mode.toString(), room);
    }
}
