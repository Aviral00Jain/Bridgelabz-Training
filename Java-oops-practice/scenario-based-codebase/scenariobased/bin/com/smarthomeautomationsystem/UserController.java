package com.smarthomeautomationsystem;

class UserController {

    public void operateDevice(Controllable device, boolean powerState) {
        if (powerState) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }

    // Compare energy usage using operators
    public void compareUsage(Appliance a1, Appliance a2) {
        if (a1.getPowerConsumption() > a2.getPowerConsumption()) {
            System.out.println("First appliance consumes more power");
        } else if (a1.getPowerConsumption() < a2.getPowerConsumption()) {
            System.out.println("Second appliance consumes more power");
        } else {
            System.out.println("Both appliances consume equal power");
        }
    }
}
