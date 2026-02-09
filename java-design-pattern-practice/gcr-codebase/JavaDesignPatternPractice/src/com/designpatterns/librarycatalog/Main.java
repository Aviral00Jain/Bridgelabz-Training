package com.designpatterns.librarycatalog;
public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog1 = LibraryCatalog.getInstance();
        LibraryCatalog catalog2 = LibraryCatalog.getInstance();
        System.out.println(catalog1 == catalog2); 
    }
}