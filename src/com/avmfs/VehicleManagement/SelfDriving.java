package com.avmfs.VehicleManagement;

import com.avmfs.Services.Model.Vehicle;
import com.avmfs.Utility.Location;

public final class SelfDriving extends Vehicle implements AutonomousVehicle {
    private int passengerCapacity;
    private int currentPassengers;

    public SelfDriving() {
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

    public void pickUpPassengers(int number){}

    public void dropOffPassengers(int number){}
}
