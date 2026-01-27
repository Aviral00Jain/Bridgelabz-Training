package com.streams.saveandretrieveanobject;

import java.io.Serializable;
//create Employee class that having info about employee
class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    // Constructor
    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //display method
    void display() {
        System.out.println(id + "| " + name + " | " + department + " | " + salary);
    }
}