package com.headFirst.commander.control.objects;

public class GarageDoor {
    private float openRange; //0 closed 1 open
    private Light light;

    public GarageDoor(){
        this.openRange = 0;
        this.light = new Light("Garage Door");
    }

    public void up(float upRange) {
        if (openRange == 1) return;
        if (openRange + upRange >= 1) this.openRange = 1;

        this.openRange += upRange;
        printState();
    }

    public void down(float downRange) {
        if (openRange == 0) return;
        if (openRange - downRange <= 0) this.openRange = 0;

        this.openRange -= downRange;
        printState();
    }

    public void stop(float stopAt) {
        if (stopAt >= 1) this.openRange = 1;
        if (stopAt <= 0) this.openRange = 0;

        this.openRange = stopAt;
        printState();
    }

    public void printState() {
        if (openRange == 1) System.out.println("Door is open");
        if (openRange == 0) System.out.println("Door is closed");

        System.out.printf("Door is at %f.2 open\n", openRange);
    }

    public void lightOn() {
        this.light.on();
    }

    public void lightOff() {
        this.light.off();
    }
}
