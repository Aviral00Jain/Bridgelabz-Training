package com.junit.evenchecker;

import static org.junit.Assert.*;
import org.junit.Test;

public class EvenCheckerTest {
	@Test
	public void testIsEven() {
		EvenChecker checker = new EvenChecker();

		assertTrue(checker.isEven(2));
		assertTrue(checker.isEven(4));
		assertTrue(checker.isEven(6));

		assertTrue(checker.isEven(7));
		assertFalse(checker.isEven(9));
	}
}