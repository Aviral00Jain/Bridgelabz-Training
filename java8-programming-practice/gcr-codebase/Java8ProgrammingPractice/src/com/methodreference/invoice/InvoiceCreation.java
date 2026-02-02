package com.methodreference.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceCreation {
	public static void main(String[] args) {

		// List of transaction IDs
		List<Integer> transactionIds = new ArrayList<>();

		transactionIds.add(5001);
		transactionIds.add(5002);
		transactionIds.add(5003);

		// Creating Invoice objects using Constructor Reference
		List<Invoice> invoices = transactionIds.stream().map(Invoice::new) // Constructor reference
				.collect(Collectors.toList());

		// Printing generated invoices
		invoices.forEach(System.out::println);
	}
}