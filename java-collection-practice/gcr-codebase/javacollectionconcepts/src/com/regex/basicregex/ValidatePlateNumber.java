package com.regex.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePlateNumber {
	public static void main(String[] args) {
		
		// Create regex
		String regex="^[A-Z]{2}[0-9]{4}$";
		
		// create array of license plate numbers
		String[] licenses= {"VD1234","AGd345","XXag34YY","ab1234"};
		Pattern pattern=Pattern.compile(regex);
		
		for(String license:licenses) {
			Matcher matcher=pattern.matcher(license);
			System.out.println(license+" is valid :"+matcher.matches());
		}
	}

}