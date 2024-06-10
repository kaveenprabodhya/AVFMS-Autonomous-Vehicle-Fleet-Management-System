package com.avmfs.Services.Map;

import com.avmfs.Services.MaintenanceScheduleService;
import com.avmfs.Services.Model.Schedule;

import java.util.Set;

public class MaintenanceMapService extends AbstractMapService<Schedule, Long> implements MaintenanceScheduleService {

    public MaintenanceMapService() {
    }

    @Override
    public Set<Schedule> findAll() {
        return super.findAll();
    }

    @Override
    public Schedule findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Schedule save(Schedule object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Schedule object) {
        super.delete(object);
    }
}
