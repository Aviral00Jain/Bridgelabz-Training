package com.junit.stringutils;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverse() {
        StringUtils utils = new StringUtils();
        assertEquals("avaJ", utils.reverse("Rust"));
    }
    @Test
    public void testPalindrome() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("sir"));
        assertFalse(utils.isPalindrome("rust"));
    }

    @Test
    public void testUpperCase() {
        StringUtils utils = new StringUtils();
        assertEquals("HELLO", utils.toUpperCase("byy"));
    }
}