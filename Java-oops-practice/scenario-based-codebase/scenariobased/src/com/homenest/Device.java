
package com.homenest;
abstract class Device implements IControllable {

    protected String deviceId;
    private boolean status;               
    protected double energyUsage;

    protected String firmwareLog;          
    
    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware initialized";
    }

    // Encapsulated access
    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double calculateMonthlyEnergy(int hoursPerDay) {
        return energyUsage * hoursPerDay * 30;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(deviceId + " turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(deviceId + " turned OFF");
    }
}
