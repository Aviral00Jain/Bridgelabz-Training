package com.mybank;

public abstract class Account implements ITransaction {
	
	//Attribute 
	protected String accountNumber;
	private double balance;
	
	Account(String accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Constructor without opening balance
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
 // Encapsulated balance access
    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void deposit(double amount) {
    	if(amount > 0) {
    		balance+=amount;
    	   }
    }
    
    public void withdraw(double amount) {
    	if(amount > 0 && amount <= balance) {
    		balance-=amount;
    	    }
    }

    public double checkBalance() {
    	   return balance;
    }
	
    // Polymorphic method
    public abstract double calculateInterest();
	
	

}
