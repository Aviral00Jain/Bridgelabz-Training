package com.medistore;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine m1 = new Tablet("Paracetamol", 5.0, 30);
        Medicine m2 = new Syrup("Cough Syrup", 120.0, 7);
        Medicine m3 = new Injection("Insulin", 500.0, 12, 10);

        System.out.println("Bill 1: ₹" + m1.sell(5));
        System.out.println("Bill 2: ₹" + m2.sell(1));
        System.out.println("Bill 3: ₹" + m3.sell(1));
    }
}
