package com.avmfs.VehicleManagement;

import com.avmfs.Services.Model.Vehicle;
import com.avmfs.Utility.FleetingStatus;
import com.avmfs.Utility.Location;
import com.avmfs.Utility.VehicleStatus;

public final class SelfDriving extends Vehicle implements AutonomousVehicle {
    private int passengerCapacity;
    private int currentPassengers = 0;

    public SelfDriving(Long id, String model, int year, VehicleStatus status, int altitude, int batteryLevel, FleetingStatus fleetingStatus, int passengerCapacity) {
        super(id, model, year, status, altitude, batteryLevel, fleetingStatus);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void updateLocation(Location<Long, Long> newLocation) {

    }

    public void pickUpPassengers(int number){
        if(this.getPassengerCapacity() < number){
            throw new RuntimeException("Exceeding the passenger limit.");
        }
        this.setCurrentPassengers(number);
    }

    public void dropOffPassengers(int number){
        this.setCurrentPassengers(number);
    }
}
