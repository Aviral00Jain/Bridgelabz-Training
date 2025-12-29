package com.constructor.levelone;


public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default Constructor
    public CarRental() {
        customerName = "Not Assigned";
        carModel = "Standard";
        rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        double ratePerDay;

        switch (carModel.toLowerCase()) {
            case "suv":
                ratePerDay = 3000;
                break;
            case "sedan":
                ratePerDay = 2000;
                break;
            case "hatchback":
                ratePerDay = 1500;
                break;
            default:
                ratePerDay = 1800; // default car rate
        }

        return ratePerDay * rentalDays;
    }

    // Display Method
    public void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
        System.out.println("---------------------------------------");
        
    }
}