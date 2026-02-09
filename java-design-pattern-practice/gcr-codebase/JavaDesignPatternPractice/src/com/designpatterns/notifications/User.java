package com.designpatterns.notifications;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String bookName) {
        System.out.println(name + " notified: New book arrived -> " + bookName);
    }
}