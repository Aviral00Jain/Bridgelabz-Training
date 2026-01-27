package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectProgrammingLanguage {
	public static void main(String[] args) {

		String text = "I know C++ , Java , Python, and JavaScript, but I haven't tried Rust yet.";

		//Create Regex for programming languages
		String regex = "\\b(C++|Java|JavaScript|Python|JavaScript|Rust)\\b";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}