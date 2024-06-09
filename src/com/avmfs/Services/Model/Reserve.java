package com.avmfs.Services.Model;

import com.avmfs.VehicleManagement.AutonomousVehicle;

public class Reserve extends BaseEntity {
    private boolean cancel;
    private Route route;
    private Person person;
    private AutonomousVehicle vehicle;

    public Reserve() {
    }

    public Reserve(long id, boolean cancel, Route route, Person person, AutonomousVehicle vehicle) {
        super(id);
        this.cancel = cancel;
        this.route = route;
        this.person = person;
        this.vehicle = vehicle;
    }

    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public AutonomousVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(AutonomousVehicle vehicle) {
        this.vehicle = vehicle;
    }
}
