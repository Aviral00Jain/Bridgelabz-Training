package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		// create regex
		String regex = "[0-9]{2}/[0-9]{2}/[0-9]{4}";

		// email text
		String emailText = "The events are scheduled for 18/01/2026, 19/01/2026, and 12/02/2026.";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailText);
		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}