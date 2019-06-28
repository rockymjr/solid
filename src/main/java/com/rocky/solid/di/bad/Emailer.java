package com.rocky.solid.di.bad;

public class Emailer {
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}
