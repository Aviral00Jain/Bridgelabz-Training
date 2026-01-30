package com.reflection.intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocationDemo {
	static class MathOperations {
		public int add(int a, int b) {
			return a + b;
		}

		public int subtract(int a, int b) {
			return a - b;
		}

		public int multiply(int a, int b) {
			return a * b;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			MathOperations math = new MathOperations();
			Class<?> cls = math.getClass();

			System.out.print("Enter method name (add / subtract / multiply): ");
			String methodName = sc.nextLine();

			System.out.print("Enter first number: ");
			int a = sc.nextInt();

			System.out.print("Enter second number: ");
			int b = sc.nextInt();
			Method method = cls.getMethod(methodName, int.class, int.class);

			Object result = method.invoke(math, a, b);

			System.out.println("Result: " + result);

		} catch (NoSuchMethodException e) {
			System.out.println("Invalid method name!");
		} catch (Exception e) {
			e.printStackTrace();
		}

		sc.close();
	}
}