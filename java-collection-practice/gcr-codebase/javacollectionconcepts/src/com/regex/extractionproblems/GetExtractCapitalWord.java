package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GetExtractCapitalWord {
	public static void main(String[] args) {
		// Create regex
		String regex = "\\b[A-Z][a-z]+\\b";
		String emailText = "The Taj Mahal is situated in Agra, while the Gateway of India is situated in Mumbai";
	
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(emailText);
		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}