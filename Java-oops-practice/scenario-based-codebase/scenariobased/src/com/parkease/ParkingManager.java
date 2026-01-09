package com.parkease;

class ParkingManager {

    private String bookingLog;

    public void bookSlot(ParkingSlot slot, Vehicle vehicle, int hours) {

        if (!slot.isAvailable()) {
            System.out.println("Slot not available");
            return;
        }

        slot.occupySlot();

        IPayable payableVehicle = (IPayable) vehicle;
        double charges = payableVehicle.calculateCharges(hours);

        bookingLog = "Vehicle " + vehicle.vehicleNumber +
                     " parked for " + hours +
                     " hours. Charges: ₹" + charges;

        System.out.println(bookingLog);
    }
}

