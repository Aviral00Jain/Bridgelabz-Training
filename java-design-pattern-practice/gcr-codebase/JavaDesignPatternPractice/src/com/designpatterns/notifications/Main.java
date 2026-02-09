package com.designpatterns.notifications;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Observer user1 = new User("Aviral");
        Observer user2 = new User("Aaditya");

        library.subscribe(user1);
        library.subscribe(user2);

        library.addNewBook("Java Design Patterns");
    }
}
