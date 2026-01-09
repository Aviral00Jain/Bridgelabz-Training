package com.parkease;

class ParkingSlot {

    private String slotId;
    private String location;
    private String vehicleTypeAllowed;
    private boolean isOccupied;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void occupySlot() {
        isOccupied = true;
    }

    public void freeSlot() {
        isOccupied = false;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}
