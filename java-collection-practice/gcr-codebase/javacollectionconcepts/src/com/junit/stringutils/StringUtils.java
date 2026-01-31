package com.junit.stringutils;

public class StringUtils {
    public String reverse(String value) {
        return new StringBuilder(value).reverse().toString();
    }
    public boolean isPalindrome(String value) {
        return value.equals(reverse(value));
    }
    public String toUpperCase(String value) {
        return value.toUpperCase();
    }
}