package com.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
//Create UncheckedException that check the unchecked exceptiop.
public class UncheckedException {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Enter the number one:");
			int numberOne = input.nextInt();
			
			System.out.println("Enter the number two:");
			int numberTwo = input.nextInt();
			
			int answer = numberOne/numberTwo;
			
			System.out.println("Answer is :" + answer);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero.");
		}		
		catch(InputMismatchException e) {
			System.out.println("Please enter valid numeric values.");
		}
		System.out.println("end of program");
		input.close();
	}
}