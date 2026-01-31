package com.junit.dateformatter;
import static org.junit.Assert.*;
import org.junit.Test;

public class DateFormatterTest {

    @Test
    public void testValidDate() {
        DateFormatter formatter = new DateFormatter();
        assertEquals("25-12-2025", formatter.formatDate("2025-12-25"));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDate() {
        DateFormatter formatter = new DateFormatter();
        formatter.formatDate("25-12-2025");
    }
}