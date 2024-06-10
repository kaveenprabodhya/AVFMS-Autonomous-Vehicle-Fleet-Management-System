package com.avmfs.UserManagement;

import com.avmfs.Services.Model.Person;
import com.avmfs.Services.Model.Reserve;
import com.avmfs.Services.PersonService;
import com.avmfs.Services.ReservationService;
import com.avmfs.Utility.UserRole;

public class RegularUser extends Person {

    private final PersonService personService;
    private final ReservationService reservationService;

    public RegularUser(Long id, String firstName, String lastName, String email, String password, UserRole role, PersonService personService, ReservationService reservationService) {
        super(id, firstName, lastName, email, password, role);
        this.personService = personService;
        this.reservationService = reservationService;
    }

    public void bookVehicle(Reserve reserve){}

    public void cancelBooking(Reserve reserve){}

    public void viewBookings(){}
}
