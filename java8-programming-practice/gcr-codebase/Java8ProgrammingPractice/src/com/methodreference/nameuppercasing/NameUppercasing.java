package com.methodreference.nameuppercasing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {

	public static void main(String[] args) {
		// Creating a list of employee names
		List<String> employeeNames = new ArrayList<>();

		employeeNames.add("Aditya");
		employeeNames.add("Aviral");
		employeeNames.add("Ayush");
		employeeNames.add("Karthik");

		// Converting all names to uppercase using Stream and Method Reference
		List<String> upperCaseNames = employeeNames.stream() // Convert list to stream
				.map(String::toUpperCase) // Method reference
				.collect(Collectors.toList()); // Collect result into list

		// Printing the uppercase names
		upperCaseNames.forEach(System.out::println);
	}
}