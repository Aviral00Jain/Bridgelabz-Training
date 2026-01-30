package com.reflection.basiclevel;

import java.lang.reflect.Method;

public class InvokePrivateMethodDemo {
	static class Calculator {
		private int multiply(int a, int b) {
			return a * b;
		}
	}

	public static void main(String[] args) {

		try {
			Calculator calculator = new Calculator();

			Class<?> cls = calculator.getClass();
			Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
			method.setAccessible(true);

			int result = (int) method.invoke(calculator, 5, 4);

			// Display result
			System.out.println("Result: " + result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}