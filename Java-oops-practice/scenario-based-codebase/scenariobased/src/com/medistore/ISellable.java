package com.medistore;

public interface ISellable {
    double sell(int qty);
    boolean checkExpiry();
}
