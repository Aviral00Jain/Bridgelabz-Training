package com.junit.passwordvalidator;
import static org.junit.Assert.*;
import org.junit.Test;

public class PasswordValidatorTest {
    @Test
    public void testPasswordValidation() {
        PasswordValidator validator = new PasswordValidator();
        assertTrue(validator.isValid("CTest123"));
        assertFalse(validator.isValid("c"));
    }
}