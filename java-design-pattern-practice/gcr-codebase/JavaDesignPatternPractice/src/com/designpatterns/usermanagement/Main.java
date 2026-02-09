package com.designpatterns.usermanagement;

public class Main {
    public static void main(String[] args) {

        User user1 = UserFactory.createUser("student");
        User user2 = UserFactory.createUser("faculty");
        User user3 = UserFactory.createUser("librarian");

        user1.getRole();
        user2.getRole();
        user3.getRole();
    }
}
