package com.avmfs.Services.Map;

import com.avmfs.Services.Model.Reserve;
import com.avmfs.Services.ReservationService;

import java.util.Set;

public class ReservationMapService extends AbstractMapService<Reserve, Long> implements ReservationService {

    public ReservationMapService() {
    }

    @Override
    public Set<Reserve> findAll() {
        return super.findAll();
    }

    @Override
    public Reserve findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Reserve save(Reserve object) {
        if(object.getPerson() == null || object.getRoute() == null || object.getVehicle() == null ||
                object.getPerson().getId() == null || object.getRoute().getId() == null || object.getVehicle().getId() == null){
            throw new RuntimeException("Invalid Reserve.");
        }
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Reserve object) {
        super.delete(object);
    }
}
