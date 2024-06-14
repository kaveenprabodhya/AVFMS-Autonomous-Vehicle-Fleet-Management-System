package com.avmfs.Services.Model;

public class Reserve extends BaseEntity {
    private boolean cancel;
    private Route route;
    private Person person;
    private Vehicle vehicle;

    public Reserve() {
    }

    public Reserve(long id, boolean cancel, Route route, Person person, Vehicle vehicle) {
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + this.getId() +
                ", cancel=" + cancel +
                ", route=" + route.getId() +
                ", person=" + person.getEmail() +
                ", vehicle=" + vehicle.getModel() +
                '}';
    }
}
