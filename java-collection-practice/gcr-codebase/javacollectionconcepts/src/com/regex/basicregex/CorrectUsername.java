package com.regex.basicregex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectUsername {
public static void main(String[] args) {
		
		//create regex
		String regex="[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		//create array of usernames
		String[] usernames= {"kesh_123","123abhi","th"};
		Pattern pattern =Pattern.compile(regex);
		for(String username:usernames) {
			
			Matcher matcher=pattern.matcher(username);
			System.out.println(username+" is Valid: "+matcher.matches());
		}
	}
}