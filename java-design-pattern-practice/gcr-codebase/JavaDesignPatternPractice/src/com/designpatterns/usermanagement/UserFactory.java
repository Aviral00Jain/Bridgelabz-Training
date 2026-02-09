package com.designpatterns.usermanagement;

public class UserFactory {

    public static User createUser(String type) {

        if (type == null) {
            throw new IllegalArgumentException("User type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "student":
                return new Student();
            case "faculty":
                return new Faculty();
            case "librarian":
                return new Librarian();
            default:
                throw new IllegalArgumentException("Invalid user type");
        }
    }
}
