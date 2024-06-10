package com.avmfs.Services.Map;

import com.avmfs.Services.Model.Vehicle;
import com.avmfs.Services.VehicleService;

import java.util.Set;

public class VehicleMapService extends AbstractMapService<Vehicle, Long> implements VehicleService {

    public VehicleMapService() {
    }

    @Override
    public Set<Vehicle> findAll() {
        return super.findAll();
    }

    @Override
    public Vehicle findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vehicle save(Vehicle object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Vehicle object) {
        super.delete(object);
    }
}
