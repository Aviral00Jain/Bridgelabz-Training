package com.designpatterns.bookcreation;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book.Builder("Effective Java")
                .author("Joshua Bloch")
                .edition(3)
                .genre("Programming")
                .build();

        Book book2 = new Book.Builder("Clean Code")
                .author("Robert C. Martin")
                .build();

        System.out.println(book1);
        System.out.println(book2);
    }
}
