package com.avmfs.VehicleManagement;

import com.avmfs.Utility.Location;

public sealed interface AutonomousVehicle permits DeliveryDrone, SelfDriving {

    public abstract void start();

    public abstract  void stop();

    public abstract void updateLocation(Location<Long, Long> newLocation);
}
