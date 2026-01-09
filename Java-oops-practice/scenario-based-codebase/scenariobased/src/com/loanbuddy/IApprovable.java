package com.loanbuddy;

public interface IApprovable {
	
	boolean  approveLoan(Applicant application);
	double calculateEMI(Applicant application);

}
