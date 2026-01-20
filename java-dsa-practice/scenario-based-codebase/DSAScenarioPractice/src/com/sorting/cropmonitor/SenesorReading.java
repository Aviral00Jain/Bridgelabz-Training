package com.sorting.cropmonitor;

class SensorReading {
    long timestamp;    
    double temperature;

    public SensorReading(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }

    public String toString() {
        return timestamp + " - " + temperature ;
    }
}