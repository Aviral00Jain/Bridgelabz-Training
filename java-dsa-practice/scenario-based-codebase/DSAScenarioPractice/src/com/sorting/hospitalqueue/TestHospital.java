package com.sorting.hospitalqueue;

public class TestHospital {

	public static void main(String[] args) {
		
		Patient[] patients = { new Patient("Amit", 4), new Patient("katrik", 1),
				             new Patient("Ankit", 7), new Patient("Keshav", 9),
				             new Patient("Aman", 3)};
		
		System.out.println(" ------Patients after sorting------- ");
        
		HospitalQueue.sortByCriticality(patients);
		
		for(Patient pat : patients) {
			System.out.println(pat);
		}
		
	}
}