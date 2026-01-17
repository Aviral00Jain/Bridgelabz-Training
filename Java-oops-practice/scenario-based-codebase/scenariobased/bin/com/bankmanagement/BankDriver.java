package com.bankmanagement;

public class BankDriver {
	public static void main(String[] args) {

		// Customer with Savings Account
		SavingsAccount sa = new SavingsAccount("SA1001", 5000, 5);
		Customer c1 = new Customer("Aaditya", sa);

		c1.showCustomerDetails();
		sa.deposit(2000);
		sa.withdraw(1500);
		sa.calculateInterest();

		System.out.println("--------------------------");

		// Customer with Current Account
		CurrentAccount ca = new CurrentAccount("CA2001", 8000);
		Customer c2 = new Customer("Aviral", ca);

		c2.showCustomerDetails();
		ca.deposit(3000);
		ca.withdraw(12000); // Shows insufficient balance
	}
}
