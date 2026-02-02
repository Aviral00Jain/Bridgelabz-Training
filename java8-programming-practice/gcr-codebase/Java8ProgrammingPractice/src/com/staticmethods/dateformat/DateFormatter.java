package com.staticmethods.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatter {
	static String formatDDMMYYYY(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	}

	static String formatYYYYMMDD(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	}

	static String formatReadable(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
	}
}