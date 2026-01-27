package com.regex.replaceandmodifystrings;


public class ReplaceMultipleSpace {
	public static void main(String[] args) {
		
		String inputString="It is an sample of multiple spaces.";
	
		inputString=inputString.replaceAll("\\s+"," ");
		
		System.out.println(inputString);
		
	}
}