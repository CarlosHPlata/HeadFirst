package com.headFirst.commander.control.objects;

public class Stereo {

    public static enum Mode {CD, DVD, RADIO }

    private int volume;
    private boolean isOn;
    private Mode mode;

    public Stereo() {
        this.volume = 0;
        this.isOn = false;
        this.mode = Mode.RADIO;
    }

    public void on() {
        this.isOn = true;
        printOn();
    }

    public void off() {
        this.isOn = false;
        printOn();
    }

    public void printOn() {
        System.out.println("The stereo is " + (isOn? "ON" : "OFF"));
    }

    public void setCDMode() {
        mode = Mode.CD;
        printMode();
    }

    public void setDvdMode() {
        mode = Mode.DVD;
        printMode();
    }

    public void setRadio() {
        mode = Mode.RADIO;
        printMode();
    }

    public void printMode() {
        System.out.println("The stereo is on " + mode.toString());
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.printf("The volume is %d\n", volume);
    }
}
