package com.junit.userregistration;
import static org.junit.Assert.*;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void testValidRegistration() {
		UserRegistration registration = new UserRegistration();
		registration.registerUser("keshav", "keshav@mail.com", "Pass9876");
	}
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidRegistration() {
		UserRegistration registration = new UserRegistration();
		registration.registerUser("", "abhi@test.com", "Pass9876");
	}
}