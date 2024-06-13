package com.avmfs.Services;

import com.avmfs.Services.Model.Reserve;

import java.util.List;

public interface ReservationService extends CrudService<Reserve, Long> {
    List<Reserve> findAllByUsername(String username);
    Reserve findByUsernameAndReservationId(String username, long reserveId);
}
