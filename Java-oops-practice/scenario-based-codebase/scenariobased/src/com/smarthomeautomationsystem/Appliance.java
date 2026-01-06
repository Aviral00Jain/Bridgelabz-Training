package com.smarthomeautomationsystem;

abstract class Appliance implements Controllable {

    private boolean isOn;          // encapsulated internal state
    private int powerConsumption;  // watts (private)

    // Constructor with default power
    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    // Constructor with user-defined power
    public Appliance(int powerConsumption, boolean isOn) {
        this.powerConsumption = powerConsumption;
        this.isOn = isOn;
    }

    protected void setOn(boolean state) {
        isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}
