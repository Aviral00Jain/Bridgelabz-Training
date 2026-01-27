package com.regex.replaceandmodifystrings;

import java.util.HashSet;
import java.util.Set;

public class BannedBadWords {
	public static void main(String[] args) {

		String inputString = "This is a damn bad example with some stupid words.";

		inputString = inputString.replaceAll("(?i)damn|stupid", "*****");
		
		System.out.println(inputString);

	}

}