package com.methodreference.hospital;

import java.util.ArrayList;
import java.util.List;

public class PatientIdPrinting {
	public static void main(String[] args) {

		// Creating a list to store patient IDs
		List<Integer> patientIds = new ArrayList<>();

		// Adding patient IDs
		patientIds.add(101);
		patientIds.add(102);
		patientIds.add(103);
		patientIds.add(104);

		// Printing patient IDs using Method Reference
		// System.out::println is a method reference
		patientIds.forEach(System.out::println);
	}
}