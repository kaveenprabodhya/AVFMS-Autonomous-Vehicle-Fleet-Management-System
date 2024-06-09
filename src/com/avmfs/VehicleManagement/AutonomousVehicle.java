package com.avmfs.VehicleManagement;

import com.avmfs.Services.Model.Vehicle;
import com.avmfs.Utility.LocationType;

public interface AutonomousVehicle {

    public abstract void start();

    public abstract  void stop();

    public abstract void updateLocation(LocationType<Long, Long> newLocation);
}
