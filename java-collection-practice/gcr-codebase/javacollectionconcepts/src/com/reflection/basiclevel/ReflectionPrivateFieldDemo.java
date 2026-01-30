package com.reflection.basiclevel;

import java.lang.reflect.Field;

public class ReflectionPrivateFieldDemo {
	// Inner Person class
	static class Person {
		private int age;

		Person(int age) {
			this.age = age;
		}
	}

	public static void main(String[] args) {

		try {
			Person person = new Person(25);
			Class<?> cls = person.getClass();
			Field ageField = cls.getDeclaredField("age");
			ageField.setAccessible(true);
			System.out.println("Original Age: " + ageField.get(person));
			ageField.set(person, 30);
			System.out.println("Updated Age: " + ageField.get(person));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}