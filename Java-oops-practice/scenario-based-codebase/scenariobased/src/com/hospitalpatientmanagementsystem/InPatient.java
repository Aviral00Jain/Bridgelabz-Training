package com.hospitalpatientmanagementsystem;

class InPatient extends Patient {
	//instance variable
    private int daysAdmitted;

    public InPatient(int id, String name, int days) {
        super(id, name);
        this.daysAdmitted = days;
    }

    public InPatient(int id, String name, String history, int days) {
        super(id, name, history); // calls emergency constructor
        this.daysAdmitted = days;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + getSummary() + ", Days Admitted: " + daysAdmitted);
    }

    
    public int getDaysAdmitted() {
        return daysAdmitted;
    }
}