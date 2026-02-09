package com.designpatterns.librarycatalog;
public class LibraryCatalog {

    private static final LibraryCatalog INSTANCE = new LibraryCatalog();

    private LibraryCatalog() {}

    public static LibraryCatalog getInstance() {
        return INSTANCE;
    }
}