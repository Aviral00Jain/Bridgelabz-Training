package com.reflection.intermediate;

import java.lang.reflect.Field;

public class ModifyStaticFieldDemo {

	static class Configuration {
		private static String API_KEY = "OLD_KEY";
	}

	public static void main(String[] args) {

		try {
			Class<?> cls = Configuration.class;
			Field field = cls.getDeclaredField("API_KEY");
			field.setAccessible(true);
			System.out.println("Original API_KEY: " + field.get(null));
			field.set(null, "NEW_API_KEY_123");

			System.out.println("Updated API_KEY: " + field.get(null));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}