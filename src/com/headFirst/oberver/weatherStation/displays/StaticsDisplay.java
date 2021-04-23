package com.headFirst.oberver.weatherStation.displays;

import com.headFirst.oberver.weatherStation.Observer;
import com.headFirst.oberver.weatherStation.Subject;

public class StaticsDisplay implements Display, Observer {

    private Subject weatherSubject;
    private float avg;
    private int avgCounter;
    private float min;
    private float max;

    public StaticsDisplay(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        this.weatherSubject.registerObserver(this);

        this.avg = 0;
        this.avgCounter = 0;
        this.min = Float.MAX_VALUE;
        this.max = Float.MIN_VALUE;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        avg = (avg + temperature) / ++avgCounter;
        min = Math.min(min, temperature);
        max = Math.max(max, temperature);

        display();
    }

    @Override
    public void display() {
        String text = String.format("The average temperature is %f C,\n The min temperature registered today is: %f C,\nThe max temperature registered is: %f C", avg, min, max);
        System.out.println(text);
    }
}
