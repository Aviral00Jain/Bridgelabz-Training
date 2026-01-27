package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetExtractEmailAddress {
	public static void main(String[] args) {
		//Create regex
		String regex="[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
		
		//email text
		String emailText="Contact us at abhi@example.com and details@company.org";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(emailText);
		
		while(matcher.find()) {
			System.out.println(matcher.group());	
			
		}
	}
}