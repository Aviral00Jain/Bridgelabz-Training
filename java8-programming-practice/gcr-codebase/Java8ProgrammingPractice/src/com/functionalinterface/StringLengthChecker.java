package com.functionalinterface;

import java.util.function.Function;

public class StringLengthChecker {
	public static void main(String[] args) {
		String message = "This is an important notification";
		int maxLength = 20;

		// Function to get string length
		Function<String, Integer> lengthFunction = msg -> msg.length();

		int messageLength = lengthFunction.apply(message);

		if (messageLength > maxLength) {
			System.out.println(" Message too long (" + messageLength + " characters)");
		} else {
			System.out.println(" Message length OK (" + messageLength + " characters)");
		}
	}
}