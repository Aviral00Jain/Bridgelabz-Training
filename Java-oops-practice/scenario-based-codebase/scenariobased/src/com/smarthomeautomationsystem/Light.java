package com.smarthomeautomationsystem;

class Light extends Appliance {

    public Light() {
        super(40); // default power
    }

    @Override
    public void turnOn() {
        setOn(true);
        System.out.println("Light turned ON (Soft glow)");
    }

    @Override
    public void turnOff() {
        setOn(false);
        System.out.println("Light turned OFF");
    }
}

