package com.avmfs.UserManagement;

import com.avmfs.Services.*;
import com.avmfs.Services.Model.*;
import com.avmfs.Utility.UserRole;
import com.avmfs.Utility.VehicleStatus;

import java.util.Date;

public class FleetManager extends Person {
    private final VehicleService vehicleService;
    private final RouteService routeService;
    private final ReservationService reservationService;
    private final MaintenanceScheduleService maintenanceScheduleService;
    private final PersonService personService;

    public FleetManager(Long id, String firstName, String lastName, String email, String password, UserRole role, VehicleService vehicleService, RouteService routeService, ReservationService reservationService, MaintenanceScheduleService maintenanceScheduleService, PersonService personService) {
        super(id, firstName, lastName, email, password, role);
        this.vehicleService = vehicleService;
        this.routeService = routeService;
        this.reservationService = reservationService;
        this.maintenanceScheduleService = maintenanceScheduleService;
        this.personService = personService;
    }

    // Manage Vehicles
    // crud vehicle
    public void addVehicle(Vehicle vehicle){
        vehicleService.save(vehicle);
    }
    public void deleteVehicle(Vehicle vehicle){
        vehicleService.delete(vehicle);
    }
    public void deleteVehicleById(long id){
        vehicleService.deleteById(id);
    }
    public void getAllVehicles(){
        vehicleService.findAll();
    }
    public void getVehicleById(long id){
        vehicleService.findById(id);
    }
    public void updateVehicle(long id, Vehicle vehicle){
        vehicle.setId(id);
        vehicleService.save(vehicle);
    }
    public void changeMaintenanceStatus(VehicleStatus status, long id){
        Vehicle vehicle = vehicleService.findById(id);
        vehicle.setStatus(status);
        vehicleService.save(vehicle);
    }

    // Manage Routes
    // crud route
    public void addRoute(Route route){
        routeService.save(route);
    }
    public void getAllRoute(){
        routeService.findAll();
    }
    public void deleteRouteById(long id){
        routeService.deleteById(id);
    }
    public void editRoute(long id, Route route){
        route.setId(id);
        routeService.save(route);
    }
    public void deleteRoute(Route route){
        routeService.delete(route);
    }
    public void calculateDistance(){}

    public void estimatedTime(){}

    public void updateRoute(String newDestination){}

    // TODO View fleet status
    // get fleet status of vehicles
    public void getFleetStatus(){}

    // Manage Bookings
    // crud bookings
    public void addReservation(Reserve reserve){
        reservationService.save(reserve);
    }
    public void cancelReservation(Reserve reserve){
        reserve.setCancel(true);
        reservationService.save(reserve);
    }
    public void getAllReservations(){
        reservationService.findAll();
    }
    public void getReservationById(long id){
        reservationService.findById(id);
    }
    public void deleteReservation(Reserve reserve){
        reservationService.delete(reserve);
    }
    public void deleteReservationById(long id){
        reservationService.deleteById(id);
    }

    // Manage maintenance
    //crud maintenance
    public void addMaintenance(Schedule schedule){
        maintenanceScheduleService.save(schedule);
    }
    public void getAllMaintenance(){
        maintenanceScheduleService.findAll();
    }
    public void getMaintenanceById(long id){
        maintenanceScheduleService.findById(id);
    }
    public void deleteMaintenance(Schedule schedule){
        maintenanceScheduleService.delete(schedule);
    }
    public void deleteMaintenanceById(long id){
        maintenanceScheduleService.deleteById(id);
    }
    public void updateSchedule(Date newDate){}

    public void completeMaintenance(){}

    // Manage users
    public void addUser(Person person){
        personService.save(person);
    }
    public void removeUser(Person person){
        personService.delete(person);
    }
    public void removeUserById(long id){
        personService.deleteById(id);
    }
    public void listAllUsers(){
        personService.findAll();
    }
    public void getUserById(long id){
        personService.findById(id);
    }
}
