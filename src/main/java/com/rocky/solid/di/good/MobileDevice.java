package com.rocky.solid.di.good;

public class MobileDevice implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions.equalsIgnoreCase("rainy"))
            System.out.print("It is rainy");
    }
}
