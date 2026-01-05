package com.smarthomeautomationsystem;

class Fan extends Appliance {

    public Fan() {
        super(75);
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Fan turned ON (Medium speed)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Fan turned OFF");
    }
}

