package com.headFirst.commander.control.objects;

public class Light {

    private boolean isOn = false;
    private final String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        this.isOn = true;
        this.printState();
    }

    public void off() {
        this.isOn = false;
        this.printState();
    }

    public void printState() {
        System.out.printf("The light is %s on room %s\n", (this.isOn? "on" : "off"), room);
    }

}
