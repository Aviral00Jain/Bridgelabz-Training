package com.sorting.cropmonitor;

public class Main {
    public static void main(String[] args) {

        SensorReading[] data = {
            new SensorReading(1705403000L, 28.5),
            new SensorReading(1705401000L, 27.2),
            new SensorReading(1705405000L, 29.1),
            new SensorReading(1705402000L, 26.9)
        };

        QuickSort.quickSort(data, 0, data.length - 1);

        System.out.println(" Sensor Data Sorted");
        for (SensorReading s : data) {
            System.out.println(s);
        }
    }
}