package com.designpatterns.usermanagement;

public class Student implements User {
    @Override
    public void getRole() {
        System.out.println("User Role: Student");
    }
}
