package com.healthclinic.HealthClinicJDBC.model;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialty;

    // Default Constructor
    public Doctor() {

    }

    // Parameterized Constructor
    public Doctor(int doctorId, String name, String specialty) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
    }

    // Getter and Setter

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor [doctorId=" + doctorId +
                ", name=" + name +
                ", specialty=" + specialty + "]";
    }

}