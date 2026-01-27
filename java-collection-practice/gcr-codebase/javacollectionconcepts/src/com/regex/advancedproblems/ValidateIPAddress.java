package com.regex.advancedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//create ValidateIPAddress
public class ValidateIPAddress {
	public static void main(String[] args) {
		String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.)){3}" + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

		String[] ipAddresses = { "192.168.1.1", "10.0.0.5", "255.255.255.255", "256.100.50.25", "192.168.1",
				"192.168.1.999", "abc.def.1.1", "123.045.067.089", "192.168.1.1.1" };

		Pattern pattern = Pattern.compile(regex);
		for (String ipAddress : ipAddresses) {
			
			Matcher matcher = pattern.matcher(ipAddress);
			System.out.println(ipAddress + " is Valid: " + matcher.matches());
		}
	}
}