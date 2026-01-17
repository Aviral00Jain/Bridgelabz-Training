package com.bankmanagement;

//Customer HAS-A Account (Composition)
class Customer {
	//instance variables
String name;
Account account;

	//Constructor
Customer(String name, Account account) {
   this.name = name;
   this.account = account;
}

	//show customer details method
public void showCustomerDetails() {
   System.out.println("Customer Name: " + name);
   account.display();
}
}