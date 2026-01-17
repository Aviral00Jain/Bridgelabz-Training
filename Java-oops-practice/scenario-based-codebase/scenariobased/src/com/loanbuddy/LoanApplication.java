package com.loanbuddy;

abstract  class LoanApplication implements IApprovable {
	
	    protected String loanType;
	    protected int term;               // in months
	    protected double interestRate;
 
	    protected boolean loanApproved;
	    
	    
	    public LoanApplication(String loanType, int term, double interestRate) {
	        this.loanType = loanType;
	        this.term = term;
	        this.interestRate = interestRate;
	    }

}
