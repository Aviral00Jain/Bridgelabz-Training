package com.junit.exception;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}