package com.headFirst.oberver.weatherStation.displays;
import com.headFirst.oberver.weatherStation.Observer;
import com.headFirst.oberver.weatherStation.Subject;

public class CurrentConditionsDisplay implements Display, Observer {

    private float temperature;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        String text = "The temperature is %f C,\nThe current humidity is %f";
        System.out.printf((text) + "%n", this.temperature, this.humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
