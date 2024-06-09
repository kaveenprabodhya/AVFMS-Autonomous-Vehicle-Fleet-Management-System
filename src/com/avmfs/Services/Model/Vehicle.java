package com.avmfs.Services.Model;

import com.avmfs.Utility.VehicleStatus;

public class Vehicle extends BaseEntity{
    private String model;
    private VehicleStatus status;

    public Vehicle() {
    }

    public Vehicle(Long id, String model, VehicleStatus status) {
        super(id);
        this.model = model;
        this.status = status;
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
}
