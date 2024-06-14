package com.avmfs.VehicleManagement;

import com.avmfs.Services.Model.Vehicle;
import com.avmfs.Utility.FleetingStatus;
import com.avmfs.Utility.Location;
import com.avmfs.Utility.VehicleStatus;

public final class DeliveryDrone extends Vehicle implements AutonomousVehicle {
    private double payloadCapacity;
    private double currentPayload = 0.0;

    public DeliveryDrone(Long id, String model, int year, VehicleStatus status, int altitude, int batteryLevel, FleetingStatus fleetingStatus, double payloadCapacity) {
        super(id, model, year, status, altitude, batteryLevel, fleetingStatus);
        this.payloadCapacity = payloadCapacity;
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

    public void loadPayload(double weight){
        if(weight > this.payloadCapacity){
            throw new RuntimeException("Exceeding payload capacity.");
        }
        this.setCurrentPayload(weight);
    }

    public void unload(){
        this.setCurrentPayload(0.0);
    }
}
