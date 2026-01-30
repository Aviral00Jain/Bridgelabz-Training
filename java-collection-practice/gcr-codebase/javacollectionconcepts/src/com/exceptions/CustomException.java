package com.exceptions;
import java.util.Scanner;
//create a class called CustomException
public class CustomException {
	public static void validateAge(int age) throws InvalidAgeException{
		if(age < 18) {
			throw new InvalidAgeException("Age must be 18 or above");
		}
		System.out.println("Access granted!");
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("enter you age: ");
			int age = input.nextInt();
			validateAge(age);
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}