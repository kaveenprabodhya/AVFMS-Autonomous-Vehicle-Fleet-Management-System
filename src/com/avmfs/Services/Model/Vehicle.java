package com.avmfs.Services.Model;

import com.avmfs.Utility.FleetingStatus;
import com.avmfs.Utility.VehicleStatus;

public class Vehicle extends BaseEntity {
    private String model;
    private int year;
    private VehicleStatus status;
    private int altitude;
    private int batteryLevel;
    private FleetingStatus fleetingStatus;

    public Vehicle() {
    }

    public Vehicle(Long id, String model, int year, VehicleStatus status, int altitude, int batteryLevel, FleetingStatus fleetingStatus) {
        super(id);
        this.model = model;
        this.year = year;
        this.status = status;
        this.altitude = altitude;
        this.batteryLevel = batteryLevel;
        this.fleetingStatus = fleetingStatus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public FleetingStatus getFleetingStatus() {
        return fleetingStatus;
    }

    public void setFleetingStatus(FleetingStatus fleetingStatus) {
        this.fleetingStatus = fleetingStatus;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
}
