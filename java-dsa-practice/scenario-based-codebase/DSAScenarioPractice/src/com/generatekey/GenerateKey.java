package com.generatekey;
import java.util.*;

public class GenerateKey {
	
	//creating a method 
	public static String CleanseAndInvert(String input) {
		StringBuffer string = new StringBuffer();
		if(input.length() < 6) {
			return "Length of input is less than 6";
			
		}
	    input = input.toLowerCase();
	    
		for (int i=0 ; i<input.length(); i++) {
		   int str = input.charAt(i);
		   
		   if (str <= 97 && str >=122) {
			   return "Invalid Input";
			   
		   }
		   if (str % 2 != 0) {
			   string.append(input.charAt(i));
		   }
		}
		string.reverse();
		StringBuffer finalstring = new StringBuffer();
		
		for (int j = 0 ; j<string.length(); j++) {
			if (j % 2 == 0) {
				finalstring.append(Character.toUpperCase(string.charAt(j)));
			}
			
			else {
				finalstring.append(string.charAt(j));
			}
		}
		return finalstring.toString();
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input String");
		String word = sc.nextLine();
		
		System.out.println(CleanseAndInvert(word));
	}
	

}
