package com.avmfs.VehicleManagement;

import com.avmfs.Services.Model.Vehicle;
import com.avmfs.Utility.Location;

public final class DeliveryDrone extends Vehicle implements AutonomousVehicle {
    private double payloadCapacity;
    private double currentPayload;

    public DeliveryDrone() {
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public double getCurrentPayload() {
        return currentPayload;
    }

    public void setCurrentPayload(double currentPayload) {
        this.currentPayload = currentPayload;
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

    public void loadPayload(double weight){}

    public void unload(){}
}
