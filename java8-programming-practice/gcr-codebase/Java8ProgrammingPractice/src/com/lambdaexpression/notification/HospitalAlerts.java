package com.lambdaexpression.notification;

import java.util.*;
import java.util.function.Predicate;

public class HospitalAlerts {
	public static void main(String[] args) {
		// Creating list of alerts
		List<Alert> alerts = new ArrayList<>();

		alerts.add(new Alert("Emergency", "Heart rate critical"));
		alerts.add(new Alert("Medicine", "Take BP medicine at 8 AM"));
		alerts.add(new Alert("Appointment", "Doctor visit at 5 PM"));
		alerts.add(new Alert("Emergency", "Oxygen level low"));

		// User preference: show ONLY Emergency alerts
		Predicate<Alert> emergencyOnly = alert -> alert.type.equals("Emergency");

		System.out.println("Filtered Alerts:");

		// Manual filtering using Predicate (no streams)
		for (Alert alert : alerts) {
			if (emergencyOnly.test(alert)) {
				System.out.println(alert);
			}
		}
	}
}