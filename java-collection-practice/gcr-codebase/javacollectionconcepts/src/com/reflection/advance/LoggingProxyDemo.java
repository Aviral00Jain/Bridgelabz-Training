package com.reflection.advance;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxyDemo {

	interface Greeting {
		void sayHello(String name);
	}

	static class GreetingImpl implements Greeting {
		@Override
		public void sayHello(String name) {
			System.out.println("Hello, " + name + "!");
		}
	}

	static class LoggingHandler implements InvocationHandler {

		private final Object target;

		LoggingHandler(Object target) {
			this.target = target;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("Invoking method: " + method.getName());

			return method.invoke(target, args);
		}
	}

	public static void main(String[] args) {

		Greeting realObject = new GreetingImpl();

		Greeting proxyObject = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
				new Class[] { Greeting.class }, new LoggingHandler(realObject));
		proxyObject.sayHello("Anuj");
	}
}