package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CheckCurrencyValues {
	public static void main(String[] args) {

		String text = "The price is $405.49, and the discount is $50.30.";
		//Create Regex for currency values
		String regex = "\\$?\\d+(\\.\\d{2})";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}