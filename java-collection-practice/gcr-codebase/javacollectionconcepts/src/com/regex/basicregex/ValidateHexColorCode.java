package com.regex.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
	
	public static void main(String[] args) {
		//create regex
		String regex="^#[0-9A-Fa-f]{6}$";
		
		//create array of hex color codes
		String[] licenses= {"#GASD00","#ff4500","#123","ab1e4","#12AB23"};
		Pattern pattern=Pattern.compile(regex);
		
		//validating
		for(String license:licenses) {
			Matcher matcher=pattern.matcher(license);
			System.out.println(license+" is Valid :"+matcher.matches());
		}
	}

}