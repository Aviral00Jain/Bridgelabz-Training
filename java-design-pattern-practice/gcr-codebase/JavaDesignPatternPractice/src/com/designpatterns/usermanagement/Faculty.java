package com.designpatterns.usermanagement;

public class Faculty implements User {
    @Override
    public void getRole() {
        System.out.println("User Role: Faculty");
    }
}
