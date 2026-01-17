package com.cabbygoapplication;

public interface IRideService {

    void bookRide(Vehicle vehicle, Driver driver, double distance);

    void endRide();
}