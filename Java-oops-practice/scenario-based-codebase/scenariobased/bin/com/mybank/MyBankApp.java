package com.mybank;

public class MyBankApp {
	
	public static void main(String[] args) {
		Account saving = new SavingAccount("9877554325443", 10000 );
		Account current = new CurrentAccount("982374921375", 500000);
		
		
		saving.deposit(2000);
        current.deposit(5000);

        System.out.println("Savings Balance: ₹" + saving.checkBalance());
        System.out.println("Savings Interest: ₹" + saving.calculateInterest());

        System.out.println("Current Balance: ₹" + current.checkBalance());
        System.out.println("Current Interest: ₹" + current.calculateInterest());
	}

}
