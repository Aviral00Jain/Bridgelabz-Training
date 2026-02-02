package com.staticmethods.passwordstrength;

public class PasswordTest {
	public static void main(String[] args) {
		String password = "Insu@123";

		if (SecurityUtils.isStrongPassword(password)) {
			System.out.println(" Strong Password");
		} else {
			System.out.println(" Weak Password");
		}
	}
}