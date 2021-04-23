package com.headFirst.oberver.weatherStation;

import com.headFirst.oberver.weatherStation.displays.CurrentConditionsDisplay;
import com.headFirst.oberver.weatherStation.displays.HeatIndexDisplay;
import com.headFirst.oberver.weatherStation.displays.StaticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 49.4f);
        System.out.println("---------------------------------------------------");
        weatherData.setMeasurements(82, 75, 29.4f);
        System.out.println("---------------------------------------------------");
        weatherData.setMeasurements(78, 90, 49.4f);
        System.out.println("---------------------------------------------------");

    }
}
