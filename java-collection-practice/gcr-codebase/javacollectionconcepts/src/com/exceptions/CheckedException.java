package com.exceptions;
import java.io.*;
//Create a checkedException class that check file is exists or not
public class CheckedException {
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\data.txt");
		}
		catch(IOException e) {
			System.out.println("File is not found.");
		}
	}
}