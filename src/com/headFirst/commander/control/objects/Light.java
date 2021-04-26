package com.headFirst.commander.control.objects;

public class Light {

    private boolean isOn = false;

    public void on() {
        this.isOn = true;
        this.printState();
    }

    public void off() {
        this.isOn = false;
        this.printState();
    }

    public void printState() {
        System.out.printf("The light is %s", (this.isOn? "on" : "off"));
    }

}
