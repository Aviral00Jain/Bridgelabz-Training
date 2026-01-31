package com.junit.dateformatter;

public class DateFormatter {

    public String formatDate(String date) {
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
        	
            throw new IllegalArgumentException("invalid date");
        }

        String[] parts = date.split("-");
        return parts[2] + "-" + parts[1] + "-" + parts[0];
    }
}