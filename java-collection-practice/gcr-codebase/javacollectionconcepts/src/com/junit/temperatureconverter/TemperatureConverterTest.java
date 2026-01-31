package com.junit.temperatureconverter;
import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureConverterTest {

    @Test
    public void testConversion() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(32, converter.celsiusToFahrenheit(0), 0.0);
        assertEquals(0, converter.fahrenheitToCelsius(32), 0.0);
    }
}