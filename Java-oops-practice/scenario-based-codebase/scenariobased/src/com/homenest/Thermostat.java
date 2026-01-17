
package com.homenest;
class Thermostat extends Device {

    public Thermostat(String id) {
        super(id, 1.2);
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: temperature set to 22°C");
    }
}