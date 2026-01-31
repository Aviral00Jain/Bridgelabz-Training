package com.junit.performance;
import org.junit.Test;

public class PerformanceTest {
	@Test(timeout = 2000)
	public void testLongRunningTask() throws InterruptedException {
		Thread.sleep(3000);
	}
}