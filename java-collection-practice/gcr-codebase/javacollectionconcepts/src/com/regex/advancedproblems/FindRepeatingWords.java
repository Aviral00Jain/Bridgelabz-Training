package com.regex.advancedproblems;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
	public static void main(String[] args) {
		String input = "This This is is a frequent frequent word test Test.";
		//Create Regex to find repeating words
		String regex = "\\b(\\w+)\\s+\\1\\b";

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}
}