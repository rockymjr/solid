package com.rocky.solid.di.good;

public class EmailClient implements Notifier {
	public void alertWeatherConditions(String weatherConditions) {
		if (weatherConditions.equalsIgnoreCase("sunny")) {
			System.out.print("It is sunny");
		}
	}
}
