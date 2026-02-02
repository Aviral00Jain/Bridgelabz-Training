package com.staticmethods.dateformat;

import java.time.LocalDate;

public class InvoiceDateTest {
	public static void main(String[] args) {
		LocalDate invoiceDate = LocalDate.now();

		System.out.println("Invoice Date (dd-MM-yyyy): " + DateFormatter.formatDDMMYYYY(invoiceDate));

		System.out.println("Invoice Date (yyyy/MM/dd): " + DateFormatter.formatYYYYMMDD(invoiceDate));

		System.out.println("Invoice Date (Readable): " + DateFormatter.formatReadable(invoiceDate));
	}
}