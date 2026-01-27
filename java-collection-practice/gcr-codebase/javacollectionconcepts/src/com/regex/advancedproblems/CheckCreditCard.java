package com.regex.advancedproblems;
import java.util.regex.Pattern;

public class CheckCreditCard {
	public static void main(String[] args) {

		String regex = "^(4\\d{15}|5\\d{15})$";

		String[] cardNumbers = { "12345678909876543", "56793456789012345", "2345678976543", "123456789087654",
				"51234567890123456", "abcd123456789012" };

		for (String card : cardNumbers) {
			System.out.println(card + " is Valid: " + Pattern.matches(regex, card));
		}
	}
}

