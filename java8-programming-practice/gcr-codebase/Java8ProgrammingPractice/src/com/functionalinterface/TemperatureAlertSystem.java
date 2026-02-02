package com.functionalinterface;

import java.util.function.Predicate;

public class TemperatureAlertSystem {
	public static void main(String[] args) {
		double currentTemperature = 39.5;
		double threshold = 37.0;

		// Predicate to check high temperature
		Predicate<Double> isHighTemperature = temp -> temp > threshold;

		if (isHighTemperature.test(currentTemperature)) {
			System.out.println(" Alert! Temperature is too high: " + currentTemperature);
		} else {
			System.out.println(" Temperature is normal: " + currentTemperature);
		}
	}
}