package com.avmfs.UserManagement;

import com.avmfs.Services.Model.Person;
import com.avmfs.Services.Model.Reserve;
import com.avmfs.Services.PersonService;
import com.avmfs.Services.ReservationService;
import com.avmfs.Utility.UserRole;

import java.util.List;

public class RegularUser extends Person {

    private final PersonService personService;
    private final ReservationService reservationService;

    public RegularUser(Long id, String firstName, String lastName, String email, String password, UserRole role, PersonService personService, ReservationService reservationService) {
        super(id, firstName, lastName, email, password, role);
        this.personService = personService;
        this.reservationService = reservationService;
    }

    public void bookVehicle(Reserve reserve){
        this.reservationService.save(reserve);
    }

    public void cancelBooking(long reservationId){
        Reserve reserve = this.reservationService.findByUsernameAndReservationId(this.getEmail(),this.getId());
        if(reserve == null){
            throw new RuntimeException("Reservation not found!");
        }
        reserve.setCancel(true);
        this.reservationService.save(reserve);
    }

    public List<Reserve> viewBookings(){
        return this.reservationService.findAllByUsername(this.getEmail());
    }
}
