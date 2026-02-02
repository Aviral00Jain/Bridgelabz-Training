package com.functionalinterface;

public class BackgroundJobExecution {
	public static void main(String[] args) {
		// Runnable task using lambda
		Runnable backgroundTask = () -> {
			System.out.println("Background job started...");
			try {
				Thread.sleep(2000); // simulate work
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Background job completed!");
		};

		Thread thread = new Thread(backgroundTask);
		thread.start(); // runs asynchronously

		System.out.println("Main thread continues executing...");
	}
}