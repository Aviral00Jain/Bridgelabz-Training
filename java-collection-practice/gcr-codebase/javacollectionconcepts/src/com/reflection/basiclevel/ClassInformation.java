package com.reflection.basiclevel;
import java.lang.reflect.*;
import java.util.Scanner;

public class ClassInformation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter fully qualified class name: ");
		String className = sc.nextLine();

		try {
			Class<?> cls = Class.forName(className);

			System.out.println("\nclass Name: " + cls.getName());

			//constructors
			System.out.println("\nconstructors:");
			Constructor<?>[] constructors = cls.getDeclaredConstructors();
			for (Constructor<?> c : constructors) {
				System.out.println(c);
			}

			//fields
			System.out.println("\nFields:");
			Field[] fields = cls.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f);
			}

			//methods
			System.out.println("\nmethods:");
			Method[] methods = cls.getDeclaredMethods();
			for (Method m : methods) {
				System.out.println(m);
			}

		} catch (ClassNotFoundException e) {
			System.out.println("class not found! Please enter a valid class name.");
		}

		sc.close();
	}
}