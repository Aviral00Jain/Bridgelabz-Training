package com.designpatterns.notifications;

import java.util.*;

class Library implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String bookName) {
        for (Observer observer : observers) {
            observer.update(bookName);
        }
    }

    // New book arrival
    public void addNewBook(String bookName) {
        System.out.println("Library: New book added -> " + bookName);
        notifyObservers(bookName);
    }
}
