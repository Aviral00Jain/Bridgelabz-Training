package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties: Cooking food and managing the kitchen.");
    }
}
