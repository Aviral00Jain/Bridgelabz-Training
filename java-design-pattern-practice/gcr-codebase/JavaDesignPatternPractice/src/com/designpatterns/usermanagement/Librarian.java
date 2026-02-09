package com.designpatterns.usermanagement;

public class Librarian implements User {
    @Override
    public void getRole() {
        System.out.println("User Role: Librarian");
    }
}
