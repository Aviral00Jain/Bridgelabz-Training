package com.traincompanion;

public class TrainNode {
	
	int compartment;
	String service;
	
	
	 TrainNode prev ;
	 TrainNode next;
	
	public TrainNode(int compartmentNumber, String service ) {
		this.compartment = compartmentNumber;
		this.service = service;
	}
	
	
	

}